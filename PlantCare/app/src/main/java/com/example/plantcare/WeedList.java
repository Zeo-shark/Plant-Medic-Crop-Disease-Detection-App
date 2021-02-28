package com.example.plantcare;

import java.util.HashMap;

public class WeedList {

    HashMap<String , Weeds > listOfWedds = new HashMap<>();

    public WeedList(){
        String weedName = "";
        String sol = "";

//        1
        weedName = "Chinee Apple";
        sol =  "Glyphosate of ammonium salt";
        Weeds w1 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w1);

        //        2
        weedName = "Lantana";
        sol =  "Glyphosate (4%SL) 2.5 Litre/ha";
        Weeds w2 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w2);

        //        3
        weedName = "Parkinsonia";
        sol =  "Triclopyr-(1.5kg/ha)";
        Weeds w3 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w3);

        //        4
        weedName = "Parathenium";
        sol =  "Chromium ethyl(25%WP) 40g/ha";
        Weeds w4 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w4);

        //        5
        weedName = "Prickly Acacia";
        sol =  "Paraquart Dichloride(24%SL)";
        Weeds w5 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w5);

        //        6
        weedName = "Rubber vine";
        sol =  "Glyphosate (3 litre/ha)";
        Weeds w6 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w6);

        //        7
        weedName = "Siam weed";
        sol =  "24D Sodium (80%), Linurom(50%WP) 2kg/ha";
        Weeds w7 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w7);

        //        8
        weedName = "Snake Weed";
        sol =  "Dicamba+24D (2.5kg/ha)";
        Weeds w8 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w8);

        //        9
        weedName = "Negative";
        sol =  "Not a weed";
        Weeds w9 = new Weeds(weedName , sol);
        listOfWedds.put(weedName , w9);
    }
}
