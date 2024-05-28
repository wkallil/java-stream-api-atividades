package desafio9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerificarSeNaoRepete {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean temNumeroRepetido = numeros.stream().distinct().count() == numeros.size();

        System.out.println("Todos os números são diferentes? " + temNumeroRepetido);
    }
}
