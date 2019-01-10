package todo.ui.button.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import todo.ui.ItemTableModel;
import java.util.List;

@Configuration
public class TableModelBean {
	@Bean
	public ItemTableModel itemTableModel(
			@Value("#{itemList}")
					List itemList) {
		ItemTableModel itemTableModel = new ItemTableModel();
		itemTableModel.setItemList(itemList);
		return itemTableModel;
	}
}
