package com.example.demo.infra.codegroup;

import java.util.List;

public interface CodeGroupDao {
	
	//수많은 DTO 목록들을 리스트로 리턴
	public List<CodeGroupDto> selectList();
	
	//DTO 중 하나를 리턴
	public CodeGroupDto selectOne(CodeGroupDto dto);
}
