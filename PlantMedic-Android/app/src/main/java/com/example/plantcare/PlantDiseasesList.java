package com.example.plantcare;


import java.util.ArrayList;
import java.util.HashMap;

public class PlantDiseasesList {
    HashMap<String , PlantDisease> listOfDiseases = new HashMap<>();
    ArrayList<String> diseaseNameList = new ArrayList<>();
    PlantDiseasesList(){


        int diseaseId  = 0;
        String diseaseName =  "";
        String imglink = "";
        String nameOfCrop = "";
        String symptoms = "";
        String about = "";
        String treatment = "";
        String source = "";
//        disease 0: apple apple scab
        diseaseId = 0;
        diseaseName = "apple apple scab";
        imglink= "https://gumlet.assettype.com/nationalherald%2F2019-06%2F3ff488fb-bf20-4050-b3bf-009fbd1274bb%2Fapple_scab_in_himachal.jpg?rect=0%2C0%2C1307%2C735&auto=format%2Ccompress&w=400&dpr=2.6";
        nameOfCrop = "apple";
        symptoms = "Leaf spots are round, olive-green in color and up to ½-inch across. \n" +
                "Spots are velvet-like with fringed borders.\n" +
                "As they age, leaf spots turn dark brown to black, get bigger and grow together.\n" +
                "Leaf spots often form along the leaf veins.\n" +
                "Leaves with many leaf spots turn yellow and drop by mid-summer.\n" +
                "Infected fruit have olive-green spots that turn brown and corky with time.\n" +
                "Fruit that are infected when very young become deformed and cracked as the fruit grows.";
        about = "Apple scab is caused by the fungus Venturia inaequalis. It infects crabapples and apples (Malus spp.), mountain ash (Sorbus spp.), pear (Pyrus communis) and Cotoneaster (Cotoneaster spp.).";
        treatment = "Fungicide active ingredients to treat apple scab on ornamental crabapples:\n" +
                "Tebuconazole\n" +
                "Myclobutanil\n" +
                "Captan\n" +
                "Chlorothalonil\n" +
                "Propiconazole\n" +
                "Mancozeb\n" +
                "Sulfur/lime sulfur*\n" +
                "Neem oil*\n" +
                "Copper**";
        source = "https://extension.umn.edu/plant-diseases/apple-scab#fungicides-1165363";
        PlantDisease appleScab = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop ,symptoms,about , treatment , source);
        listOfDiseases.put(diseaseName, appleScab);
        diseaseNameList.add(diseaseName);



