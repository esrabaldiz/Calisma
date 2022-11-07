package grupcalismasiodev;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {

//        3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
       int sayi=3;
       int sonuc=0;
       for (int i=sayi; i<15; i++){
           sonuc=sonuc+i;
       }
        System.out.println(sonuc);
        System.out.println();
   //3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
int num=1;
for (int i=3; i<10 ; i++){
    num=num*i;
}

        System.out.println(num);

//) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.
        String str="";
        for (char i='C'; i>='A';i-- ){
            str=str+i;
        }

        System.out.println(str);
// Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 75.4238  ́ *4*2*3*8


double no=75.4238;
String str2=String.valueOf(no);
int num2=str2.indexOf(".");
String hiclik="";
String yenistr=str2.substring(num2+1);
for (int i=0 ; i<yenistr.length();i++){
    String son=yenistr.substring(i,i+1);
    hiclik=hiclik+"*"+son;
}
        System.out.println(hiclik);
/*
EX;5; kullanicidan bir sifre isteyi
ilk harf kucuk OLMALI
son karakter rakam olsun
eger bu saglanmiyorsa whilw loop ile tekrar tekrar sifre isteyin
 */

        Scanner input=new Scanner(System.in);

    String s = " ";
        int counter = 0;
        boolean sifregecerlimi = false;
        while (sifregecerlimi != true) {

            System.out.println("sifre gir");
            s = input.next();

            counter = 0;

            if (!(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')) {
                System.out.println("gecersiz tekrar dene");
                counter++;
            }
            if (!(s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')) {
                System.out.println(" yanlis sifre yeniden  son karakter sayi gir");
                counter++;
            }

            if (counter == 0) {
                sifregecerlimi = true;
            }
        }

}






    }

