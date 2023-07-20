/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiaclasesproyecto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author luiscarlomendoza
 */
public class Celda implements Serializable{
    
    private String nombre;
    private int columna, fila;
    private String valor;
    private boolean referencia;
    private boolean seleccionada;
    private ArrayList <Celda> celdasReferencia = new ArrayList();
    private Celda referenicaCelda;
    

    public Celda() {
    }

    public Celda(int columna, int fila) {
        this.columna = columna;
        this.fila = fila;
    }

    public Celda(int columna, int fila, String valor) {
        this.columna = columna;
        this.fila = fila;
        this.valor = valor;
    }

    public Celda(String nombre, int columna, int fila, String valor) {
        this.nombre = nombre;
        this.columna = columna;
        this.fila = fila;
        this.valor = valor;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if(this.referencia == true){
            this.valor = referenicaCelda.getValor();
        } else{
            this.valor = valor;
        }

    }
    
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isReferencia() {
        return referencia;
    }

    public void setReferencia(boolean referencia) {
        
        this.referencia = referencia;
        
    }

    public boolean isSeleccionada() {
        return seleccionada;
    }

    public void setSeleccionada(boolean seleccionada) {
        this.seleccionada = seleccionada;
    }

    public ArrayList<Celda> getCeldasReferencia() {
        return celdasReferencia;
    }

    public void setCeldasReferencia(ArrayList<Celda> celdasReferencia) {
        this.celdasReferencia = celdasReferencia;
    }

    public Celda getReferenicaCelda() {
        return referenicaCelda;
    }

    public void setReferenicaCelda(Celda referenicaCelda) {
        this.referenicaCelda = referenicaCelda;
    }

    
    

    @Override
    public String toString() {
        return nombre;
    } 
    
}
