package todo.ui.button.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ListBean {
	@Bean
	public List itemList() {
		List list = new ArrayList();
		list.add("привет");
		list.add("пока");
		return list;
	}
}
