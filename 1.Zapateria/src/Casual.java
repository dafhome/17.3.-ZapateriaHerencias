public class Casual extends Zapato {
    private String color;

    public Casual(String marca, String modelo, String material,double talla, double precio, String color){
        super( marca,  modelo,  material, talla,  precio);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Casual - Marca: " + marca + ", modelo: " + modelo + ", material: " + material + ", talla: " + talla
                + ", precio: " + precio +", color: " + color + ".";
    }

}
