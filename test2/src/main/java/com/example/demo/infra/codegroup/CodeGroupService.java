package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * 로직을 처리하는 클래스
 * DAO의 구현체를 호출하는 역할을 한다고 보면됨
 */

@Service
public class CodeGroupService {

	// @autowired : 객체 생성어노테이션
	@Autowired
	CodeGroupDao codeGroupDao;

	
	 
	//selectList 구현
	public List<CodeGroupDto> selectList() {
/*
 * 		List<CodeGroupDto> list = codeGroupDao.selectList();
 * 		return list;
 */
		
		return codeGroupDao.selectList();
	}

	public CodeGroupDto selectOne(CodeGroupDto dto) {
		return codeGroupDao.selectOne(dto);
	}
	
}
