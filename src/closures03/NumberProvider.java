package closures03;

public class NumberProvider {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Number provide(){
       // Number n1 = () -> n;
        //return n1;
        return () -> n;

    }

    @FunctionalInterface
    public interface Number{
        int get();

    }

}
