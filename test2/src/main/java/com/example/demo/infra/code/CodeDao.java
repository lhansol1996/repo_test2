package com.example.demo.infra.code;

import java.util.List;

public interface CodeDao {
	
	//수많은 DTO 목록들을 리스트로 리턴
	public List<CodeDto> selectList();
	
	//DTO 중 하나를 리턴
	public CodeDto selectOne(CodeDto dto);
	
	// CRUD
	// 생성
	public int insert(CodeDto dto);
	
	// 수정
	public int update(CodeDto dto);
	
	// 삭제 (uelete, delete)
	//uelete
	public int uelete(CodeDto dto);
	//delete
	public int delete(CodeDto dto);
}
