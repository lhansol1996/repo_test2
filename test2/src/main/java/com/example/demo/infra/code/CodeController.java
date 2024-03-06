package com.example.demo.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@Autowired
	CodeService service;

	/**
	 * 코드 리스트
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/codeXdmList")
	public String codeXdmList(Model model) throws Exception {
		model.addAttribute("list", service.selectList());
//		System.out.println("-----------------------------=======================================");
//		System.out.println(model.toString());

		return "codeXdmList";
	}

	/**
	 * 코드 view
	 * @param model 
	 * @param codeDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/codeView")
	public String codeView(Model model, CodeDto dto) throws Exception {
		System.out.println("---------------------------" + dto.toString());
		model.addAttribute("item",service.selectOne(dto));
		return "codeView";
	}
	
	/**
	 * 코드 등록 화면으로 이동
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/codeRegForm")
	public String codeView(Model model) throws Exception {
		return "codeRegForm";
	}
	
	/**
	 * 코드 등록 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/codeInsert")
	public String codeInsert(Model model, CodeDto dto) throws Exception {
		service.insert(dto);
		return "redirect:/codeXdmList";
	}
	
	
	/**
	 * 코드 update
	 * @param model
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/codeUpdate")
	public String codeUpdate(Model model, CodeDto dto) throws Exception {
		service.update(dto);
		return "redirect:/codeXdmList";
	}

	/**
	 * 코드 uelete
	 * @param model
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/codeUelete")
	public String codeUelete(Model model, CodeDto dto) throws Exception {
		service.uelete(dto);
		return "redirect:/codeXdmList";
	}
	
	/**
	 * code delete
	 * @param model
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/codeDelete")
	public String codeDelete(Model model, CodeDto dto) throws Exception {
		service.delete(dto);
		return "redirect:/codeXdmList";
	}
	
}
