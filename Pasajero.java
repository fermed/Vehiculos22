/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Pussy
 */
public class Pasajero implements Persona {
    
    private String nombre;
    
    public Pasajero(String n){
        
    }

    @Override
    public boolean subirAVehiculo(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isConductor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInVehiculo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean bajarDeVehiculo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vehiculo getVehiculo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void conducir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
