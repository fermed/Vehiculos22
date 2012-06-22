/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Pussy
 */
public class Conductor implements Persona {
    
    private String nombre;
    private boolean isInVehiculo;
    private Vehiculo vehiculo;
    
    public Conductor(String n){
        this.nombre = n;
        this.isInVehiculo = false;
    }

    @Override
    public boolean subirAVehiculo(Vehiculo v) {
//        throw new UnsupportedOperationException("Not supported yet.");
        boolean r = false;
        if(this.isInVehiculo() == false){
            this.isInVehiculo = true;
            this.vehiculo = v;
            r = true;
        }
        return r;
    }

    @Override
    public boolean isConductor() {
        return true;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean isInVehiculo() {
//        throw new UnsupportedOperationException("Not supported yet.");
        return this.isInVehiculo;
    }

    @Override
    public boolean bajarDeVehiculo() {
        this.isInVehiculo = false;
        return true;
    }

    @Override
    public Vehiculo getVehiculo() {
//        throw new UnsupportedOperationException("Not supported yet.");
        return this.vehiculo;
    }

    public void conducir() {
//        throw new UnsupportedOperationException("Not supported yet.");
        String r = "No tengo vehículo que conducir";
        if(this.isInVehiculo()){
            r = "Look at me, im driving a " + vehiculo.getNombre();
        }
        JOptionPane.showMessageDialog(null, r);
    }
    
}