        //        disease 1: apple black rot
        diseaseId = 2;
        diseaseName = "apple black rot";
        imglink= "https://www.phillyorchards.org/wp-content/uploads/2015/11/black-rot.jpg";
        nameOfCrop = "apple";
        symptoms = "Fruit symptoms : \n" +
                "Large brown rotten areas can form anywhere on the fruit but are most common on the blossom end.\n" +
                "Brown to black concentric rings can often be seen on larger infections.\n" +
                "The flesh of the apple is brown but remains firm.\n" +
                "Small, black spots can be seen on older fruit infections. These are fungal spore producing structures, called pycnidia.\n" +
                "Some fruit mummify (shrivel and dry out) and remain attached to the tree.\n" +
                "Occasionally fruit are infected early in the season. This results in fruit that ripen early and are rotten at the core.\n" +
                "Leaf symptoms : \n" +
                "Infected leaves develop \"frog-eye leaf spot.”The se are circular spots with purplish or reddish edges and light tan interiors.\n" +
                "Branch symptoms : \n" +
                "Cankers appear as a sunken, reddish-brown area on infected branches. Cankers often have rough or cracked bark.\n" +
                "Cankers may be hard to see. If you see rotten fruit or frog-eye leaf spot, inspect your trees for cankers.\n" +
                "Sunken cankers may appear:\n" +
                "On the southwest side of young trees, where winter injury is common.\n" +
                "Or at crotches where branches join the main trunk. These areas are typically the last to harden off in fall.";
        about = "Black rot is caused by the fungus Diplodia seriata (syn Botryosphaeria obtusa).\n" +
                "The fungus can infect dead tissue as well as living trunks, branches, leaves and fruits.\n" +
                "The black rot fungi survive Minnesota winters in branch cankers and mummified fruit (shriveled and dried fruit) attached to the tree.\n" +
                "In wet weather, spores are released from these infections and spread by wind or splashing water.\n" +
                "Leaf spots don’t release fungal spores.\n" +
                "The fungus infects leaves and fruit through natural openings or minor wounds.\n" +
                "Branches and the trunk are most likely to be infected through dead or damaged wood.\n" +
                "Leaf spots don’t seriously affect the health of the tree unless many leaves turn yellow and fall off because of the infection (this is rare).";
        treatment = "Fungicide sprays are usually not needed for managing black rot in Minnesota.\n" +
                "\n" +
                "Consider using fungicides only after you’ve used good cultural practices and the disease hasn’t gone away.\n" +
                "Captan and sulfur products are labeled for control of both scab and black rot. A scab spray program including these chemicals may help prevent the frog-eye leaf spot of black rot, as well as the infection of fruit. These sprays will not control or prevent infection of branches.";
        source = "https://extension.umn.edu/plant-diseases/black-rot-apple#fungicide-sprays-1767012";
        PlantDisease appleBlackRot = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment , source);
        listOfDiseases.put(diseaseName, appleBlackRot);
        diseaseNameList.add(diseaseName);


        //        disease 1: apple black rot
        diseaseId = 3;
        diseaseName = "apple cedar apple rust";
        imglink="https://content.ces.ncsu.edu/media/images/RUST.png";
        nameOfCrop = "apple";
        symptoms = "On apple, the disease first appears on the leaves as small greenish yellow spots which gradually enlarge, changing to orange-yellow and becoming surrounded at the border by concentric red bands (Figure 1). On the upper leaf surface, the spots become stippled with black specialized fruiting structures (spermogonia) (Figure 2). On the underside of the leaf, lesions are formed called “aecia.” At the point where an aecium is formed, hairlike projections can be observed (Figure 3). The leaf thickens around these projections, causing the aecium to have a cuplike appearance. These cuplike lesions can also appear on immature fruit of apples, causing dwarfing and malformation.";
        about = "Black rot is caused by the fungus Diplodia seriata (syn Botryosphaeria obtusa).\n" +
                "The fungus can infect dead tissue as well as living trunks, branches, leaves and fruits.\n" +
                "The black rot fungi survive Minnesota winters in branch cankers and mummified fruit (shriveled and dried fruit) attached to the tree.\n" +
                "In wet weather, spores are released from these infections and spread by wind or splashing water.\n" +
                "Leaf spots don’t release fungal spores.\n" +
                "The fungus infects leaves and fruit through natural openings or minor wounds.\n" +
                "Branches and the trunk are most likely to be infected through dead or damaged wood.\n" +
                "Leaf spots don’t seriously affect the health of the tree unless many leaves turn yellow and fall off because of the infection (this is rare).";
        treatment = "Apple trees can be protected from cedar-apple rust by following a fungicide spray schedule starting at blossom time and continuing at seven-day intervals until the cedar galls have stopped spreading spores. Control on cedars can be obtained with a fungicide spray schedule from June through September at two-week intervals. For suggested fungicides and rates, refer to the current publication  E-832 OSU Extension Agents’ Handbook of Insect, Plant Disease, and Weed Control.";
        source = "https://extension.okstate.edu/fact-sheets/cedar-apple-rust.html";
        PlantDisease cedarAppleRust = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment , source);
        listOfDiseases.put(diseaseName, cedarAppleRust);
        diseaseNameList.add(diseaseName);

        //        disease 3: apple healthy
        diseaseId = 4;
        diseaseName = "apple healthy";
        imglink="https://www.applesfromny.com/wp-content/uploads/2020/05/Jonagold_NYAS-Apples2.png";
        nameOfCrop = "apple";
        symptoms = "Poor plant vigor,loss of roots.\n"+"Damage to cambium impaired transport of water and nutrients";
        about = "The bacterium overwinters in cankers and invisible infections on twigs and in buds. In the spring, the bacteria multiplies in infected tissue and begins to ooze from natural openings in the plant. The bacterial cells spread to healthy tissue by water, insects, and pruning tools.";
        treatment = "o prevent the spread of disease, the UMaine Cooperative Extension recommends applying fungicides containing fenarimol or myclobutanil. Avoid planting the host trees near one another. Inspect nearby juniper and red cedar trees in late winter or early spring. Prune and remove galls before the orange, gummy structures form in the spring.";
        source = "Several infectious disease agents biotic pathogens such as fungi, bacteria, viruses, nematodes, and mycoplasmas and non-infectious factors  abiotic factors such as temperature, moisture, nutrients, soil conditions, and chemicals.";
        PlantDisease appleHealthy = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment , source);
        listOfDiseases.put(diseaseName, appleHealthy);
        diseaseNameList.add(diseaseName);

        //        disease 4: blueberry healthy
        diseaseId = 5;
        diseaseName = "blueberry healthy";
        imglink="https://plantvillage-production-new.s3.amazonaws.com/images/pics/000/000/954/original/Botrytis_blight_1.jpg?1374505664";
        nameOfCrop = "blueberry";
        symptoms = "Symptoms are usually most severe on young plants and include stunting, chlorosis and scorch. When soil moisture is abundant and temperatures are warm, wilting and cane death may occur. However, older plants with larger root reserves can survive the disease for years.";
        about = "Corollas of expanded blossoms appear blighted; brown lesions on leaves which have come into contact with infected blossoms; infected blossoms do not produce fruit; in large fields, severe infedctions are often visible as brown patches";
        treatment = "Disease can be controlled by application of appropriate fungicides, if available, at mid-bloom and late bloom stage";
        source="Blueberry scorch virus is transmitted by infected plant mate- rial and aphids. Once a plant is infected, symptoms may take 1 to 2 years to develop. The disease spreads quickly in a ra- dial pattern, and eventually all bushes in a field may become infected.";
        PlantDisease blueberryHealthy = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment , source);
        listOfDiseases.put(diseaseName, blueberryHealthy);
        diseaseNameList.add(diseaseName);

        //        disease 5: cherry including sour powdery mildew
        diseaseId = 6;
        diseaseName = "cherry including sour powdery mildew";
        imglink="https://plantvillage-production-new.s3.amazonaws.com/images/pics/000/001/042/original/Black_knot_2.jpg?1375285613";
        nameOfCrop = "cherry";
        symptoms = "Initial symptoms, often occurring 7 to 10 days after the onset of the first irrigation, are light roughly-circular, powdery looking patches on young, susceptible leaves (newly unfolded, and light green expanding leaves). Older leaves develop an age-related (ontogenic) resistance to powdery mildew and are naturally more resistant to infection than younger leaves. Look for early leaf infections on root suckers, the interior of the canopy or the crotch of the tree where humidity is high. In contrast to other fungi, powdery mildews do not need free water to germinate but germination and fungal growth are favored by high humidity (Grove & Boal, 1991a). The disease is more likely to initiate on the undersides (abaxial) of leaves (Fig. 2) but will occur on both sides at later stages. As the season progresses and infection is spread by wind, leaves may become distorted, curling upward. Severe infections may cause leaves to pucker and twist. Newly developed leaves on new shoots become progressively smaller, are often pale and may be distorted.";
        about = "Cankers on twigs at bases of flower and leaf buds, in pruning wounds or at the base of spurs which exude amber colored gum; cankers spread upwards and form sunken areas in winter; if pathogen enters dormant buds they may be killed or open normally in Spring before collapsing in early Summer; infected buds may be symptomless";
        treatment = "nsure that a suitable cherry variety and rootstock is chosen based on geographic location and environmental conditions to prevent stress to tree which predisposes tree to canker disease; apply protective copper spray to trees before flowering; prune trees in early summer to decrease likelihood of infection";
        source = "Bacterium";
        PlantDisease cherrySourPowderyMildew = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment , source);
        listOfDiseases.put(diseaseName, cherrySourPowderyMildew);
        diseaseNameList.add(diseaseName);

        diseaseId = 7;
        diseaseName = "cherry including sour healthy";
        imglink="https://plantvillage-production-new.s3.amazonaws.com/images/pics/000/001/041/original/Black_knot_1.jpg?1375285488";
        nameOfCrop = "cherry";
        symptoms = "Elongated swellings (knots) on woody parts of tree which can reach up to 30 cm (12 in) long; knots are initially olive green in color with a corky texture but turn black in color and become hard and brittle; knots grow in length each year";
        about = "Infections occur on new shoots after rainfall and knots develop rapidly in second year";
        treatment = "Prune knots on twigs and branches 8-10 cm (3-4 in) below the swelling and remove the pruned branches from the orchard; remove knots on older branches by removing the knot plus 2 cm (0.8 in) of surrounding tissue; removal of knots is most effective when done in midsummer; disease can be controlled by application of appropriate fungicides, if available, during shoot elongation";
        source = "Fungus";
        PlantDisease cherrysourhealthy = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, cherrysourhealthy);
        diseaseNameList.add(diseaseName);



        diseaseId = 8;
        diseaseName = "corn maize cercospora leaf spot gray leaf spot";
        imglink="https://content.peat-cloud.com/w400/grey-leaf-spot-of-maize-maize-1.jpg";
        nameOfCrop = "corn";
        symptoms = "Symptoms seen on corn include leaf lesions, discoloration (chlorosis), and foliar blight";
        about = "Grey leaf spot (GLS) is a foliar fungal disease that affects maize, also known as corn. GLS is considered one of the most significant yield-limiting diseases of corn worldwide.[1] There are two fungal pathogens that cause GLS: Cercospora zeae-maydis and Cercospora zeina.[2] Symptoms seen on corn include leaf lesions, discoloration (chlorosis), and foliar blight.";
        treatment = "Management strategies for gray leaf spot include tillage, crop rotation and planting resistant hybrids. Fungicides may be needed to prevent significant loss when plants are infected early and environmental conditions favor disease. Symptoms of gray leaf spot are usually first noticed in the lower leaves.";
        source = "Grey leaf spot (GLS) is a foliar fungal disease that affects maize, also known as corn. ... There are two fungal pathogens that cause GLS: Cercospora zeae-maydis and Cercospora zeina. Symptoms seen on corn include leaf lesions, discoloration (chlorosis), and foliar blight.";
        PlantDisease xyz7 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz7);
        diseaseNameList.add(diseaseName);



        diseaseId = 9;
        diseaseName = "corn maize common rust";
        imglink="https://assets.corteva.com/is/image/Corteva/common-rust-early-lesions?wid=548&hei=322";
        nameOfCrop = "corn";
        symptoms = "Lesions begin as flecks on leaves that develop into small tan spots.\n"+
                "Spots turn into elongated brick-red to cinnamon-brown pustules with jagged appearance.\n"+
                "Found on both upper AND lower leaf surfaces (unlike southern rust).\n"+
                "Pustules turn dark brown to black late in the season.\n"+
                "Occurs on leaf only, NOT on sheaths, stalks, ear shanks and husk leaves";
        about = "Fungal disease caused by Puccinia sorghi pathogen.\n"+
                "Favored by moist, cool conditions (temps in the 60s and 70s)\n"+
                "Hot, dry conditions typically slow or stop development.\n"+
                "Spreads by windblown spores from southern corn growing areas.\n"+
                "Typically progresses as corn matures in late summer if conditions are persistently wet and cool.\n"+
                " More often a problem in seed production and sweet corn fields than in hybrid fields.\n"+
                "Less likely than southern rust to cause significant yield loss to hybrid corn, so important to distinguish common and southern rust.\n"+
                "Hybrids differ in resistance";
        treatment = "Remove all infected parts and destroy them. For bramble fruits, remove and destroy all the infected plants and replant the area with resistant varieties.";
        source = "Fungus";
        PlantDisease xyz8 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz8);
        diseaseNameList.add(diseaseName);



        diseaseId = 10;
        diseaseName = "corn maize northern leaf blight";
        imglink="https://extension.umn.edu/sites/extension.umn.edu/files/styles/large/public/northernleafblight_600px.jpg?itok=7Nogx0Ew";
        nameOfCrop = "corn";
        symptoms = "Typical symptoms of northern corn leaf blight are canoe-shaped lesions 1 inch to 6 inches long. The lesions are initially bordered by gray-green margins. They eventually turn tan colored and may contain dark areas of fungal sporulation. ";
        about = "The disease is most prevalent during moderate temperatures (64 to 80 degrees F) with prolonged periods of moisture. It typically appears at or after silking, but the disease is usually more severe when infection occurs earlier.";
        treatment = "Use resistant hybrids. Fungicides may be warranted on inbreds for seed production during the early stages of this disease. Crop rotation and tillage practices may be helpful in some cases.";
        source = "The pathogen is the fungus Exserohilum turcicum (syn. Helminthosporium turcicum). It overwinters on corn leaf debris. Several races of this pathogen are known that interact differently with different resistance genes.";
        PlantDisease xyz9 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz9);
        diseaseNameList.add(diseaseName);


        diseaseId = 11;
        diseaseName = "corn maize healthy";
        imglink="data:image/jpeg;base64,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";
        nameOfCrop = "corn";
        symptoms = "The main symptoms are appearance of water soaked lesions initially. As the disease progress the lesions become long and turn pale yellow with irregular margins running in the length. The pathogen may infect the stem and causes stunting, wilting and death of plant.";
        about = "Fungus survives the winter on crop debris. Emergence of disease is favored by high temperatures and extended periods of wet and cloudy weather - seedlings and mature plants are most susceptible to the disease.";
        treatment = "Plant hybrids resistant to anthracnose; rotating crops and plowing crop debris into soil may help reduce incidence of early season infections.";
        source = "Anthracnose symptoms vary widely depending on numerous factors such as genotype, age of plant and environmental conditions.";
        PlantDisease xyz10 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz10);
        diseaseNameList.add(diseaseName);



        diseaseId =12;
        diseaseName = "grape black rot";
        imglink="https://blogs.cornell.edu/nysipm/files/2014/03/Black-rot-cluster-2glcp9x.jpg";
        nameOfCrop = "grape";
        symptoms = "The disease attacks the leaves, stem, flowers and berries.\n"+
                "The symptoms are in the form of irregularly shapedreddish brown spots on the leaves and a black scab on berries.\n"+
                "Occasionally, small elliptical darkcoloured canker lesions occur on the young stems and tendrils.";
        about = "Mancozeb is available as BONIDE MANCOZEB FLOWABLE fungicide. It contains 37% Mancozeb and should be very effective for controlling black rot. Nova (myclobutanil) is available in IMMUNOX FUNGICIDE. It is 1.55 % myclobutanil and should be effective for controlling black rot.";
        treatment = "Black rot can be very difficult control and there is no one method, including the use of fungicides, that will control it alone. You need to develop and use an integrated disease control program that uses some very important cultural practices combined with the application of effective fungicides.";
        source = "Black rot, caused by the bacterium Xanthomonas campestris pv. campestris (Xcc), is a significant disease of cabbage and other crucifer crops worldwide. ... The pathogen can also survive in cruciferous weeds, such as yellow rocket, Shepherd's purse, and wild mustard, as well as in crop debris in the field";
        PlantDisease xyz11 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz11);
        diseaseNameList.add(diseaseName);



        diseaseId = 13;
        diseaseName = "grape esca black measles";
        imglink="https://blogs.cornell.edu/nysipm/files/2014/03/Black-rot-cluster-2glcp9x.jpg";
        nameOfCrop = "grape";
        symptoms = "Esca, Botryosphaeria dieback, Eutypa dieback, and Phomopsis dieback make up a complex of \"trunk diseases\" caused by different wood-infecting fungi. The foliar symptom of Esca is an interveinal striping";
        about = "Esca is caused by a complex of fungi that includes several species of Phaeoacremonium, primarily by P. aleophilum";
        treatment = "No resistant varieties known; disease practically impossible to control without chemicals in areas where alternative hosts are available; use of an appropriate fungicide on pruning wounds can prevent the fungus from entering the plant; fungicide should be applied at time of pruning";
        source = "Stunted, withered leaves curled into a cup shape; dark cankers on wood; cross section of wood reveals wedge-shaped discoloration";
        PlantDisease xyz12 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz12);
        diseaseNameList.add(diseaseName);


        diseaseId = 14;
        diseaseName = "grape leaf blight isariopsis leaf spot";
        imglink="https://static.vikaspedia.in/media/images_en/agriculture/crop-production/integrated-pest-managment/ipm-for-fruit-crops/ipm-strategies-for-grapes/Downymildew.jpg";
        nameOfCrop = "grape";
        symptoms = "Symptoms of this disease are frequently confused with those of powdery mildew. Infected leaves develop pale yellow-green lesions which gradually turn brown. Severely infected leaves often drop prematurely.";
        about = "The fungus is an obligate pathogen which can attack all green parts of the vine.Young berries are highly susceptible to infection and are often covered with white fruiting structures of the fungus. Infected older berries of white cultivars may turn dull gray-green, whereas those of black cultivars turn pinkish red.";
        treatment = "Apply dormant sprays to reduce inoculum levels.\n"+
                "Use protectant and systemic fungicides.";
        source = "Grapes face all kinds of fungal diseases — from mildews, rots and blights to leaf spot and anthracnose. ";
        PlantDisease xyz13 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz13);
        diseaseNameList.add(diseaseName);


        diseaseId = 15;
        diseaseName = "grape healthy";
        imglink="https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.agric.wa.gov.au%2Fsites%2Fgateway%2Ffiles%2Fdowny%2520in%2520bunches%2520%252836%2529.JPG&imgrefurl=https%3A%2F%2Fwww.agric.wa.gov.au%2Ftable-grapes%2Fdowny-mildew-grapevines&tbnid=NYnjTa12qYbTNM&vet=12ahUKEwjHjqvJl4jvAhVyK7cAHZO8BlwQMygKegUIARCzAQ..i&docid=xSOXRaNgNh_GGM&w=3648&h=2736&q=grape%20healthy%20disease%20in%20plants%20symptoms&ved=2ahUKEwjHjqvJl4jvAhVyK7cAHZO8BlwQMygKegUIARCzAQ";
        nameOfCrop = "grape";
        symptoms = "Infections of leaves first appear as red spots on the upper leaf surface in late spring. These circular spots enlarge and become tan to light brown with distinct, dark borders. Small, pinpoint black fruiting structures of the fungus often develop in the centers of these spots.";
        about = "On leaf surface we will see lesions which are irregularly shaped (2 to 25 mm in diameter). Initially lesions are dull red to brown in color turn black later. If disease is severe this lesions may coalesce. On berries we can see symptom similar to black rot but the entire clusters will collapse.";
        treatment = "Fungicides sprayed for other diseases in the season may help to reduce this disease.";
        source = "Common in tropical and subtropical grapes. The disease appear late in the season. Cynthiana and Cabernet Sauvignon are susceptible to this pathogen.";
        PlantDisease xyz14 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz14);
        diseaseNameList.add(diseaseName);



        diseaseId = 16;
        diseaseName = "orange haunglongbing citrus greening";
        nameOfCrop = "citrus";
        imglink="https://upload.wikimedia.org/wikipedia/commons/1/1e/Huanglongbing.jpg";
        symptoms = "Affected trees have stunted growth, bear multiple off-season flowers (most of which fall off), and produce small, irregularly shaped fruit with a thick, pale peel that remains green at the bottom and tastes very bitter. ... The most noticeable symptom of HLB is greening and stunting of the fruit, especially after ripening.";
        about = "Citrus greening, also known as Huanglongbing (HLB) or yellow dragon disease, is the most important threat to citrus production worldwide. The disease devastates citrus plants, reducing fruit yield and quality, and killing the plants in as little as 2 years.";
        treatment = "Currently there is no cure for citrus greening disease; the best control strategy is to keep healthy plants from being infected. One of the most effective ways to prevent the disease is to avoid moving plants and plant materials from areas under regulatory quarantine or where the insect or disease is present.";
        source = "HLB is distinguished by the common symptoms of yellowing of the veins and adjacent tissues; followed by splotchy mottling of the entire leaf, premature defoliation, dieback of twigs, decay of feeder rootlets and lateral roots, and decline in vigor, ultimately followed by the death of the entire plant. ";
        PlantDisease xyz15 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz15);
        diseaseNameList.add(diseaseName);



        diseaseId = 17;
        diseaseName = "peach bacterial spot";
        imglink="https://www.canr.msu.edu/uploads/images/4-12%20Bacterial%20spot%20on%20peaches%20and%20nectarinesBILL%201%20and%202.jpg";
        nameOfCrop = "peach";
        symptoms = "Bacterial spot is an important disease of peaches, nectarines, apricots, and plums caused by Xanthomonas campestris pv. pruni. ... Leaf symptoms of bacterial spot on peaches and nectarines are generally dark, small lesions, often clustered at the leaf tip where water collects during dews and rain";
        about = "about xyz";
        treatment = "Remove old vegetable debris in the garden and do not plant new crops where host plants were once growing. There are no recognized chemical treatments for bacterial leaf spot disease. Your best bet is prevention and mechanical control at the first sign of symptoms of bacterial leaf spot";
        source = "Bacterial spot affects peaches, nectarines, apricots, plums, prunes and cherries. The disease is widespread throughout all fruit growing states east of the Rocky Mountains. Bacterial spot can affect leaves, twigs, and fruit";
        PlantDisease xyz16 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz16);
        diseaseNameList.add(diseaseName);


        diseaseId = 18;
        diseaseName = "peach healthy";
        imglink="https://www.google.com/search?q=peach&rlz=1C1CHBF_enIN914IN914&sxsrf=ALeKk00MkfZgASrakHnUtu6i9NSiTG26ng:1614366015316&tbm=isch&source=iu&ictx=1&fir=nRNbYtKnqUm8nM%252CMqAgJ7H7PyidVM%252C%252Fm%252F0dj6p&vet=1&usg=AI4_-kQumuAXc6h3ZPbeITIGK_T-orICnw&sa=X&ved=2ahUKEwjXiIWHnojvAhU9wzgGHXwhAbMQ_B16BAhWEAE&cshid=1614366073965522#imgrc=nRNbYtKnqUm8nM";
        nameOfCrop = "peach";
        symptoms = "Infected trees have stunted shoot growth and leaves become sparse, small and yellow. Fruit will be small and sunburned. Shoot and scaffold limb dieback occurs as the disease progresses. Crown rot symptoms appear as black decayed areas on the root crown and/or trunk base near the soil line.";
        about = "about xyz";
        treatment = "Infected areas on fruit turn brown and appear rusty. Symptoms usually occur on green fruit and disappear as the fruit develops. Prevention & Treatment: Provide good air circulation to peach trees by thinning trees and following proper pruning practices. This disease occurs frequently when roses are nearby.";
        source = "Disease emergence favors high moisture and low temperatures in the spring; young trees particularly susceptible; trees grown in sandy soils that drain poorly are also susceptible";
        PlantDisease xyz17 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz17);
        diseaseNameList.add(diseaseName);


        diseaseId = 19;
        diseaseName = "pepper bell bacterial spot";
        imglink="https://extension.umn.edu/sites/extension.umn.edu/files/styles/caption_medium/public/bact-spot-pepper-leaf.jpg?itok=t36bdHiY";
        nameOfCrop = "pepper";
        symptoms = " Because the most obvious symptoms occur on leaves, the disease is often referred to as \"bacterial leaf spot.\" Symptoms begin as small, yellow-green lesions on young leaves which usually appear deformed and twisted.";
        about = "Bacterial spot is one of the most devastating diseases of pepper and tomato. The disease occurs worldwide where pepper and tomato are grown in warm, moist areas. When it occurs soon after transplanting and weather conditions remain favorable for disease development, the results are usually total crop loss.";
        treatment = "A plant with bacterial spot cannot be cured. Remove symptomatic plants from the field or greenhouse to prevent the spread of bacteria to healthy plants. Burn, bury or hot compost the affected plants and DO NOT eat symptomatic fru";
        source = "";
        PlantDisease xyz18 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz18);
        diseaseNameList.add(diseaseName);



        diseaseId = 20;
        diseaseName = "pepper bell healthy";
        imglink="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS72O3KDO1WqoZh8cAlkHz4IYPRCwRYvd15tQ&usqp=CAU";
        nameOfCrop = "pepper";
        symptoms = "Initial symptoms of the disease include plants becoming stunted and lower leaves turning yellow; as the infection progresses, more leaves turn yellow and begin dropping from the plant; plants wilt during the day and recover at night; wilting becomes permanent and plant death ensues.";
        about = "The tender leaves and succulent shoot tips of freshly emerging runner shoots trailing on the soil turn black when infected. The disease spreads to the entire vine, from these infected runner shoots and leaves, during intermittent showers due to rain splash.";
        treatment = "Fungus survives in disease plant debris as well as soil. These vines may recover after the rains and survive for more than two seasons till the root infection culminates in collar rot and death of the vine";
        source = "One or more black spots appear on the leaves which have a characteristic fine fibre like projections at the advancing margins which rapidly enlarge and cause defoliation.";
        PlantDisease xyz19 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz19);
        diseaseNameList.add(diseaseName);


        diseaseId = 21;
        diseaseName = "potato early blight";
        imglink="https://www.planetnatural.com/wp-content/uploads/2012/12/potato-blight.jpg";
        nameOfCrop = "potato";
        symptoms = "Symptoms of early blight infection on tubers appear as dark and sunken lesions on the surface . Tuber lesions may be circular or irregular in shape  and can be surrounded by a raised dark-brown border. The underlying tissue is dry with a corky texture and a dark-brown color";
        about = "Early blight overwinters on infected plant tissue and is spread by splashing rain, irrigation, insects and garden tools. The disease is also carried on tomato seeds and in potato tubers. In spite of its name, early blight can occur any time throughout the growing season. High temperatures (80-85˚F.) and wet, humid conditions promote its rapid spread. In many cases, poorly nourished or stressed plants are attacked.";
        treatment = "Treatment of early blight includes prevention by planting potato varieties that are resistant to the disease; late maturing are more resistant than early maturing varieties. Avoid overhead irrigation and allow for sufficient aeration between plants to allow the foliage to dry as quickly as possible.";
        source = "As the disease matures, it spreads outward on the leaf surface causing it to turn yellow, wither and die. Eventually the stem, fruit and upper portion of the plant will become infected. Crops can be severely damaged.";
        PlantDisease xyz20 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz20);
        diseaseNameList.add(diseaseName);


        diseaseId = 22;
        diseaseName = "potato late blight";
        imglink="https://cropwatch.unl.edu/image/2643359-version%3D1.0%26t%3D1260361359000.jpg";
        nameOfCrop = "potato";
        symptoms = "The first symptoms of late blight in the field are small, light to dark green, circular to irregular-shaped water-soaked spots (Figure 1). These lesions usually appear first on the lower leaves. Lesions often begin to develop near the leaf tips or edges, where dew is retained the longest.";
        about = "On the leaf underside, a spore-producing zone of white moldy growth approximately 0.1 - 0.2 inches wide may appear at the border of the lesion. Under continuously wet conditions, the disease progresses rapidly and warm, dry weather will slow or stop disease development";
        treatment = "The severe late blight can be effectively managed with prophylactic spray of mancozeb at 0.25% followed by cymoxanil+mancozeb or dimethomorph+mancozeb at 0.3% at the onset of disease and one more spray of mancozeb at 0.25% seven days after application of systemic fungicides in West Benga";
        source = " Older lesions may become firm and sunken due to water loss and tubers will appear shrivelled. Infected tubers are commonly invaded by secondary decay organisms such as soft-rot bacteria and, therefore, are quite likely to decay during storage. ";
        PlantDisease xyz21 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz21);
        diseaseNameList.add(diseaseName);


        diseaseId = 23;
        diseaseName = "potato healthy";
        imglink="https://plantvillage-production-new.s3.amazonaws.com/images/pics/000/003/616/original/5684245277_db4090c1d5_z.jpg?1414779729";
        nameOfCrop = "potato";
        symptoms = "Affected tubers have roughened rings of darker brown or reddened skin. Necrosis beneath the rings may extend into the tuber flesh. Necrotic symptoms in tubers often increase after storage.";
        about = "Potato tubers are a staple food source in temperate regions and are eaten after cooking. They may be cut or sliced and made into potato chips or fries. Potatoes can also be processed into starch, alcohol or flour.";
        treatment = "Plant only certified seed potatoes - certified seed potatoes are grown in seed beds with zero tolerance of ring rot; remove all crop debris from soil after harvest; sanitize tools and equipment regularly";
        source = "Bacteria are carried on tubers and in wounds and can be spread to healthy tubers during handling and cutting of seed pieces; disease emergence favors high soil temperatures";
        PlantDisease xyz22 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz22);
        diseaseNameList.add(diseaseName);


        diseaseId = 24;
        diseaseName = "raspberry healthy";
        imglink="https://plantvillage-production-new.s3.amazonaws.com/images/pics/000/100/196/original/5407874-PPT.jpg?1489772219";
        nameOfCrop = "raspberry";
        symptoms = "Purple black cankers form at wounds on young canes; cankers enlarge to encircle cane and cause wilting and death of lateral shoots; infected canes are often cracked and brittle, breaking easily; black specks (fungal fruiting bodies) may become visible in the cankers.";
        about = "lasting symptoms (browning and drying) of one, or a cluster, of blossoms; soft, light brown areas on fruits which enlarge rapidly; berries become mummified and is covered in a gray powdery substance;";
        treatment = "Always plant raspberries in full sun and in an area with good drainage; plant only certified planting material; avoid over fertilizing plants; remove and destroy fruiting canes immediately after harvest; if pruning is necessary then make cuts during dry weather to allow wounds to heal before wet weather; control insect pests which may cause wounds to the canes such as crown borers and stem girdlers.";
        source = "Spread by rain splash from infected to healthy canes.";
        PlantDisease xyz23 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz23);
        diseaseNameList.add(diseaseName);


        diseaseId = 25;
        diseaseName = "soybean healthy";
        imglink="https://crop-protection-network.s3.amazonaws.com/articles/Bacterial-blight-Daren-Mueller11.jpg";
        nameOfCrop = "soyabean";
        symptoms = "Symptoms of soybean rust first appear as pale green to yellow flecks on leaves in the low to mid canopy of plants in the reproductive stages of crop development. Spots become angular in shape and reddish brown in color . Spots remain small, but become numerous.";
        about = "Bacterial blight is caused by Pseudomonas savastanoi pv. glycinea, and is usually one of the first foliar diseases to occur on soybean. Bacterial blight seldom causes serious yield loss.";
        treatment = "Although some soybean varieties are resistant, control is usually achieved by planting disease-free seed. In fields with a history of purple seed stain problems, the application of foliar fungicides during early pod set (R3 to R4) should aid in the control of this disease and may improve seed quality.";
        source = " As the disease progresses, lesions often grow together to produce large, irregularly shaped dead areas. Centers of older lesions frequently fall out, causing leaves to appear tattered.";
        PlantDisease xyz24 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz24);
        diseaseNameList.add(diseaseName);


        diseaseId = 26;
        diseaseName = "squash powdery mildew";
        imglink="https://www.planetnatural.com/wp-content/uploads/2012/12/plant-disease-mildew.jpg";
        nameOfCrop = "squash";
        symptoms = "The first sign of powdery mildew is pale yellow leaf spots."+
                "White powdery spots can form on both upper and lower leaf surfaces, and quickly expand into large blotches. ..."+
                "When powdery mildew infects the majority of the foliage, the plant weakens and the fruit ripens prematurely.";
        about = "Fungal spores overwinter inside leaf buds and other plant debris. Wind, water and insects transmit the spores to other nearby plants. Zucchini, beans, cucumbers, squash, pumpkins, tomatoes, roses and zinnia are especially susceptible.";
        treatment = "Plant resistant cultivars in sunny locations whenever possible."+
                "Prune or stake plants to improve air circulation. Make sure to disinfect your pruning tools (one part bleach to 4 parts water) after each cut."+
                "Remove diseased foliage from the plant and clean up fallen debris on the ground.";
        source = "It is caused by a variety of closely related fungal species, each with a limited host range. (The fungi attacking your roses are unlikely to spread to your lilacs). Low soil moisture combined with high humidity levels at the plant surface favors this disease.";
        PlantDisease xyz25 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz25);
        diseaseNameList.add(diseaseName);



        diseaseId = 27;
        diseaseName = "strawberry leaf scorch";
        imglink="https://plantvillage-production-new.s3.amazonaws.com/images/pics/000/098/795/original/5539929-PPT.jpg?1479765304";
        nameOfCrop = "strawberry";
        symptoms = "Irregular dark purple or brown blotches on upper leaf surface which may colaesce to produce large purplish brown patches; tissue between blotches may turn purple or red; lesions may also develop on flowers and fruits; affected petals may wither and drop from plant; lesions may girdle peduncles causing death of fruit";
        about = "Disease emergence favored by wet foliage for extended periods of time.";
        treatment = "Plant resistant varieties; regular renewal of plants; plant in an area with good air circulation and drainage in full sun; remove all foliage from plants at harvest; application of appropriate foliar fungicide may be required to provide control.";
        source = "Leaf spot Round black or light gray lesions on leaves; numerous spots may develop but leaves do not die. Runners and petioles Dark brown or black sunken, circular lesions on stems, petioles and runners; plants may be stunted and yellow; plants may wilt and collapse; internal tissues discolored red.";
        PlantDisease xyz26 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz26);
        diseaseNameList.add(diseaseName);




        diseaseId = 28;
        diseaseName = "strawberry healthy";
        imglink="https://www.google.com/imgres?imgurl=https%3A%2F%2Fstrawberryplants.org%2Fwp-content%2Fuploads%2FFusarium-Wilt-strawberries.jpg&imgrefurl=https%3A%2F%2Fstrawberryplants.org%2Fdiseases-fungi-molds%2F&tbnid=K6UcqHbYoC7g-M&vet=12ahUKEwi8mdHIr4jvAhWOgUsFHRz_BOYQMygAegUIARCjAQ..i&docid=AhAotSWQ5LPqhM&w=900&h=600&q=healthy%20strawberry%20diseases%20symptoms&hl=en&ved=2ahUKEwi8mdHIr4jvAhWOgUsFHRz_BOYQMygAegUIARCjAQ";
        nameOfCrop = "strawberry";
        symptoms = "Very small water-soaked lesions on lower surfaces of leaves which enlarge to form dark green or translucent angular spots which ooze bacteria. Lesions may coalesce to form reddish spots with a chlorotic halo.";
        about = "Bacterium survives in crop debris and overwintering plants; can survive for long periods on plant debris but can not live free in soil; bacteria can be spread by splashing water.";
        treatment = "Use only certified planting stock; rotate crops and avoid overhead irrigation; chemical controls generally ineffective.";
        source = "Disease emergence favored by wet foliage for extended periods of time.";
        PlantDisease xyz27 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz27);
        diseaseNameList.add(diseaseName);


        diseaseId = 29;
        diseaseName = "tomato bacterial spot";
        imglink="https://www.google.com/url?sa=i&url=http%3A%2F%2Fwww.omafra.gov.on.ca%2Fenglish%2Fcrops%2Ffacts%2F05-069.htm&psig=AOvVaw1fZAAiwGEnV1joH0QVTPbM&ust=1614456878353000&source=images&cd=vfe&ved=0CAYQjRxqFwoTCOj7h9iuiO8CFQAAAAAdAAAAABAD";
        nameOfCrop = "tomato";
        symptoms = "Leaves. Because the most obvious symptoms occur on leaves, the disease is often referred to as \"bacterial leaf spot.\" Symptoms begin as small, yellow-green lesions on young leaves which usually appear deformed and twisted (Figure 8), or as dark, water soaked, greasy-appearing lesions on older foliage (";
        about = "Bacterial spot causes leaf and fruit spots, which leads to defoliation, sun-scalded fruit, and yield loss. ... Bacterial spot symptoms on field tomatoes caused by Xanthomonas perforans";
        treatment = "Soak seeds in a 20 percent bleach solution for 30 minutes (this may reduce germination) Soak seeds in water that is 125 F. (52 C.) for 20 minutes. When harvesting seeds, allow the seeds to ferment in the tomato pulp for one week. ";
        source = "Bacterial spot is caused by four species of Xanthomonas and occurs worldwide wherever tomatoes are grown. Bacterial spot causes leaf and fruit spots, which leads to defoliation, sun-scalded fruit, and yield loss. ... Bacterial spot symptoms on field tomatoes caused by Xanthomonas perforans.";
        PlantDisease xyz28 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz28);
        diseaseNameList.add(diseaseName);


        diseaseId = 30;
        diseaseName = "tomato early blight tomato";
        imglink="https://www.apsnet.org/edcenter/disandpath/fungalasco/pdlessons/Article%20Images/PotatoTomato02.jpg";
        nameOfCrop = "tomato";
        symptoms = "nitially, small dark spots form on older foliage near the ground. Leaf spots are round, brown and can grow up to half inch in diameter. Larger spots have target-like concentric rings. ... Severely infected leaves turn brown and fall off, or dead, dried leaves may cling to the stem.";
        about = " Initial symptoms on leaves appear as small 1-2 mm black or brown lesions and under conducive environmental conditions the lesions will enlarge and are often surrounded by a yellow halo";
        treatment = "Prune or stake plants to improve air circulation and reduce fungal problems. Make sure to disinfect your pruning shears (one part bleach to 4 parts water) after each cut. Keep the soil under plants clean and free of garden debris. ... Drip irrigation and soaker hoses can be used to help keep the foliage dry.";
        source = "Infection of both green and ripe tomato fruit normally occurs through the calyx with lesions sometimes reaching a considerable size";
        PlantDisease xyz29 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz29);
        diseaseNameList.add(diseaseName);


        diseaseId = 31;
        diseaseName = "tomato late blight tomato";
        imglink="https://i1.wp.com/www.gardeningchannel.com/wp-content/uploads/2020/01/tomato-leaf-mold.jpg?resize=768%2C402&ssl=1";
        nameOfCrop = "tomato";
        symptoms = "Firm, dark brown, circular spots grow to cover large parts of fruits. Spots may become mushy as secondary bacteria invade. In high humidity, thin powdery white fungal growth appears on infected leaves, fruit and stems. In cool, wet weather, entire fields turn brown and wilted as if hit by frost.";
        about = "Late blight is a potentially devastating disease of tomato and potato, infecting leaves, stems and fruits of tomato plants. The disease spreads quickly in fields and can result in total crop failure if untreated. Late blight of potato was responsible for the Irish potato famine of the late 1840s.";
        treatment = "If symptoms are observed, treat plants with one of the following fungicides: Apply a copper based fungicide (2 oz/ gallon of water) every 7 days or less, following heavy rain or when the amount of disease is increasing rapidly. If possible, time applications so that at least 12 hours of dry weather follows application.";
        source = "Leaf symptoms of late blight first appear as small, water-soaked areas that rapidly enlarge to form purple-brown, oily-appearing blotches. On the lower side of leaves, rings of grayish white mycelium and spore-forming structures may appear around the blotches. ";
        PlantDisease xyz30 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz30);
        diseaseNameList.add(diseaseName);


        diseaseId = 32;
        diseaseName = "tomato leaf mold";
        imglink="https://i1.wp.com/www.gardeningchannel.com/wp-content/uploads/2020/01/tomato-leaf-mold.jpg?resize=768%2C402&ssl=1";
        nameOfCrop = "tomato";
        symptoms = "Pale greenish-yellow spots, usually less than 1/4 inch, with no definite margins, form on upper sides of leaves. Olive-green to brown velvety mold forms on the lower leaf surface below leaf spots. Leaf spots grow together and turn brown. Leaves wither and die but often remain attached to the plant.";
        about = "Leaf mold is a common fungal disease that affects tomatoes that are cultivated in especially humid environments. Feeding off of the humidity, the mold grows and thrives after attaching itself to the leaves of the tomato plant";
        treatment = "Removing infected leaves. Remove infected leaves immediately, and be sure to wash your hands and pruners thoroughly before working with uninfected plants. Consider organic fungicide options. ...Consider chemical fungicides.";
        source = "When treating tomato plants with fungicide, be sure to cover all areas of the plant that are above the soil, especially the underside of leaves, where the disease often forms. Calcium chloride-based sprays are recommended for treating leaf mold issues. Organic fungicide options are also available.";
        PlantDisease xyz31 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz31);
        diseaseNameList.add(diseaseName);


        diseaseId = 33;
        diseaseName = "tomato septoria leaf spot";
        imglink="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8oylhFwmLFqCDAkmevZ-LRIL8dQqQLOsPjg&usqp=CAU";
        nameOfCrop = "tomato";
        symptoms = "early blight, septoria leaf spot occurs first on the lowest plant leaves. As it progresses, it moves upward through the plant. Unlike early blight's large, target-like lesions, septoria leaf spots start small. The numerous circular spots develop gray centers and dark brown edges.";
        about = "Once septoria leaf spot appears in tomatoes, time is of the essence. Remove infected lower leaves to limit the spread to fruit-bearing branches.";
        treatment = "The disease first appears on the lower leaves after the plant has set fruit. Leaf spots begin as yellow areas that later become circular with gray centers and dark borders. Spots may reach 1/8 inch in diameter and be surrounded by a yellow halo.";
        source = "Look for irregular, dark brown spots on both upper and lower leaf surfaces. Adjacent lesions frequently merge to form irregularly shaped blotches. Leaves become rusty brown. Symptoms of Septoria leaf spot can also develop on stems and pods of plants approaching maturity.";
        PlantDisease xyz32 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz32);
        diseaseNameList.add(diseaseName);


        diseaseId = 34;
        diseaseName = "tomato spider mites two spotted spider mite";
        imglink="https://agritech.tnau.ac.in/org_farm/tlc.jpg";
        nameOfCrop = "tomato";
        symptoms = "Leaves of mite-infested plants may turn yellow and dry up, and plants may lose vigor and die when infestations are severe. The undersides of affected leaves appear tan or yellow and have a crusty texture. Heavy infestations of the two‑spotted spider mite produce fine webbing that may cover the entire plant.";
        about = " The rubbing alcohol you have around the house also can kill spider mites. Soak cotton balls in rubbing alcohol and wipe across the foliage of infested houseplants. Let either the dish soap or rubbing alcohol sit on the plants a few hours, and then rinse the leaves thoroughly with water";
        treatment = "The best way to begin treating for two-spotted mites is to apply a pesticide specific to mites called a miticide. Ideally, you should start treating for two-spotted mites before your plants are seriously damaged. Apply the miticide for control of two-spotted mites every 7 days or so";
        source = "Pest-control materials recommended for managing spider mites outdoors include abamectin (Avid), bifenthrin (Talstar), dicofol (Kelthane), hexythiazox (Hexygon), insecticidal soap, and summer oil. Be sure to concentrate sprays on leaf undersides.";
        PlantDisease xyz33 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz33);
        diseaseNameList.add(diseaseName);


        diseaseId = 35;
        diseaseName = "tomato target spot";
        imglink="https://agritech.tnau.ac.in/org_farm/tlc.jpg";
        nameOfCrop = "tomato";
        symptoms = "Target spot symptoms begin as small dark lesions which enlarges to form light brown lesions with concentric pattern and a yellow halo around it in the transplants. Lesions can be seen inside the canopy and the micro-climate favors the infection process.";
        about = "A number of insects, including whiteflies and thrips, can transmit (vector) viruses in tomatoes. In virus-susceptible cultivars, disease management often relies on control of the insects that can transmit the virus since plants that become infected with a virus cannot be cured. ";
        treatment = "Pay careful attention to air circulation, as target spot of tomato thrives in humid conditions. Grow the plants in full sunlight. Be sure the plants aren't crowded and that each tomato has plenty of air circulation. Cage or stake tomato plants to keep the plants above the soil.";
        source = "Lesions can be seen inside the canopy and the micro-climate favors the infection process.";
        PlantDisease xyz34 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz34);
        diseaseNameList.add(diseaseName);


        diseaseId = 36;
        diseaseName = "tomato yellow leaf curl virus";
        imglink="https://agritech.tnau.ac.in/org_farm/tlc.jpg";
        nameOfCrop = "tomato";
        symptoms = "Typical symptoms for this disease in tomato are yellow (chlorotic) leaf edges, upward leaf cupping, leaf mottling, reduced leaf size, and flower drop. TYLCV can have a severe impact on tomato production. Plants infected at an early stage won't bear fruit and their growth will be severely stunted.";
        about = "Tomato yellow leaf curl virus (TYLCV) is a DNA virus from the genus Begomovirus and the family Geminiviridae. TYLCV causes the most destructive disease of tomato, and it can be found in tropical and subtropical regions causing severe economic losses";
        treatment = "Use only virus-and whitefly-free tomato and pepper transplants. Transplants should be treated with Capture (bifenthrin) or Venom (dinotefuran) for whitefly adults and Oberon for eggs and nymphs. Imidacloprid or thiamethoxam should be used in transplant houses at least seven days before shipping.";
        source = "The primary host for TYLCV is the tomato plant, and other plant hosts where TYLCV infection has been found include eggplants, potatoes, tobacco, beans, and peppers";
        PlantDisease xyz35 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz35);
        diseaseNameList.add(diseaseName);


        diseaseId = 37;
        diseaseName = "tomato mosaic virus";
        imglink="https://agritech.tnau.ac.in/org_farm/tlc.jpg";
        nameOfCrop = "tomato";
        symptoms = "Mottled light and dark green on leaves. ... If plants are infected early, they may appear yellow and stunted overall. Leaves may be curled, malformed, or reduced in size. Spots of dead leaf tissue may become apparent with certain cultivars at warm temperatures. Fruits may ripen  unevenly.";
        about = "The virus may be introduced on infected seed. Only a small number of seedlings need to be infected for the virus to spread rapidly. It can also be spread on contaminated tools and the clothing and hands of workers during routine activities.";
        treatment = "Fungicides will NOT treat this viral disease.\n Plant resistant varieties when available or purchase transplants from a reputable source. Do NOT save seed from infected crops.";
        source = "Due to the rapid spread of TYLCV in the last few decades, there is an increased focus in research trying to understand and control this damaging pathogen. Some interesting findings include virus being sexually transmitted from infected males to non-infected females";
        PlantDisease xyz36 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz36);
        diseaseNameList.add(diseaseName);


        diseaseId = 38;
        diseaseName = "tomato healthy";
        imglink="https://hort.extension.wisc.edu/articles/bacterial-spot-of-tomato/";
        nameOfCrop = "tomato";
        symptoms = "Symptoms vary among hosts and in a single host species. Stunting is a common symptom of TSWV infection. Chlorotic or necrotic rings form on the leaves of many infected hosts. Thickening of veins and bronzing of young leaves. Growing tips may die-back and terminal branches may be streaked.z";
        about = "Disease development is favored by high temperatures and high moisture. The bacteria multiply rapidly inside the water-conducting tissue of the plant, filling it with slime.";
        treatment = "Control of bacterial wilt of plants grown in infested soil is difficult. Rotation with non-susceptible plants, such as corn, beans and cabbage, for at least three years provides some control.";
        source = "If an infected stem is cut crosswise, it will look brown and tiny drops of yellowish ooze may be visible.";
        PlantDisease xyz37 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz37);
        diseaseNameList.add(diseaseName);

        diseaseId = 39;
        diseaseName = "Foot Rot Fungus";
        imglink="https://hort.extension.wisc.edu/articles/bacterial-spot-of-tomato/";
        nameOfCrop = "orange";
        symptoms = "Lesions and cankers around the base of the tree usually indicate foot rot fungus, especially if the lesions ooze sap";
        about = "Disease development is favored by high temperatures and high moisture. The bacteria multiply rapidly inside the water-conducting tissue of the plant, filling it with slime.";
        treatment = "This disease is not treatable. Remove and destroy infected trees. To minimize the risk of foot rot fungus, plant trees in well-draining soil and avoid overwatering them. Raised beds and berms are necessary if you have heavy clay soil.";
        source = "If an infected stem is cut crosswise, it will look brown and tiny drops of yellowish ooze may be visible.";
        PlantDisease xyz38 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz38);
        diseaseNameList.add(diseaseName);

        diseaseId = 41;
        diseaseName = "Alternaria tenuissima ";
        imglink="https://hort.extension.wisc.edu/articles/bacterial-spot-of-tomato/";
        nameOfCrop = "mango";
        symptoms = "Twigs and branches of trees infected with sooty canker develop peeling bark. Underneath the bark, you’ll find a black fungus. The leaves may turn brown and wither and the twigs may die back. ";
        about = "Alternaria tenuissima is a saprophytic fungus and opportunistic plant pathogen. It is cosmopolitan in distribution, and can colonize a wide range of plant hosts.";
        treatment = "To control Alternaria tenuissima, remove all infected branches. Cut them back 12 inches behind the infected area and disinfect your tools between cuttings by dipping them in a solution of one part chlorine bleach to 10 parts water.";
        source = "If an infected stem is cut crosswise, it will look brown and tiny drops of yellowish ooze may be visible.";
        PlantDisease xyz40 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz40);
        diseaseNameList.add(diseaseName);


        diseaseId = 42;
        diseaseName = "Monosporascus Root Rot";
        imglink="https://hort.extension.wisc.edu/articles/bacterial-spot-of-tomato/";
        nameOfCrop = "melon";
        symptoms = "Monosporascus vine decline, caused by Monosporascus cannonballus, can be suppressed by application of the fungicide Cannonball at seeding or transplanting followed by additional applications as specified on the product label";
        about = "Infected plants usually do not develop symptoms until near harvest time. Infected plants wilt (Image 1) and eventually die. Sometimes, there is vascular browning (Image 2). Brown lesions may be found on the roots (Image 3), even on plants that are not wilting. Root lesions may be caused by other soil-borne fungi, such as Pythium sp. and Rhizoctonia solani (Image 4). This disease is primarily a problem on silt or clay soils of the Lower Rio Grande Valley. The fungus is indigenous to the soil and populations build up with continued cucurbit monoculture, particularly cantaloupe. Soil fumigation is an effective control, but is not usually economical. Soils with consistent problems should not be planted to cucurbits.";
        treatment = "M. cannonballus is transmitted via the planting of infected seedlings and the replanting of cucurbit crops in infected fields. It is unlikely that it is transmitted by water movement such as heavy rain or irrigation. The disease is often indigenous to the soil and is fostered by continued cucurbit cultivation. Although soil fumigation is effective, it is also costly. Cucurbits should not be planted in areas with proven consistent infection of this disease. Crop rotation and good cultural practices are the best non-control methods for the disease. Fungicide treatments applied just at plant emergence have been shown to be affective at controlling Monosporascus root rot of cucurbits Read more at Gardening Know How: Cucurbit Root Rot: Learn About Monosporascus Root Rot Of Cucurbits https://www.gardeningknowhow.com/plant-problems/disease/cucurbit-monosporascus-root-rot.htm";
        source = "If an infected stem is cut crosswise, it will look brown and tiny drops of yellowish ooze may be visible.";
        PlantDisease xyz41 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz41);
        diseaseNameList.add(diseaseName);

        diseaseId = 44;
        diseaseName = "Damping-off";
        imglink="https://hort.extension.wisc.edu/articles/bacterial-spot-of-tomato/";
        nameOfCrop = "okra";
        symptoms = " Seedlings appear wilted, yellowed and either depression, light brown ring-shaped lesions or water-soaked, dark green lesions are found on the collar.";
        about = "This disease can cause an 80% reduction in okra seed emergence. The very widespread disease mostly affects seed germination (pre-emergence damping off). When damping-off occurs, seedlings emerge later and are sparse.";
        treatment = "M. cannonballus is transmitted via the planting of infected seedlings and the replanting of cucurbit crops in infected fields. It is unlikely that it is transmitted by water movement such as heavy rain or irrigation. The disease is often indigenous to the soil and is fostered by continued cucurbit cultivation. Although soil fumigation is effective, it is also costly. Cucurbits should not be planted in areas with proven consistent infection of this disease. Crop rotation and good cultural practices are the best non-control methods for the disease. Fungicide treatments applied just at plant emergence have been shown to be affective at controlling Monosporascus root rot of cucurbits Read more at Gardening Know How: Cucurbit Root Rot: Learn About Monosporascus Root Rot Of Cucurbits https://www.gardeningknowhow.com/plant-problems/disease/cucurbit-monosporascus-root-rot.htm";
        source = "If an infected stem is cut crosswise, it will look brown and tiny drops of yellowish ooze may be visible.";
        PlantDisease xyz43 = new PlantDisease(diseaseId,diseaseName,imglink, nameOfCrop,symptoms,about , treatment, source);
        listOfDiseases.put(diseaseName, xyz43);
        diseaseNameList.add(diseaseName);


    }
}


////        disease 0: xyz Sample
//        diseaseId = 0;
//        diseaseName = "xyz";
//        nameOfCrop = "abc";
//        symptoms = "sympptoms of xyz";
//        about = "about xyz";
//        treatment = "";
//        source = "";
//        PlantDisease xyz = new PlantDisease(diseaseId,diseaseName, nameOfCrop,symptoms,about , treatment, source);
//        listOfDiseases.put(diseaseName, xyz);
//        diseaseNameList.add(diseaseName);
