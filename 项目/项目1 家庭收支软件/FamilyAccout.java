/**
 * 
 */
package project1;

/**
 * @Description
 * @author zych1108
 * @version
 * @date 2021年5月25日上午8:44:15
 */
public class FamilyAccout {
	public static void main(String[] args) {
		boolean isflag = true;
		//初始化金额 
		String info = "收支\t"+"账户金额\t\t"+"收支金额\t\t"+"说  明\n";
		int money = 10000;
		
		while(isflag) {
			//软件启动界面
			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println();
			System.out.println("                    1 收支明细");
			System.out.println("                    2 登记收入");
			System.out.println("                    3 登记支出");
			System.out.println("                    4 退   出");
			System.out.println();
			System.out.println("                     请选择(1-4):");
			
			//获取用户输入的一个数字：
			int selection = Utility.readMenuSelection();
			//switch分支判断selection进入哪一个界面
			switch(selection){
			case '1':
				System.out.println();
				System.out.println("-----------------当前收支明细记录-----------------");
				System.out.println(info);
				//System.out.println();
				System.out.print("--------------------------------------------------");
				break;
			case '2':
				System.out.print("本次收入金额：");
				int addmoney = Utility.readNumber();
				money += addmoney;
				System.out.print("本次收入说明：");
				String addinfo = Utility.readString();
				info += ("收入\t"+money+"\t\t"+addmoney+"\t\t"+addinfo+"\n");
				System.out.print("---------------------登记完成---------------------\n");
				break;
			case '3':
				System.out.print("本次支出金额：");
				int minusmoney = Utility.readNumber();
				money -= minusmoney;
				System.out.print("本次支出说明：");
				String minusinfo = Utility.readString();
				info += ("收入\t"+money+"\t\t"+minusmoney+"\t\t"+minusinfo+"\n");
				System.out.print("---------------------登记完成---------------------\n");
				break;
			case '4':
				System.out.print("确认是否退出(Y/N)：");
				char choose = Utility.readConfirmSelection();
				if(choose == 'Y') {
					isflag = false;
				}
			}
		}	
	}
}
