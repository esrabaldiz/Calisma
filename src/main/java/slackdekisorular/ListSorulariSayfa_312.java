package slackdekisorular;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorulariSayfa_312 {
    public static void main(String[] args) {
 // Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
 // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer>g = new ArrayList<>(Arrays.asList(12, 12, 11, 15, 34,15,43));

        if(g.contains(15)){
            for(int w : g){

                if(w==15){

                int idx = g.indexOf(15);

                g.set(idx, 51); }
            }
            System.out.println(g);
     }else{
            System.out.println("liste 15 elemanıini icermiyor");

        }

 //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
 // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

List<Integer> arr=new ArrayList<>(Arrays.asList(10,31,15,13,54,13));
  if (!arr.contains(15)&& !arr.contains(13)){
      System.out.println("liste 13 ve 15 icermiyor");
  }else {
      for (int i=0 ; i<arr.size(); i++){
          if (arr.get(i) == 15 ){
              int indeks=arr.indexOf(15);
              arr.remove(indeks);
              i--;

          }
          if (arr.get(i)==13){
              int indeks2=arr.indexOf(13);
              arr.remove(indeks2);
              i--;
          }
      }
      System.out.println(arr);
  }
//Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
// Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> sbs=new ArrayList<>(Arrays.asList(12, 31, 7, 13, 10));

  Collections.sort(sbs);
  for (Integer w: sbs){



     sbs.set(sbs.indexOf(w),w+2);

  }
        System.out.println(sbs);
 //String bir listede verilen tüm fiyatların toplamını bulunuz.
//Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
List<String> list=new ArrayList<>();
list.add("$12.99");
list.add("$23.60");
list.add("$54.45");
double sum=0;
for (String w:list){
    Double price=Double.valueOf(w.replace("$",""));
    sum+=price;

}
        System.out.println(sum);
// Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
//Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70


        List<String> sbs1=new ArrayList<>(Arrays.asList("$12.99","$8.25","$23.60","$54.45"));

        List<Double> decimalList = new ArrayList<>();
for (String w: sbs1){
    Double price2=Double.valueOf(w.replace("$", ""));
    decimalList.add(price2);

}

    }
}
