package ��һ����;

import java.util.Scanner;

/*public class Unit6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ������");
		String name = input.next();
		int score;
		int sum = 0;
		double avg = 0;
		for(int i = 0;i<5;i++){
			System.out.print("���������Ź����е�"+(i+1)+"�ſεĳɼ���");
			score = input.nextInt();
			sum = score+sum;
		}
			avg = (double)sum/5;
			System.out.println(name+"��ƽ����Ϊ"+avg);
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int i;
		int j;
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ֵ");
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
		}System.out.println("����Ϊ"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int age;
		double count1=0;
		double count2=0;
		for (int i=1 ;i<=10;i++){
			System.out.print("�������"+i+"Ϊ�˿͵����䣺");
			age= input.nextInt();
			if(age<=30){
				count1=count1+1;
			}else{
				count2=count2+1;
			}
		}System.out.print("��ʮ�����µı���Ϊ"+(+count1/10));
		System.out.print("��ʮ�����ϵı���Ϊ"+(+count2/10));
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int sum= 0;
		for(int i=1;i<=100;i++){
			if(i%3!=0){
				sum = i+sum;
			}
		}System.out.println("��Ϊ"+sum);
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
		}System.out.println("����20�ĵ�ǰ��Ϊ��"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������༶������");
		int total = input.nextInt();
		int count = 0;
		for(int i = 1;i<=total;i++){
			System.out.println("�������"+(i)+"λѧ���ĳɼ�");
			int score = input.nextInt();
			if(score<80){
				continue;
			}
			count=count+1;
		}
		System.out.println("��ʮ�����ϵ�����Ϊ��"+count);
		double ratio = (count*1.0/total)*100;
		System.out.printf("��ʮ�����ϵĵ���ռ����Ϊ%.2f%%\n:",ratio);
		}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int sum = 0;
		for(int i =1;i<=10;i++){
			if(i%2!=0){
				continue;
			}sum=sum+i;
		}System.out.println("��Ϊ"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		for (int i = 1; i <= 3; i++) {
			System.out.println("\n��������λ��Ա�ţ�4λ������:");
			int num = input.nextInt();
			System.out.println("�������Ա���գ���/��<����λ������ʾ>��");
			String birthday = input.next();
			System.out.println("�������Ա���֣�");
			int integral = input.nextInt();
			if (num < 1000 || num > 9999) {
				System.out.println(+num+"�Ǵ��󿨺ţ�¼��ʧ��,����������");
			} else {
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println("����"+"\t"+"����"+"\t"+"����");
				System.out.println(num + "\t" + birthday + "\t" + integral);
			}
		}System.out.println("�������");
	}
}*/
/*public class Unit6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int change = 3; change <= 3; change--) {
			System.out.println("�������û���");
			String name = input.next();
			System.out.println("����������");
			String password = input.next();
			if (name.equals("jim") && password.equals("123456")) {
				System.out.println("��ӭ��½");
				break;
			} else if (change - 1 > 0) {
				System.out.println("�������������" + (change - 1) + "�λ���");
			} else {
				System.out.println("�Բ��������ξ��������");
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
			System.out.println("��������"+day+"��ѧϰʱ�䣺");
			int time = input.nextInt();
			total = time+total;
		}System.out.println("��һ������ÿ��ƽ��ѧϰʱ���ǣ�"+(total*1.0/5)+"Сʱ");
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		for(int chook = 0,hare = 35;chook<=35;chook++,hare--){
			if(chook*2+hare*4==94){
				System.out.println("����"+chook+"ֻ"+"����"+hare+"ֻ");
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
						System.out.println("������" + men + "Ů����" + women + "С����" + kid);
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
				System.out.println("100-999��ˮ������"+i);
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
		System.out.println("������һ������");
		int num = input.nextInt();
		boolean  isPrime= true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				isPrime = false;
				break;
			}
		}
			if(isPrime){
				System.out.println("������");
			}else {
				System.out.println("��������");
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
		}System.out.println("sumΪ"+sum);
	}
}*/
/*public class Unit6{
	public static void main(String[]args){
		int sum = 0;
		for(int i =1;;i++){
			sum = sum+3;
			if(sum>=7){
				System.out.println(+i+"������");
				break;
			}else {
				sum = sum-2;
			}
		}
	}
}
*/




















