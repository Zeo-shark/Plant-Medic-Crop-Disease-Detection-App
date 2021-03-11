package com.example.plantcare;

public class PlantDisease {
    int id;
    String symptoms;
    String about;
    String name;
    String imglink;
    String cropName;
    String treatment;
    String source;
    public PlantDisease(int dId , String nameOfDisease, String imglink , String nameOfCrop ,String sympMsg, String aboutMsg , String treatmentOfDisease , String dSource){
        symptoms = sympMsg;
        about = aboutMsg;
        id = dId;
        name = nameOfDisease;
        treatment = treatmentOfDisease;
        cropName = nameOfCrop;
        source = dSource;
        imglink= imglink;
    }
}
