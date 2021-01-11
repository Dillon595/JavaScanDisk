
package homework;

import java.io.File;
import java.util.Scanner;

class Main {

	/**  
	 * @Description: 
	 * @author LYL
	 * @date 2021-01-11 11:00:16
	 */

	public void Main() {
		System.out.println("扫描全盘还是扫描指定路径？1、全盘  2、指定路径");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		Scan scan = new Scan();
		if(i==1){			
			scan.allScan(new File("c:/"));
			
		}else if(i==2) {
			System.out.println("请输入指定路径：（格式：'c：/user/xxx'）");
			String path = sc.next();
			scan.allScan(new File(path));
		}
		
	}
			

	

}
