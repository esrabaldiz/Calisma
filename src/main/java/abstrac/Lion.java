package abstrac;

public class Lion extends BigCat {
    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public void roar() {
        System.out.println("the lion");
    }


}
