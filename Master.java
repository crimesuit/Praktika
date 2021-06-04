package com.mycompany.praktika;

public class Master {
    int id = (1246);
        public int getID(){
            return id;
        }
        String FIO = ("Гусев Никита Максимович");
        public String getFIO(){
            return FIO;
        }
         int date_start = (240322);
        public int getDate_start(){
            return date_start;
        }
         int date_end = (220626);
        public int getDate_end(){
            return date_end;
        }
        void MasterOut(){
            System.out.println("Имя мастера: " + FIO);
            System.out.println("Номер мастера: " + id);
            System.out.println("Дата начала работы: " + date_start);
            System.out.println("Дата истечения рабочего контракта: " + date_end);
            System.out.println("");
        } 
}