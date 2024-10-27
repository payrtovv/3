public class Auto {
    private String marca = "MErcedes";
    private String modelo;
    private String color = "Negro";
    private double cilindraje;
    private float consumo = 40;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }



    public String verDetalle(){
        String dv = "la marca es =" + this.getMarca() + "\n" +
                "el modelo es = " + this.getModelo() + "\n" +
                "El color es = " + this.getColor()+ "\n" +
                "El cilindraje es " + this.getCilindraje();
        return dv;
    }

    public String acelerar(){
        return "el auto marca = " + this.marca + "\tEsta acelerando";
    }

    public String frenar(int kmph){
        return "El auto modelo = " + this.modelo + "\tEsta frenando a " + kmph;
    }

    public float capacidadTanque(int cap, float porConsumo){
        float cm = consumo /(cap * porConsumo);
        return cm;


    }

    public float capacidadTanque(int cap, int porConsumo) {
        float cm = (cap * (porConsumo / 100));
        return cm;
    }
}