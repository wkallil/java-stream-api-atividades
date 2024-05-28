package desafio14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       OptionalInt maiorNumeroPrimo = numeros.stream()
               .filter(MaiorNumeroPrimo::isPrimo)
               .mapToInt(Integer::intValue)
               .max();

        System.out.println(maiorNumeroPrimo);
    }
    private static boolean isPrimo(int numero) {
        if (numero <=1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

}
