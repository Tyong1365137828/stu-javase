package edu.hebeu.displacement;

/**
 * ����������ν��ж����Ƶ���λ����
 * @author 13651
 *
 */
public class BinaryDisplacement {
	public static void main(String[] args) {
		/**
		 * >> 1		����������1λ
		 * >> 2		����������2λ
		 * 
		 * �磺10 >> 1		��ʾ��10�Ķ���������1λ
		 * 	10�Ķ����ƣ� 00001010	��10��
		 * 	10�Ķ���������һλ��00000101		��5��
		 * ���ۣ������ƶ�1λ�����ڳ���2
		 */
		System.out.println(10 >> 1); // ���Ϊ5
		
		/**
		 * 10 << 1		��ʾ��10�Ķ���������1λ
		 * 10�Ķ����ƣ�00001010			��10��
		 * 10�Ķ���������1λ��00010100	��20��
		 */
		System.out.println(10 << 1); // ���20
	}
}