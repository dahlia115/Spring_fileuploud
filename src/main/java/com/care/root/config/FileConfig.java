package com.care.root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration //설정 파일
public class FileConfig {
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver mr = new CommonsMultipartResolver();
		mr.setMaxUploadSize(52428800);//50MB
		mr.setDefaultEncoding("utf-8");
		return mr; //리턴으로 돌려주는 객체가 빈으로 등록
	}
}
