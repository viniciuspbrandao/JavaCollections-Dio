package DioCollections.set.orderedSet;

import java.util.Objects;

public class Serie  implements Comparable<Serie> {
    private String name;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String name, String genero, Integer tempoEpisodio) {
        this.name = name;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return name.equals(serie.name) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }
}
