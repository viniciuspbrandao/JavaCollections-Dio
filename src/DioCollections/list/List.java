package DioCollections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        System.out.println("1- Crie uma lista e adicione sete notas: ");
        java.util.List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas); //System.out.println(notas.toString())

        System.out.println("\n2- Exiba o indice/posicao da nota 5.0: " + notas.indexOf(5.0)); //indexOf()

        System.out.println("\n3- Adicione na lista a nota 8.0 no indice/posicao 4: ");
        notas.add(4, 8.0); //add(int index, Double element)
        System.out.println(notas);

        System.out.println("\n4- Sustitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("\n5- Confira se a nota 5.0 esta na lista: " + notas.contains(5.0)); //retorna boolean

        System.out.println("\n6- Exiba todas as notas na ordem que foram inseridas: " + notas);

        System.out.println("\n7- Exiba a terceira nota adicionada: " + notas.get(2)); //get(int index)

        System.out.println("\n8- Exiba a menor nota: " + Collections.min(notas));
        //Essa comparacao e possivel pq o Double implementa a interface Comparable

        System.out.println("\n9- Exiba a maior nota: " + Collections.max(notas));
        //Essa comparacao e possivel pq o Double implementa a interface Comparable

        System.out.println("\n10- Exiba a soma dos valores:");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("\n11- Exiba a media das notas: " + (soma / notas.size()));

        System.out.println("\n12- Remova a nota 0:");
        notas.remove(0.0); //remove(Object o)
        System.out.println(notas);

        System.out.println("\n13- Remova a nota no indice/posicao 0:");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\n14- Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\n15- Apaque toda a lista: ");
        notas.clear();
        System.out.println(notas);
    }
}
