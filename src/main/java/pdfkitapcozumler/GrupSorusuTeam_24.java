package pdfkitapcozumler;

import java.util.Scanner;

public class GrupSorusuTeam_24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//3'den altiya  kadar tamsayilarin toplamini bulan kodu yaz
  /*
        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
        System.out.println();
        //6'dan 3'e kadar tamsayilarin carpmasini veren kodu yazin
        int carpim = 1;
        for (int i = 6; i >= 3; i--) {
            carpim = carpim * i;
        }

            System.out.println(carpim);
        System.out.println();
        */
 //size verilen bir tam  sayinin rakamlari toplamini giriniz/
int numero=35;
int result=0;

for (int i=numero; i>0; i=i/10) {
    result = result + i %10;
}
        System.out.println(result);
//System.out.println("Lutfen 4 karakterli bir kelime giriniz");
//        String kelime=input2.next();
//        System.out.println(kelime.length());
//        if(kelime.length()==4){
//            char bir=kelime.charAt(0);
//            char iki= kelime.charAt(1);
//            char uc=kelime.charAt(2);
//            char dort=kelime.charAt(3);
//            System.out.println("Tersten yazilmis hali : "+dort+uc+iki+bir);
//        }else if(kelime.length()>4){
//            System.out.println("Giriginiz kelime 4 karakterden fazla");
//        }else if(kelime.length()<4){
//            System.out.println("Girdiginiz kelime 4 karakterden az");
//        }

        System.out.println("lutfen bir kelime giriniz");

String tersKelime=scan.nextLine();
String sepet="";
for (int i=tersKelime.length()-1; i>-1 ; i--) {
    char c = tersKelime.charAt(i);
    sepet = sepet + c;
}

        System.out.println(sepet);

        }
    }





