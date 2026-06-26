/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asistencias;
import participante.Participante;

public class Asistencia {

    private Participante participante;
    private String estado;

    public Asistencia(Participante participante, String estado) {
        this.participante = participante;
        this.estado = estado;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Participante: " + participante.getNombreCompleto());
        System.out.println("Estado: " + estado);
    }

}