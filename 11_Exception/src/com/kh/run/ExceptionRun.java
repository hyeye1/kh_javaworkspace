package com.kh.run;

import java.io.IOException;

import com.kh.exception.CheckedException;
import com.kh.exception.UnCheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 에러 종류
		 - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로 해결안됨(심각한 에러)
		 - 컴파일 에러 : 소스코드상의 문법상 문제 => 애초에 빨간줄로 알려줌 ( 어떻게? 매번 컴파일이 진행되고 있기 때문에)
		 									  => 애초에 해결하지 않으면 프로그램 실행 자체가 되지않는다. 
		 - 런타임 에러 : 코드 상으로는 문제는 없지만, 프로그램 실행시 발생하는 에러
		 				=> 사용자의 실수일 수도 있고, 개발자가 예측가능한 경우를 제대로 처리해놓지 않은 문제일 수도 있다.
		 - 논리 에러 : 코드상 문법적으로 문제되지도 않고 실행했을때도 딱히 문제가 없는 .. 다만 프로그램 의도상 맞지 않는 것
		 
		 우리는 시스템 에러를 제외한 컴파일에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업을 한다
		 이런것들을 "예외" 라고한다 => exception
		 
		 이러한 예외들이 "발생" 했을 때를 대비해서
		 "발생했을 경우 실행할 내용들을 정의" 해 두는 걸" 예외처리" 라고한다
		 
		 *예외처리 방법
		 1. try~catch 문을 이용
		 2. throws 를 이용 (떠넘기기 == 위임)
		 3. try~with~resource
		  
		 */
		
		UnCheckedException uc = new UnCheckedException();
		//uc.method1();
		//uc.method2();
		//uc.method3();
		
		CheckedException c = new CheckedException();
		/*
		try {
			c.method1();
		} catch (IOException e ) {
			
		}
		*/
		c.method1();
	}

}
