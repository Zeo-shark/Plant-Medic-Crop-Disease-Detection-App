package com.example.plantcare;

public class PlantDisease {
    int id;
    String symptoms;
    String about;
    public PlantDisease(int dId ,String sympMsg, String aboutMsg ){
        symptoms = sympMsg;
        about = aboutMsg;
        id = dId;
    }
}
