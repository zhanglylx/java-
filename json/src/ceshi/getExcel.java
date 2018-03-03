package ceshi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.scene.control.Cell;
import jxl.Sheet;

public class getExcel {
	String[] v1;

	public static void getExcel () throws Exception{
		InputStream is = new FileInputStream("F:\\新建文件夹 (2)\\新建文件夹\\六期室内星(1).xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);            
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
          int lie=xssfSheet.getRow(0).getPhysicalNumberOfCells();//获取所有的列
          int row = xssfSheet.getLastRowNum(); //获取所有的行
          System.out.println(lie);
          getExcel [] values = new getExcel[100];
          int n = 0;        
           for (int rowNum = 1; rowNum <=row ; rowNum++) {
        	   //获取行内容
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow != null) {
                	//获取第4列内容
                   XSSFCell one = xssfRow.getCell(4);            
                   one.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                   //获取当前行里指定列的内容                      
                   if("1".equals(one.toString()) || "0".equals(one.toString())){
                	   getExcel getexcel = new getExcel();
                	  String[] s = new String[7];
                    	for(int i=0;i<7;i++){
                    		
                    		one = xssfRow.getCell(i+4);             
                              one.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                              s[i] = one.toString();
                    		if(i==6){
                    			getexcel.v1 = s;
                    			values[n] =getexcel; 
                    			n++;
                    		}
                    	 }
                    	
                    }
                   
               }
           // }
        }
        	createExcel.createExcel("F:\\新建文件夹 (2).xls", "sheetName", values);
           
           
        /*
        //转换数据格式
       StringText getValue(XSSFCell xssfRow) {

        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return StringText.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            return StringText.valueOf(xssfRow.getNumericCellValue());
        } else {
            return StringText.valueOf(xssfRow.getStringCellValue());
        }
    }
    */
	}
}
