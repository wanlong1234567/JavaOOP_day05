package oo.day05;
//final����ʾ
public class FinalDemo {
	public static void main(String[] args) {
		
	}
}


//��ʾfinal������
final class Doo{}
//class Eoo extends Doo{} //�������final���಻�ܱ��̳�
class Foo{}
final class Goo extends Foo{} //��ȷ


class Boo{ //��ʾfinal���η���
	void show(){}
	final void say(){}
}
class Coo extends Boo{
	void show(){}
	//void say(){} //�������final�ķ������ܱ���д
}

/*
 * final���γ�Ա������ֻ�����ֳ�ʼ����ʽ:
 *   1)����ͬʱ��ʼ��
 *   2)���췽���г�ʼ��
 * final���ξֲ�������ֻҪ����֮ǰ��ʼ������
 */
class Aoo{ //��ʾfinal���α���
	final int num = 5;
	final int count;
	Aoo(){
		count = 6;
	}
	void show(){
		final int a;
		//num = 55; //�������final�ı������ܱ��ı�
	}
}



















