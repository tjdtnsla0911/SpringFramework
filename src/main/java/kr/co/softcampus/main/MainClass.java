package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	//beans.xml파일을 업로드한다.
	ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
	
	ctx.close();
}
}
