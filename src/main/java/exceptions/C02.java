package exceptions;

import java.util.Collection;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        String s="Merhbab";
        //  System.out.println(s.charAt(10));//e
//        int x=12;
//       int b=0;
//       System.out.println(x/b);
        getElement(s,4);
        getElement(s,9);
        bolma(s,1,1,5);
    }


    public static void getElement(String str,int idx){
        try {
            System.out.println(str.charAt(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index string da yok");

        }
    }

    public static void bolma(String str,int idx1,int idx2,int idx3){
        try {
///0,2
            int ilkKarkrkater= str.substring(idx1,idx2).length();//1
            int ikiKarakter= str.substring(idx1,idx3).length();
            System.out.println(ilkKarkrkater/ikiKarakter);
        }catch (ArithmeticException e){
            System.out.println("0 a bolamazsiniz.");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index string da yok");
        }


    }
}

