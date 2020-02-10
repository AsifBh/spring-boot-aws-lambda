package com.test.lambda.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.lambda.model.TranslateKey;
import com.test.lambda.repo.TranslateDao;
import com.test.lambda.repository.TranslateRepository;

@Service
public class TranslateDaoImpl implements TranslateDao{
	
	@Autowired
	private TranslateRepository translateRepository;

	@Override
	public TranslateKey findByKeyAndLanguageCode(String key, String languageCode) {
		return translateRepository.findByKeyAndLanguageCode(key, languageCode);
	}

	@Override
	public void save(TranslateKey translateKey) {
		translateRepository.save(translateKey);
	}

}
