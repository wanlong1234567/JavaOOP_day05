package oo.day05;
//�ӿڵ���ʾ
public class InterfaceDemo {
	public static void main(String[] args) {
		//Inter6 o1 = new Inter6(); //������󣬽ӿڲ��ܱ�ʵ����
		Inter6 o2 = new Moo(); //��������
		Inter5 o3 = new Moo(); //��������
		/*
		 * �ӿڵ���ϰ:
		 * 1)�����ӿ�Inter1����������PI�ͳ��󷽷�show
		 * 2)�����ӿ�Inter2������a()��b()
		 *   ������Aoo��ʵ��Inter2�ӿ�
		 * 3)�����ӿ�Inter3������c()
		 *   ������Boo��ʵ��Inter2��Inter3
		 * 4)����������Coo���������󷽷�d()
		 *   ������Doo���̳�Coo��ʵ��Inter2��Inter3
		 * 5)�����ӿ�Inter4���̳�Inter3������e()
		 *   ������Eoo��ʵ��Inter4�ӿ�
		 * 6)main()��:
		 *   6.1)Inter4 o1 = new Inter4();------???
		 *   6.2)Inter4 o2 = new Eoo();---------???
		 *   6.3)Inter3 o3 = new Eoo();---------???
		 */
	}
}


//��ʾ�ӿڼ̳нӿ�
interface Inter5{
	void show();
}
interface Inter6 extends Inter5{
	void test();
}
class Moo implements Inter6{
	public void test(){}
	public void show(){}
}

//��ʾ�ȼ̳к�ʵ��
interface Inter3{
	void show();
}
interface Inter4{
	void test();
}
abstract class Xoo{
	abstract void say();
}
class Yoo extends Xoo implements Inter3,Inter4{
	public void show(){}
	public void test(){}
	void say(){}
}

//��ʾ�ӿڵ�ʵ��
interface Inter2{
	void show();
	void test();
}
class Zoo implements Inter2{
	public void show(){}
	public void test(){}
}

//��ʾ�ӿڵ��﷨
interface Inter1{
	public static final int NUM = 5;
	public abstract void show();
	int COUNT = 6; //Ĭ��public static final
	void test(); //Ĭ��public abstract
	//double PI; //������󣬳�����������ͬʱ��ʼ��
	//void say(){} //������󣬳��󷽷������з�����
}

















