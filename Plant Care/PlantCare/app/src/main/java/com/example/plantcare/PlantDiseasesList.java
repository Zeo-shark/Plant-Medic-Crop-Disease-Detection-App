package com.example.plantcare;


import java.util.ArrayList;
import java.util.HashMap;

public class PlantDiseasesList {
    HashMap<String , PlantDisease> listOfDiseases = new HashMap<>();
    ArrayList<String> diseaseNameList = new ArrayList<>();
    PlantDiseasesList(){


        int diseaseId;
        String diseaseName ;
        String symptoms;
        String about;

//        disease 0: xyz
        diseaseId = 0;
        diseaseName = "xyz";
        symptoms = "sympptoms of xyz";
        about = "about xyz";
        PlantDisease xyz = new PlantDisease(diseaseId,symptoms,about);
        listOfDiseases.put(diseaseName, xyz);
        diseaseNameList.add(diseaseName);

//        disease 1: abc
        diseaseId = 1;
        diseaseName = "abc";
        symptoms = "sysmptoms of abc";
        about = "about abc";
        PlantDisease abc = new PlantDisease(diseaseId,symptoms,about);
        listOfDiseases.put(diseaseName, abc);
        diseaseNameList.add(diseaseName);

    }
}
