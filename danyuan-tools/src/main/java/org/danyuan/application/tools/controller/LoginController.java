/**
 *
 */
package org.danyuan.application.tools.controller;

import org.danyuan.application.tools.common.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;

/**
 * @author wth
 *
 */
@FXMLController
public class LoginController {

	@Autowired
	UserConfig userConfig;

	@FXML
	private void setHelloText(final Event event) {
		System.out.println(userConfig);
	}
}
