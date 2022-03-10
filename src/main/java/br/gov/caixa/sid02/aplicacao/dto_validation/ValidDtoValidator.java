package br.gov.caixa.sid02.aplicacao.dto_validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidDtoValidator implements ConstraintValidator<ValidateDto, ValidDto>{

	@Override
	public boolean isValid(ValidDto dtoReference, ConstraintValidatorContext constraintValidatorContext) {
		return dtoReference.isValid(constraintValidatorContext);
	}

}
