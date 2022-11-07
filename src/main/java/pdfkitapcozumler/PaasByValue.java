package pdfkitapcozumler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaasByValue {


  public static void main(String[] args) {
  /*      int fiyat = 100;
        System.out.println("yuzde 10 hesaplanan fiyat: " + indirim10(fiyat));
        System.out.println(" yuzde 20 hesaplanan fiyat: " + indirim20(fiyat));
        System.out.println("yuzde 25 hesaplanan fiyat: " + indirim25(fiyat));
        System.out.println("en son fiyat fiyat: " + (fiyat));

    }

    public static int indirim10(int fiyat) {
        fiyat *= 0.90;
        return fiyat;

    }

    public static int indirim20(int fiyat) {
        fiyat *= 0.80;
        return fiyat;
    }

    public static int indirim25(int fiyat) {
        fiyat *= 0.75;
        return fiyat;
    }
    //Soru3 bir list olusturun ve eleman olara 10, 11 ,12 ekleyin
    // ve iki method olusturup list elemanlari arttirmayi deneyelim
    //a) birinci methodda for each loop  kullanaraka arttirin
    //b) 2. methodda elemanlari set methodu kullanarak arttirin
    //artislarin kalici olup olkmadiklaini kontrol edin
    public static void main(Integer[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);

        degistir(list);
        System.out.println(list);
        degistir2(list);
        System.out.println(list);
    }
public static void degistir(List<Integer> list){
        for (Integer w:list){
            w=w+3;
            System.out.println(w + " ");
        }
    System.out.println();
    System.out.println(list);
}
public static void degistir2(List<Integer> list){
        for (int i= 0; i< list.size(); i++){
            list.set(i,list.get(i)+3);
            System.out.println(list.get(i)+"");
        }
    System.out.println();
    System.out.println(list);
}
*/
    /*
//exemple: bir list ve bir array olusturalim ve eleman olarak 10,11,12 ekleyelim
 //   iki method olusturup list ve arrayi degistirmeyi deneyelim
//1. methodda array e yeni bir array assign edelim
//2.methodda liste yeni bir list assign edelimve yeni hallini yazdiralim
//Method callden sonra main methodda yeniden yazdirip degisip degismediklerini kontrol edelim
public static void main (String[] args) {
    int num[] = {10, 11, 12};
    degistirArray(num);
    System.out.println("methoddan sonra main methodun icinde array:" + Arrays.toString(num));
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(11);
    list.add(12);
    degistirList(list);
    System.out.println("methdoddan sonra main methodun icinde :" + list);
}
public static void degistirList(List<Integer>list){
list =new ArrayList<>();
list.add(40);
    System.out.println("list methodda :" + list);
}
public  static void degistirArray(int num[]){
    num=new int [5];
    System.out.println(" array methodda : " +Arrays.toString(num));

  */

 String str="Mehmet";
 str.toUpperCase();
      System.out.println(str);


   List<String>list=new ArrayList<>();
   list.add("Mehmet");
   list.add("Ayse");
      System.out.println(list);





}
}
