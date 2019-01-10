package todo.ui.button.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import todo.ui.button.AddNewButtonActionListener;
import javax.swing.*;
import java.util.List;

@Configuration
public class AddNewButtonBean {
	@Bean
	public AddNewButtonActionListener addNewButtonActionListener(
			@Value("#{itemList}")
					List itemList,
			@Value("#{itemTable}")
					JTable itemTable) {
		AddNewButtonActionListener actionListener = new AddNewButtonActionListener();
		actionListener.setList(itemList);
		actionListener.setTable(itemTable);
		return actionListener;
	}
}
