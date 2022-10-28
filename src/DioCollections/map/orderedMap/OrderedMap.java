package DioCollections.map.orderedMap;

/*
Dadas as seguintes informações sobre os livros e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor | Livro | Paginas
*/

import java.util.*;

public class OrderedMap {
    public static void main(String[] args) {
        System.out.println("1- Ordem aleatoria: ");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put(" 35 autores", new Livro("Jornada Java", 485));
            put(" Stephen R. Covey", new Livro("Os Sete Hábitos das Pessoas Altamente Eficazes", 450));
            put(" Paul Deitel", new Livro("Java: Como Programar", 855));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());

        System.out.println("\n2- Ordem de insercao");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" 35 autores", new Livro("Jornada Java", 485));
            put(" Stephen R. Covey", new Livro("Os Sete Hábitos das Pessoas Altamente Eficazes", 450));
            put(" Paul Deitel", new Livro("Java: Como Programar", 855));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());

        System.out.println("\n3- Ordem alfabetica por autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());

        System.out.println("\n4- Ordem alfabetica por livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());

        System.out.println("\n5- Ordem por numero de paginas");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPags());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());

    }
}
