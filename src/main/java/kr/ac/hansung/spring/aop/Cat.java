package kr.ac.hansung.spring.aop;

import lombok.Setter;

@Setter
public class Cat implements AnimalType {

	private String MyName;

	@Override
	public void sound() {
		System.out.println("Cat name="+MyName+":"+"Neow");
	}

}
