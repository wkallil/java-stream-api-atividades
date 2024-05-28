package desafio18;

import java.util.Arrays;
import java.util.List;

public class NumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosIguais = numeros.stream().distinct().count() == 1;

        if (numerosIguais) {
            System.out.println("Todos os número na lista são iguais");
        } else {
            System.out.println("Os números na lista não são todos iguais.");
        }
    }
}
