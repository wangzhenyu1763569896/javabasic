package ��һ����;

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
		 System.out.println("�����ܽ�"+tatal);	 
	 }
 }
*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("********���ѵ�********");
		System.out.println("������Ʒ\t����\t����\t���");
		int shirtPrice = 245;
		int shoePrice = 570;
		int patPrice = 320;
		int shirtNumber = 2;
		int shoeNumber = 1;
		int patNumber = 1;
		double discount = 0.8;
		System.out.println("T��"+"\t"+"��"+shirtPrice+"\t"+shirtNumber+"\t"+"��"+shirtPrice*shirtNumber);
		System.out.println("����Ь"+"\t"+"��"+shoePrice+"\t"+shoeNumber+"\t"+"��"+shoePrice*shoeNumber);
		System.out.println("������"+"\t"+"��"+patPrice+"\t"+patNumber+"\t"+"��"+patPrice*patNumber);
		System.out.println("\n"+"�ۿۣ�"+discount*10);
		double tatal = (shirtPrice*shirtNumber+shoePrice*shoeNumber+patPrice*patNumber)*discount;
		System.out.println("�����ܽ�"+"��"+tatal);
		Scanner input = new Scanner(System.in);
		System.out.println("ʵ�ʽɷѣ�");
		double pay = input.nextDouble();
		double change = pay - tatal;
		System.out.println("���㣺"+"��"+change);
		int integral = (int)tatal*3/100;
		System.out.println("���ι�����������ǣ�"+integral);
		
	}
}
*/
/*public class Unit2{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("������4λ��Ա���ţ�");
		int mark = input.nextInt();
		int ge = mark%10;//int qian = mark/1000;
		int shi = mark/10%10;//int bai = mark%1000/100;
		int bai = mark/100%10;//int shi = mark%100/10;
		int qian = mark/1000;//int ge = mark%10;
		int sum = qian+bai+shi+ge;
		System.out.println("��Ա��"+mark+"��λ֮�ͣ�"+sum);
		boolean isLuck = sum>20;
		System.out.println("�����˿ͻ���"+isLuck);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		int left = 10;
		int right = 8;
		System.out.println("�������ǰ���е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�"+left);
		System.out.println("�����е�ֽ�ƣ�"+right);
		System.out.println("������������е�ֽ�ƣ�");
		int in = left;
		left = right;
		right = in;
		System.out.println("�����е�ֽ�ƣ�"+left);
		System.out.println("�����е�ֽ�ƣ�"+right);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("�������ۿۣ�");
		Scanner input = new Scanner(System.in);
		double discount = input.nextDouble();
		int shirtPrice = 245;
		int shoePrice = 570;
		int patPrice = 320;
		double afterShitPrice = shirtPrice*discount;
		double afterShoePrice = shoePrice*discount;
		double afterPatPrice = patPrice*discount;
		boolean isLowShirt = afterShitPrice<100;
		System.out.println("T���ۿۼ۵���100��"+isLowShirt);
		boolean isLowshoe = afterShoePrice<100;
		System.out.println("����Ь�ۿۼ۵���100��"+isLowshoe);
		boolean isLowPat = afterPatPrice<100;
		System.out.println("�������ۿۼ۵���100��"+isLowPat);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("���ڻ����¶��ǣ�");
		Scanner input = new Scanner(System.in);
		double Fahrenheit = input.nextDouble();
		double celsius = 5/9.0*(Fahrenheit-32);
		System.out.println("�����¶ȣ�"+celsius);
	}
}*/
/*public class Unit2{
	public static void main(String[]args){
		System.out.println("�����뱾��");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		System.out.println("����Ϊ��"+money);
		double interert1 = money*2.55/100;
		double interert2 = money*2.7/100;
		double interert3 = money*3.24/100;
		double interert5 = money*3.6/100;
		System.out.println("��ȡһ���ı�Ϣ�ǣ�"+(money + interert1));
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+(money + interert2));
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+(money + interert3));
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+(money + interert5));
	}
}*/






