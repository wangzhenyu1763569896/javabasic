package ��һ����;
import java.util.*;

/*public class Unit3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>���˳齱\n");
		System.out.print("��������λ��Ա����");
		int num = input.nextInt();
		int bai = num%1000/100;
		int random = (int)(Math.random()*10);
		if (bai == random){
			System.out.println(+num+"�ſͻ��������û�������MP3һ��");	
		}else {
			System.out.println(+num+"�ſͻ���лл��Ĳ���");
		}
	}
}*/
/*public class Unit3{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		System.out.print("�������Ա�ţ���λ������");
		int num = input.nextInt();
		System.out.print("\n�������Ա���գ���/��<�ö�λ����ʾ����");
		int month = input.nextInt();
		int day = input.nextInt();
		System.out.print("��������֣�");
		int integral = input.nextInt();
		if (1000<=num&&num<=9999){
			System.out.println("��¼���Ա����Ϣ�ǣ�");
			System.out.print(+num+"\t"+month+"/"+day+"\t"+integral);
		}else{
			System.out.println("��Ϣ¼��ʧ��");
		}	
	}
}*/
//����ifѡ��ṹ
/*public class Unit3{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ѧ���ɼ�");
		double score = input.nextDouble();
		if(score>=80){
			System.out.println("��ѧ�����Գɼ�����");
		}else if(score>=60){
			System.out.println("��ѧ�����Գɼ��е�");
		}else{
			System.out.println("��ѧ���ɼ���");
		}
	}
}*/
/*
public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������˵Ĵ��");
		double deposit = input.nextDouble();
		if(deposit>5000000){
			System.out.println("�򿭵�����");
		}else if(deposit>1000000){
				System.out.println("��������");
			}else if(deposit>500000){
				System.out.println("��������");
			}else if(deposit>100000){
				System.out.println("�����");
			}else{
				System.out.println("����");
			}
	}
}*/
/*public class Unit3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������ܲ��ɼ���");
		double grade = input.nextDouble();
		System.out.print("�������Ա�");
		String sex = input.next();
		String man = "��";
		String women = "Ů";
		if (grade < 10) {
			if (sex.equals(man)) {
				System.out.println("���˽���������");
			} else if (sex.equals(women)) {
				System.out.println("���˽���Ů����");
			}
		} else {
			System.out.println("��̭");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ƿ�Ϊ��Ա���ǣ�y��/�������ַ���");
		String member = input.next();
		System.out.print("�����빺���");
		double sum = input.nextDouble();
		if(member.equals("y")){
			if(sum>=200){
				System.out.println("ʵ��֧����"+sum*75/100);
			}else{
				System.out.println("ʵ��֧����"+sum*8/10);
			}
		}else{
			if(sum>=100){
				System.out.println("ʵ��֧����"+sum*9/10);
			}else{
				System.out.println("ʵ��֧����"+sum);
			}
		}	
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ա����");
		int integral = input.nextInt();
		if(integral < 2000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.9");
		}else if(2000<=integral&&integral<4000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.8");
		}else if(4000<=integral&&integral<8000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.7");
		}else if(8000<=integral){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.6");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = input.nextInt();
		if (year % 4 == 0 && year%100 != 0||year%400 == 0) {
			System.out.println("����Ϊ����");
		} else {
			System.out.println("����Ϊƽ��");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������н����");
		int bonus = input.nextInt();
		if(bonus>=5000000){
			System.out.println("���򳵣�����ϣ�����̣�ȥŷ������");
		}else{
			System.out.println("������һ����ʣ������ո���");
		}
	}
}*/
/*public class Unit3{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String name = input.next();
	    System.out.print("���������룺");
		int password = input.nextInt();
		if(name.equals("��")&&password == 123){
			System.out.println("��ӭ�㣺��");
		}else{
			System.out.println("�Բ����㲻����");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("���������䣺");
		int age = input.nextInt();
		System.out.print("�������Ա�");
		String sex = input.next();
		if(age>=5&&sex.equals("��")||age>=7){
			System.out.println("���԰ᶯ����");
		}else{
			System.out.println("�᲻������");
		}
		input.close();
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������������");
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
		}System.out.println(+a+"��"+b+","+c);	
	}
}*/
/*public class Unit3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������ܼ���");
		String week = input.next();
		if (week.contentEquals("����") || week.contentEquals("����")) {
			System.out.print("�����������¶�:");
			int temp = input.nextInt();
			if (temp > 30) {
				System.out.println("������ȥ��Ӿ");
			} else {
				System.out.println("������ȥ��ɽ");
			}
		} else{
			System.out.print("���������������");
			String weather = input.next();
			if(weather.contentEquals("����")){
				System.out.println("�ݷÿͻ�");
			}else{
				System.out.println("������");
			}
			
		}
	}
}*/
/*public class Unit3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int number = input.nextInt();
		if (number % 3 == 0 || number % 5 == 0) {
			System.out.println("������3��5�ı���");
		} else {
			System.out.println("�������ܱ�3��5���κ�һ��������");
		}
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ�");
		int grade = input.nextInt();
		if(grade<60){
			System.out.println("û������");
		}else if(grade<=90){
			System.out.println("��һ���ֻ�");
		}else if(grade<100){
			System.out.println("��һ���ʼǱ�");
		}else{
			System.out.println("��");
		}input.close();
	}
}*/
/*public class Unit3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ĳ����·ݣ�1����12");
		int month = input.nextInt();
		System.out.println("��������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		int kind = input.nextInt();
		int price = 5000;
		if(3<month&&month<11){
			if(kind==1){
				System.out.println("��Ļ�Ʊ�۸��ǣ�"+price*9/10);
			}else{
				System.out.println("��Ļ�Ʊ�۸��ǣ�"+price*8/10);
			}
		}else if(kind==1){
			System.out.println("��Ļ�Ʊ�۸��ǣ�"+price*5/10);
		}else{
			System.out.println("��Ļ�Ʊ�۸��ǣ�"+price*4/10);
		}input.close();
	}
}*/



















