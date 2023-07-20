/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiaclasesproyecto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author luiscarlomendoza
 */
public class adminProjects implements Serializable {
    
    private ArrayList <ProjectTest> proyectos = new ArrayList();
    private File archivo = null;

    public adminProjects() {
    }

    public adminProjects(String path) {
        archivo = new File(path);
    }

    public ArrayList<ProjectTest> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList <ProjectTest> proyectos) {
        this.proyectos = proyectos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
        public void cargarArchivo() {
        try {

            ProjectTest temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ProjectTest) objeto.readObject()) != null) {
                        proyectos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (ProjectTest t : proyectos) {
                bw.writeObject(t);
            }

            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
