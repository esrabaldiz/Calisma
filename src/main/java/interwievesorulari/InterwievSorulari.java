package interwievesorulari;

import java.util.ArrayList;
import java.util.List;

public class InterwievSorulari {
    public static void main(String[] args) {
//flag ve count ile ilgili bir soru;
//Math.Random() classından 0 ile 1000 arasında üreteceğiniz sayılarda 0 ve 1'in kaç defa
// üretildiğini gösteren bir method create ediniz?(Yani sıfır ile 1000 arasında
// kod 1000 defa çalışacak ve kaç kere sıfır kaç kere 1 geldiği hesaplanacak.)
//--int num[]={1,2,4,5,6,8,9,11};
//olmayan rakamları yazdıran kodu yazınız. 
        hesaplama(0, 1, 1000);
        olmayanRakam();
    }

    private static void hesaplama(int num1, int num2, int hedef) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < hedef; i++) {
            int rakam = (int) (Math.random() * 1000);
            if (rakam == num1) {
                count1++;
                System.out.println("Rakam0 : " + rakam);
            } else if (rakam == num2) {
                count2++;
                System.out.println("Rakam1 : " + rakam);
            }
        }

        System.out.println("Toplam 1 kac defa geldi : " + count1);
        System.out.println("Toplam 0 kac defa geldi : " + count2);
    }


    public static void olmayanRakam() {
        int num[] = {1, 2, 4, 5, 6, 8, 9, 11};//olmayan rakamlari yazdiran kodu yaziniz.
        //0,3,7,10

        List<Integer> yeniList = new ArrayList<>();
        for (int w : num) {
            yeniList.add(w);
        }

        for (int i = 0; i < 11; i++) {
            if (!yeniList.contains(i)) {
                System.out.println("Olmayan rakamlar : " + i);


            }
        }
    }
}