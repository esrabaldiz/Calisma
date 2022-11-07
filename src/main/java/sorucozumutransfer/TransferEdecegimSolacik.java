package sorucozumutransfer;

public class TransferEdecegimSolacik extends Solacik{
    public void sagAyak(){
        System.out.println("Sag ayagini kullanabilir.");
    }

    int maas;
    int boy;
    String ulke;

    public  TransferEdecegimSolacik(){
        super(27);
        System.out.println("TransferEdecegimSolAcik 'dan ===> bos");

    }

    public  TransferEdecegimSolacik(int maas){
        super(27);
        this.maas = maas;
        System.out.println("TransferEdecegimSolAcik'dan ====> mass");

    }

    public   TransferEdecegimSolacik(int yas, int boy, String ulke){
        this.maas = yas;
        this.boy = boy;
        this.ulke = ulke;


    }
    }
