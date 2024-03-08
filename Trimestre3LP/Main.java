package Trimestre3LP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Producto> inventario = new HashMap<>();
        String pathAbsoluto = "C:\\Users\\JuanPrograma\\OneDrive\\Desktop\\productos.txt";
        // Solicitar al usuario la ruta y el nombre del archivo
        System.out.println("Introduce la ruta y el nombre del archivo de productos:");
        //String pathAbsoluto = sc.nextLine();
        inventario = leer(pathAbsoluto);

        // Pedir al usuario el código del producto y mostrar información si existe
        String codigoProducto;
        do {
            System.out.println("Introduce el código del producto (0 para salir):");
            codigoProducto = sc.nextLine();
            if (!codigoProducto.equals("0")) {
                Producto producto = inventario.get(codigoProducto);
                if (producto != null) {
                    System.out.println("Información del producto:");
                    System.out.println("Código: " + producto.getCodigo());
                    System.out.println("Nombre: " + producto.getNombre());
                    System.out.println("Precio: " + producto.getPrecio());
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }
        } while (!codigoProducto.equals("0"));
    }
    //metodo apparte para leer el contenido 
    public static HashMap<String, Producto> leer(String path) {

        // Leer el archivo y llenar el inventario
        HashMap<String, Producto> inventario = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] partes = line.split(",");
                if (partes.length == 3) {
                    String codigo = partes[0];
                    String nombre = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    Producto producto = new Producto(codigo, nombre, precio);
                    inventario.put(codigo, producto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inventario;
    }

}
