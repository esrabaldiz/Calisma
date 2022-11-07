import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arraylistecalismakonutekrari {
    public static void main(String[] args) {
        //verilen bir listedeki elemanlari terarsiz olarak yazdirma

/*

        List<Integer>a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

 List<Integer> yeni=new ArrayList<>();
 for (Integer w:a){
     if (!yeni.contains(w)){
         yeni.add(w);
     }
 }

        System.out.println(yeni);

 */
//kullanicidan bir harf ak=liniz harf sizdeki
// listin icinde varsa o harfi bulunduya ceviriniz
//yoksa o harfi liste ekleyiniz
        Scanner scan = new Scanner(System.in);
/*        System.out.println("lutfen bir harf giriniz");
        String harf = scan.next().substring(0, 1);
        List<String> c = new ArrayList<>();

        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        if (c.contains(harf)) {
            c.set(c.indexOf(harf), "bulundu");
        } else {
            c.add(harf);

        }
        System.out.println(c);

 */
//bir listte birbirine en yakin olan ikisini bulunuz
//[12, 15,19,30,21]   ==>>19,21
List<Integer> d=new ArrayList<>();
d.add(12);
d.add(19);
d.add(15);
d.add(30);
d.add(21);
        System.out.println(d);
        Collections.sort(d);
        System.out.println(d);
int minFrk=Integer.MAX_VALUE;
for (int i=0 ; i<d.size();i++ ){
    minFrk=Math.min(minFrk,d.get(i)-d.get(i-1));
}

        System.out.println(minFrk);









    }
}