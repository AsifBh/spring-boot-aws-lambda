package com.test.lambda.repo;

import com.test.lambda.model.TranslateKey;

public interface TranslateDao {

	public TranslateKey findByKeyAndLanguageCode(String key, String languageCode);
	
	public void save(TranslateKey translateKey);
	
}
