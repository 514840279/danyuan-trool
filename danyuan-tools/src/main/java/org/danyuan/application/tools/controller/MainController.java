package org.danyuan.application.tools.controller;

import org.danyuan.application.ToolsApplication;
import org.danyuan.application.tools.view.LoginView;
import org.danyuan.application.tools.view.MainView;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;

/**
 *
 * 文件名 ： MainController.java 包 名 ： org.danyuan.application.tools.controller 描 述
 * ： TODO(用一句话描述该文件做什么) 机能名称：TODO 技能ID ：TODO 作 者 ： wth 时 间 ： 2020年10月23日
 * 上午1:07:59 版 本 ： V1.0
 */
@FXMLController
public class MainController {

	@FXML
	public void showPerson(final Event event) {
		ToolsApplication.showView(LoginView.class);
	}

	@FXML
	public void showMain(final Event event) {
		ToolsApplication.showView(MainView.class);
	}

}
