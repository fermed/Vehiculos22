/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Pussy
 */
public interface Persona {
    public boolean subirAVehiculo(Vehiculo v);
    public boolean isConductor();
    public String getNombre();
    public boolean isInVehiculo();
    public boolean bajarDeVehiculo();
    public Vehiculo getVehiculo();
    public void conducir();
}
