package com.test.lambda.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.lambda.dto.TranslateDto;
import com.test.lambda.processor.TranslateProcessor;

@RestController
public class TranslateController {
	
	@Autowired
	private TranslateProcessor translateProcessor;

    @RequestMapping(path = "/translate", method = RequestMethod.GET)
    public TranslateDto translateKey(@RequestParam(name = "key") String key, @RequestParam(name = "lang_code") String languageCode) {
    	return translateProcessor.searchTranslatedString(key, languageCode);
    }
    
    @RequestMapping(path = "/translate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public void translateKey(@RequestBody(required = true) TranslateDto translateDto) {
    	translateProcessor.addTranslateObject(translateDto);
    }
}