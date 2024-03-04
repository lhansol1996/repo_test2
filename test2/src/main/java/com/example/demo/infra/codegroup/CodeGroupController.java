package com.example.demo.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
//	CodeGroupService codeGroupService;
	CodeGroupService service;
	
	@RequestMapping(value="/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception {
		
//		List <CodeGroupDto> codeGroupDtos = codeGroupService.selectList();	
//			model.addAttribute("listcodeGroups", codeGroupDtos);
		
		model.addAttribute("list", service.selectList());
			
		
		return "codeGroupXdmList";
	}
	
	
	@RequestMapping(value="/codeGroupView")
	public String codeGroupView(CodeGroupDto dto, Model model) throws Exception{
		/*
		 * 넘겨 받은 변수 2개 확인하는 방법
		 * 1번째 방법 : 받는 객체를 dto로 받는 방법
		 * -> dto의 변수들 이름과 html에서 받는 이름이 같으면 자동으로 매핑됨(대소문자도 같아야함)
		 */
		System.out.println("dto.getseq:"+dto.getSeq());
		System.out.println("dto.getName:"+dto.getName());
		System.out.println(dto.toString());
		
		
		
		return "codeGroupView";
	}
	
	
	
	
}
