package pdfkitapcozumler;

import java.util.Scanner;

public class PdfCozumler2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        Interview Question
//        Kullanicidan 100'den kucuk bir tamsayi isteyin.1'den baslayarak girilen sayiya kadar tum sayilari yazdirin.
//        Ancak;
        //       -Sayi 3'un kati ise sayi yerine "Java" yazdirin.
        ////               -Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
        //              -Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
//                */ // 1,2,3,4,guzeldir
/*
        System.out.println("100'den kucuk bir tam sayi giriniz: ");
        int num= input.nextInt();

        for (int i = 1; i <num ; i++) {
            System.out.print(i+", ");
        }if (num%3==0 && num%5==0){
            System.out.println("Java Guzeldir");
        } else if (num%3==0) {
            System.out.println("Java");

        } else if (num%5==0) {
            System.out.println("Guzeldir");

 */


        //       7-Interview Question)
        //       Kullanicidan bir String isteyin ve Stringi tersten yazin
        /*

         */
 /*
        System.out.println("Bir String giriniz: ");
        String str = input.nextLine();
        String bos = "";
        for (int i = str.length() - 1; i > -1; i--) {
            char ch = str.charAt(i);
            bos = bos + ch;
        }
        System.out.println(bos);
*/
//kullanicidan bi sitring al ve onu tersten yazdir
        /*
        System.out.println("lutfen bir  isim giriniz");
        String str2 = input.nextLine();
        String bosSepet = "";

        for (int i = str2.length() - 1; i > -1; i--) {
            char bs = str2.charAt(i);
            bosSepet = bosSepet + bs;

            System.out.println(bosSepet);
 */
//kullanicidan bir string girin stringin
// palindrome olup olmadigini kontrol eden bir kod yaziniz
     //   System.out.println("Bir cümle giriniz: ");
/*
        String str = input.nextLine();// Kabak

        String tersten = "";
        for (int i = str.length() - 1; i > -1; i--) {
            char st = str.charAt(i);
            tersten = tersten + st;
        } if (str.equalsIgnoreCase(tersten)) {
                System.out.println("palindromedir");
            } else {
                System.out.println("palindrome degildir");

            }
                System.out.println(tersten);
        */
//kullanicidan iki tam sayi isteyin ve aralarindaki tum tam sayilari yazdiriniz
 /*       System.out.println("lutfen iki tam sayi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int bosKume =0;

if (sayi1>sayi2){
    for (int i=sayi1; sayi1>=sayi2; ) {
        bosKume = bosKume + i;
    }
} else if (sayi2>sayi1) {
    for (int i=sayi2;sayi2>=sayi1 ;i--){
        bosKume=bosKume+i;
    } System.out.println(bosKume);
}else System.out.println(sayi1);
        System.out.println();

  */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int num1 = scan.nextInt(); // 5
        int num2 = scan.nextInt(); // 10
// 5 + 6 + 7+ 8 + 9 + 10

        int sepet = 0;

        if (num2>num1) {// 5 10                  num2>num1
            for (int i = num1; i <= num2; i++) {
                sepet = sepet + i;
            }
            System.out.println(sepet);
        } else if (num1>num2) { // 10.9.8.7... 5 num1>num2
            for (int i = num1; i>=num2 ; i--) {
                sepet=sepet+i;
            } System.out.println(sepet);
        }else {
            System.out.println(num1); // esit olma durumu
        }

    }


        }







