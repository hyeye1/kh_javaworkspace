package com.kh.run;

/*
import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Constant;
*/
import com.kh.variable.*;

public class VariableRun {
	
	public static void main(String[] args) {
		A_Variable a = new A_Variable();
		//a.printVariable();
		//a.declareVariable();
		//a.initVariable();
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		b.inputScanner2();
		//b.inputScanner3();
		
		C_Constant c = new C_Constant();
		//c.finalConstant();
		
		D_Casting d = new D_Casting();
		//d.autoCasting();
		//d.forceCasting();
		
		E_Printf e = new E_Printf();
		//e.printfMethod();
		
	}

}





