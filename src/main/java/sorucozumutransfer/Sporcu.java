package sorucozumutransfer;

public class Sporcu {
    /*

Galatasaraya  futbolcu transfer etmek istiyorum :

   1. Ulkesi    = Cek
   2. Yas       = 27
   3. Bonservis = 10.000.000 $
   4. Boy       = 177
   5  Maas      = 3.500.000 $


  # Yetenek #
   1. Spor yapabilen
   2. Futbol oynayabilen
   3. Hizli kosabilen
   4. Sag ayagini kullanabilen

*/
    String brans;

    public void sporYap(){
        System.out.println("Spor yapabilir.");
    }



    public Sporcu(){

    }

    public Sporcu(String brans){
        this.brans = brans;
        System.out.println("Sporcudan===> brans");
    }

}

