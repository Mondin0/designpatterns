package Singleton;

public class Main {
    public static void main(String[] args) {

        //Se usa para llamadas puntuales
        System.out.println(Singleton.getSingleton().metodo());
        System.out.println(SingletonIniciado.getSingletonIniciado().metodo());

        System.out.println("---------------");

        //de esta forma es cuando lo queremos llamar mas de una vez
        //El singleton es un objeto normal, se puede llamar con normalidad

        Singleton s = Singleton.getSingleton();
        System.out.println(s.metodo());
        SingletonIniciado si= SingletonIniciado.getSingletonIniciado();
        System.out.println(si.metodo());
    }
}
