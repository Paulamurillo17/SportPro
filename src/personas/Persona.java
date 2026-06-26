/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;
import java.time.Period;
/**alDate;
 *
 * @author pg610
 */
public class Persona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected LocalDate fechaNacimiento;
    protected int telefono;
    protected int cedula;

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCedula() {
        return cedula;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
     public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public Persona(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int telefono, int cedula) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    
    }
 
