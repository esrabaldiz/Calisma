package team21calisma;

import java.util.HashMap;
import java.util.Map;

public class MapsUrun {


    public static void main(String[] args) {
        //asagida verilen fiyat listesinden fiyati 29.99 olan urunlerin adlarini yazdirin.

        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Terlik", 29.99);
        urunler.put("Kravat", 19.99);

        int counter=0;
       double toplam=0;
        for (Map.Entry<String,Double> w:urunler.entrySet()){
            toplam=toplam + w.getValue();
            if (w.getValue()==29.99){
                counter++;
                System.out.println(w.getKey());
                System.out.println(toplam);
            }
        }
        System.out.println(counter + " tane urun vardir");
    }
}