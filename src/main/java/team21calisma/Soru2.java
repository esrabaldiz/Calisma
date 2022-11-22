package team21calisma;

import java.util.*;

public class Soru2 {
    public static void main(String[] args) {

      // Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
       // bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
       Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
       product.put("Refrigerator", 12);
        product.put("Music System", 87);
       product.put("Mobile Phone", 53);

        TreeMap<String,Integer> mytree=new TreeMap<>(product);
      System.out.println(mytree);

        TreeMap<String, Integer> tree = new TreeMap<>(product);
        System.out.println(tree);
        Set<String> urunler = tree.keySet();
      System.out.println(urunler);

        HashSet<String> set1= new HashSet<>(product.keySet());
       TreeSet<String> product1= new TreeSet<>(set1);
        System.out.println(product1);

//Soru5:
  //      Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        //Apex=2, is=1, easy=1
        String arr[]   =   s.toLowerCase().replaceAll("\\p{Punct}" , "").split("");
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer> map1=new HashMap<>();
        for (String w:arr){
     Integer kelimeSayaci= map1.get(w);

        if (kelimeSayaci==null){
            map1.put(w,1);

        }else {
            map1.put(w,kelimeSayaci+1);

        }


        }
//Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir? List<Integer> myList = new ArrayList<>();
        List<Integer> myList=new ArrayList<>();
myList.add(12);
myList.add(21);
myList.add(12);
myList.add(13);
myList.add(12);
myList.add(21);
myList.add(35);
HashMap<Integer,Integer> map2=new HashMap<>();
for (Integer w:myList){
  Integer gorunumKc=map2.get(w);
    if (gorunumKc==null) {
        map2.put(w,1);
    }else {

        map2.put(w,gorunumKc+1);

    }
}
        System.out.println(map2);//{35=1, 21=2, 12=3, 13=1}
        for (Map.Entry<Integer,Integer>w:map2.entrySet()) {
            System.out.println(w.getKey()+" den " +w.getValue()+"tane vardir");
        }
        //soru2:key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        // Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu yazınız.
        Map<String, Integer> urunler1 = new HashMap<>();
        urunler1.put("Laptop", 12);
        urunler1.put("TV", 53);
        urunler1.put("Refrigerator", 12);
        urunler1.put("Music System", 87);
        String varMi="Laptop";
        if (!urunler.contains(varMi)) {
            System.out.println("urunler arasinda laptop :" + "yoktur");
        } else {
            System.out.println("urunler arasinda laptop :" + "vardir");

        }

    }


}
