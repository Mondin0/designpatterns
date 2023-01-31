package Singleton;
/**
 * Implementación del patron singleton bajo demanda
 * */

public class Singleton {
    /*
    * Definimos la clase que se instanciara una sola vez
    * */
    static private Singleton singleton = null;

    private Singleton(){} //constructor privado, sera llamado la unica vez que se instancie

    //Metodo principal, si nunca se instancio se activa el constructor y se devuelve el mismo, ya el constructor no se puede llamar mas

    static public Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public String metodo(){
        return "Singleton invocado bajo demanda";
    }
}
