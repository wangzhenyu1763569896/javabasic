package 第一本书;

import java.util.Scanner;

/*public class Unit6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名");
		String name = input.next();
		int score;
		int sum = 0;
		double avg = 0;
		for(int i = 0;i<5;i++){
			System.out.print("请输入五门功课中第"+(i+1)+"门课的成绩：");
			score = input.nextInt();
			sum = score+sum;
		}
			avg = (double)sum/5;
			System.out.println(name+"的平均分为"+avg);
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int i;
		int j;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个值");
		int sum = input.nextInt();
		for(i=0,j=sum;i<=sum;i++,j--){
			System.out.println(+i+"+"+j+"="+(i+j));
		}
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int i= 1;
		int sum = 0;
		for(;i<=100;i++){
			if(i%2==1){
				sum = sum+i;
			}
		}System.out.println("总数为"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int age;
		double count1=0;
		double count2=0;
		for (int i=1 ;i<=10;i++){
			System.out.print("请输入第"+i+"为顾客的年龄：");
			age= input.nextInt();
			if(age<=30){
				count1=count1+1;
			}else{
				count2=count2+1;
			}
		}System.out.print("三十岁以下的比例为"+(+count1/10));
		System.out.print("三十岁以上的比例为"+(+count2/10));
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int sum= 0;
		for(int i=1;i<=100;i++){
			if(i%3!=0){
				sum = i+sum;
			}
		}System.out.println("和为"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int i = 1;
		int sum = 0;
		for(;i<=10;i++){
			sum = sum+i;
			if(sum>20){
				break;
			}
		}System.out.println("大于20的当前数为："+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入班级总人数");
		int total = input.nextInt();
		int count = 0;
		for(int i = 1;i<=total;i++){
			System.out.println("请输入第"+(i)+"位学生的成绩");
			int score = input.nextInt();
			if(score<80){
				continue;
			}
			count=count+1;
		}
		System.out.println("八十分以上的人数为："+count);
		double ratio = (count*1.0/total)*100;
		System.out.printf("八十分以上的的所占比例为%.2f%%\n:",ratio);
		}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int sum = 0;
		for(int i =1;i<=10;i++){
			if(i%2!=0){
				continue;
			}sum=sum+i;
		}System.out.println("和为"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		for (int i = 1; i <= 3; i++) {
			System.out.println("\n请输入四位会员号（4位整数）:");
			int num = input.nextInt();
			System.out.println("请输入会员生日（月/日<用两位整数表示>）");
			String birthday = input.next();
			System.out.println("请输入会员积分：");
			int integral = input.nextInt();
			if (num < 1000 || num > 9999) {
				System.out.println(+num+"是错误卡号，录入失败,请重新输入");
			} else {
				System.out.println("你录入的会员信息是：");
				System.out.println("卡号"+"\t"+"生日"+"\t"+"积分");
				System.out.println(num + "\t" + birthday + "\t" + integral);
			}
		}System.out.println("程序结束");
	}
}*/
/*public class Unit6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int change = 3; change <= 3; change--) {
			System.out.println("请输入用户名");
			String name = input.next();
			System.out.println("请输入密码");
			String password = input.next();
			if (name.equals("jim") && password.equals("123456")) {
				System.out.println("欢迎登陆");
				break;
			} else if (change - 1 > 0) {
				System.out.println("输入错误！您还有" + (change - 1) + "次机会");
			} else {
				System.out.println("对不起，您三次均输入错误");
				break;
			}
		}
	}
}
*/
/*public class Unit6{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int total = 0;
		for(int day = 1;day<=5;day++){
			System.out.println("请输入周"+day+"的学习时间：");
			int time = input.nextInt();
			total = time+total;
		}System.out.println("周一至周五每天平均学习时间是："+(total*1.0/5)+"小时");
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		for(int chook = 0,hare = 35;chook<=35;chook++,hare--){
			if(chook*2+hare*4==94){
				System.out.println("鸡有"+chook+"只"+"兔有"+hare+"只");
				break;
			}
		}
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
				continue;
			}else if(i%3==0){
				System.out.println("Flip");
				continue;
			}else if(i%5==0){
				System.out.println("Flop");
				continue;
			}else{
				System.out.println(i);
			}
		}
	}
}*/
/*public class Unit6{
	public static void main(String[] args) {
		int men = 0, women = 0, kid = 0;
		for (men=0; men <= 10; men++) {
			for (women=0; women <= 25; women++) {
				for (kid=0; kid <= 50; kid++) {
					if (3 * men + 2 * women + kid == 50 && men + women + kid == 30) {
						System.out.println("男人有" + men + "女人有" + women + "小孩有" + kid);
					}
				}
			}
		}
	} 
}*/
/*public class Unit6{
	public static void main(String[]args){
		for(int i =100;i<=999;i++){
			if((i%10)*(i%10)*(i%10)+(i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)==i){
				System.out.println("100-999中水仙数有"+i);
			}else{
				continue;
			}
		}
	}
}
*/
/*public class Unit6{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = input.nextInt();
		boolean  isPrime= true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				isPrime = false;
				break;
			}
		}
			if(isPrime){
				System.out.println("是质数");
			}else {
				System.out.println("不是质数");
			}
	}
	
}*/
/*public class Unit6{
	public static void main(String[]args){
		int num = 2;
		int sum = 2;
		for(int i =1;i<=7;i++){
			num = num*10+2;
			sum = sum+num;
		}System.out.println("sum为"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int sum = 0;
		for(int i =1;;i++){
			sum = sum+3;
			if(sum>=7){
				System.out.println(+i+"天跳出");
				break;
			}else {
				sum = sum-2;
			}
		}
	}
}
*/




















