package dominio;

import utilidad.*;
import java.time.LocalTime;

public class Vuelo {
    
    private int codigoVuelo;
    private int cantidadLugares;
    private Fecha fechaVuelo;
    private String destino;
    private LocalTime horaVuelo;

    public Vuelo(){
        this.codigoVuelo = 343;
        this.cantidadLugares = 30;
        this.fechaVuelo = new Fecha(26, 2, 1999);
        this.destino = "Las Venturas";
        this.horaVuelo = LocalTime.of(16, 00);
    }

    public Vuelo(int codVuelo, int cantLuegares, Fecha fechaVuelo, String destino, LocalTime horaVuelo){
        this.codigoVuelo = codVuelo;
        this.cantidadLugares = cantLuegares;
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
    }

    public int getCodigoVuelo(){
        return codigoVuelo;
    }

    public int getCantidadLugares(){
        return cantidadLugares;
    }

    public String getDestino(){
        return destino;
    }

    public Fecha getFechaVuelo(){
        return fechaVuelo;
    }

    public LocalTime getHoraVuelo(){
        return horaVuelo;
    }

    public void ingresarVuelo(){
        Fecha fec = new Fecha();
        Consola.emitirMensajeLN("\tDatos del Vuelo");
        Consola.emitirMensaje("Codigo de Vuelo:");
        this.codigoVuelo = Consola.leerInt();
        Consola.emitirMensaje("Cantidad de Asientos:");
        this.cantidadLugares = Consola.leerInt();
        Consola.emitirMensaje("Destino:");
        this.destino = Consola.leerString();
        fec.ingresarFecha();
        Consola.emitirMensaje("Hora:");
        int axHora = Consola.leerInt();
        Consola.emitirMensaje("Minuto:");
        int axMinuto = Consola.leerInt();
        this.horaVuelo = LocalTime.of(axHora, axMinuto);
    }

    @Override
    public String toString(){
        return "Codigo de Vuelo:" + codigoVuelo + "\n" +
                "Destino:" + destino + "\n" +
                "Cantidad de Asientos:" + cantidadLugares + "\n" +
                "Fecha y hora del Vuelo:" + fechaVuelo.toString() + " a las " + horaVuelo.toString();
    }

}
