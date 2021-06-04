package com.mycompany.praktika;

public class JeweleryWorkshop {
   String place = ("филиал в Австралии");
        public String getPlace(){
            return place;
        }
        String name = ("Diamond");
        public String getName(){
            return name;
        }
        void JeweleryworkshopOut(){
            System.out.println("ИНФОРМАЦИЯ О ПОСЕЩЕНИИ");
            System.out.println("Расположение: " + place);
            System.out.println("Название ювелирной мастерской: " + name);
            System.out.println("");
        }
}
