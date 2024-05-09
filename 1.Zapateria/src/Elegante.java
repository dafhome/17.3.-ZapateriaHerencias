public class Elegante extends Zapato {
    private int largoCordones;
    public Elegante(String marca, String modelo, String material,double talla, double precio, int largoCordones){
        super( marca,  modelo,  material, talla,  precio);
        this.largoCordones=largoCordones;
    }
    public int getLargoCordones() {
        return largoCordones;
    }
    public void setLargoCordones(int largoCordones) {
        this.largoCordones = largoCordones;
    }
    @Override
    public String toString() {
        return "Elegante - Marca: " + marca + ", modelo: " + modelo + ", material: " + material + ", talla: " + talla
                + ", precio: " + precio +", largo cordones: " + largoCordones + ".";
    }

}
