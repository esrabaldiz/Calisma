package derstekrari;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Day22SoruBankasi {
    public static void main(String[] args) {

        //     Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz. Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);
        int minDiff = h.get(2) - h.get(1);
        for (int i = 1; i < h.size(); i++) {
            minDiff = Math.min(minDiff, h.get(i) - h.get(i - 1));
        }
        for (Integer i = 1; i < h.size(); i++) {
            if (h.get(i) - h.get(i - 1) == minDiff) {
                System.out.println(h.get(i) + " and " + h.get(i - 1));
            }


        }
        //elemanlar ACEF Olan bir stringarray liste olusturunuz
        List<String> str = new ArrayList<>();
        str.add("A");
        str.add("C");
        str.add("E");
        str.add("F");
        str.add("B");
str.add(1,"L");
        // System.out.println(str);
//str.set(2," D");
        //   System.out.println(str);
// str.remove("F")  ;


        Collections.sort(str);

        System.out.println(str);
if (str.contains("L")) {
    System.out.println("L listte var");
}else System.out.println("L listede yok");
if (!str.contains(" M")){
    System.out.println(" M lisstte yok");
}else System.out.println(" M listte var");

int sayi=str.size();
        System.out.println(sayi);//ikinci yol =System.out.println(str.size());
//8
 str.clear();
        System.out.println(str);
        System.out.println(str.isEmpty());
}
        }