package exceptions;

import java.util.Scanner;

public class C01 {/*
       Kullanicidan yasini isteyin
       kullanici yas olarak negatif bir sayi,
       0 veya
       120'den buyuk bir sayi girerse illegalArgumentException olusacak sekilde
       bir program yaziniz
       */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi giriniz");
        int age = scan.nextInt();

        try {
            if (age<0|| age>120){
                System.out.println("yas 0 veya 120 arasinda olmalidir");
                throw new IllegalArgumentException("yas 0 veya 120 arasinda olmalidir");


            } else {
                System.out.println(age);

            }
        }catch (IllegalArgumentException e){
            System.out.println();
        }


    }
}