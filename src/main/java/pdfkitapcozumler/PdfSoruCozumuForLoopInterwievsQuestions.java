package pdfkitapcozumler;

import java.util.Scanner;

public class PdfSoruCozumuForLoopInterwievsQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 /*
 //kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoriyelini bulun
        System.out.println("10'dan kucuk bir tam sayi giriniz");
        int num1= scan.nextInt();
//5= 5 * 4 * 3 * 2 * 1
        int carpim=1;
        if (num1<10 && num1>0) { //-5
            for (int i = num1; i > 0; i--) {

                carpim = carpim * i;
            }
            System.out.println(carpim);

        }else {
            System.out.println("Lutfen 10'dan kucuk bır tam sayi giriniz");
        }
        System.out.println();
*/
/*        System.out.println("lutfen 10'dan kucuk bir tam sayi girinz");
        int num=scan.nextInt();
        int carpim2=1;
        if (num<10&&num>0){
          for (int i =num;i>0 ; i--) {
          carpim2=carpim2*i;
          }
            System.out.println(carpim2);
        }else System.out.println("lutfen 10'dan kucuk bir tam sayi girinz");
*/
//kullanicidan bir tam sayi isteyin ve girilen sayiya gore asagidaki sekli cizin
        /*
         *
         * *
         * * *
         * * * *

         */
  /*      System.out.println("Pozitif bir rakam giriniz");
        int satir = scan.nextInt();
        if (satir > 0 && satir < 10) {

            for (int i = 1; i < satir + 1; i++) {

                for (int j = 1; j < i + 1; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Lutfen bir rakam giriniz");
  /*
/*
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablsounu gormek icin bir sayi giriniz");
        int s = input.nextInt();
        int n = 1;

        while (n < 11) {
            System.out.println(s + "x" + n + " = " + s * n);
            n++;

            System.out.println("lutfen pozitif bir rakam giriniz");
            int rakam = scan.nextInt();
            int str = 1;
            while (str < 11) {
                System.out.println(rakam + "x" + str + " = " + rakam * str);
                str++;
            }
/

  */
   /*     for (int i = 1; i < 5; i++) {
            for (int k = 1; k < i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
/*
        }


        int k = 3;
        while (k < 14) {
            if (k % 2 == 1) {
                System.out.println(k + " ");

            }
            k++;

        }
        System.out.println();
*/
//15, 20 ve 90á bolunen 3 basamkli sayilari while loop  ve fot loop ile yazdir
 /*       System.out.println("lutfen uc basamakli bir sayi saciniz");

        int sayi = scan.nextInt();
        int str = 99;
        while (sayi > 99 && sayi<1000) {
            for (int i = 99; i < 1000; i++) {


                if (sayi % 15 == 00 && sayi % 20 == 0 && sayi % 90 == 0) {

                     System.out.println(sayi + " ");

                }
                sayi++;

            }
            System.out.println();

        }
*/
   /*     System.out.println("lutfen uc basamakli bir sayi saciniz");

        int sayi = scan.nextInt();
        for (int i = 100; i < 1000; i++) {


            if (i % 15 == 00 && i % 20 == 0 && i % 90 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
*/
        //kullanicidan baslangic ve bitis degerleri alin ve baslangis ve bitis degerleri dahil aralarindaki
        // tum cift sayilari while loop kullanarak ekrana yazdiriniz
/*
        int baslangic = 12;

        int sum = 0;

        while (baslangic < 99) {
            if (baslangic % 2 == 0)
                sum += baslangic;
            baslangic++;
        }
        System.out.println(sum);


//iki sayi giriniz ve girilen sayilar ve aralarindaki tum tam sayilari toplayip sonucu yazdiran program yaziniz
        /*
 int sayi1=12;
 int sayi2=90;
 int sum=0;
 for (int i=sayi1; i<sayi2+1 ; i++){
   sum+=i;
     System.out.println(sum);

 }

        System.out.println( sum );
*/

//kullanicidan baslangic ve bitis degerleri alin ve baslangis ve bitis degerleri dahil aralarindaki
// tum cift sayilari while loop kullanarak ekrana yazdiriniz
/*
        int baslangic = 12;


        while (baslangic < 99 ) {
            if (baslangic % 2 == 0) {






                System.out.println(baslangic + "  ");

            }
            baslangic++;

 */

 /*       //10 dan kucuk bi sayi gir ve faktoriyelini bul
        int sayi4 = 4;
        int carpma = 1;
        for (int i = sayi4; i >= 1; i--) {
            carpma = carpma * i;
        }
        System.out.println(carpma);

        System.out.println();
*/

        //int baslangic = 12;
        //
        //        int sum = 0;
        //
        //        while (baslangic < 99 ) {
        //
        //
        //
        //        }
        //


        int baslangic = 12;
        int sum=0;
        while (baslangic < 99) {
        if (baslangic%2==0){
            sum += baslangic;
            baslangic++;
        }





        }
    }
}






