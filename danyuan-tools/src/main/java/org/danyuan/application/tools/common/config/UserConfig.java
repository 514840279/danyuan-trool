package org.danyuan.application.tools.common.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "user")
public class UserConfig {
	// 开发者信息
	List<Developer> developers = new ArrayList<>();

	// 语言
	private String language;

	/**
	 * @return the developers
	 */
	public List<Developer> getDevelopers() {
		return developers;
	}

	/**
	 * @param developers the developers to set
	 */
	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	@Override
	public String toString() {
		return "UserConfig [developers=" + developers + "]";
	}

}
