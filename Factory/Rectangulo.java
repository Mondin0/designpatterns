package Factory;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(){

    }
    public Rectangulo(double ancho, double alto){
        this.setAncho(ancho);
        this.setAlto(alto);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
