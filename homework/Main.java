
package homework;

import java.io.File;
import java.util.Scanner;

class Main {

	/**
	 * @Description: 用户交互
	 * @author LYL
	 * @date 2021-01-11 11:00:16
	 */

	public void Main() {
		System.out.println("扫描全盘还是扫描指定路径？1、全盘  2、指定路径");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		// 创建Scan对象，以便调用扫描的方法
		Scan scan = new Scan();
		if (i == 1) {
			scan.allScan(new File("c:/"));
			System.out.println("扫描结束");
		} else if (i == 2) {
			System.out.println("请输入指定路径：（格式：'c：/user/xxx'）");
			sc.nextLine();
			String path = sc.nextLine();
			// 将用户输入的路径放入一个新的File对象中
			scan.allScan(new File(path));
			System.out.println("扫描结束");
		} else {
			throw new RuntimeException("请输入所提示的数据！");
		}
		// 结束后判断是否继续
		scan.isContinue();

	}

}
