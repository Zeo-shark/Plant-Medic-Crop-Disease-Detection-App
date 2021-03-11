import os

from werkzeug import utils
from flask import Flask, request, Response, jsonify,render_template,redirect, url_for
from tensorflow import keras
from PIL import Image
import numpy as np



app= Flask(__name__)

model = keras.models.load_model("./modelplant.h5")

# app.add_url_rule(rule="/", endpoint="homepage", view_func=redirect_upload)
def redirect_upload():

    """
    A viewer function that redirects the Web application from the root to a HTML page for uploading an image to get classified.
    The HTML page is located under the /templates directory of the application.
    :return: HTML page used for uploading an image. It is 'upload_image.html' in this exmaple.
    """
    return render_template(template_name_or_list="upload_image.html")

app.add_url_rule(rule="/", endpoint="homepage", view_func=redirect_upload)

def upload_image():

    """
    Viewer function that is called in response to getting to the 'http://localhost:7777/upload' URL.
    It uploads the selected image to the server.
    :return: redirects the application to a new page for predicting the class of the image.
    """
    #Global variable to hold the name of the image file for reuse later in prediction by the 'CNN_predict' viewer functions.
    global secure_filename
    if request.method == "POST":#Checking of the HTTP method initiating the request is POST.
        img_file = request.files["image_file"]#Getting the file name to get uploaded.
        secure_filename = utils.secure_filename(img_file.filename)#Getting a secure file name. It is a good practice to use it.
        img_path = os.path.join(app.root_path, secure_filename)#Preparing the full path under which the image will get saved.
        img_file.save(img_path)#Saving the image in the specified path.
        print("Image uploaded successfully.")
        """
        After uploading the image file successfully, next is to predict the class label of it.
        The application will fetch the URL that is tied to the HTML page responsible for prediction and redirects the browser to it.
        The URL is fetched using the endpoint 'predict'.
        """
        return redirect(url_for(endpoint="predict"))
    return "Image upload failed."
"""
Creating a route between the URL (http://localhost:7777/upload) to a viewer function that is called after navigating to such URL. 
Endpoint 'upload' is used to make the route reusable without hard-coding it later.
The set of HTTP method the viewer function is to respond to is added using the 'methods' argument.
In this case, the function will just respond to requests of method of type POST.
"""
app.add_url_rule(rule="/upload/", endpoint="upload", view_func=upload_image, methods=["POST"])


def cnn_predict():
    global secure_filename
    # Reading the image file from the path it was saved in previously.
    # img = imageio.imread(os.path.join(app.root_path, secure_filename))
    try:
        img= Image.open(os.path.join(app.root_path, secure_filename))
        print(img.size)
        img= img.resize((64,64))
        img= np.asarray(img)
        img= np.reshape(img,(1,64,64,3))
        # img= img.reshape(1,64,64,3)
        out= model.predict(img)
        plant_disease_labels=['apple apple scab',
            'apple black rot',
            'apple cedar apple rust',
            'apple healthy',
            'blueberry healthy',
            'cherry including sour powdery mildew',
            'cherry including sour healthy',
            'corn maize cercospora leaf spot gray leaf spot',
            'corn maize common rust' ,
            'corn maize northern leaf blight',
            'corn maize healthy',
            'grape black rot',
            'grape esca black measles' ,
            'grape leaf blight isariopsis leaf spot',
            'grape healthy',
            'orange haunglongbing citrus greening' ,
            'peach bacterial spot',
            'peach healthy',
            'pepper bell bacterial spot',
            'pepper bell healthy',
            'potato early blight',
            'potato late blight',
            'potato healthy',
            'raspberry healthy',
            'soybean healthy',
            'squash powdery mildew',
            'strawberry leaf scorch',
            'strawberry healthy',
            'tomato bacterial spot',
            'tomato early blight',
            'tomato late blight',
            'tomato leaf mold',
            'tomato septoria leaf spot',
            'tomato spider mites two spotted spider mite',
            'tomato target spot',
            'tomato tomato yellow leaf curl virus',
            'tomato tomato mosaic virus',
            'tomato healthy'
            ]
        predicted_class= np.argmax(out)
        predicted_class= plant_disease_labels[predicted_class-1]
        predicted_crop= predicted_class.split(" ", 1)
        return render_template(template_name_or_list="prediction_result.html", predicted_crop=predicted_crop[0], predicted_disease=predicted_crop[1])
    except Exception as e:
        return str(e)

app.add_url_rule(rule="/predict/", endpoint="predict", view_func=cnn_predict)

if __name__ == "__main__":
    """
    In this example, the app will run based on the following properties:
    host: localhost
    port: 7777
    debug: flag set to True to return debugging information.
    """
    app.run(host="localhost", port=7777, debug=True)