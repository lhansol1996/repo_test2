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
}
