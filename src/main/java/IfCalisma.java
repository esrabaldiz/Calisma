
import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

public class IfCalisma {
    public static void main(String[] args) {


// kullanicidan bir tam sayi aliniz ve sayinin tek veya cift oldugunu yazdiriniz


//exemple2: kullanicidan bir tam sayi alin ve sayi < 10 ise "rakam ; 100'den kucukse "iki bsamakli sayi"
//degilse "uc basamakli veya daha buyuk sayi "yazdirin
        //       int sayi1 = 250;


        //       if (sayi1 < 10) {
        //           System.out.println("rakam");

        //       } else if (sayi1 < 100) {
        //          System.out.println("iki bsamakli sayi");
        //       } else if (sayi1 > 100) {
        //           System.out.println("uc basamakli bir sayi ");
//        } else System.out.println("lutfen gecerli bir sayi giriniz");
        //   }

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


















