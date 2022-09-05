package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner input = new Scanner(System.in);
		String wifiname = null; //指针指示
		String password = null; //指针指示
		String putin = null; //指针指示
		System.out.println("欢迎使用万能WIFI钥匙!");
		System.out.println("版本0.1 FL45PU-");
		System.out.println("");
		System.out.println("请输入你要查找的WIFI");
		wifiname = input.next();//等待输入
		System.out.println("请输入你要查找的WIFI密码");
		password = input.next();//等待输入
		System.out.println("正在查找WIFI....");
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
		System.out.println("完毕!");
		System.out.println(wifiname);
		System.out.println("是否破解？");
		System.out.println("");
		System.out.println("Y/N");
		putin = input.next();//等待输入
		if(putin.equals("Y")|putin.equals("y"));{
			System.out.println("破解中.....");
			Thread.sleep(3000);
			System.out.println("破解完毕");
			System.out.println("密码是:" + password);
		}
		input.close(); // 关闭资源
	}
}
