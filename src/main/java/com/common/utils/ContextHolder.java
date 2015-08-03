package com.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextHolder implements ApplicationContextAware {

	private static ApplicationContext applicationContext; // Spring应用上下文环境

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		ContextHolder.applicationContext = applicationContext;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object getBean(Class requiredType)
			throws BeansException {
		return applicationContext.getBean(requiredType.getName(), requiredType);
	}
}
