package DioCollections.set;

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

import java.util.*;

public class Set {
    public static void main(String[] args) {

        System.out.println("1- Crie um conjunto e adicione as notas: ");
        java.util.Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);
        /*
         * OBS: o "7" só é impresso uma única vez, pois o Set nao aceita valores duplicados.
         * OBS: Nao e possivel fazer buscas de acordo com o indice/posicao
         */
        System.out.println("\n2- Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));
        System.out.println("3- Exiba a menor nota: " + Collections.min(notas));
        System.out.println("4- Exiba a maior nota: " + Collections.max(notas));

        System.out.println("5- Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("\n6- Exiba a media das notas: " + (soma / notas.size()));

        System.out.println("\n7- Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\n8- Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\n9- Exiba as notas na ordem em que forem adicionadas: ");
        java.util.Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d); // O 7 nao e impresso, pois ele nao permite numeros repetidos
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("\n10- Exiba todas as notas em ordem crescente: ");
        java.util.Set<Double> notas3 = new TreeSet<>(notas2); //Esse metodo funciona nessa classe pois ela possui o comparable
        System.out.println(notas3);

        System.out.println("\n11- Apague o primeiro conjunto: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\n12- Verifique se o conjunto esta vazio: " + notas.isEmpty());

    }
}
