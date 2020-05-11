package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

public class ViajeIndividual extends Viaje{
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    @Override
    public String descripcion(){
        return "Disfruta tu viaje individual";
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="METODO">
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
//</editor-fold>
    //No se describe cualquierMetodo2()
}



