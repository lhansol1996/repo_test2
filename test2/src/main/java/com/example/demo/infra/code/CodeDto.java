package com.example.demo.infra.code;

import java.util.Date;

public class CodeDto {
	String seq;
	String name;
	String memo;
	Integer delNy;
	Date regDate;
	Date modifyDate;

	String xcodeGroupSeq;
	String xcodeGroupName;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getDelNy() {
		return delNy;
	}

	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getXcodeGroupSeq() {
		return xcodeGroupSeq;
	}

	public void setXcodeGroupSeq(String xcodeGroupSeq) {
		this.xcodeGroupSeq = xcodeGroupSeq;
	}

	public String getXcodeGroupName() {
		return xcodeGroupName;
	}

	public void setXcodeGroupName(String xcodeGroupName) {
		this.xcodeGroupName = xcodeGroupName;
	}

	@Override
	public String toString() {
		return "CodeDto [seq=" + seq + ", name=" + name + ", memo=" + memo + ", delNy=" + delNy + ", regDate=" + regDate
				+ ", modifyDate=" + modifyDate + ", xcodeGroupSeq=" + xcodeGroupSeq + ", xcodeGroupName="
				+ xcodeGroupName + "]";
	}

}
