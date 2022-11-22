package grupcalismasiodev;

import java.util.HashMap;

public class Kizlarla {
    //2.yol
    public static HashMap<String, Integer> karakterSayisi(String str) {
        HashMap<String, Integer> gorunum = new HashMap<>();
        String[] harfler = str.split("");
        for (String w : harfler) {
            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi == null) {
                gorunum.put(w, 1);
            } else {
                gorunum.put(w, gorunumSayisi + 1);

            }
        }
        return gorunum;

    }


            }



