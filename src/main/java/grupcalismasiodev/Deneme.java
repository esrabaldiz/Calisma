package grupcalismasiodev;

import java.util.Arrays;
public class Deneme {
    static int count = 0;

    public void increment() {
        count++;

    }

    public static void main(String[] args) {

/*
        Deneme obj1 = new Deneme();
        Deneme obj2 = new Deneme();

        obj1. increment();
        obj2 . increment();
        System.out.println(obj1.count);
        System.out.println(obj2.count);
 */
        /*
        int arr[] = {2, 11, 0, 23, 7}; Arrays.sort(arr);
        for(int i=4; i>=0; i--)
        { System.out.print(arr[i] + " ");


         */
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        System.out.println(arr1==arr2);

        int arr[] = {12, 23, 12, 2, 3}; Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 12));

        int arb[] = {12, 23, 12, 2, 3}; Arrays.sort(arb);
        System.out.println(Arrays.binarySearch(arb, 5));
        char arm[] = new char[4]; arm[0] = 'A';
        arm[2] = 'E';
        arm[3] = 'M'; System.out.println(Arrays.toString(arm));

        String str = "Cok calis, mutevazi ol";
        String strArray[] = str.split("X"); System.out.println(Arrays.toString(strArray));


    }
    }
