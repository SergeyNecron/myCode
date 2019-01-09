package todo.ui.button;

import java.awt.event.ActionEvent;

//инициализируется и передаётся в ActionListenerButton
public class AddNewButtonActionListener extends 
  ListTableActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        list.add("Новая заметка");
        table.revalidate();
    }
}