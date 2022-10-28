package DioCollections.map.orderedMap;

import java.util.Objects;

public class Livro {
    private String name;
    private Integer pages;

    public Livro(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return name.equals(livro.name) && pages.equals(livro.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
