package ��һ����;

import java.util.Scanner;

/*public class Unit5 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=100){
			System.out.println("��"+i+"��д���ú�ѧϰ��������");
			i++;
		}
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		int spread = 1;
		while(spread<=50){
			System.out.println("��"+spread+"������ӡ");
			spread++;
		}
	}
}*/
/*public class Unit5{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("�ϸ�����y/n)");
		String answer = input.next();
		while("n".equals(answer)){
			System.out.println("�����Ķ��̲�");
			System.out.println("�����ϻ�����");
			System.out.println("�ϸ�����y/n)");
			answer = input.next();
		}
		input.close();
	}
}*/
//�ϻ���ϰһ
/*public class Unit5{
	public static void main(String[]args){
		int sum=0;
		int i = 2;
		while(i<=100){
			sum = i+sum;
			i = i+2;
			
		}System.out.println("����Ϊ"+sum);
	}
}*/
//�ϻ���ϰ��
/*public class Unit5{
	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println("\n*********************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*********************************");
		System.out.println("��������Ʒ��ţ�");
		String name = "0";
		double price = 0;
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String answer;
		do {
			switch (number) {
			case (1):
				name = "T��";
				price = 245.0;
				break;
			case (2):
				name = "����Ь";
				price = 570;
				break;
			case (3):
				name = "������";
				price = 320;
				break;
			}
			System.out.println(name + "\t" + "��" + price + "\n");
			System.out.println("�������Ƿ����y/n");
			answer = input.next();
			System.out.println("��������Ʒ���");
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
			System.out.println("��" + year + "��ﵽ" + crew + "����");
		}
		System.out.println("��" + year + "��ﵽ" + crew + "����");

	}
}*/
//������ϰ
/*public class Unit5{
	public static void main(String[]args){
		double h = 0;
		double c = 0;
		int t = 1;
		do{
			h = c*9/5.0+32;
			c = c+20;
			t++;
			System.out.println("���϶�Ϊ"+c+"���϶�Ϊ"+h);
		}while(c<=250&&t<=10);
		while(c<=250&&t<=10){
			
			h = c*9/5.0+32;
			c = c+20;
			t++;
			System.out.println("���϶�Ϊ"+c+"���϶�Ϊ"+h);
		}
	}
}*/
//�ϻ���ϰ��
/*public class Unit5{
	public static void main(String[] args) {
		System.out.println("**************************\n");
		System.out.println("��ѡ�������Ʒ���");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("**************************\n\n");
		Scanner input = new Scanner(System.in);

		String go = "y";
		double total = 0;
		double total1 = total;
		while ("y".equals(go)) {
			System.out.print("��������Ʒ��ţ�");
			int num = input.nextInt();
			System.out.print("��ѡ����������");
			int count = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("T����245.0" + "\t" + "����" + count + "\t" + "�ܼƣ�" + (245 * count));
				total = 245 * count;
				break;
			case 2:
				System.out.println("����Ь��570.0" + "\t" + "����" + count + "\t" + "�ܼƣ�" + (570 * count));
				total = 570 * count;
				break;
			case 3:
				System.out.println("�����ģ�320.0" + "\t" + "����" + count + "\t" + "�ܼƣ�" + (320 * count));
				total = 320 * count;
				break;
			}
			total1 = total + total1;
			System.out.println("�Ƿ������y/n��");
			go = input.next();
		}
		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����" + total1 * 0.8);
		System.out.println("ʵ����");
		double in = input.nextDouble();
		double out = in - total * 0.8;
		System.out.println("��Ǯ��" + out);
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopoing����ϵͳ");
		System.out.println("\n1.�ͻ���Ϣ����");
		System.out.println("2.�������");
		System.out.println("3.�������");
		System.out.println("4.ע��");
		System.out.println("**********************\n\n\n");
		System.out.println("��ѡ����������");
		int num = input.nextInt();
		while(num<1||num>4){
			System.out.println("�������������ѡ��");
			num = input.nextInt();
		}switch(num){
		case(1):
			System.out.println("ִ�пͻ���Ϣ����");
		break;
		case(2):
			System.out.println("ִ�й������");
		break;
		case(3):
			System.out.println("ִ���������");
		break;
		default:
		System.out.println("ִ��ע��");
		break;
		}
		System.out.println("�������");
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
		System.out.print("������һ������������0ʱ��������");
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
			System.out.print("������һ������������0ʱ��������");
			num = input.nextInt();
		} while (num != 0);
		System.out.println("���ֵΪ"+max);
		System.out.println("��СֵΪ"+min);
	}
}*/
/*public class Unit5{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num;
		do{
			System.out.println("����������1-7������0ʱ������");
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
		System.out.println("�������");
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
		}System.out.println("1-100��Ϊ"+sum);
		do{
			sum = i+sum;
			i++;
		}while(i<=100);
		System.out.println("1-100��Ϊ"+sum);
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
		System.out.println("10�Ľ׳�Ϊ"+sum);
		while(i<=10){
			result = i*i;
			sum = result + sum;
			i++;
		}System.out.println("10�Ľ׳�Ϊ"+sum);
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
		System.out.println("��Ҫ"+i+"��ֽ�ﵽ���������߶�");
		
	}
}*/
/*public class Unit5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year, month, day;
		System.out.print("���������");
		year = input.nextInt();
		System.out.print("�������·�");
		month = input.nextInt();
		System.out.print("����������");
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
		System.out.println("����1900.1.1���" + sum + "��");
	}
}
*/
/*public class Unit5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		int mun = 0;
		  while(num*1.0/10>0){ mun = mun*10+num%10; num = num/10; }
		do {
			mun = mun * 10 + num % 10;
			num = num / 10;
		} while (num * 1.0 / 10 > 0);
		System.out.println("��ת�������Ϊ��" + mun);
	}
}*/

 




















