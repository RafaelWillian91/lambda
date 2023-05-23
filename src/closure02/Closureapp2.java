package closure02;

public class Closureapp2 {

    int calculate(int x, int y){

        Operation op = (n1, n2) -> n1 + n2;
        return op.calculate(x, y);

    }

}
