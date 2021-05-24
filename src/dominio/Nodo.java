package dominio;

public class Nodo {
    
    private Vuelo dato;
    private Nodo enlace;

    public Nodo(Vuelo dato){
        this.dato = dato;
        this.enlace = null;
    }

    public void setDato(Vuelo dato){
        this.dato = dato;
    }

    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }

    public Vuelo getDato(){
        return dato;
    }

    public Nodo getEnlace(){
        return enlace;
    }

    @Override
    public String toString(){
        return "Nodo{" + dato + "-" + "enlace " + enlace + '}';
    }
    
}
