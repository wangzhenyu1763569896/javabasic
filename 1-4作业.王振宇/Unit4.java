package 第一本书;

import java.util.Scanner;

/*public class Unit4 {
//示例一
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入名次");
		int ranking = input.nextInt();
		if ranking
		switch(ranking){
		case(1):
			System.out.println("夏令营");
		break;
		case(2):
			System.out.println("笔记本");
			break;
		case(3):
			System.out.println("硬盘");
			break;
			default:
				System.out.println("没有奖励");
				break;
		}
		input.close();
		}
}*/
//上机练习一
/*public class Unit4 {
	public static void main(String[] args) {
		System.out.println("1.登录系统\n");
		System.out.println("2.退出\n");
		System.out.println("**************************************");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt() == true) {
			int num = input.nextInt();
			switch (num) {
			case (1):
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				break;
			case (2):
				System.out.println("谢谢您的使用");
				break;
			default:
				System.out.println("输入错误");
			}

		}else{
			System.out.println("请输入正确数字");
		}
	}
}*/
//上机练习二
/*public class Unit4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额");
		int money = input.nextInt();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元：加2元换购百事可乐饮料一瓶");
		System.out.println("2：满100元：加3元换购500ml饮料一瓶");
		System.out.println("3：满100元：加10元换购5千克面粉");
		System.out.println("4：满200元：加10元换苏泊尔炒菜锅");
		System.out.println("5：满200元：加20换欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.print("请选择：");
		int nub = input.nextInt();
		if (money >= 200) {
			switch (nub) {
			case (1):
				money = money + 2;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购：百事可乐饮料一瓶");
				break;
			case (2):
				money = money + 3;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购500ml可乐一瓶");
				break;
			case (3):
				money = money + 10;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购5kg面粉一袋");
				break;

			case (4):
				money = money + 10;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购苏泊尔炒菜锅");
				break;
			case (5):
				money = money + 20;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购欧莱雅爽肤水一瓶");
				break;
			case (0):
				money = money;
				System.out.println("本次消费金额为：" + money);
				System.out.println("未换购");
				break;

			default:
				System.out.println("选择有误");
				break;
			}
		} else if (money >= 100) {
			switch (nub) {
			case (1):
				money = money + 2;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购：百事可乐饮料一瓶");
				break;
			case (2):
				money = money + 3;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购500ml可乐一瓶");
				break;
			case (3):
				money = money + 10;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购5kg面粉一袋");
				break;
			case (0):
				money = money;
				System.out.println("本次消费金额为：" + money);
				System.out.println("未换购");
				break;
			default:
				System.out.println("选择有误");
				break;
			}
		} else if (money >= 50) {
			switch (nub) {
			case (1):
				money = money + 2;
				System.out.println("本次消费金额为：" + money);
				System.out.println("成功换购：百事可乐饮料一瓶");
				break;
			case (0):
				money = money;
				System.out.println("本次消费金额为：" + money);
				System.out.println("未换购");
				break;
			default:
				System.out.println("选择有误");
				break;
			}
		} else {
			System.out.println("金额不足无法换购");
		}
		input.close();
	}
}*/
//简答题2
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期几：");
		int week = input.nextInt();
		switch (week) {
		case (1):
		case (3):
		case (5):
			System.out.println("学习编程");
			break;
		case (2):
		case (4):
		case (6):
			System.out.println("学习英语");
			break;
		case (7):
			System.out.println("休息");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		input.close();
	}
}*/
//简答题3
/*public class Unit4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入成绩");
		int grade = input.nextInt();
		switch(grade/10){
		case(10):
			System.out.println("买一辆车");
		break;
		case(9):
			System.out.println("买一部笔记本");
			break;
		case(8):
		case(7):
		case(6):
			System.out.println("买一部手机");
			break;
		default:
			System.out.println("没有奖励");
		}
	}
}*/
//简答题4
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = input.nextInt();
		System.out.println("请输入仓型：头等舱输入1，经济舱输入2");
		int rank = input.nextInt();
		int cost = 5000;
		switch (month) {
		case (4):
		case (5):
		case (6):
		case (7):
		case (8):
		case (9):
		case (10):
			switch (rank) {
			case (1):
				System.out.println("你的机票价格是：" + cost * 9 / 10);
				break;
			case (2):
				System.out.println("你的机票价格为：" + cost * 8 / 10);
				break;
			}
			break;
		default:
			switch (rank) {
			case (1):
				System.out.println("你的机票价格为：" + cost * 5 / 10);
				break;
			case (2):
				System.out.println("你的机票价格为：" + cost * 4 / 10);
				break;
			}
		}
	}
}*/
//简答题5
/*public class Unit4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入地一个操作数");
		double nub1 = input.nextDouble();
		System.out.println("请输入运算符（+，-，*，/，%）");
		char opr = input.next().charAt(0);
		System.out.println("请输入第二个操作数");
		double nub2 = input.nextDouble();
		switch (opr) {
		case '+':
			System.out.println(+nub1 + "+" + nub2 + "=" + (nub1 + nub2));
			break;
		case '-':
			System.out.println(+nub1 + "-" + nub2 + "=" + (nub1 - nub2));
			break;
		case '*':
			System.out.println(+nub1 + "*" + nub2 + "=" + (nub1 * nub2));
			break;
		case '/':
			if (nub2 == 0) {
				System.out.println("除数不能为零");
			} else {
				System.out.println(+nub1 + "/" + nub2 + "=" + (nub1 / nub2));
			}
			break;
		case '%':
			if(nub2==0){
				System.out.println("除数不能为零");
			}else{
			System.out.println(+nub1 + "%" + nub2 + "=" + (nub1 % nub2));
			}break;
		default:
			System.out.println("请输入正确的运算符");

		}input.close();
	}
}*/
/*public class Unit4{
	public static void mian(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入今天周几：");
		String week = input.next();
		switch(week){
			case"周二":
			case"周三":
			case"周五":
			case"周六":
				System.out.println("在学校上课");
			break;
			case"周一":
				System.out.println("在寝室预习");
			break;
			case"周四":
				System.out.println("玩游戏");
				break;
				default:
					System.out.println("出去逛街");
		}
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份");
		int year = input.nextInt();
		System.out.print("请输入月份");
		int month = input.nextInt();
		switch (month) {
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			System.out.println("该月份为三十一天");
			break;
		case (4):
		case (6):
		case (11):
		case (9):
			System.out.println("该月份为三十天");
			break;
		case(2):
			if ((year % 4 == 0 && year % 100 != 0) ||( year % 400 == 0)) {
				System.out.println("该月份为29天");
			} else {
				System.out.println("该月份为28天");
			}
			break;
			default:
				System.out.println("请输入正确的月份");
				break;
		}input.close();
	}	
	}*/
