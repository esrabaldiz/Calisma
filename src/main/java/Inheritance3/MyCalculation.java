package Inheritance3;

public class MyCalculation  extends Calculation{
    public void carpma(int x,int y){
        System.out.println("2");
        super.toplama(a,b);
        super.cikarma(a,b);
        z=x*y;
        System.out.println("verilen Sayilarin carpmi: "+z);
    }

    public void bolma(int x,int y){
        z=x/y;
        System.out.println("verilen Sayilarin bolme: "+z);
    }


    public static void main(String[] args) {

//       Calculation cal=new Calculation();
//       cal.toplama(3,6);
//       cal.cikarma(10,5);
        MyCalculation demo=new MyCalculation();
        demo.toplama(a,b);//60
        demo.cikarma(a,b);//20
        System.out.println(demo.buyukSayi);
        System.out.println("===========");
        demo.carpma(a,b);
        demo.bolma(a,b);
    }
}
