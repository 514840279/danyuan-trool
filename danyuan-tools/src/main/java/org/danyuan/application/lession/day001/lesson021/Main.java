/**
 *
 */
package org.danyuan.application.lession.day001.lesson021;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * 作 者: wth
 */
public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*
	 * (non-Javadoc)
	 *
	 *  javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		Button btn1 = new Button("button1");
		Button btn2 = new Button("button2");
		Button btn3 = new Button("button3");
		Button btn4 = new Button("button4");
		Button btn5 = new Button("button5");
		Button btn6 = new Button("button6");
		Button btn7 = new Button("button7");
		Button btn8 = new Button("button8");

		TitledPane titledPane = new TitledPane();

		titledPane.getChildrenUnmodifiable().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8);
		Scene scene = new Scene(titledPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TextFlow布局类");
		primaryStage.setWidth(400);
		primaryStage.setHeight(400);
		primaryStage.show();
	}
	
}
