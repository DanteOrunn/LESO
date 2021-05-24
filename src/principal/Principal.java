package principal;

import dominio.*;

public class Principal {
    
    public static void main(String[] args) {
        
        Vuelo vuelo = new Vuelo();
        Vuelo vuelo2 = new Vuelo(); 
        Lista lista = new Lista();

        //vuelo.ingresarVuelo();
        //lista.insertar(vuelo);
        lista.insertar(vuelo2);
        lista.listarVuelos();
    }

}
