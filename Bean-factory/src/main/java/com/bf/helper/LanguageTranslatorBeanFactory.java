package com.bf.helper;

import org.springframework.beans.factory.FactoryBean;

import com.bf.beans.LanguageTranslater;
import com.bf.beans.LanguageTranslatorBuild;

public class LanguageTranslatorBeanFactory implements FactoryBean<LanguageTranslater>{

	public LanguageTranslater getObject() throws Exception {
		LanguageTranslatorBuild translatorBuild = new LanguageTranslatorBuild();
		translatorBuild.loadDefinataion("en", "hn");
		LanguageTranslater translater = translatorBuild.build();
			return translater;
	}

	public Class<?> getObjectType() {
		return LanguageTranslater.class;
	}

}
