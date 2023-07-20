/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiaclasesproyecto;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Panel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author luiscarlomendoza
 */
public class ProjectTest implements Serializable {

    private String nombre, creador;
    private Date fechaCreacion;
    private String codigo;
    private ArrayList <Tabla> tablas = new ArrayList();

    public ProjectTest() {
    }

    public ProjectTest(String nombre, String creador, Date fechaCreacion) {
        this.nombre = nombre;
        this.creador = creador;
        this.fechaCreacion = fechaCreacion;
        this.codigo = generarCodigoProject();
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tabla> tablas) {
        this.tablas = tablas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
  
    public String generarCodigoProject() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    @Override
    public String toString() {
        return nombre;
    }
    

    public Tabla generarTabla(String nombreHoja) {
        Tabla Jtable_Main = new Tabla(nombreHoja);
        Jtable_Main.setFillsViewportHeight(true);
        
        DefaultTableModel modelo = (DefaultTableModel) Jtable_Main.getModel();
        int a = 65;
        char c;
        modelo.addColumn("");
        for (int i = 0; i < 26; i++) {
            c = (char) a;
            modelo.addColumn(c);
            a++;
        }
        Jtable_Main.setModel(modelo);
        
        for (int i = 1; i < 51; i++) {
            Object[] newRow = {i};
            modelo.addRow(newRow);
        }
        
        DefaultTableModel modelo1 = (DefaultTableModel) Jtable_Main.getModel();
        for (int i = 1; i < modelo1.getColumnCount(); i++) {
            for (int j = 0; j < modelo1.getRowCount(); j++) {
                Jtable_Main.getCeldas().add(new Celda(i, j, " "));
                modelo1.setValueAt("", j, i);
            }
        }

        Jtable_Main.setModel(modelo1);
        
        tablas.add(Jtable_Main);
        
        return Jtable_Main;
    }

    public void AddColumnas(JTable Jtable_Main) {
        DefaultTableModel modelo = (DefaultTableModel) Jtable_Main.getModel();
        int a = 65;
        char c;
        for (int i = 0; i < 26; i++) {
            c = (char) a;
            modelo.addColumn(c);
            a++;
        }
        Jtable_Main.setModel(modelo);
    }

    public void AddFilas(JTable Jtable_Main) {
        DefaultTableModel modelo = (DefaultTableModel) Jtable_Main.getModel();
        for (int i = 1; i < 51; i++) {
            Object[] newRow = {i};
            modelo.addRow(newRow);
        }

        Jtable_Main.setModel(modelo);
    }

}
