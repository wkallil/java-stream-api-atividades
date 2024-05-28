package desafio5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MedioNumerosMaiorQueCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Double media = numeros.stream().filter(n-> n >5).mapToInt(n->n).average().orElse(0.0);

        OptionalDouble media2 = numeros.stream().mapToInt(Integer::intValue).filter(n -> n > 5).average();

        System.out.println(media);
        System.out.println(media2);

    }
}
