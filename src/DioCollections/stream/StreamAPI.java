package DioCollections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("1- Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream()
//                .forEach(System.out::println);
        numerosAleatorios.forEach(System.out::println); // Essa linha com o Stream method substitui as 2 linhas acima

        System.out.println("\n2- Pegue os 5 primeiros numeros e coloque dentro de um Set:");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        System.out.println("\n3- Transforme essa lista de String em uma lista de numeros inteiros.");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("\n4- Pegue os numeros pares e maiores que 2 e coloque em uma lista.");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n5- Mostre a media dos numeros:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("\n6- Remova os numeros impares:");
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

    }
}
