package com.mycompany.praktika;

public class ListofProduct {
   String cost=("от 5000 до 150000");
        public String getCost(){
            return cost;
        }
        String product =("золото,жемчуг,брилианты,серебро,эмаль");
        public String getproduct(){
            return product;
        }
         String nazvaniye = ("кольцо,серьги,цепочки,ожерелье,кулоны,запонки");
        public String getNazvaniye(){
            return nazvaniye;
        }
        int date_issue = (300419);
        public int getDate_issue(){
            return date_issue;
        }
        int date_end=(300519);
        public int getDate_end(){
            return date_end;
        }
        void  ListofProductOut(){
            System.out.println("Тип материала: " + nazvaniye);
            System.out.println("Вид товара: " + product);
            System.out.println("Стоимость: " + cost);
            System.out.println("дата выдачи:" + date_issue);
            System.out.println("дата окончания:" + date_end);
            System.out.println("");
        } 
}
