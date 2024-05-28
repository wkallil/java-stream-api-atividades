package desafio19;

import java.util.Arrays;
import java.util.List;

public class SomaDosDivisiveisTresECinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        int numerosFinais = numeros.stream().filter(n-> n%3==0 && n%5==0).mapToInt(Integer::intValue).sum();

        int numerosFinais2 = numeros.stream().filter(n-> n%3==0 && n%5==0).reduce(0, Integer::sum);

        System.out.println(numerosFinais);
        System.out.println(numerosFinais2);
    }
}
