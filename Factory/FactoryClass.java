package Factory;
/*
* Implementaremos el patrón de diseño factory para la creacion de figuras
* */
public class FactoryClass {
    public static void main(String[] args) {

        //Llamamos a la clase factory que dependiendo el tipo que le pasemos nos retornara un objeto de esa misma clase

        Figura figura1 = CreadorDeFigura.crearFigura(Tipos.TRIANGULO);
        Triangulo triangulo = (Triangulo) figura1; //Forzamos el cambio de tipo, ya que cradorDeFigura nos retorna un objeto del tipo Figura, que es abstracta
        Figura figura2= CreadorDeFigura.crearFigura(Tipos.CIRCULO);
        Circulo circulo = (Circulo) figura2;
        Figura figura3 = CreadorDeFigura.crearFigura(Tipos.RECTANGULO);
        Rectangulo rectangulo = (Rectangulo) figura3;

        //mostramos en pantalla lo que obtengamos de cada objeto

        triangulo.setAltura(5);
        triangulo.setBase(3);
        System.out.println("base= " + triangulo.getBase());
        System.out.println("altura = " + triangulo.getAltura());
        System.out.println("area de triangulo = " + triangulo.calcularArea());

        System.out.println("-------------------------------");


        circulo.setRadio(5);
        System.out.println("radio = " + circulo.getRadio());
        System.out.println("Area del circulo = " + Math.round(circulo.calcularArea()));

        System.out.println("-------------------------------");


        rectangulo.setAlto(2);
        rectangulo.setAncho(6);
        System.out.println("Alto = " + rectangulo.getAlto());
        System.out.println("Ancho = " + rectangulo.getAncho());
        System.out.println("Area del rectangulo = " + rectangulo.calcularArea());
    }
}
