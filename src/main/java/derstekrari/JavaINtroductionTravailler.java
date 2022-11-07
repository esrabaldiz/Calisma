package derstekrari;

import java.util.Scanner;

public class JavaINtroductionTravailler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        System.out.println("adinizi yaziniz " );

String ad=input.next() ;

String  sepet="";
for (int i=ad.length()-1; i>-1;i--){
    char trs=ad.charAt(i);
    sepet=sepet+trs;
}
*/
 //       System.out.println(sepet);

//bir stringdeki m karaketi haric tum karakterleri yazdiriniz
        String str="Andromeda";
        for (int i=0; i<str.length(); i++){
char ch=str.charAt(i);
if (ch!='m'){
    System.out.print(ch);
}
        }




    }
}
