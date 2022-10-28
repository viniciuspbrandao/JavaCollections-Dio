package DioCollections.map;
/*
 * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 * (Modelo Key / Consumo Value)
 * modelo = gol - consumo = 14,4km/l
 * modelo = uno - consumo = 15,6 km/l
 * modelo = mobi - consumo = 16,1 km/l
 * modelo = hb20 - consumo = 14,5 km/l
 * modelo = kwid - consumo = 15,6 km/l
 */

import java.util.*;

public class Map {
    public static void main(String[] args) {


        System.out.println("1- Crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        java.util.Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4); //nao tem metodo "add", utilizamos o metodo "put"
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\n2- Substitua o consumo do Gol para 15.2km/L: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\n3- Confira se o modelo Tucson esta no dicionario: " +
                carrosPopulares.containsKey("tucson"));

        System.out.println("\n4- Exiba o consumo do uno: " +
                carrosPopulares.get("uno"));

        System.out.println("\n5- Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\n6- Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\n7- Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<java.util.Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (java.util.Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " +
                modeloMaisEficiente + " - " +
                consumoMaisEficiente + "km/L");

        System.out.println("\n8- Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (java.util.Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " +
                        modeloMenosEficiente + " - " +
                        consumoMenosEficiente + "km/L");
            }
        }

        System.out.println("\n9- Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma: " + soma);

        System.out.println("\n10- Exiba a media dos consumos deste dicionario de carros: " +
                (soma / carrosPopulares.size()));

        System.out.println("\n11- Remova os modelos com consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\n12- Exiba todos os carros na ordem em que foram informados: ");
        java.util.Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4); //nao tem metodo "add", utilizamos o metodo "put"
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("\n13- Exiba o dicionario ordenado pelo modelo: ");
        java.util.Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("\n14- Apague os dicionarios de carros: ");
        carrosPopulares.clear();
        carrosPopulares1.clear();
        carrosPopulares2.clear();
        System.out.print(carrosPopulares);
        System.out.print(carrosPopulares1);
        System.out.print(carrosPopulares2);


    }
}
