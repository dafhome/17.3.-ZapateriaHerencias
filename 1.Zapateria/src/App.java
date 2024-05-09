import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        Casual c1 = (new Casual("Vans", "Skooll", "Piel", 45, 59.99));
        Casual c2 = (new Casual("Converse", "Taylor", "Tela", 44.5, 89.99));

        Deporte d1 = (new Deporte("Nike", "Air Force", "Piel", 43.5, 89.95));
        Deporte d2 = (new Deporte("Puma", "Mayze", "Sintetico", 41, 29.95));

        Elegante e1 = (new Elegante("Boss", "BRANDON_TENN_SD", "Ante", 45, 129.95,10));
        Elegante e2 = (new Elegante("Martinelli", "Buchel", "Piel", 44, 112.95,20));


        ArrayList<Zapato> tienda = new ArrayList(Arrays.asList(c1,c2,d1,d2,e1));
        tienda.add(e2);
        System.out.println();
        System.out.println("Mostrar marca con bucle for");
        for (int i=0; i<tienda.size();i++){
            System.out.println(tienda.get(i).getMarca());
        }
        System.out.println();
        System.out.println("Ahora muestro los modelos con foreach");
        for (Zapato zapato : tienda) {
            System.out.println(zapato);
        }

     
        System.out.println();


        // De esta forma puedo acceder a un elemento de un tipo de objeto que no existe en el constructor super

        // Recorriendo la lista tienda
        for (Zapato zapato : tienda) {

            // Verificando si el zapato es de tipo Elegante
            if (zapato instanceof Elegante) {

                // Si es de tipo Elegante, hacemos un casting a Elegante
                Elegante elegante = (Elegante) zapato;

                // Ahora podemos acceder al atributo largoCordones
                System.out.println("Largo de cordones para el zapato " + elegante.getMarca() + ": " + elegante.getLargoCordones());
            }
        }

        // calcular precio total
        double precioTotal = 0f;
        for (Zapato zapato : tienda) {
            precioTotal+=zapato.getPrecio();
        }
        System.out.println();
        System.out.println("El precio total de todos los zapatos es: "+precioTotal+"€");
    }
}
