package bdaecb2018;

import java.util.ArrayList;
import java.util.Date;

public class Tablas {
    String nombre;
    String creador;
    Date fecha_creacion;
    ArrayList<String> Colaboradores=new ArrayList();
    ArrayList<String> Atributos=new ArrayList();
    ArrayList<String> Detalle=new ArrayList();

    public Tablas(String nombre, String creador, Date fecha_creacion) {
        this.nombre = nombre;
        this.creador = creador;
        this.fecha_creacion = fecha_creacion;
    }    

    public ArrayList<String> getColaboradores() {
        return Colaboradores;
    }

    public void setColaboradores(ArrayList<String> Colaboradores) {
        this.Colaboradores = Colaboradores;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public ArrayList<String> getAtributos() {
        return Atributos;
    }

    public void setAtributos(ArrayList<String> Atributos) {
        this.Atributos = Atributos;
    }

    public ArrayList<String> getDetalle() {
        return Detalle;
    }

    public void setDetalle(ArrayList<String> Detalle) {
        this.Detalle = Detalle;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}