package utilidad;

public class Fecha {
    
    private int dia;
    private int mes;
    private int año;

    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
    }

    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAño(){
        return año;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAño(int año){
        this.año = año;
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + año;
    }

    public void ingresarFecha(){
        cargarAño();
        cargarMes();
        cargarDia();
    }

    private void cargarDia(){
        int axDia;
        do{
            Consola.emitirMensaje("Dia:");
            axDia = Consola.leerInt();

            if (verificarDia(axDia) == false) {
                Consola.emitirMensajeLN("Dia invalido...");
            }
        }while(!verificarDia(axDia));
        this.dia = axDia;
    }

    private void cargarMes(){
        int axMes;
        do{
            Consola.emitirMensaje("Mes:");
            axMes = Consola.leerInt();

            if (verificarMes(axMes) == false) {
                Consola.emitirMensajeLN("Mes invalido...");
            }
        }while(!verificarMes(axMes));
        this.mes = axMes;
    }

    private void cargarAño(){
        int axAño;
        do{
            Consola.emitirMensaje("Año:");
            axAño = Consola.leerInt();

            if (verificarAño(axAño) == false) {
                Consola.emitirMensajeLN("Año invalido...");
            }
        }while(!verificarAño(axAño));
        this.año = axAño;
    }

    private boolean verificarDia(int dia){
        boolean done = false;
        switch (this.mes) {
            case 1:
                done = dia > 0 && dia < 32;
                break;
            case 2:
                done = dia > 0 && dia < 30; 
                break;
            case 3:
                done = dia > 0 && dia < 32;
                break;
            case 4:
                done = dia > 0 && dia < 31;
                break;
            case 5:
                done = dia > 0 && dia < 32;
                break;
            case 6:
                done = dia > 0 && dia < 31;
                break;
            case 7:
                done = dia > 0 && dia < 32;
                break;
            case 8:
                done = dia > 0 && dia < 32;
                break;
            case 9:
                done = dia > 0 && dia < 31;
                break;
            case 10:
                done = dia > 0 && dia < 32;
                break;
            case 11:
                done = dia > 0 && dia < 31;
                break;
            case 12:
                done = dia > 0 && dia < 32;
                break;
        }
        return done;
    }

    private boolean verificarMes(int mes){
        return mes > 0 && mes < 13;
    }

    private boolean verificarAño(int año){
        return año >= 0;
    }

}
