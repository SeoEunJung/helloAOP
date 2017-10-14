package kr.ac.hansung.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//import lombok.RequiredArgsConstructor;


public class PetOwner {
	
	@Autowired //wiring by type
	@Qualifier(value="qf_cat")
	//lombok 생성자를 사용했을 경우 final을 붙여주어야 함
	private AnimalType animal;
	
	public void play(){
		animal.sound();
	}
}
