package odevler;

import java.util.Scanner;

public class OdevGrup {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*



String str = "Kara kara dusunme Ankara";
        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);
        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.
        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississippi";
        int idxI = s.indexOf('i');//indexOf() hem String hem de char ile kullanilabilir.
        System.out.println(idxI);// 1
        int idxIss1 = s.indexOf("iss");//Ilk ground "ilk" caharacter'inin indexini verir
        System.out.println(idxIss1);
        int idxIss2 = s.lastIndexOf("iss");//Son gorunumun "ilk" caharacter'inin indexini verir
        System.out.println(idxIss2);

        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz
        //           "Helloooo" ==> H-->Tekrarsiz     e-->Tekrarsiz     l-->Tekrarli     o-->Tekrarli

        String t = "Helloooo";
        char c = 'e';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        //ilk gorunumunun indexini return eder.
        int sonuc = u.indexOf("e", 4);
        System.out.println(sonuc);//11



*/


//kullanicidan bir cumle ya da harf  isteyin, harfin cumlede var olup olmadigini yazdirin


        String str="bu dunya bos dunya";


int cumleY=str.indexOf("dunya");
        System.out.println("cumleY");

    }
}