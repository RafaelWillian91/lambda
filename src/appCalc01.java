public class appCalc01 {

    public static void main(String[] args) {

        //Sempre que temos uma CLASSE ANONIMA de uma INTERFACE que implementa UM MÉTODO, podemos transformar isso em uma
        //expressão LAMBDA no java.
        Operation op1 = new Operation() {
            @Override
            public int calculate(int n1, int n2) {
                return n1 + n2;
            }
        };

        //Toda a expressão lambda tem parametros, flecha e um corpo.
        //Não preciso criar uma operation, nem o método calculate aparece.
        Operation op2 = (int n1, int n2) -> {
            return n1 - n2;
        };

        //O compilador já sabe que são dois inteiros, então podemos omitir o tipo de dado dos parâmetros. A não ser por
        //questoes de ambiguidade.
        Operation op3 = (n1, n2) -> {
            return n1 - n2;
        };

        //Quando temos apenas uma linha dentro do bloco, o return pode ser omitido, e os blocos tambem.
        Operation op4 = (n1, n2) -> n1 * n2;

        //Agora é possível passar a expressao dentro do parametro.
        run((n1, n2) -> n1 * n2);



        System.out.println(op1.calculate(10, 20));
        run(op1);
        run(op2);
        run(op3);
        run(op4);

    }

    private static void run(Operation op){
        int r = op.calculate(5, 3);
        System.out.println(r);
    }



}
