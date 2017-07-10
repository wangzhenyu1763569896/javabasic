package 第一本书;
import java.util.*;

/*public class Unit3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统>幸运抽奖\n");
		System.out.print("请输入四位会员卡号");
		int num = input.nextInt();
		int bai = num%1000/100;
		int random = (int)(Math.random()*10);
		if (bai == random){
			System.out.println(+num+"号客户是幸运用户，获精美MP3一个");	
		}else {
			System.out.println(+num+"号客户，谢谢你的参与");
		}
	}
}*/
/*public class Unit3{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息\n");
		System.out.print("请输入会员号（四位整数）");
		int num = input.nextInt();
		System.out.print("\n请输入会员生日（月/日<用二位数表示）：");
		int month = input.nextInt();
		int day = input.nextInt();
		System.out.print("请输入积分：");
		int integral = input.nextInt();
		if (1000<=num&&num<=9999){
			System.out.println("已录入会员的信息是：");
			System.out.print(+num+"\t"+month+"/"+day+"\t"+integral);
		}else{
			System.out.println("信息录入失败");
		}	
	}
}*/
//多重if选择结构
/*public class Unit3{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入该学生成绩");
		double score = input.nextDouble();
		if(score>=80){
			System.out.println("该学生考试成绩良好");
		}else if(score>=60){
			System.out.println("该学生考试成绩中等");
		}else{
			System.out.println("该学生成绩差");
		}
	}
}*/
/*
public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入此人的存款额：");
		double deposit = input.nextDouble();
		if(deposit>5000000){
			System.out.println("买凯迪拉克");
		}else if(deposit>1000000){
				System.out.println("买帕萨特");
			}else if(deposit>500000){
				System.out.println("买伊兰特");
			}else if(deposit>100000){
				System.out.println("买奥拓");
			}else{
				System.out.println("不买");
			}
	}
}*/
/*public class Unit3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入跑步成绩：");
		double grade = input.nextDouble();
		System.out.print("请输入性别");
		String sex = input.next();
		String man = "男";
		String women = "女";
		if (grade < 10) {
			if (sex.equals(man)) {
				System.out.println("该人进入男子组");
			} else if (sex.equals(women)) {
				System.out.println("该人进入女子组");
			}
		} else {
			System.out.println("淘汰");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入是否为会员：是（y）/否（其他字符）");
		String member = input.next();
		System.out.print("请输入购物金额：");
		double sum = input.nextDouble();
		if(member.equals("y")){
			if(sum>=200){
				System.out.println("实际支付："+sum*75/100);
			}else{
				System.out.println("实际支付："+sum*8/10);
			}
		}else{
			if(sum>=100){
				System.out.println("实际支付金额："+sum*9/10);
			}else{
				System.out.println("实际支付金额："+sum);
			}
		}	
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入会员积分");
		int integral = input.nextInt();
		if(integral < 2000){
			System.out.println("该会员享受的折扣是：0.9");
		}else if(2000<=integral&&integral<4000){
			System.out.println("该会员享受的折扣是：0.8");
		}else if(4000<=integral&&integral<8000){
			System.out.println("该会员享受的折扣是：0.7");
		}else if(8000<=integral){
			System.out.println("该会员享受的折扣是：0.6");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();
		if (year % 4 == 0 && year%100 != 0||year%400 == 0) {
			System.out.println("该年为闰年");
		} else {
			System.out.println("该年为平年");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入中奖金额");
		int bonus = input.nextInt();
		if(bonus>=5000000){
			System.out.println("我买车，资助希望工程，去欧洲旅游");
		}else{
			System.out.println("我买下一期体彩，继续烧高香");
		}
	}
}*/
/*public class Unit3{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name = input.next();
	    System.out.print("请输入密码：");
		int password = input.nextInt();
		if(name.equals("青")&&password == 123){
			System.out.println("欢迎你：青");
		}else{
			System.out.println("对不起，你不是青");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		System.out.print("请输入性别");
		String sex = input.next();
		if(age>=5&&sex.equals("男")||age>=7){
			System.out.println("可以搬动桌子");
		}else{
			System.out.println("搬不动桌子");
		}
		input.close();
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三个整数");
		int a,b,c;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if(a>b){
			a=a+b;
			b=a-b;
			a=a-b;
		}if(a>c){
			a=a+c;
			c=a-c;
			a=a-c;
		}if(b>c){
			b=b+c;
			c=b-c;
			b=b-c;
		}System.out.println(+a+"，"+b+","+c);	
	}
}*/
/*public class Unit3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入今天周几：");
		String week = input.next();
		if (week.contentEquals("周六") || week.contentEquals("周日")) {
			System.out.print("请输入今天的温度:");
			int temp = input.nextInt();
			if (temp > 30) {
				System.out.println("与朋友去游泳");
			} else {
				System.out.println("和老铁去爬山");
			}
		} else{
			System.out.print("请输入天气情况：");
			String weather = input.next();
			if(weather.contentEquals("晴天")){
				System.out.println("拜访客户");
			}else{
				System.out.println("查资料");
			}
			
		}
	}
}*/
/*public class Unit3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int number = input.nextInt();
		if (number % 3 == 0 || number % 5 == 0) {
			System.out.println("该数是3或5的倍数");
		} else {
			System.out.println("该数不能被3或5中任何一个数整除");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩");
		int grade = input.nextInt();
		if(grade<60){
			System.out.println("没有礼物");
		}else if(grade<=90){
			System.out.println("买一部手机");
		}else if(grade<100){
			System.out.println("买一部笔记本");
		}else{
			System.out.println("买车");
		}input.close();
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的出行月份：1——12");
		int month = input.nextInt();
		System.out.println("请输入你选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		int kind = input.nextInt();
		int price = 5000;
		if(3<month&&month<11){
			if(kind==1){
				System.out.println("你的机票价格是："+price*9/10);
			}else{
				System.out.println("你的机票价格是："+price*8/10);
			}
		}else if(kind==1){
			System.out.println("你的机票价格是："+price*5/10);
		}else{
			System.out.println("你的机票价格是："+price*4/10);
		}input.close();
	}
}*/



















