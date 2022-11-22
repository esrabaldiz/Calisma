package team21calisma;

import java.util.*;

public class MapsKitapSorulari {
    public static void main(String[] args) {
        //    1) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        //    Toplam ürün sayısını bulmak için kodu yazınız.
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        Collection<Integer> produc1 = product.values();
        Integer sum = 0;
        for (Integer w : produc1) {
            sum += w;

        }
        System.out.println(sum);

        // //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        //        //bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
        //        Map<String, Integer> product = new HashMap<>();
        //        product.put("Laptop", 12);
        //        product.put("TV", 53);
        //        product.put("Refrigerator", 12);
        //        product.put("Music System", 87);
        //        product.put("sac kurutma makinasi ", 45);
        //
        //        Set<String> keys = product.keySet();
        //        System.out.println(keys);
        //        int urunSayisi = keys.size();
        //        System.out.println(urunSayisi);
        //
        //        Collection <Integer> adetSayisi = product.values();
        //        System.out.println(adetSayisi);
        //
        //        int sum =0;
        //        for(Integer w : adetSayisi){
        //            sum = sum + w ;
        //        }
        //        System.out.println(sum);


        //2.soruAşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        // Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu yazınız.
        Map<String, Integer> product2 = new HashMap<>();
        product2.put("Laptop", 12);
        product2.put("TV", 53);
        product2.put("Refrigerator", 12);
        product2.put("Music System", 87);
       String  urun ="Laptop";
        if (product2.containsKey(urun)) {
            System.out.println("laptop vardir");
        } else
            System.out.println("laptop yoktur");

      //  soru3:Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
       //   Ürün sayılarını artan sırada yazdırınız.
        Map<String, Integer> product3 = new HashMap<>();
        product3.put("Laptop", 82);
        product3.put("TV", 53);
        product3.put("Refrigerator", 12);
        product3.put("Music System", 87);
        product3.put("Mobile Phone", 53);
        Set<Integer> ArtanSirada=new TreeSet<Integer>(product3.values());
        System.out.println(ArtanSirada);
      // Object[] artanSayi= product3.values().toArray();
      // Arrays.sort(artanSayi);
      // System.out.println(Arrays.toString(artanSayi));

/*
Set<Map.Entry<String,Integer> > elemanlar = product.entrySet();

System.out.println(elemanlar);

List<Integer> myList = new ArrayList<>();

for (Map.Entry<String,Integer> w:elemanlar) {

    System.out.println(w.getKey()+ " vardir " + w.getValue() + " adettir");

    myList.add(w.getValue());
}
Collections.sort(myList);
System.out.println(myList);
 */

//soru4:Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
// Ürün adlarını alfabetik sırayla yazdırınız.
Map<String, Integer> product4 = new HashMap<>();
product4.put("Laptop", 82);
product4.put("TV", 53);
product4.put("Refrigerator", 12);
product4.put("Music System", 87);
product4.put("Mobile Phone", 53);
//Set<String> alfabetik= new TreeSet(product4.keySet());

  //      System.out.println(alfabetik);

        List<String> myList=new ArrayList<>(product4.keySet());

     Collections.sort(myList);
        System.out.println(myList);
Set<String> alfabetik=product4.keySet();
List<String> alfabetikList=new ArrayList<>(alfabetik);
Collections.sort(alfabetikList);
        System.out.println(alfabetikList);

//Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
// (Büyük/küçük harfe duyarlı değil)
String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

 s = s.replaceAll("\\p{Punct}","").toLowerCase();

Map<String, Integer> wordOccurence = new HashMap<>();

String[] words = s.split(" ");

        for(String w : words){
            Integer numOfOccurence = wordOccurence.get(w); if(numOfOccurence == null ){
                wordOccurence.put(w, 1); }else{
                wordOccurence.put(w, numOfOccurence+1); }
        } System.out.println(wordOccurence);
  //2.yol // Bir String' deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
        //        // (Büyük/küçük harfe duyarlı değil)
        //        //apex=3 , is=1......gibi
        //
        //
        //        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        ////
        //        //2.yol
        //        String arr1[] = s.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
        //        HashMap<String, Integer> map2 = new HashMap<>();
        //        for (String w : arr1) {
        //            Integer gorSayisi = map2.get(w);
        //            if (gorSayisi == null) {
        //                map2.put(w, 1);
        //            } else {
        //                map2.put(w, gorSayisi + 1);
        //            }
        //        }
        //        System.out.println(map2);

        //6.soru//Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
        //List<Integer> myList = new ArrayList<>();
        //myList.add(12);
        //myList.add(21);
        //myList.add(12);
        //myList.add(13);
        //myList.add(12);
        //myList.add(21);
        //myList.add(35);
        //HashMap<Integer, Integer> map1 = new HashMap<>();
        // for(Integer w: myList){
        //     Integer gorunumsayisi = map1.get(w);
        //     if(gorunumsayisi == null){
        //         map1.put(w,1);
        //     }else {
        //         map1.put(w,gorunumsayisi +1);
        //     }
        // }
        //System.out.println(map1);
        //
        //for (Map.Entry<Integer , Integer> w : map1.entrySet()){
        //    System.out.println(w.getKey()+ "  dan " + w.getValue()+ " tane vardir");
        //}
}

    }

