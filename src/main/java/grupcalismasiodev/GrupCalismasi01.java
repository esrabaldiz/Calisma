package grupcalismasiodev;

import javax.swing.*;
import java.util.Scanner;

public class GrupCalismasi01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//        A
//        AA
//        AAA
//        AAAA
        //       1.Yol:
/*
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            String s = "";
            for (int k = 1; k <= i; k++) {
                s = s + "A";
            }
            System.out.println(s);

        }
        System.out.println();

//7:çarpım tablosunu oluşturmak için kod yazınız.
//3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
   //     int num = 3;
       // for (int i = 1; i < 11; i++) {
      //      System.out.println(num + "x" + i + "=" + num * i);
        }
//20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında
// boşluk bırakarak yazdırmak
// için gereken kodu yazınız.
/*
        String str = "";
        for (int i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                str = str + i + " ";
            }
        }
            System.out.println(str);
        System.out.println();
//String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
// Örneğin; 'Ali Can?' ==> l*i*a*n*
    /*
String  s=input.nextLine();


s=s.replaceAll("[^a-z]" ,"" );
String t="";
for (int i=0 ;i<s.length() ;i++){
String r=s.substring(i,i+1) ;
    t=t+r+'*';

}
     */


//        System.out.println(t);

// Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 75.4238  ́ *4*2*3*8
  /*
        double num1 = 75.4238;
        String s = String.valueOf(num1);
        int numYeni = s.indexOf(".");
        String ondalikliKisim = s.substring(numYeni + 1);
        String t = "";

        for (int i =0; i<ondalikliKisim.length();i++){
            String son=ondalikliKisim.substring(i,i+1);
            t=t+"*"+son;

        }
/*
        System.out.println(t);
//11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        System.out.println("bir cumle ya da kelime girniz");
        String cumle=input.nextLine();
        String bos="";
        for (int i=cumle.length()-1;i>-1; i--){
            bos=bos+cumle.substring(i,i+1);

        }

        System.out.println(bos);
 */
 // Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // AA A A A A A A
        // AX X X X X X A
        // AX X X X X X A
        // AX X X X X X A
        //1.Yol:

       int satir=4;
       int sutun=8;
       for (int i=1;i<=satir;i++){
           String str="";

           if (i==1  ||  i==satir ) {
               for (int k = 1; k <= sutun; k++) {
                   str = str + "A";

               }
               System.out.println(str);

           }else{
               str=str+"A";
               for (int m=2; m<sutun ; m++){
                   str=str+"X";

               }
               str=str+"A";
               System.out.println(str);
           }
       }







    }


}


