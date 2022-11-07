package derstekrari;

import java.util.Arrays;

public class Day16DersTekrariArrayslists {
    public static void main(String[] args) {
//bir tane integer multidimensionnal array olusturunuz
//bu arraydaki tum sayilarin toplamini veren kodu yaziniz
        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;
        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;

            }
        }
        System.out.println(sum);

        int brr[][] = {{2, 5, 1}, {32, 75}};
        int toplam = 0;
        for (int[] w : brr) {
            toplam = toplam + w.length;

        }
        System.out.println(toplam);
        int idx = 0;

        int crr[] = new int[toplam];

        for (int[] w : brr) {

            for (int k : w) {
                crr[idx] = k;
                idx++;

            }

        }
        System.out.println(Arrays.toString(crr));

//bir multidimensionnal arraydaki en buyuk ve enkucuk elemainin toplamini veren kodu yaziniz

        int trr[][] = {{2, 5, 1}, {83, 75}};
        int maxEleman = trr[0][0];
        int minEleman = trr[0][0];

        for (int[] w : trr) {
            for (int k : w) {
   maxEleman = Math.max(maxEleman, k);

  minEleman=Math.min(minEleman,k ) ;
            }
            }
            System.out.println(maxEleman);
        System.out.println(minEleman);
        System.out.println(maxEleman + minEleman);


        }
    }



