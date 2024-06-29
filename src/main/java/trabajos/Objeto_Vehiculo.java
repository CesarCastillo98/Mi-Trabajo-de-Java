package trabajos;

public class Objeto_Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;

    public Objeto_Vehiculo(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Objeto_Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        Objeto_Vehiculo miObjeto_Vehiculo = new Objeto_Vehiculo("Mazda", "Mazda_3", 2024, "rojo");

        System.out.println(miObjeto_Vehiculo);
    }
}
