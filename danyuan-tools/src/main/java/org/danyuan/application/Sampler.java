package org.danyuan.application;

import org.kordamp.bootstrapfx.scene.layout.Panel;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sampler extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception { // (1)
		Panel panel = new Panel("This is the title");
		panel.getStyleClass().add("panel-primary"); // (2)
		BorderPane content = new BorderPane();
		content.setPadding(new Insets(20));
		Button button = new Button("Hello BootstrapFX");
		button.getStyleClass().setAll("btn", "btn-danger"); // (2)
		content.setCenter(button);
		panel.setBody(content);

		Scene scene = new Scene(panel);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css"); // (3)

		primaryStage.setTitle("BootstrapFX");
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}
}