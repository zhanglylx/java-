package 万达;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;

/**
 * 支持访问xls文件
 */

/**
 * @author zhanglianyu
 * 
 *
 */
public class Excel {
	/**
	 * @author zhanglianyu
	 * @param Path  
	 * 				查找Excel的路径
	 * @param acquire
	 *				获取第一行数据请填写:获取标题，输入其他代表所有内容
	 *@param find
	 *				匹配第一行的列，如果查找到返回本列全部内容
	 */			
	public static String [] ExcelNative(String Path, String acquire,String find) {
		
		jxl.Workbook readwb = null;
		String [] Excel = null;
		try {
			// 构建Workbook对象, 只读Workbook对象
			// 直接从本地文件创建Workbook
			InputStream instream = new FileInputStream(Path);
			readwb = Workbook.getWorkbook(instream);
			// Sheet的下标是从0开始
			// 获取第一张Sheet表
			Sheet readsheet = readwb.getSheet(0);

			// 获取Sheet表中所包含的总列数
			
			int rsColumns = readsheet.getColumns();// 获取所有列
			int rsRows = readsheet.getRows();// 获取所有行
		
			Excel = new String[rsColumns];
			
			for (int Columns = 0; Columns < rsColumns; Columns++) {// 获取list当前所在列
				if ("获取标题".equals(acquire)) {					
					// 如果获取标题，那么获取第1行的所有数据
					Cell cell = readsheet.getCell(Columns, 0);
					Excel[Columns] = cell.getContents();
				} else {
					Cell cell = readsheet.getCell(Columns, 0); // 获取到引用的位置
					String str = cell.getContents();
					if (str.contains(find)) {// 模糊匹配list
						rsColumns = Columns;
						break;
					} else {
						if (Columns == rsColumns - 1) {
							System.out.println("没有找到Excel中的指定列");
							System.exit(0);
						}
					}
				}
			}

			// int rsColumns =1;//先写死了去第一列数据，以后有需求在更改
			// 获取指定单元格的对象引用
			if ("获取标题".equals(acquire) == false) {
				Excel = new String[rsRows];// 创建数组，存入Excel数据
				for (int i = 0; i < rsRows; i++) {
					// for (int j = 0; j < rsColumns; j++)
					// {
					Cell cell = readsheet.getCell(rsColumns, i); // 获取到引用的位置					
					Excel[i] = cell.getContents();
					if("".equals(Excel[i]) ){
						Excel[i]="获取的表格没有内容";
					}
					
					// System.out.print(cell.getContents() + "
					// ");//需要getContents方法转化为相应字符
					// }
					// System.out.println();
				}
			}
			/*
			 * // 利用已经创建的Excel工作薄,创建新的可写入的Excel工作薄 jxl.write.WritableWorkbook
			 * wwb = Workbook.createWorkbook(new File( "F:/红楼人物1.xls"), readwb);
			 * // 读取第一张工作表 jxl.write.WritableSheet ws = wwb.getSheet(0); //
			 * 获得第一个单元格对象 jxl.write.WritableCell wc = ws.getWritableCell(0, 0);
			 * // 判断单元格的类型, 做出相应的转化 if (wc.getType() == CellType.LABEL) { Label
			 * l = (Label) wc; l.setString("新姓名"); } // 写入Excel对象 wwb.write();
			 * wwb.close();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			readwb.close();
		}
		if (Excel == null) {
			System.out.println("获取Excel空了");
		}
		return Excel;
	}
}
