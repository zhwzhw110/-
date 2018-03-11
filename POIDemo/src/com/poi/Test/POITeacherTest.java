package com.poi.Test;

import java.util.List;

import com.poi.po.Student_info;
import com.poi.read.POITeacher_Excel;

public class POITeacherTest {
	public static void main(String[] args) {
		POITeacher_Excel execl = new POITeacher_Excel();
		try {
			String filePath = "D:\\ѧ����Ϣ������33����\\��Ϫ�������е�ְҵѧУ.xls";
			
			List<Student_info> list = execl.readFromExcel(filePath);
			for (Student_info student_info : list) {
				System.out.println(student_info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
