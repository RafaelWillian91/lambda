package closure02;

public class Closureapp2 {

    //Neste exemplo o closure não necessita que a variável seja final
    private int mult;
    int calculate(int x, int y){

        mult = 2;
        Operation op = (n1, n2) -> (n1 + n2) * mult;
        mult = 3;
        //mult vale 3 e não 2. Pq a variável externa que faz parte da expressão lambda é definida no momento que
        //op.calculate(x, y) é chamado. ELe só atribui mult quando o método é invocado.
        return op.calculate(x, y);

    }

}
