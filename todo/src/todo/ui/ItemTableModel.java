package todo.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;

//Swing tabel model
public class ItemTableModel extends AbstractTableModel //по правилам swing обзательно
 {
//эта коллекция являеться источником данных для JTable
    List itemList;

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public int getColumnCount() {
        return 1;
    }

    public String getColumnName(int column) {
        return "Items";
    }
//задаём коллекцию
    public void setItemList(List itemList) {
        this.itemList = itemList;
    }
//получить количество элементов
    public int getRowCount() {
        return itemList.size();
    }

    public void setValueAt(Object value, 
                           int rowIndex, int columnIndex) {
        itemList.set(rowIndex, value);
    }
//получить значения в строке rowIndex, в столбце columnIndex
    public Object getValueAt(int rowIndex, int columnIndex) {
        return itemList.get(rowIndex);
    }
}