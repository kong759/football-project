package kr.co.sist.football.teamlist.model.service;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.co.sist.football.teamlist.model.dto.TeamInfo;

public class TeamValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return TeamInfo.class.isAssignableFrom(clazz);  
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		TeamInfo info = (TeamInfo) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required", "필수입력 사항입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "logoPath", "required", "필수입력 사항입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "maxNum", "required", "필수입력 사항입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "location", "required", "필수입력 사항입니다.");

		// Team의 name값이 5자 이하인지 확인
		if(info.getName().length() < 1 || info.getName().length() > 6){     
			// Exception이 아닌 오류메세지(defaulutMessage)를 띄움
			errors.rejectValue("name", "lengthsize", "팀  이름은 한글 6자이하만 가능합니다.");
		}

	}

}
