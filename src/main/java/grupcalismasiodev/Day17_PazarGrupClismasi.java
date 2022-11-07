package grupcalismasiodev;

public class Day17_PazarGrupClismasi {

    public static void main(String[] args) {





/*
//soru Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz. String s = "Java is a strongly typed, object-oriented programming language.";
s = s.replaceAll("\\s","").replaceAll("\\p{Punct}", ""); System.out.println(s.length());

 //soru1:// Bir String' deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
         String s = ".jawa! bazen guzel bazen sinir bozucudur.";
        // //1. yol
        s=s.replace(" ","").replaceAll("\\p{Punct}","");
        int k=s.length();
         System.out.println(k);


 /*       //2. yol//Gul hanimin cozumu
          int sum =0;
         for(int i=0;i<s.length();i++){
             char  c=s.charAt(i);
            if(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>=0&&c<=9){
               sum++;

             }


         }

         System.out.println("sum = " + sum);
*/
//exemple21kitaptaki soru:
//  Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
//  Örnek:12133455  ́ 2+4=6

        int sayi = 895118;
        String str = String.valueOf(sayi);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(i, i + 1);
            if (str.indexOf(a) == str.lastIndexOf(a)) {

                sum = sum + Integer.valueOf(a);
            }
        }
        System.out.println(sum);


    }


}












