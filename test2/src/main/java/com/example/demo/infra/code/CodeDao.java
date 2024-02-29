package com.example.demo.infra.code;

import java.util.List;

public interface CodeDao {
	
	//수많은 DTO 목록들을 리스트로 리턴
	public List<CodeDto> testList();
	
	//DTO 중 하나를 리턴
	public CodeDto selectOne();
}
