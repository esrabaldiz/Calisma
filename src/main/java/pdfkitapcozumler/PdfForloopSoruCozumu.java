package pdfkitapcozumler;



import java.util.Scanner;

public class PdfForloopSoruCozumu {
    public static void main(String[] args) {
/*   for (int i=0 ; i<10; i++)  {
       System.out.println("java guzeldir");
   }
 */
 /*       //10 ile 30 arasi rakamlari topkla

        int sum = 0;
        for (int i = 10; i <= 30; i++) {
            sum = sum + i;
        }
        System.out.print(sum + ",");


  */
        //verileni ters yazdir
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = input.next();
        String word = " ";

        for (int i = kelime.length() - 1; i > 0; i--) {
            char c = kelime.charAt(i);
            word = word + c;

        }
        System.out.println(word);

        Integer satir=input.nextInt();

        }

    }
