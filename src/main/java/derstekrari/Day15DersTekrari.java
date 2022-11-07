package derstekrari;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day15DersTekrari {
    public static void main(String[] args) {
 /*       String arr[] = {"Jane", "Mark", "Cristopher", "Tom", "Ali", "Rojda"};
        for (String w : arr) {
            System.out.println(w + " ");
            if (w.equals("Tom")) {
                break;
            }
        }
        System.out.println();

        //exemple String bir array olusturunuz "Tom" ve "Jane" haric tum elemanlari  ekrana yazdiriniz.

 /*String brr[] = {"Jane","Mark","Cristopher" ,"Tom",  "Ali", "Rojda"};

  for (String w: brr)  {
      if (w.equals("Tom") || w.equals("Ali")){

          continue;


      }
      System.out.println(w +" ");
  }
*/
//kullanici ile beraber bir array olusturun
//
int arr[]={2,1,2,3,2};
int eleman=5;
int counter=0;
for (int w:arr){
    if (w==eleman){
        counter++;
    }
}


if (counter>0) {

    System.out.println(eleman +" arrayda" + counter + "defa var");

}else{ System.out.println(eleman + " arrayda yok ");
//"java kolaydir calisana ne kolaydir ki calismayana"
String sentence="javaaaaaaaaaa kolaydir calisana ne kolaydir ki calismayana";
sentence=sentence.replaceAll("\\p{Punct}",  "");

    System.out.println(sentence);

String words []=sentence.split(" ");

    Arrays.sort(words, Comparator.comparingInt(String::length));

    System.out.println(Arrays.toString(words));

    System.out.println(words[words.length-1]);


}
    }

}



















