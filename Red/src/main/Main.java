package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner input = new Scanner(System.in);
		String wifiname = null; //ָ��ָʾ
		String password = null; //ָ��ָʾ
		String putin = null; //ָ��ָʾ
		System.out.println("��ӭʹ������WIFIԿ��!");
		System.out.println("�汾0.1 FL45PU-");
		System.out.println("");
		System.out.println("��������Ҫ���ҵ�WIFI");
		wifiname = input.next();//�ȴ�����
		System.out.println("��������Ҫ���ҵ�WIFI����");
		password = input.next();//�ȴ�����
		System.out.println("���ڲ���WIFI....");
		Thread.sleep(9990);
		System.out.println("10%");
		Thread.sleep(1000);
		System.out.println("20%");
		Thread.sleep(1000);
		System.out.println("30%");
		Thread.sleep(1000);
		System.out.println("40%");
		Thread.sleep(10000);
		System.out.println("50%");
		Thread.sleep(1000);
		System.out.println("60%");
		Thread.sleep(1000);
		System.out.println("70%");
		Thread.sleep(1000);
		System.out.println("80%");
		Thread.sleep(1000);
		System.out.println("90%");
		Thread.sleep(99000);
		System.out.println("100%");
		System.out.println("");
		System.out.println("���!");
		System.out.println(wifiname);
		System.out.println("�Ƿ��ƽ⣿");
		System.out.println("");
		System.out.println("Y/N");
		putin = input.next();//�ȴ�����
		if(putin.equals("Y")|putin.equals("y"));{
			System.out.println("�ƽ���.....");
			Thread.sleep(3000);
			System.out.println("�ƽ����");
			System.out.println("������:" + password);
		}
		input.close(); // �ر���Դ
	}
}
