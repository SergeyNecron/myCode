package todo.ui.button.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import todo.ui.ItemTableModel;
import javax.swing.*;

@Configuration
public class TableBean {
	@Bean
	public JTable itemTable(
			@Value("#{itemTableModel}")
                    ItemTableModel itemTableModel) {
		JTable table = new JTable();
		table.setModel(itemTableModel);
		return table;
	}
}
