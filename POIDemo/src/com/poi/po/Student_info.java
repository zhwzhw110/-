package com.poi.po;

public class Student_info {
	private String SchoolName; // 学校名称
	private String MajorName;// 专业名称
	private String MajorDirection;// 专业方向
	private String Grade;// 年级
	private String Clazz;// 班级

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getMajorName() {
		return MajorName;
	}

	public void setMajorName(String majorName) {
		MajorName = majorName;
	}

	public String getMajorDirection() {
		return MajorDirection;
	}

	public void setMajorDirection(String majorDirection) {
		MajorDirection = majorDirection;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getClazz() {
		return Clazz;
	}

	public void setClazz(String clazz) {
		Clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student_info [SchoolName=" + SchoolName + ", MajorName=" + MajorName + ", MajorDirection="
				+ MajorDirection + ", Grade=" + Grade + ", Clazz=" + Clazz + "]";
	}

}
