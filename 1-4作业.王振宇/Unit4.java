package ��һ����;

import java.util.Scanner;

/*public class Unit4 {
//ʾ��һ
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������");
		int ranking = input.nextInt();
		if ranking
		switch(ranking){
		case(1):
			System.out.println("����Ӫ");
		break;
		case(2):
			System.out.println("�ʼǱ�");
			break;
		case(3):
			System.out.println("Ӳ��");
			break;
			default:
				System.out.println("û�н���");
				break;
		}
		input.close();
		}
}*/
//�ϻ���ϰһ
/*public class Unit4 {
	public static void main(String[] args) {
		System.out.println("1.��¼ϵͳ\n");
		System.out.println("2.�˳�\n");
		System.out.println("**************************************");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt() == true) {
			int num = input.nextInt();
			switch (num) {
			case (1):
				System.out.println("1.�ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("3.�������");
				System.out.println("4.ע��");
				break;
			case (2):
				System.out.println("лл����ʹ��");
				break;
			default:
				System.out.println("�������");
			}

		}else{
			System.out.println("��������ȷ����");
		}
	}
}*/
//�ϻ���ϰ��
/*public class Unit4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ��");
		int money = input.nextInt();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������һƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3����100Ԫ����10Ԫ����5ǧ�����");
		System.out.println("4����200Ԫ����10Ԫ���ղ������˹�");
		System.out.println("5����200Ԫ����20��ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.print("��ѡ��");
		int nub = input.nextInt();
		if (money >= 200) {
			switch (nub) {
			case (1):
				money = money + 2;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ����������¿�������һƿ");
				break;
			case (2):
				money = money + 3;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ�����500ml����һƿ");
				break;
			case (3):
				money = money + 10;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ�����5kg���һ��");
				break;

			case (4):
				money = money + 10;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ������ղ������˹�");
				break;
			case (5):
				money = money + 20;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ�����ŷ����ˬ��ˮһƿ");
				break;
			case (0):
				money = money;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("δ����");
				break;

			default:
				System.out.println("ѡ������");
				break;
			}
		} else if (money >= 100) {
			switch (nub) {
			case (1):
				money = money + 2;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ����������¿�������һƿ");
				break;
			case (2):
				money = money + 3;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ�����500ml����һƿ");
				break;
			case (3):
				money = money + 10;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ�����5kg���һ��");
				break;
			case (0):
				money = money;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("δ����");
				break;
			default:
				System.out.println("ѡ������");
				break;
			}
		} else if (money >= 50) {
			switch (nub) {
			case (1):
				money = money + 2;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("�ɹ����������¿�������һƿ");
				break;
			case (0):
				money = money;
				System.out.println("�������ѽ��Ϊ��" + money);
				System.out.println("δ����");
				break;
			default:
				System.out.println("ѡ������");
				break;
			}
		} else {
			System.out.println("�����޷�����");
		}
		input.close();
	}
}*/
//�����2
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ���");
		int week = input.nextInt();
		switch (week) {
		case (1):
		case (3):
		case (5):
			System.out.println("ѧϰ���");
			break;
		case (2):
		case (4):
		case (6):
			System.out.println("ѧϰӢ��");
			break;
		case (7):
			System.out.println("��Ϣ");
			break;
		default:
			System.out.println("�������");
			break;
		}
		input.close();
	}
}*/
//�����3
/*public class Unit4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("������ɼ�");
		int grade = input.nextInt();
		switch(grade/10){
		case(10):
			System.out.println("��һ����");
		break;
		case(9):
			System.out.println("��һ���ʼǱ�");
			break;
		case(8):
		case(7):
		case(6):
			System.out.println("��һ���ֻ�");
			break;
		default:
			System.out.println("û�н���");
		}
	}
}*/
//�����4
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������·�");
		int month = input.nextInt();
		System.out.println("��������ͣ�ͷ�Ȳ�����1�����ò�����2");
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
				System.out.println("��Ļ�Ʊ�۸��ǣ�" + cost * 9 / 10);
				break;
			case (2):
				System.out.println("��Ļ�Ʊ�۸�Ϊ��" + cost * 8 / 10);
				break;
			}
			break;
		default:
			switch (rank) {
			case (1):
				System.out.println("��Ļ�Ʊ�۸�Ϊ��" + cost * 5 / 10);
				break;
			case (2):
				System.out.println("��Ļ�Ʊ�۸�Ϊ��" + cost * 4 / 10);
				break;
			}
		}
	}
}*/
//�����5
/*public class Unit4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ��������");
		double nub1 = input.nextDouble();
		System.out.println("�������������+��-��*��/��%��");
		char opr = input.next().charAt(0);
		System.out.println("������ڶ���������");
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
				System.out.println("��������Ϊ��");
			} else {
				System.out.println(+nub1 + "/" + nub2 + "=" + (nub1 / nub2));
			}
			break;
		case '%':
			if(nub2==0){
				System.out.println("��������Ϊ��");
			}else{
			System.out.println(+nub1 + "%" + nub2 + "=" + (nub1 % nub2));
			}break;
		default:
			System.out.println("��������ȷ�������");

		}input.close();
	}
}*/
/*public class Unit4{
	public static void mian(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("����������ܼ���");
		String week = input.next();
		switch(week){
			case"�ܶ�":
			case"����":
			case"����":
			case"����":
				System.out.println("��ѧУ�Ͽ�");
			break;
			case"��һ":
				System.out.println("������Ԥϰ");
			break;
			case"����":
				System.out.println("����Ϸ");
				break;
				default:
					System.out.println("��ȥ���");
		}
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������");
		int year = input.nextInt();
		System.out.print("�������·�");
		int month = input.nextInt();
		switch (month) {
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			System.out.println("���·�Ϊ��ʮһ��");
			break;
		case (4):
		case (6):
		case (11):
		case (9):
			System.out.println("���·�Ϊ��ʮ��");
			break;
		case(2):
			if ((year % 4 == 0 && year % 100 != 0) ||( year % 400 == 0)) {
				System.out.println("���·�Ϊ29��");
			} else {
				System.out.println("���·�Ϊ28��");
			}
			break;
			default:
				System.out.println("��������ȷ���·�");
				break;
		}input.close();
	}	
	}*/
