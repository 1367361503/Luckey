package game;

import java.util.Scanner;

public class Luckey {
	static String name;
	static String password;
	static int cardId;
	private static Object landing;
	
	public static void zhuyemian(){
		System.out.println("****��ӭ���뽱�͸��̳齱ϵͳ****");
		System.out.println("	1.ע��                           ");
		System.out.println("	2.��¼   		");
		System.out.println("	3.�齱		");
		System.out.println("******************************");
		System.out.println("��ѡ��˵���");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
			
		switch (key) {
			case 1:
				System.out.println("[���͸���ϵͳ>>ע��]");
				register();
				break;
			case 2:
				System.out.println("[���͸���ϵͳ>>��¼]");
				landing();
				break;
			case 3:
				System.out.println("[���͸���ϵͳ>>�齱]");
				luckey();
				break;
			
			default:
				System.out.println("���������������������룡��");
				break;
			}
			System.out.println("������(y/n)");
			keep();
	}
	
	//ʵ��ע��
	public static void register(){
		Scanner input = new Scanner(System.in);
		System.out.print("�û�����\n");
		name = input.next();
		System.out.print("���룺\n");
		password = input.next();
		if (name != null && password !=null) {
			int register = 1;
			int max =1000;
			int min = 9999;
			cardId = (int)(Math.random()*(max-min)+min);
			System.out.println("ע��ɹ�����Ǻ����Ļ�Ա����");
			System.out.println("�û���         ����         ��Ա����  ");
			System.out.println(name+"  "+password+"  "+cardId);
			
		} else {
              System.out.println("��������������ע�ᣡ");
             
		}
	}
	//ʵ�ֵ�½
	public static void landing(){
		Scanner input = new Scanner(System.in);
		String iName;
		String iPassword;
		int num = 0;
		while(true){
			System.out.println("�������û�����");
			iName = input.next();
			System.out.println("���������룺");
			iPassword = input.next();
			if(!iName.equals(name)||!iPassword.equals(password)&&num<=3){
				System.out.println("�Բ��������û����������������������룡��");
				landing();
				break;
			}
			//��¼ʱ���ж��û��������Ƿ���ڣ�
			if(iName.equals(name)){
				if(iName.equals(name)&&iPassword.equals(password)){
					System.out.println(iName+"����");
					System.out.println("�����𣿣�y/n��:");
					keep();
					break;
				}
				
			}else{
				System.out.println("�û��������ڣ�����ע�ᣡ������");
				register();
			}
		}
		
	}
	//ʵ�ֳ齱
	public static void luckey(){
		int lcardId[] = new int[5];
		
		for (int i = 0; i < lcardId.length; i++) {
			lcardId[i] = (int) (Math.random()*10000);
		}
		//��ȡ���˿���
		System.out.println("���յ����˿���Ϊ��");
		for (int i = 0; i < lcardId.length; i++) {
			System.out.println(lcardId[i] + "  ");
		}
		//�жϻ�Ա���ź����˿��Ƿ����
		for (int i = 0; i < lcardId.length; i++) {
			if(lcardId[i] == cardId ){
				System.out.println("\n��ϲ������Ϊ���յ����˻�Ա������");
				break;
			}
			if(i == lcardId.length-1){
				System.out.println("\n�ܱ�ǸŶ�������ǽ��յ����˻�Ա����");
			}
		}
		
		
		
	}
	//�ж��Ƿ����
	public static void keep(){
		Scanner input = new Scanner(System.in);
		String yn = input.next();
		if(yn.equals("y")){
			zhuyemian();
		}else if(yn.equals("n")){
			System.out.println("ϵͳ������ллʹ��");
		}
	}

	public static void main(String[] args) {
		zhuyemian();
	}	
}	




