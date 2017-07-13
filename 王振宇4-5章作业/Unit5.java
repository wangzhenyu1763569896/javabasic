package 第一本书;

import java.util.Scanner;

/*public class Unit5 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=100){
			System.out.println("第"+i+"遍写：好好学习天天向上");
			i++;
		}
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		int spread = 1;
		while(spread<=50){
			System.out.println("第"+spread+"继续打印");
			spread++;
		}
	}
}*/
/*public class Unit5{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("合格了吗（y/n)");
		String answer = input.next();
		while("n".equals(answer)){
			System.out.println("上午阅读教材");
			System.out.println("下午上机操作");
			System.out.println("合格了吗（y/n)");
			answer = input.next();
		}
		input.close();
	}
}*/
//上机练习一
/*public class Unit5{
	public static void main(String[]args){
		int sum=0;
		int i = 2;
		while(i<=100){
			sum = i+sum;
			i = i+2;
			
		}System.out.println("总数为"+sum);
	}
}*/
//上机练习二
/*public class Unit5{
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println("\n*********************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*********************************");
		System.out.println("请输入商品编号：");
		String name = "0";
		double price = 0;
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String answer;
		do {
			switch (number) {
			case (1):
				name = "T恤";
				price = 245.0;
				break;
			case (2):
				name = "网球鞋";
				price = 570;
				break;
			case (3):
				name = "网球拍";
				price = 320;
				break;
			}
			System.out.println(name + "\t" + "￥" + price + "\n");
			System.out.println("请输入是否继续y/n");
			answer = input.next();
			System.out.println("请输入商品编号");
			number = input.nextInt();
		} while ("y".equals(answer));
		input.close();
	}
}*/
/*public class Unit5{
	public static void main(String[] args) {
		double crew = 25;
		int year = 2012;
		while (crew <= 100) {
			crew = crew * 1.25;
			year = year + 1;
			System.out.println("第" + year + "年达到" + crew + "万人");
		}
		System.out.println("第" + year + "年达到" + crew + "万人");

	}
}*/
//课堂练习
/*public class Unit5{
	public static void main(String[]args){
		double h = 0;
		double c = 0;
		int t = 1;
		do{
			h = c*9/5.0+32;
			c = c+20;
			t++;
			System.out.println("摄氏度为"+c+"华氏度为"+h);
		}while(c<=250&&t<=10);
		while(c<=250&&t<=10){
			
			h = c*9/5.0+32;
			c = c+20;
			t++;
			System.out.println("摄氏度为"+c+"华氏度为"+h);
		}
	}
}*/
//上机练习三
/*public class Unit5{
	public static void main(String[] args) {
		System.out.println("**************************\n");
		System.out.println("请选择购买的商品编号");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("**************************\n\n");
		Scanner input = new Scanner(System.in);

		String go = "y";
		double total = 0;
		double total1 = total;
		while ("y".equals(go)) {
			System.out.print("请输入商品编号：");
			int num = input.nextInt();
			System.out.print("请选择购买数量：");
			int count = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("T恤￥245.0" + "\t" + "数量" + count + "\t" + "总计￥" + (245 * count));
				total = 245 * count;
				break;
			case 2:
				System.out.println("网球鞋￥570.0" + "\t" + "数量" + count + "\t" + "总计￥" + (570 * count));
				total = 570 * count;
				break;
			case 3:
				System.out.println("网球拍￥320.0" + "\t" + "数量" + count + "\t" + "总计￥" + (320 * count));
				total = 320 * count;
				break;
			}
			total1 = total + total1;
			System.out.println("是否继续（y/n）");
			go = input.next();
		}
		System.out.println("折扣：0.8");
		System.out.println("应付金额：" + total1 * 0.8);
		System.out.println("实付金额：");
		double in = input.nextDouble();
		double out = in - total * 0.8;
		System.out.println("找钱：" + out);
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用MyShopoing管理系统");
		System.out.println("\n1.客户信息管理");
		System.out.println("2.购物结算");
		System.out.println("3.真情回馈");
		System.out.println("4.注销");
		System.out.println("**********************\n\n\n");
		System.out.println("请选择：输入数字");
		int num = input.nextInt();
		while(num<1||num>4){
			System.out.println("输入错误，请重新选择：");
			num = input.nextInt();
		}switch(num){
		case(1):
			System.out.println("执行客户信息管理");
		break;
		case(2):
			System.out.println("执行购物结算");
		break;
		case(3):
			System.out.println("执行真情回馈");
		break;
		default:
		System.out.println("执行注销");
		break;
		}
		System.out.println("程序结束");
	}
	
}*/
/*public class Unit5{
	public static void main(String[]args){
		int num = 100;
		while(num>=5){
			System.out.println(num);
			num = num - 5;
		}
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		int num = 1;
		int sum = 0;
		do{
			if(num%7==0){
				sum = sum+num;
			}num++;
		}while (num<50);
		System.out.println(sum);
	}
}*/
/*public class Unit5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数（输入0时结束）：");
		int num = input.nextInt();
		int max = num;
		int min = num;
		do {
			
			if (max <= num) {
				max = num;
			}
			if (min > num&&num!=0) {
				min = num;
			}
			System.out.print("请输入一个整数（输入0时结束）：");
			num = input.nextInt();
		} while (num != 0);
		System.out.println("最大值为"+max);
		System.out.println("最小值为"+min);
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num;
		do{
			System.out.println("请输入数字1-7（输入0时结束）");
			num = input.nextInt();
			switch(num){
			case(1):
				System.out.println("MON");
			break;
			case(2):
				System.out.println("TUE");
				break;
			case(3):
				System.out.println("WED");
				break;
			case(4):
				System.out.println("THU");
				break;
			case(5):
				System.out.println("FRI");
				break;
			case(6):
				System.out.println("AST");
				break;
			case(7):
				System.out.println("SUN");
				break;
			}
		}while(num!=0);
		System.out.println("程序结束");
	}
}
*/
/*public class Unit5{
	public static void main(String[]args){
		int i = 1;
		int sum = 0;
		while(i<=100){
		sum = i+sum;
			i++;
		}System.out.println("1-100和为"+sum);
		do{
			sum = i+sum;
			i++;
		}while(i<=100);
		System.out.println("1-100和为"+sum);
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		int i = 1;
		int result = 0;
		int sum = 0;
		do{
			result = i*i;
			sum = result +sum;
			i++;
		}while(i<=10);
		System.out.println("10的阶乘为"+sum);
		while(i<=10){
			result = i*i;
			sum = result + sum;
			i++;
		}System.out.println("10的阶乘为"+sum);
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		double height = 0.00008;
		int i = 1;
		double sum = 0;
		while(sum<=8848.13){
			sum = height*i;
			i++;
		}
		do{
			sum = height*i;
			i++;
		}while(sum<=8848.13);
		System.out.println("需要"+i+"张纸达到珠穆朗玛峰高度");
		
	}
}*/
/*public class Unit5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year, month, day;
		System.out.print("请输入年份");
		year = input.nextInt();
		System.out.print("请输入月份");
		month = input.nextInt();
		System.out.print("请输入日期");
		day = input.nextInt();
		int sum = 0;
		while (year - 1900 != 0) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				sum = sum + 366;
			} else {
				sum = sum + 365;
			}
			year--;
		}
		while (month -1>0 ) {
			switch (month) {
			case (3):
			case (5):
			case (7):
			case (8):
			case (10):
			case (12):
				sum = sum + 31;
				break;
			case (4):
			case (6):
			case (9):
			case (11):
				sum = sum + 30;
				break;
			case (2):
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					sum = sum + 29;
				} else {
					sum = sum + 28;
				}
				break;
			default:
				sum = sum + 0;
				break;
			}
			month=month-1;
		}
		while (day - 1 > 0) {
			sum = sum + (day - 1);
			break;
		}
		System.out.println("距离1900.1.1相距" + sum + "天");
	}
}
*/
/*public class Unit5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = input.nextInt();
		int mun = 0;
		  while(num*1.0/10>0){ mun = mun*10+num%10; num = num/10; }
		do {
			mun = mun * 10 + num % 10;
			num = num / 10;
		} while (num * 1.0 / 10 > 0);
		System.out.println("翻转后的数字为：" + mun);
	}
}*/

 




















