package Factory;

public class CreadorDeFigura {
    public static Figura crearFigura(Tipos tipoFigura){
        return switch (tipoFigura) {
            case TRIANGULO -> new Triangulo();
            case CIRCULO -> new Circulo();
            default -> new Rectangulo();
        };
    }
}