/*public class Unit4{
	public static void main(String[] args) {
		System.out.println("����������");
		Scanner input = new Scanner(System.in);
		int nub = input.nextInt();
		switch (nub) {
		case (1):
			System.out.println("���ְֵĺ���");
			break;
		case (2):
			System.out.println("������ĺ���");
			break;
		case (3):
			System.out.println("��үү�ĺ���");
			break;
		case (4):
			System.out.println("�����̵ĺ���");
			break;
		default:
			System.out.println("������������");
		}
		input.close();
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ���ɼ�");
		int score = input.nextInt();
		switch (score / 10) {
		case (9):
		case(10):
			System.out.println("ѧϰ�ɼ�Ϊ����");
			break;
		case (8):
			System.out.println("ѧϰ�ɼ�Ϊ����");
			break;
		case (7):
			System.out.println("ѧϰ�ɼ�Ϊ�е�");
			break;
		case (6):
			System.out.println("ѧϰ�ɼ�Ϊ����");
			break;
		default:
			System.out.println("�ɼ�������");
			break;
		}
		input.close();
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������·�");
		int month = input.nextInt();
		switch (month) {
		case (4):
		case (5):
		case (3):
			System.out.println("����");
			break;
		case (7):
		case (6):
		case (8):
			System.out.println("�ļ�");
			break;
		case (10):
		case (11):
		case (9):
			System.out.println("�＾");
			break;
		case (12):
		case (1):
		case (2):
			System.out.println("����");
			break;
		default:
			System.out.println("��������ȷ���·�");
		}
		input.close();
	}
}*/
/*public class Unit4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������ĸ");
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
			System.out.println("ֻ��ת��abcde");
		}
		input.close();
	}
}*/






















