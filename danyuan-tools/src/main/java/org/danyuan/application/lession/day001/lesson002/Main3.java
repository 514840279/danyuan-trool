/**
 *
 */
package org.danyuan.application.lession.day001.lesson002;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author wth
 *
 */
public class Main3 extends Application {

	public static void main(String[] args) {
		System.out.println("main()");
		launch(args);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javafx.application.Application#init()
	 */
	@Override
	public void init() throws Exception {
		System.out.println("init()");
		super.init();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javafx.application.Application#stop()
	 */
	@Override
	public void stop() throws Exception {
		System.out.println("stop()");
		super.stop();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start()");
		primaryStage.show();

	}
}