/*public class Unit4{
	public static void main(String[] args) {
		System.out.println("请输入数字");
		Scanner input = new Scanner(System.in);
		int nub = input.nextInt();
		switch (nub) {
		case (1):
			System.out.println("拨爸爸的号码");
			break;
		case (2):
			System.out.println("拨妈妈的号码");
			break;
		case (3):
			System.out.println("拨爷爷的号码");
			break;
		case (4):
			System.out.println("拨奶奶的号码");
			break;
		default:
			System.out.println("拨打其他号码");
		}
		input.close();
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生成绩");
		int score = input.nextInt();
		switch (score / 10) {
		case (9):
		case(10):
			System.out.println("学习成绩为优秀");
			break;
		case (8):
			System.out.println("学习成绩为良好");
			break;
		case (7):
			System.out.println("学习成绩为中等");
			break;
		case (6):
			System.out.println("学习成绩为及格");
			break;
		default:
			System.out.println("成绩不及格");
			break;
		}
		input.close();
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份");
		int month = input.nextInt();
		switch (month) {
		case (4):
		case (5):
		case (3):
			System.out.println("春季");
			break;
		case (7):
		case (6):
		case (8):
			System.out.println("夏季");
			break;
		case (10):
		case (11):
		case (9):
			System.out.println("秋季");
			break;
		case (12):
		case (1):
		case (2):
			System.out.println("冬季");
			break;
		default:
			System.out.println("请输入正确的月份");
		}
		input.close();
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字母");
		char letter = input.next().charAt(0);
		switch (letter) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;
		default:
			System.out.println("只能转换abcde");
		}
		input.close();
	}
}*/






















