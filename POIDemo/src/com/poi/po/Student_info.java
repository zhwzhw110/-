package com.poi.po;

public class Student_info {
	private String SchoolName; // ѧУ����
	private String MajorName;// רҵ����
	private String MajorDirection;// רҵ����
	private String Grade;// �꼶
	private String Clazz;// �༶

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
