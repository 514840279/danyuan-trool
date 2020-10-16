package org.danyuan.application.tools.config;

import de.felixroske.jfxsupport.SplashScreen;
import javafx.scene.Parent;

/**
 * 自定义闪屏
 * 
 * @author xiyang.ycj
 * @since Dec 09, 2019 16:35:12 PM
 */
public class SplashScreenCustom extends SplashScreen {
	@Override
	public Parent getParent() {
		return super.getParent();
	}

	@Override
	public boolean visible() {
		return super.visible();
	}

	@Override
	public String getImagePath() {
		return "/images/splash.gif";
	}
}