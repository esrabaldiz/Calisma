package pdfkitapcozumler;

import java.util.Scanner;

public class Day18PdfCalismasi {
    public static void main(String[] args) {
//5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak
// için kod yazınız.

        for (int i = 3; i <= 9; i++) {

            if (i == 5) {
                continue;

            }
            System.out.print(i + " ");
        }
//Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı
// girmesini isteyiniz. Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”,
// kullanıcı 120 girerse “120 asal değildir” olur, kullanıcı negatif tam sayılar girerse
// çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı yönlendiriniz.
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();
        int counter = 0;

        if (sayi > 0 )
        if   (  sayi == 0) {
            System.out.println(sayi + "bir asal sayidir");
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(sayi + "bir asal sayidir");
            }else System.out.println("positif bir tam sayi giriniz");

        }

    }
}

