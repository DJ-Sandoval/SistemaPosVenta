
package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import static javax.swing.text.StyleConstants.setForeground;

/**
 *
 * @author Jose
 */
public class Tables extends DefaultTableCellRenderer {

   @Override
    public Component getTableCellRendererComponent(
            JTable jtable, Object o, boolean bln, boolean blnl, int row, int col) {
        super.getTableCellRendererComponent(jtable, o, bln, blnl, row, col);
        Object cellValue = jtable.getValueAt(row, col);
        if (cellValue != null && cellValue.toString().equals("Inactivo")) {
            setBackground(Color.red);
            setForeground(Color.black);
        } else {
            setBackground(Color.white);
            setForeground(Color.black);
        }
        return this;
    }

}
