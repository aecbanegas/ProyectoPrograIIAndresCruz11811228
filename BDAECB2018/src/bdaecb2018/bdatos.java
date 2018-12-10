/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdaecb2018;

import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MBanegas
 */
public class bdatos {

    String nombre;
    DefaultTreeModel modelo;
    ArrayList<Tablas> tablas = new ArrayList();
    ArrayList<String> scripts = new ArrayList();
    ArrayList<Usuarios> colaboradores = new ArrayList();

    public bdatos(String nombre, DefaultTreeModel modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DefaultTreeModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTreeModel modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Tablas> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tablas> tablas) {
        this.tablas = tablas;
    }

    public ArrayList<String> getScripts() {
        return scripts;
    }

    public void setScripts(ArrayList<String> scripts) {
        this.scripts = scripts;
    }

    public ArrayList<Usuarios> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Usuarios> colaboradores) {
        this.colaboradores = colaboradores;
    }
}
