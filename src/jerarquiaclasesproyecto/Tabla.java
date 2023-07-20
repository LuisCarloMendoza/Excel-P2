/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiaclasesproyecto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JTable;

/**
 *
 * @author luiscarlomendoza
 */
public class Tabla extends JTable implements Serializable {

    private String nombreHoja;
    private String codigo;
    private ArrayList<Celda> celdas = new ArrayList();

    public Tabla() {
        super();
    }
    
    public Tabla(String nombreHoja) {
        this.nombreHoja = nombreHoja;
        this.codigo = generarCodigoTabla();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    public String getNombreHoja() {
        return nombreHoja;
    }

    public void setNombreHoja(String nombreHoja) {
        this.nombreHoja = nombreHoja;
    }

    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
    }
    

    public String generarCodigoTabla() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    @Override
    public String toString() {
        return nombreHoja;
    }

}
