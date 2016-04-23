package game;

import java.util.Scanner;

public class Luckey {
	static String name;
	static String password;
	static int cardId;
	private static Object landing;
	
	public static void zhuyemian(){
		System.out.println("****欢迎进入奖客富翁抽奖系统****");
		System.out.println("	1.注册                           ");
		System.out.println("	2.登录   		");
		System.out.println("	3.抽奖		");
		System.out.println("******************************");
		System.out.println("请选择菜单：");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
			
		switch (key) {
			case 1:
				System.out.println("[奖客富翁系统>>注册]");
				register();
				break;
			case 2:
				System.out.println("[奖客富翁系统>>登录]");
				landing();
				break;
			case 3:
				System.out.println("[奖客富翁系统>>抽奖]");
				luckey();
				break;
			
			default:
				System.out.println("您的输入有误，请重新输入！！");
				break;
			}
			System.out.println("继续吗？(y/n)");
			keep();
	}
	
	//实现注册
	public static void register(){
		Scanner input = new Scanner(System.in);
		System.out.print("用户名：\n");
		name = input.next();
		System.out.print("密码：\n");
		password = input.next();
		if (name != null && password !=null) {
			int register = 1;
			int max =1000;
			int min = 9999;
			cardId = (int)(Math.random()*(max-min)+min);
			System.out.println("注册成功，请记好您的会员卡号");
			System.out.println("用户名         密码         会员卡号  ");
			System.out.println(name+"  "+password+"  "+cardId);
			
		} else {
              System.out.println("输入有误，请重新注册！");
             
		}
	}
	//实现登陆
	public static void landing(){
		Scanner input = new Scanner(System.in);
		String iName;
		String iPassword;
		int num = 0;
		while(true){
			System.out.println("请输入用户名：");
			iName = input.next();
			System.out.println("请输入密码：");
			iPassword = input.next();
			if(!iName.equals(name)||!iPassword.equals(password)&&num<=3){
				System.out.println("对不起，您的用户名或密码有误，请重新输入！！");
				landing();
				break;
			}
			//登录时，判断用户名密码是否存在，
			if(iName.equals(name)){
				if(iName.equals(name)&&iPassword.equals(password)){
					System.out.println(iName+"您好");
					System.out.println("继续吗？（y/n）:");
					keep();
					break;
				}
				
			}else{
				System.out.println("用户名不存在，请先注册！！！！");
				register();
			}
		}
		
	}
	//实现抽奖
	public static void luckey(){
		int lcardId[] = new int[5];
		
		for (int i = 0; i < lcardId.length; i++) {
			lcardId[i] = (int) (Math.random()*10000);
		}
		//抽取幸运卡号
		System.out.println("本日的幸运卡号为：");
		for (int i = 0; i < lcardId.length; i++) {
			System.out.println(lcardId[i] + "  ");
		}
		//判断会员卡号和幸运卡是否相等
		for (int i = 0; i < lcardId.length; i++) {
			if(lcardId[i] == cardId ){
				System.out.println("\n恭喜您，成为今日的幸运会员！！！");
				break;
			}
			if(i == lcardId.length-1){
				System.out.println("\n很抱歉哦！您不是今日的幸运会员！！");
			}
		}
		
		
		
	}
	//判断是否继续
	public static void keep(){
		Scanner input = new Scanner(System.in);
		String yn = input.next();
		if(yn.equals("y")){
			zhuyemian();
		}else if(yn.equals("n")){
			System.out.println("系统结束，谢谢使用");
		}
	}

	public static void main(String[] args) {
		zhuyemian();
	}	
}	




