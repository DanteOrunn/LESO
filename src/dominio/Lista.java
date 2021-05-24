package dominio;

import utilidad.Consola;

public class Lista {

    protected Nodo list;

    public Lista() {
        this.list = null;
    }

    /**
     * Metodo para saber si la Lista esta vacia
     * 
     * @return true or false
     */
    public boolean listaVacia() {
        return list == null;
    }

    /**
     * Metodo para insertar al inicio de la lista
     * 
     * @param dato
     */
    public void insertar(Vuelo nodo){
        Nodo nuevoNodo = new Nodo(nodo);

        if (list == null) {
            list = nuevoNodo; 
            Consola.emitirMensajeLN("| Guardado Efectivo |");
        } else {
            nuevoNodo.setEnlace(list);
            list = nuevoNodo;
            Consola.emitirMensajeLN("| Guardado Efectivo |");
        }
    }

    /**
     * Metodo que elimina de la lista un vuelo segun el codigo de vuelo que ingrese
     * el usuario
     * 
     * @param DNI
     * @return
     */
    public Nodo eliminarVuelo(int codVuelo) {
        Nodo nodoDevolucion = null;
        Nodo nodoAuxiliar = list;
        Nodo nodoAnterior = null;
        boolean elementoEncontrado = false;

        if (list == null) {
            return nodoDevolucion;
        } else {
            while (nodoAuxiliar != null && !elementoEncontrado) {
                if (nodoAuxiliar.getDato().getCodigoVuelo() == codVuelo) {
                    elementoEncontrado = true;
                } else {
                    nodoAnterior = nodoAuxiliar;
                    nodoAuxiliar = nodoAuxiliar.getEnlace();
                }
            }
        }

        if (elementoEncontrado == true) {
            Consola.emitirMensajeLN("");
            Consola.emitirMensajeLN("---------------------------------------------------");
            Consola.emitirMensajeLN("| AVISO: El vuelo ha sido eliminado exitosamente |");
            Consola.emitirMensajeLN("---------------------------------------------------");
            Consola.emitirMensajeLN("");
            quitar(nodoAuxiliar, nodoAnterior);
            nodoDevolucion = nodoAuxiliar;
        } else {
            Consola.emitirMensajeLN("");
            Consola.emitirMensajeLN("-----------------------------------------");
            Consola.emitirMensajeLN("| ERROR: Vuelo inexistente en la lista |");
            Consola.emitirMensajeLN("-----------------------------------------");
            Consola.emitirMensajeLN("");
        }
        return nodoDevolucion;
    }

    /**
     * Metodo para quitar un nodo
     * 
     * @param nodoAuxiliar
     * @param nodoAnterior
     * @return
     */
    public Nodo quitar(Nodo nodoAuxiliar, Nodo nodoAnterior) {
        Nodo nodoDevolucion = nodoAuxiliar;
        if (nodoAuxiliar == list) {
            list = nodoAuxiliar.getEnlace();
        } else {
            nodoAnterior.setEnlace(nodoAuxiliar.getEnlace());
        }
        return nodoDevolucion;
    }

    public void listarVuelos(){
        Nodo nodoAx = list;

        Consola.emitirMensajeLN("");
        Consola.emitirMensajeLN("-------------------------------------------------------------------------------");
        Consola.emitirMensajeLN("| Codigo de Vuelo \t Lugar de Destino \t Fecha del Vuelo \t Hora |");
        Consola.emitirMensajeLN("-------------------------------------------------------------------------------");
        Consola.emitirMensajeLN("");

        while(nodoAx != null){
            System.out.print(nodoAx.getDato().getCodigoVuelo() + "\t\t\t ");
            System.out.print(nodoAx.getDato().getDestino() + "\t\t ");
            System.out.print(nodoAx.getDato().getFechaVuelo().toString()+ "\t\t");
            System.out.print(nodoAx.getDato().getHoraVuelo().toString() + "\t");
            System.out.println("");
            nodoAx = nodoAx.getEnlace();
        }  

        Consola.emitirMensajeLN("-------------------------------------------------------------------------------");
        Consola.emitirMensajeLN("Cantidad de Vuelos:" + cantidadElementos());
        Consola.emitirMensajeLN("-------------------------------------------------------------------------------");
    }

    /**
     * Metodo para saber la cantidad de elementos que posee la lista
     * @return 
     */
    public int cantidadElementos(){
        int cont = 0;
        Nodo recorrido = list;

        while(recorrido != null){
            cont++;
            recorrido = recorrido.getEnlace();
        }
        return cont;
    }

}
