package DioCollections.map.orderedMap;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPags implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPages().compareTo(l2.getValue().getPages());
    }
}
