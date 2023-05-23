package closure01;

public class appClosure01 {

    public static void main(String[] args) {

        int mult = 2;
        //Closure são variáveis externas que podem ser usadas dentro de expressoes lambda.
        //Elas devem ser final explicitamente ou inferidas pelo compilador.
        Closureapp1 op = (n1, n2) -> n1 + n2 * mult;

        System.out.println(op.calculate(12, 23));



    }

}
