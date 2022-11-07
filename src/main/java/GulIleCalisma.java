import java.util.Scanner;

public class GulIleCalisma {
    public static void main(String[] args) {

  /*
EX2= Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
 Govde sabit ve 5 olsun.
       /* tac uzunlugu -> 6 iken
          ^
          ^^
          ^^^
          ^^^^
          ^^^^^
          ^^^^^^
          |||
          |||
          |||
          |||
          |||
   */

for (int i= 1; i<=6;  i++) {

    for (int k = 1; k <= i; k++) {

        System.out.print("ˆ");
    }
    System.out.println();
}
 for (int j=1; j<=5; j++){
     for (int m=1; m<=3; m++){
         System.out.print("|");
     }
     System.out.println();
 }
// kullanicidan alinan bir stringin kullanicidan almis oldugunuz baslangic
// ve bitis indexi arasini ekrana yazdiran bir metot olusturalim
      Scanner input =new Scanner(System.in);
        System.out.println("lutfen bir string girin");
    String s= input.next();
        System.out.println("baslangic ve bitis indexi giriniz");
       int bas= input.nextInt();
       int bit= input.nextInt();
  kendiSubstringimiz(s,bas,bit);
        }

        public static void kendiSubstringimiz(String a, int bas, int bit){
         if (bas>bit){
             System.out.println("baslangic indexii daha buyuk olamaz");
         } else if (bit>a.length()-1) {
             System.out.println(" bitis indexin karakter sayisindan buyuk olamaz");

         }else {
             for (int i=0; i<a.length(); i++){
                 if (i>=bas && i<=bit){
                     System.out.println(" ");
                     System.out.println(a.substring(i,i+1));

                     }


                 }
             }
         }
        }



