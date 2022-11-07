public class Day17 {

    public static void main(String[] args) {


        // Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
        // 1.Yol:
/*
String str="kastamonu";
String str2="";
for (int i=0 ;i<str.length(); i++){
String sonuc= str.substring(i,i+1)   ;
    if (sonuc.equals("m")){
       continue;

    }
    str2 = str2+sonuc;
}

        System.out.println(str2);
        //2.YOL:

  String kelime = "kastamonu";
        for (int i = 0; i < kelime.length(); i++) {
            char kel = kelime.charAt(i);
            if (kel == 'm') {
                break;
            }
            System.out.print(kel);


*/
//exemple:1'den 100'e kadar tum tam sayilari 6 ile bolunenler haric ekrana yazdiriniz
/*
for (int i=1  ;i<101  ; i++) {

    if (i % 6 == 0) {
        continue;
    }

    System.out.print(i +" ");
*/
        //exemple3:
/*
//Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız
        String kelime = "kastamonu";
        for (int i = 0; i < kelime.length(); i++) {
            char kel = kelime.charAt(i);
            if (kel == 'm') {
                break;
            }
            System.out.print(kel);
        }

 /*
 for (int i=1 ;i<5 ;i++){

     System.out.println("week:"+i);

for (int k= 1 ; k<8; k++) {
    System.out.println("day: " + k);

//
    */

//  Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
        String s = "Java is a strongly typed, object-oriented programming language.";

        s = s.replaceAll("\\s", "").replaceAll("\\p{Punct}", "");
        System.out.println(s.length());


        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. *** ***

int satir = 6;

 for (int i = 1; i <= satir;  i++) {

 for (int k =satir ; k>= i ; k--) {

     System.out.print("*");

            }
 System.out.println();
        }

GulIleCalisma.kendiSubstringimiz("Esra" ,0,2);

    }
}