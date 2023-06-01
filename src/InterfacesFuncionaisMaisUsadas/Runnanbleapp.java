package InterfacesFuncionaisMaisUsadas;

public class Runnanbleapp {

    public static void main(String[] args) {

        run(() -> System.out.println("Ola"));
        run(() ->
                {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                    }
                }
                );

        Runnable run2 = () -> System.out.println("Teste");

    }

    private static void run(Runnable runnable){
        runnable.run();
    }
}
