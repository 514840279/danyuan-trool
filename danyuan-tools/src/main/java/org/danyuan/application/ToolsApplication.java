package org.danyuan.application;

import org.danyuan.application.tools.view.MainView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.fxml.FXMLLoader;

@SpringBootApplication
public class ToolsApplication extends AbstractJavaFxApplicationSupport {
	
	public static ApplicationContext applicationContext;
	
	private static FXMLLoader loadFxml(String fxmlPath) {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(ToolsApplication.class.getResource(fxmlPath));
		fxmlLoader.setControllerFactory(applicationContext::getBean);
		return fxmlLoader;
		
	}
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ToolsApplication.class, args);
		// launch(args);
		launch(ToolsApplication.class, MainView.class, args);
	}
	
}
