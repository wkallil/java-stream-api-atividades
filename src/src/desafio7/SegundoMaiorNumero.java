package desafio7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> encontrarSegundoMaior = numeros.stream()
                .distinct() // Retira duplicados
                .sorted((a, b) -> b - a) // reverter a ordem
                .skip(1) // pula um número
                .findFirst(); //pega o primeiro número

        System.out.println(encontrarSegundoMaior);
    }
}
