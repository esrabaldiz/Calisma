package derstekrari;

public class Day23SoruCozumuGrupClalismasi {
    /*
            public static void main(String[] args) { updateWord("john", "black");
            }
            public static void updateWord(String s, String t) {
                s = s.substring(0,1).toUpperCase() + t.substring(2);
                System.out.println(s); }

     */
    public static void main(String[] args) { add(3.2, 4.8); //Output A
        add(5, 7.3); //Output B add(5, 7); //Output C add(5.3, 7); //Output D
    }
    public static void add(double n1, double n2) { System.out.println(n1 + n2);
    }
    public static void add(int n1, double n2) {
        System.out.println(n1 + n2); }
    public static void add(int n1, int n2) { System.out.println(n1 + n2);
    }

}