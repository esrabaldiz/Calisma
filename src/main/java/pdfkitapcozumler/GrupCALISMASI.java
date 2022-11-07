package pdfkitapcozumler;

import java.util.Arrays;
import java.util.Scanner;

public class GrupCALISMASI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

/*        System.out.println("lutfen bir isim giriniz");

        String isim = input.nextLine();


        if (isim.contains("a") && isim.contains("A")) {
            System.out.println("girdiginiz isim a harfi iceriyor");
        } else if (isim.contains("Z") && isim.contains("z")) {
            System.out.println("isim Z harfi iceriyor");

        } else if (!isim.contains("a") && !isim.contains("Z")) {
            System.out.println("girdiginiz isim  a veya Z harfi icermiyor");

        } else if (isim.contains("Z") && isim.contains("a")) {
            System.out.println("isminiz hem a hem de z harfi iceriyor");
        }else if (isim.contains("A") && isim.contains("Z")){
            System.out.println("isminiz hem a hem z harfi iceriyor");
        } else
            System.out.println("lutfen gecerli bir isim giriniz");

System.out.println("Lutfen 4 karakterli bir kelime giriniz");
        String kelime=input2.next();
        System.out.println(kelime.length());
        if(kelime.length()==4){
            char bir=kelime.charAt(0);
            char iki= kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);
            System.out.println("Tersten yazilmis hali : "+dort+uc+iki+bir);
        }else if(kelime.length()>4){
            System.out.println("Giriginiz kelime 4 karakterden fazla");
        }else if(kelime.length()<4){
            System.out.println("Girdiginiz kelime 4 karakterden az");
        }


 */
//kullanicidan isim  ve soyismini isteyin ve hangisinin daha uzun oldugunu yaziniz
/*        System.out.println("adinizi giriniz");
        String ilkIsim = input.nextLine();
        System.out.println("soyadinizi girniz");
        String soyAd = input.nextLine();


        if (ilkIsim.length() > soyAd.length()) {
            System.out.println("isminiz soyadinizdan uzun");

        } else if (soyAd.length() > ilkIsim.length()) {
            System.out.println("soyadiniz isminizden uzun");
        } else System.out.println("lutfen gecerli bir isim giriniz");
        System.out.println();
  */
//// Kullanicidan 4 harfli bir kelime isteyin
//        // ve girilen kelimeyi tersten yazdirin
        System.out.println("lutfen 4 harfli bir kelime girniz");
        String kelime = input.next();
        if (kelime.length()==4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("tersten yazilmis hali : " + dort + uc + iki + bir);
        }else if (kelime.length()>4 ) {
            System.out.println("girdiginiz karakter 4 harften fazla");

        }else if (kelime.length()<4){
            System.out.println("girdiginiz karakter 4 harften az");

            }else System.out.println("lutfen gecerli bir kelime giriniz");
        }


    }


























