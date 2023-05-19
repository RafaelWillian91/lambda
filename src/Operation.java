@FunctionalInterface
public interface Operation {

    //Só pode haver um método regular, esse que não tem corpo.
    //Uma anotação que ajuda é a @FunctionalInterface que mostra um erro de compilação caso um novo método seja criado na interface funcional.
    int calculate(int n1, int n2);


    //naõ pode haver mais de um método na interface funcional, excetuando-se os métodos static e defautl.
   // int  calculate2(int n1, int n2);


    //Seguindo essas regras o java sabe que ele deve implementar como anonymou class o método calculate. Por é o único que tem.
    //Por tanto qualquer expressão lambda deve passar dois inteiros e retornar um inteiro, no nosso exemplo.
}
