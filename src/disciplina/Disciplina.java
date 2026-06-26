/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplina;
import responsable.Responsable;

public class Disciplina {

    private String nombre;
    private String categoria;
    private int capacidadMaxima;
    private Responsable responsable;

    public Disciplina(String nombre, String categoria, int capacidadMaxima, Responsable responsable) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.capacidadMaxima = capacidadMaxima;
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Capacidad maxima: " + capacidadMaxima);
    }

}
