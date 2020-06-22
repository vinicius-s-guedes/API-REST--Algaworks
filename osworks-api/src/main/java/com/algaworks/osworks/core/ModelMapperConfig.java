package com.algaworks.osworks.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	// ESSA INSTANCIA (BEAN) SERÁ INJETADA, POIS, MODELMAPPER NÃO FAZ PARTE DO SPRING
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
