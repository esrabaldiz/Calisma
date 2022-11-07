package test1;


import java.util.Scanner;

public class Toplama_Cikarma {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("ay ismi giriniz");

        String ayIsmi = "aralik";

        if(ayIsmi.equals("aralik") || ayIsmi.equals("ocak") || ayIsmi.equals("subat")) {

            System.out.println("Kis");
        }else if (ayIsmi.equals("mart") || ayIsmi.equals("nisan") || ayIsmi.equals("mayis")) {

            System.out.println("ilkbahar");
        }else if (ayIsmi.equals("haziran") || ayIsmi.equals("temmuz") || ayIsmi.equals("agustos")) {
            System.out.println("yaz");
        }else if (ayIsmi.equals("eylul")|| ayIsmi.equals("ekim") || ayIsmi.equals("kasim")) {

            System.out.println("sonbahar");
        }else{
            System.out.println("gecerli bir ay ismi giriniz");


    }


    }}












