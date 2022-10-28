package DioCollections.set.orderedSet;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        //Primeiro compara por nome, depois genero, depois tempo de episodio
        int name = s1.getName().compareTo(s2.getName()); //comparando por nome
        if (name != 0) return name;

        int genero = s1.getGenero().compareTo(s2.getGenero()); //comparando por genero
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());//comparando por tempo de episodio

    }
}