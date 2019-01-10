package todo.ui.button.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import todo.ui.button.DeleteButtonActionListener;
import javax.swing.*;
import java.util.List;

@Configuration
public class DeleteButtonBean {
	@Bean
	public DeleteButtonActionListener deleteButtonActionListener(
			@Value("#{itemList}")
					List itemList,
			@Value("#{itemTable}")
					JTable itemTable) {
		DeleteButtonActionListener actionListener = new DeleteButtonActionListener();
		actionListener.setList(itemList);
		actionListener.setTable(itemTable);
		return actionListener;
	}
}
