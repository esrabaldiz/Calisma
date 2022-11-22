package team21calisma;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SorularMaps {
    public static void main(String[] args) {
 //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);



        Collection<Integer> product1=product.values();
        Integer sum=0;
        for (Integer w:product1){
            sum+=w;

        }
        System.out.println(sum);

        //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        // Ürün sayılarını artan sırada yazdırınız.
       Map<String, Integer> product2 = new HashMap<>();
       product2.put("Laptop", 82);
       product2.put("TV", 53);
       product2.put("Refrigerator", 12);
       product2.put("Music System", 87);
       product2.put("Mobile Phone", 53);



    }
}
