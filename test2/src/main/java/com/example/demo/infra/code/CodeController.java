package com.example.demo.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	
	@RequestMapping(value="/codeXdmList")
	public String codeXdmList(Model model) throws Exception {	
		model.addAttribute("list", service.testList());
		System.out.println("-----------------------------=======================================");
			System.out.println(model.toString());
			
//			List <CodeDto> codeDtos = service.testList();	
//			System.out.println("-----------------------------");
//			for (CodeDto codeDto : codeDtos) {
//				System.out.println(codeDto.toString());
//			}
//			
//			model.addAttribute("list", codeDtos);
		
		return "codeXdmList";
	}
}
