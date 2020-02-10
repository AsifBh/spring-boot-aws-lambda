package com.test.lambda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "translate_key")
public class TranslateKey {
	
	@Id
	@GenericGenerator(name = "GUID" , strategy = "org.hibernate.id.GUIDGenerator")
	@GeneratedValue(generator = "GUID")
	@Column(name = "id", updatable = false, nullable = false)
	private String id;

	@Column(name = "`key`")
	private String key;
	
	@Column(name = "`value`")
	private String value;
	
	@Column(name = "language_code")
	private String languageCode;
	
	
	public TranslateKey () {}

	public TranslateKey(String key, String value, String languageCode) {
		super();
		this.key = key;
		this.value = value;
		this.languageCode = languageCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
}
