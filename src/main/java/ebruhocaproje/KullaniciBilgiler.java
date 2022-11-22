package ebruhocaproje;

import java.util.HashMap;

public class KullaniciBilgiler {
    private static String KimlikNo;
    private static String Isim;
    private static String adres;
    private static String telefonNo;

    public static String getKimlikNo() {
        return KimlikNo;
    }

    public static void setKimlikNo(String kimlikNo) {
        KimlikNo = kimlikNo;
    }

    public static String getIsim() {
        return Isim;
    }

    public static void setIsim(String isim) {
        Isim = isim;
    }

    public static String getAdres() {
        return adres;
    }

    public static void setAdres(String adres) {
        KullaniciBilgiler.adres = adres;
    }

    public static String getTelefonNo() {
        return telefonNo;
    }

    public static void setTelefonNo(String telefonNo) {
        KullaniciBilgiler.telefonNo = telefonNo;
    }
    public static HashMap<String, String> KullaniciBilgiler(String kimlikNo, String adres, String telefonNo, String isim){
         HashMap<String, String> person = new HashMap<>();
   return person;



    }

}


