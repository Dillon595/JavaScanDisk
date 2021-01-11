
package homework;

import java.io.File;
import java.util.Scanner;

/**
 * @ClassName: Scan
 * @Description: 全盘扫描和指定路径扫描
 * @author LYL
 * @date 2021-01-11 11:05:44
 */

public class Scan {

	public void allScan(File f) {
		File[] lf = f.listFiles();
		if (lf == null) {
			return;
		}

		for (File f1 : lf) {
			if (f1.isDirectory()) {
				String path = f1.getAbsolutePath();
				allScan(new File(path));
				
			} else {
				System.out.println(f1.getName());
				//System.out.println(f1.getAbsolutePath());
				
			}
		}
		isContinue();

	}
	
	public void isContinue() {
		System.out.println("扫描结束~");
		System.out.println("请选择操作：1、继续扫描  2、退出程序");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {
			Main main = new Main();
			main.Main();
		}else if(i==2) {
			System.exit(0);
		}else {
			throw new RuntimeException("请输入提示数据！");
		}
	}
	

}
