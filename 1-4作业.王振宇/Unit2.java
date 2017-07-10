package 第一本书;

import java.util.Scanner;

/* public class Unit2{
	 public static void main(String[]args){
		 int shirtPrice = 245;
		 int shoePrice = 570;
		 int patPrice = 320;
		 int shirtNumber = 2;
		 int shoeNumber = 1;
		 int patNumber = 1;
		 double discount = 0.8;
		 double tatal = (shirtPrice*shirtNumber+shoePrice*shoeNumber+patPrice*patNumber)*discount;
		 System.out.println("消费总金额："+tatal);	 
	 }
 }
*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("********消费单********");
		System.out.println("购买物品\t单价\t个数\t金额");
		int shirtPrice = 245;
		int shoePrice = 570;
		int patPrice = 320;
		int shirtNumber = 2;
		int shoeNumber = 1;
		int patNumber = 1;
		double discount = 0.8;
		System.out.println("T恤"+"\t"+"￥"+shirtPrice+"\t"+shirtNumber+"\t"+"￥"+shirtPrice*shirtNumber);
		System.out.println("网球鞋"+"\t"+"￥"+shoePrice+"\t"+shoeNumber+"\t"+"￥"+shoePrice*shoeNumber);
		System.out.println("网球拍"+"\t"+"￥"+patPrice+"\t"+patNumber+"\t"+"￥"+patPrice*patNumber);
		System.out.println("\n"+"折扣："+discount*10);
		double tatal = (shirtPrice*shirtNumber+shoePrice*shoeNumber+patPrice*patNumber)*discount;
		System.out.println("消费总金额："+"￥"+tatal);
		Scanner input = new Scanner(System.in);
		System.out.println("实际缴费：");
		double pay = input.nextDouble();
		double change = pay - tatal;
		System.out.println("找零："+"￥"+change);
		int integral = (int)tatal*3/100;
		System.out.println("本次购物所获积分是："+integral);
		
	}
}
*/
/*public class Unit2{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("请输入4位会员卡号：");
		int mark = input.nextInt();
		int ge = mark%10;//int qian = mark/1000;
		int shi = mark/10%10;//int bai = mark%1000/100;
		int bai = mark/100%10;//int shi = mark%100/10;
		int qian = mark/1000;//int ge = mark%10;
		int sum = qian+bai+shi+ge;
		System.out.println("会员号"+mark+"各位之和："+sum);
		boolean isLuck = sum>20;
		System.out.println("是幸运客户吗："+isLuck);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		int left = 10;
		int right = 8;
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手中的纸牌："+left);
		System.out.println("右手中的纸牌："+right);
		System.out.println("输出互换后手中的纸牌：");
		int in = left;
		left = right;
		right = in;
		System.out.println("左手中的纸牌："+left);
		System.out.println("右手中的纸牌："+right);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("请输入折扣：");
		Scanner input = new Scanner(System.in);
		double discount = input.nextDouble();
		int shirtPrice = 245;
		int shoePrice = 570;
		int patPrice = 320;
		double afterShitPrice = shirtPrice*discount;
		double afterShoePrice = shoePrice*discount;
		double afterPatPrice = patPrice*discount;
		boolean isLowShirt = afterShitPrice<100;
		System.out.println("T恤折扣价低于100吗？"+isLowShirt);
		boolean isLowshoe = afterShoePrice<100;
		System.out.println("网球鞋折扣价低于100吗？"+isLowshoe);
		boolean isLowPat = afterPatPrice<100;
		System.out.println("网球拍折扣价低于100吗？"+isLowPat);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("现在华氏温度是：");
		Scanner input = new Scanner(System.in);
		double Fahrenheit = input.nextDouble();
		double celsius = 5/9.0*(Fahrenheit-32);
		System.out.println("摄氏温度："+celsius);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("请输入本金：");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		System.out.println("本金为："+money);
		double interert1 = money*2.55/100;
		double interert2 = money*2.7/100;
		double interert3 = money*3.24/100;
		double interert5 = money*3.6/100;
		System.out.println("存取一年后的本息是："+(money + interert1));
		System.out.println("存取两年后的本息是："+(money + interert2));
		System.out.println("存取三年后的本息是："+(money + interert3));
		System.out.println("存取五年后的本息是："+(money + interert5));
	}
}*/






