/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiaclasesproyecto;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author luiscarlomendoza
 */
public class MiRenderer extends DefaultTableCellRenderer {

    private int targetRow;
    private int targetColumn;
    private Color backgroundColor;
    private Color colorForeground;

    public MiRenderer() {
        super();
    }

    public MiRenderer(int targetRow, int targetColumn, Color backgroundColor, Color colorForeground) {
        this.targetRow = targetRow;
        this.targetColumn = targetColumn;
        this.backgroundColor = backgroundColor;
        this.colorForeground = colorForeground;
    }
    

    public int getTargetRow() {
        return targetRow;
    }

    public void setTargetRow(int targetRow) {
        this.targetRow = targetRow;
    }

    public int getTargetColumn() {
        return targetColumn;
    }

    public void setTargetColumn(int targetColumn) {
        this.targetColumn = targetColumn;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    public Color getColorForeground() {
        return colorForeground;
    }

    public void setColorForeground(Color colorForeground) {
        this.colorForeground = colorForeground;
    }
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        // Check if the current cell is the target cell
        if (row == targetRow && column == targetColumn) {
            component.setBackground(backgroundColor);
            component.setForeground(table.getForeground());
        } else {
            component.setBackground(table.getBackground());
            component.setForeground(table.getForeground());
        }

        return component;
    }
}
