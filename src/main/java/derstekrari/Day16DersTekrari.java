package derstekrari;

import java.util.Arrays;

public class Day16DersTekrari {
    public static void main(String[] args) {
/*
        int arr[] = {12, 31, 43, 14};
        int sayi = 43;
        Arrays.sort(arr);
        int idex1 = Arrays.binarySearch(arr, sayi);
        System.out.println(idex1);

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);
*/

//exemple:
//bir strimgdeki sesli  harflerin sayisini bulan kodu yaziniz
String str="Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki";

str=str.toLowerCase();
String harfler[] = str.split("");

int counter =0;
  System.out.println(Arrays.toString(harfler));

  for (String w : harfler) {
      switch (w){
          case"a":
          case"e":
          case"i":
          case"o":
          case"u":
              counter++;

      }
  }

        System.out.println(counter);








    }
}

