package derstekrari;

import java.util.*;

public class ArraySoru {
    public static void main(String[] args) {
  /*      int arr[][] = { {3,2,1},{1,2,3} };
        for (int i = 1; i < arr.length; i++) {
            for (int k = 1; k < arr[0].length; k++) {
                if (arr[i][k] % 2 == 1){
                arr[i][k] = arr[i][k] + 1; }
                if (arr[i][k] % 2 == 0){ arr[i][k] = arr[i][k] * 2;
                } }
        }
        System.out.println(Arrays.deepToString(arr)); }//[[3, 2, 1], [1, 4, 8]]
}


   */
//tam sayilardan olusan bir arraydeki ortadaki elmani bulunuz
//      (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
//
//       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
 /*       int[] a = new int[]{12, 5, 8, 13};
        Arrays.sort(a);
        if (a.length % 2 != 0) {
            int ortadakiElemanIndexi = a.length / 2;
            System.out.println(ortadakiElemanIndexi);
        } else {
            Integer ortadakiElemaninIndexi = a.length / 2;
            int ortadakiEleman = (a[ortadakiElemaninIndexi] + a[ortadakiElemaninIndexi - 1]) / 2;
            System.out.println(ortadakiEleman);
        }
*/
/*
        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana
        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));//[ne, ki, Java, kolay, kolaydir, calisana, calismayana]
        System.out.println(words[words.length-1]);//calismayana


 */
        /*
        //       String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //       Örnek: ( Kemal, Jonathan, Mark, Angie, Veli )
        //       ==> Output is Mark, Veli
        String[] b = new String[]{"Yasar", "Fehmi", "Esra", "Ayse", "oyku"};
       int minLenght=b[0].length();
       for (String w:b){
           minLenght=Math.min(minLenght,w.length());
            }
       for (String w:b){
           if (minLenght==w.length()){

           }
        }

         */
        //    Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz. Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
  /*      int[] a = new int[]{12, 5, 6, 4, 8, 13};
        Arrays.sort(a);//5,6,4,8,12,13
        if (a.length % 2 != 0) {
            Integer ortadakiElemaninIndexi = a.length / 2;
            System.out.println(a[ortadakiElemaninIndexi]);
        } else {
            Integer ortadakiElemaninIndexi = a.length / 2;
            Integer ortadakiEleman = (a[ortadakiElemaninIndexi] + a[ortadakiElemaninIndexi - 1]) / 2;
            System.out.println(ortadakiEleman);
        }

/*
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLength = b[0].length();
        for (
                String w : b) {
            minLength = Math.min(minLength, w.length());
        }
        for (
                String w : b) {
            if (minLength == w.length()) {
                System.out.println(w);
            }

        }


 */
    /*    //Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        //    Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -12,-5,-2,18,23

        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (Integer i = 0; i < a.length; i++) {
            if (a[i] < 0 && a[i + 1] > 0) {
                System.out.println("Maximum negative: " + a[i]);
                System.out.println("Minimum positive: " + a[i + 1]);


            }
        }

*/
  /*      //     1.Yol:
        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);//-12,-5,-2,18,23
        Integer minPositive = a[a.length - 1];
        Integer maxNegative = a[0];
        for (Integer w : a) {
            if (w >= 0) {
                minPositive = Math.min(minPositive, w);
            }
            if (w < 0) {
                maxNegative = Math.max(maxNegative, w);
            }


        }
/*
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
String bos="";
        for (String w:b){
            if (w.endsWith("n") || w.endsWith("k")) {
                bos = bos + w.substring(0, 1);
            }
            }
            System.out.println(bos);
*/
// String’ lerden oluşan bir arrayde kullanılan öğelerin toplam
// karakter sayısını bulunuz. Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
/*
String[] c=new String[]{"Kemal","Jonathan","Mark","Angie","Veli"};
int sum=0;

for (String w: c){
    sum=sum+w.length();
}
        System.out.println("ogelerin toplam sayisi" + ":"   +  sum);
*/
//  Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
/*
String s="Ben eger  javayi anlarsam sevecegim ve ask anlamli"  ;
String [] arr=s.split(" ");
int  counter=0;

  for (String w:arr) {
      if (w.startsWith("a") || w.startsWith("A")){
          counter++;
      }
  }

       System.out.println(counter);

 */
//Verilen bir String'deki sesli harf sayısını bulunuz.
        String str = "Ben Fehmi'yi seviyorum ";
        String[] vrs = str.toLowerCase().split("");
        int toplam = 0;
        for (String w : vrs) {
            //   switch (w){
            //       case "a":
            //       case "e":
            //       case "o":
            //       case "u":
            //       case "i":
            ///          toplam++;
            // }
        }
        //    System.out.println(toplam);
        //size verilen arraydaki 8(inclusive) ve 8 den onceki tum elemanlari iki katina cikariniz

        //   List<Integer>nums=new ArrayList<>();
        //   nums.add(12);
        //   nums.add(7);
        //   nums.add(21);
        //   nums.add(8);
        //   nums.add(9);
        //   for (Integer w: nums){
        //       nums.set(nums.indexOf(w),w*2);
        //
        //        if (w==8){
        //            break;
        //        }
        //
        //
        //   }
  //     //    System.out.println(nums);
  //     int num[] = {1, 2, 4, 5, 6, 8, 9, 11};//olmayan rakamları yazdıran kodu yazınız. (edited)
  //     Arrays.sort(num);


  //     for (int i = 0; i <= 11; i++) {
  //         int v = Arrays.binarySearch(num, i);
  //         if (v < 0) {
  //             System.out.println(i);

            }

        }

/*
    ?
   ? ?
  ? ? ?
 ? ? ? ?
? ? ? ? ?

       Kullanicinin verecegi kenar uzunlugunu ve verecegi bir karakteri kullanarak eskenar ucgen cizen kod.

        */




