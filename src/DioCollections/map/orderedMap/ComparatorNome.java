package DioCollections.map.orderedMap;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    }
}

