package br.gov.caixa.sid02.aplicacao.dto_validation;

import javax.validation.ConstraintValidatorContext;

public interface ValidDto {
	
	default boolean isValid(ConstraintValidatorContext constraintValidatorContext) {
		return true;
	}

}
