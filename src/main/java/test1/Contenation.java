package test1;

import javax.swing.*;
import java.util.Scanner;

public class Contenation {


    public static void main(String[] args) {
        // Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
        // Örnek:‘Ali Can’ için konsolda false yazmalıdır.
        // ‘ Ali Can ’ için konsolda false yazmalıdır. ‘ Ali Can ’ için konsolda false yazmalıdır.
        // ‘Ali Can’ için konsolda true yazmalıdır.
// trim() methodu bir stringin basinda ve sonunda olan bosluklari silmeye yarar

        String str = "   Amerika  Fransa  ";
        int uzunluk1 = str.replace(" ", "").length();

        int uzunluk2 = str.trim().length();
        int sonuc = uzunluk2 - uzunluk1;
        if (sonuc == 1) {

            System.out.println("ortada tek bir bosluk var");
        } else
            System.out.println("ortada tek bosluk yok");



    }




    }


















