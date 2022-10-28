package DioCollections.list.orderedList;

/*Dados as seguintes informacoes sobre os gatos, crie uma lista e ordene exibindo:
 * nome-idade-cor;
 * Gato 1 = nome: Jon, idade: 18, cor: preto
 * Gato 2 = nome: Simba, idade: 6, cor: tigrado
 * Gato 3 = nome: Jon, idade: 12, cor: amarelo
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderedList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("1- Ordem de Insercao");
        System.out.println(meusGatos);

        System.out.println("\n2- Ordem aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n3- Ordem Natural (nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n4- Ordem pela idade");
        Collections.sort(meusGatos, new ComparatorIdade());
//        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n5- Ordem pela cor");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n6- Ordem por Nome/Cor/Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
