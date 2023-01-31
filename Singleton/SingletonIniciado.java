package Singleton;
/*
* Otra aplicacion del singleton, en este caso se inicia sin demanda, solo con la carga del programa
*
* */
public class SingletonIniciado {
    static private SingletonIniciado singletonIniciado = new SingletonIniciado();
    private SingletonIniciado(){}
    public static SingletonIniciado getSingletonIniciado(){
        return singletonIniciado;
    }
    public String metodo(){
        return "Singleton iniciado sin demanda";
    }
}
