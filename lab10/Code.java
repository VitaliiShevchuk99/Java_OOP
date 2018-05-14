package com.company;

import java.util.Date;

public class Main {


    public static void main(String[] args) {
        // write your code here


        //System.out.println("Hello,our products:");
        Bread bread;
        Milk milk;
        Meat meat;
        Gus gus;
        View[]product = new View[]{
                bread=new Bread(
                        "хліб чорний",
                        "хлібина",
                        10,
                        5,
                        22.03
                ),
                milk=new Milk(
                        "молоко Галичина",
                        "Пляшка",
                        8,
                        7,
                        20.03
                ),
                meat=new Meat(
                        "м'ясо свинина",
                        "кілограм",
                        15,
                        20,
                        15.03
                ),
                gus=new Gus(
                        "гусь Вася",
                        "туша",
                        1,
                        17,
                        28.03
                )

        };

        System.out.println("Hello");
        for (int i=0;i<product.length;i++){
            System.out.println("товар " + product[i].name+" за ціною "+product[i].price);
        }




    }
}
