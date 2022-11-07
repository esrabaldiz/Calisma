package odevler;

import java.util.Scanner;

public class YaptigimOdevler {


    public static void main(String[] args) {

        //kullanicidan bir sayi isteyin sayi 10 ise "iki basamakli en kucuk sayi"eger 100 ise "uc basamakli en kucuk sayi"
//1000 ise "dort  basamakli en kucuk sayi"  diger durumlarda "girdigin sayiyi degidtir " yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=input.nextInt();


        if (sayi == 10) {
            System.out.println("iki basamakli en kucuk sayi");

        }else   if (sayi == 100) {
            System.out.println("en kucuk uc basamakli sayi");

        } else if (sayi == 1000) {
            System.out.println("dort basamakli en kucuk sayi");

        } else System.out.println("girdigin sayiyi degistir");









    }
}
