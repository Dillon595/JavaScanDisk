
package homework;

import java.io.File;
import java.util.Scanner;

/**
 * @ClassName: Scan
 * @Description: 扫描类
 * @author LYL
 * @date 2021-01-11 11:05:44
 */

public class Scan {

	public void allScan(File f) {
		// 将传入的File对象变成File数组
		File[] lf = f.listFiles();
		// 如果为空则结束这次方法。避免空指针异常
		if (lf == null) {
			return;
		}
		// 循环遍历lf中的每个File对象
		for (File f1 : lf) {
			// 如果当前遍历到的这个File对象是文件夹
			if (f1.isDirectory()) {
				// 得到当前文件夹的路径
				String path = f1.getAbsolutePath();
				// 重新调用当前方法，并传入刚刚遍历到的文件夹对象进去
				allScan(new File(path));
				// 如果当前File对象是一个文件
			} else {
				// 输出当前文件的名称
				System.out.println(f1.getName());
				// System.out.println(f1.getAbsolutePath());

			}
		}
		

	}

	/**
	 * @Description:判断是否继续扫描
	 * @author LYL
	 * @date 2021-01-11 13:08:24
	 */
	public void isContinue() {
		System.out.println("请选择操作：1、继续扫描  2、退出程序");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		//如果用户输入的是1
		if (i == 1) {			
			//通过Main()方法判断是否重新扫描
			Main main = new Main();
			main.Main();
		} else if (i == 2) {
			//如果输入2则直接退出
			System.exit(0);
		} else {
			//如果不按提示输入则抛出异常
			throw new RuntimeException("请输入所提示的数据！");
		}
		sc.close();
	}

}
