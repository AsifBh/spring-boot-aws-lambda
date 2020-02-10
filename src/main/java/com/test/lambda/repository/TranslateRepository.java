package com.test.lambda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.lambda.model.TranslateKey;

@Repository
public interface TranslateRepository extends JpaRepository<TranslateKey, String>{

	public TranslateKey findByKeyAndLanguageCode(String key, String languageCode);
	
}
