package desafio17;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter(FiltrarNumeroPrimo::isPrimo).mapToInt(Integer::intValue).forEach(System.out::println);
    }

    private static boolean isPrimo(int numero) {
        if (numero <=1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
