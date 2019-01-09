package todo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

 class Launcher {
     void launch() {
    	final String contextPaths = "context.xml";
        new ClassPathXmlApplicationContext(contextPaths);
	}
}