package closures03;

public class AppClosure03 {

    public static void main(String[] args) {

        NumberProvider numberProvider = new NumberProvider();

        numberProvider.setN(20);
        var n1 = numberProvider.provide();

        numberProvider.setN(30);
        var n2 = numberProvider.provide();

        numberProvider.setN(50);
        NumberProvider.Number n3 = numberProvider.provide();

        System.out.println(n1.get());
        System.out.println(n2.get());
        System.out.println(n3.get());
    }
}
