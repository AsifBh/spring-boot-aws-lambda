package com.test.lambda.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.lambda.dto.TranslateDto;
import com.test.lambda.model.TranslateKey;
import com.test.lambda.repo.TranslateDao;

@Service
public class TranslateProcessor {

	@Autowired
	private TranslateDao translateDao;
	
	public TranslateDto searchTranslatedString (String key, String languageCode) {
		TranslateKey translateKey= translateDao.findByKeyAndLanguageCode(key, languageCode);
		if ( null == translateKey ) {
			throw new Error("No translation found for given key and language");
		}
		return new TranslateDto(translateKey.getKey(), translateKey.getValue(), translateKey.getLanguageCode());
	}
	
	public void addTranslateObject(TranslateDto translateDto) {
		TranslateKey translateKey = new TranslateKey(translateDto.getKey(), translateDto.getValue(), translateDto.getLanguageCode());
		translateDao.save(translateKey);
	}
}
