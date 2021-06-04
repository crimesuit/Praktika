package com.mycompany.praktika;

public class Сlient {
   String FIO_client = ("Волконский Кирилл Богданович");
        public String getFIO_client(){
            return FIO_client;
        }
        String adress = ("Улица Князя Владимира, дом 16");
        public String getAdress(){
            return adress;
        }
            
        int date_birth = (230495);
        public int getDate_birth(){
            return date_birth;
        }
        int passport_num = (1623412046);
        public int getPassport_num(){
            return passport_num;
        }
        int date_polucheniya = (120520);
        public int getDate_zaselen(){
            return date_polucheniya;
        }
        // вывод информации о соискателе
        void СlientOut(){
            System.out.println("Имя клиента: " + FIO_client);
            System.out.println("Адресс: " + adress);
            System.out.println("Дата рождения: " + date_birth);
            System.out.println("Номер паспорта: " + passport_num);
            System.out.println("Дата получения товара: " + date_polucheniya);
            System.out.println("");
        }
} 
