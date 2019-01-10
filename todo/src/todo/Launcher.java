package todo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

 class Launcher {
     void launch() {
    	final String contextPaths = "app-context.xml";
        new ClassPathXmlApplicationContext(contextPaths);
	}
}