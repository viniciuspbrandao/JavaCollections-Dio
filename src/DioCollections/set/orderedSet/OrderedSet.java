package DioCollections.set.orderedSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrderedSet {
    public static void main(String[] args) {

        System.out.println("1- ORDEM ALEATORIA:"); //ORDEM ALEATORIA: HASHSET
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Suit", "acao", 60));
            add(new Serie("Braking bad", "acao", 45));
            add(new Serie("Sopranos", "suspense", 60));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getName() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n2- ORDEM DE INSERCAO:"); //ORDEM DE INSERCAO: LINKEDHASHSET
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("Suit", "acao", 60));
            add(new Serie("Braking bad", "acao", 45));
            add(new Serie("Sopranos", "suspense", 60));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getName() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("\n3- ORDEM NATURAL (Tempo de episodio):"); //TREESET
        /*
         *Essa comparacao e possivel apenas porque a classe Seria implementa o Comparable
         *Como duas series tem o mesmo tempo de episodio ele so mostra uma, pois nao aceita valores duplicados
         *No treeset abaixo aparecem valores duplicados pois fizemos um tratamento, comparando de 3 formas diferentes.
         */
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getName() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("\n4- ORDEM NOME/GENERO/TempoEPISODIO:"); //TREESET
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);


        for (Serie serie : minhasSeries3)
            System.out.println(serie.getName() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("\n5- ORDEM GENERO:"); //TREESET
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);

        for (Serie serie : minhasSeries4)
            System.out.println(serie.getName() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}
