package com.poi.read;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.poi.po.Student_info;

public class POITeacher_Excel {
	/** Excel文件的存放位置。注意是反斜线 */
	public List<Student_info> readFromExcel(String filePath) throws Exception {
		// 创建存放数据的list
		List<Student_info> list = new ArrayList<Student_info>();
		File file = new File(filePath);
		FileInputStream is = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(is);
		int sheets = workbook.getNumberOfSheets();// 获取所有的sheets
		for (int i = 0; i < sheets; i++) {
			Sheet sheet = workbook.getSheetAt(i); // 获取当前的sheet
			int Rows = sheet.getPhysicalNumberOfRows();// 获取所有行数
			for (int j = 2; j < Rows; j++) {
				Row row = sheet.getRow(j); // 获取当前行
				int cells = row.getPhysicalNumberOfCells();// 获取当前列

				Student_info student_info = new Student_info();// 创建对象
				for (int k = 0; k < cells; k++) {
					Cell cell = row.getCell(k); // 获取当前行的 列的表格

					String value = null; // 表格的值
					switch (k) {
					case 6:// 学校名称
						value = cell.getStringCellValue();
						student_info.setSchoolName(value);
						break;
					case 7:// 专业名称
						value = cell.getStringCellValue();
						student_info.setMajorName(value);
						break;
					case 8:// 专业方向
						value = cell.getStringCellValue();
						student_info.setMajorDirection(value);
						break;
					case 12:// 年纪
						value = cell.getStringCellValue();
						student_info.setGrade(value);
						break;
					case 13:// 班级
						value = cell.getStringCellValue();
						student_info.setClazz(value);
						break;
					default:
						break;
					}
				}
				list.add(student_info);
			}
		}
		return list;
	}

}
