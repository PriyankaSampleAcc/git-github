package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo demo = (Demo) context.getBean("demo");
		System.out.println(demo);

//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression exp =  temp.parseExpression("22+44");
//		System.out.println(exp.getValue());
	}
}
