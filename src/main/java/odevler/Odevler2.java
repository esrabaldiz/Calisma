package odevler;

import java.util.Scanner;

public class Odevler2 {


    public static void main(String[] args) {







            //exemple2:
// SDET
        Scanner input=new Scanner(System.in);
            System.out.println("lutfen is unvaninizi giriniz");
            String isUnvani = input.nextLine();
            if (isUnvani.equalsIgnoreCase("s")) {
                System.out.println("Software");

            } else if (isUnvani.equalsIgnoreCase("d")) {
                System.out.println("Developper");


            } else if (isUnvani.equalsIgnoreCase("e")) {

            } else if (isUnvani.equalsIgnoreCase("t")) {
                System.out.println("In Testing");


            }


        }


    }
