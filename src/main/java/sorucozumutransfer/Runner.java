package sorucozumutransfer;

public class Runner {
    public static void main(String[] args) {

        TransferEdecegimSolacik pavelNedved = new TransferEdecegimSolacik();


        System.out.println("==========================================");


        System.out.println("Pavel Nedved: ");
        pavelNedved.sporYap();
        pavelNedved.futbolOyna();
        pavelNedved.hizliKos();
        pavelNedved.sagAyak();

        System.out.println("==========================================");

        TransferEdecegimSolacik pavelNedved1 = new TransferEdecegimSolacik(350000);


    }
}