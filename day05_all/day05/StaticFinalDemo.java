package oo.day05;
//static final����ʾ
public class StaticFinalDemo {
	public static void main(String[] args) {
		System.out.println(Hoo.PI); //ͨ��������������
		//Hoo.PI = 3.1415926; //������󣬳������ܱ��ı�
		
		//1)����Ioo.class��������
		//2)��̬����numһ���洢�ڷ�������
		//3)���������л�ȡnum�����
		System.out.println(Ioo.num);
		
		//�������ڱ���ʱֱ�ӱ��滻Ϊ�����ֵ��Ч�ʸ�
		//System.out.println(5);
		System.out.println(Ioo.COUNT);
		
	}
}

class Ioo{
	public static int num = 5; //��̬����
	public static final int COUNT = 5; //����
}

class Hoo{
	public static final double PI = 3.14159;
	//public static final int NUM; //������󣬱�������ͬʱ��ʼ��
}















