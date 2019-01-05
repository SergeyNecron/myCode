package todo.ui.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;


public abstract class ListTableActionListener 
                      implements ActionListener {
    protected JTable table;
    protected List list;
    abstract public void actionPerformed(ActionEvent e);
    public void setList(List list) {
        this.list = list;
    }

    public void setTable(JTable itemTable) {
        this.table = itemTable;
    }
}