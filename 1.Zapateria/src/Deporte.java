public class Deporte extends Zapato {
    public Deporte (String marca, String modelo, String material,double talla, double precio){
        super( marca,  modelo,  material, talla,  precio);
    }

    @Override
    public String toString() {
        return "Deporte - Marca: " + marca + ", modelo: " + modelo + ", material: " + material + ", talla: " + talla
                + ", precio: " + precio +".";
    }
}
