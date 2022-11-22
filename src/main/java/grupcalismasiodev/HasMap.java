package grupcalismasiodev;

import java.util.Arrays;
import java.util.HashMap;

public class HasMap {

        // Verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini
        // return eden bir method yaziniz
        //  Ornek : Input : Zeynep Hoca bir tane   output : { =3, a=3, b=1, r=1, C=1, c=1, t=1, e=1, H=1, i=1, n=2, o=1}

        String str = "Zeynep Hoca bir tane";
//
        public static void main(String[] args) {
            System.out.println(karakterSayisiBulma("Zeynep Hoca bir tane"));

        }

        public static String karakterSayisiBulma (String str) {
            String arr[] = str.split("");
            String bos = "";

            for (String w : arr) {
                int counter = 0;
                for (String j : arr) {
                    if (w.equals(j)) {
                        counter++;
                    }
                }
                if (!bos.contains(w)) {
                    bos += w + "=" + counter+ ","+" ";
                }

            }
        return bos;

 //         //Size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz
 //         //abbcaa ==> a=3, b=2, c=1
 //         String kelime = "abbcaa";
 //         HashMap<String, Integer> gorunum = new HashMap<>();

 //         String[] harfler = kelime.split("");
 //         System.out.println(Arrays.toString(harfler));//[a, b, b, c, a, a]
 //         //[a, b, b, c, a, a]
 //         for(String w : harfler){
 //             Integer gorunumSayisi = gorunum.get(w);
 //             if(gorunumSayisi==null){
 //                 gorunum.put(w, 1);
 //             }else{
 //                 gorunum.put(w, gorunumSayisi+1);
 //             }


 //         }
 //         System.out.println(gorunum);



            }

    }

