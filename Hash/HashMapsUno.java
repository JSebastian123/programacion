package Hash;

import java.util.HashMap;

public class HashMapsUno {
    // es muy rapido
    // funciona por keys
    // es una coleccion, conjunto de elementos
    // funciona con pks para llegar enseguida a el
    // rapidssimo
    // pero para insertar cosas mas lenta
    // nosuchElemetnsException con try catch nos salvamos
    // referencia a objeto, no se puede usar en tipos primitivos
    // tenemos q usar los wrappers de los valores es decir
    // int no Integer si
    // double no Double si
    public static void main(String[] args) {

        HashMap<String, Float> map = new HashMap<String, Float>();

        // HashMap x = new HashMap<>();
        

        // metodos de los hash
        // get(String key)
        // put(string key, Object Value)

        map.put("Silla", 25f);
        // float vs double
        map.put("Isalila", 24f);

        map.get("Silla"); // printea 25

        map.replace("Silla", 45f);

        map.size(); // printea el tamaño

        map.remove("Silla");

        map.clear(); //limpia toda la lista

        map.forEach(null); // recorre la lista 

        // map.stream(); ver de donde srive  
    }
}
