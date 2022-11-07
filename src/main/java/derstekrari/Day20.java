package derstekrari;

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
/*
    ?
   ? ?
  ? ? ?
 ? ? ? ?
? ? ? ? ?

       Kullanicinin verecegi kenar uzunlugunu ve verecegi bir karakteri kullanarak eskenar ucgen cizen kod.

        */
        Scanner input = new Scanner(System.in);
        System.out.println("bir kenar uzunlugu giriniz");
        int kenarUzunlugu = input.nextInt();
        System.out.println("lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);


        for(int i=1;i<=kenarUzunlugu;i++){
            for(int k=i; k<=kenarUzunlugu;k++){
                System.out.print(" ");}



            for(int m=1; m<=i;m++){
                System.out.print(ch + " ");

                }
                System.out.println();
            }
      /*
            int i,j,k;//Değişekenlerimizi tanımladık.
            for (i=1; i<10; i++) {//Döngümüzün ne kadar döneceğini belirtir.
                for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                    System.out.print(" ");//Boşluğumuzu belirtiyoruz.
                }
                for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                    System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                    System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
                }
                System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
            }

       */
        }

    }

