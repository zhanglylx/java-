package ceshi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class createExcel {
	private static HSSFWorkbook workbook = null;

	public static void createExcel(String fileDir, String sheetName, getExcel[] s) throws Exception {
		// 创建workbook
		workbook = new HSSFWorkbook();
		// 添加Worksheet（不添加sheet时生成的xls文件打开时会报错)
		HSSFSheet sheet1 = workbook.createSheet(sheetName);

		// 新建文件
		FileOutputStream out = null;
		try {
			// 添加表头
			for (int f = 0; f < s.length; f++) {
				if(f==7){
					break;
				}
				HSSFRow row = workbook.getSheet(sheetName).createRow(f); // 创建第一行
				getExcel values = s[f];
				for (int i = 0; i < values.v1.length; i++) {
				
					HSSFCell cell = row.createCell(i);
					cell.setCellValue(values.v1[i].toString());
					sheet1.autoSizeColumn(i, true);// 自动适应宽度

				}
			}
			out = new FileOutputStream(fileDir);
			workbook.write(out);
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
