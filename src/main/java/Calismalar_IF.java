import java.util.Scanner;

public class Calismalar_IF {


    public static void main(String[] args) {

//eger not:100-85=AA
//85-75=AB
//75-60= BB
//60-40=CC
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir not giriniz");
        int not = input.nextInt();
        if (not >= 85) {
            System.out.println("notunuz AA'dir");
        } else if (not <= 75 && not >= 60) {


            System.out.println("notunuz AB'dir");
        } else if (not <= 60 && not >= 40) {
            System.out.println("notunuz BB'dir");
        } else if (not <= 40) {
            System.out.println("notunuz CC'dir");
        } else
            System.out.println("lutfen gecerli bir sayi giriniz");



    }
}
