package com.test.lambda.dto;

import javax.xml.bind.annotation.XmlElement;

public class TranslateDto {
	
	@XmlElement(name="key")
	private String key;
	
	@XmlElement(name="value")
	private String value;
	
	@XmlElement(name="languageCode")
	private String languageCode;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public TranslateDto(String key, String value, String languageCode) {
		super();
		this.key = key;
		this.value = value;
		this.languageCode = languageCode;
	}
	
	public TranslateDto () {}
}
