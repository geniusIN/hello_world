package com.yedam.classes;

public class Gugudan {

	/*           <첫번째 방법>
	 * 
	// --- Field "gugudan" start ---
	void gugudan(int num, int toNum) {
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// num단 부터 toNum단 까지
		
		
		for(int j = num; j <= toNum; j++) {
			
			for(int i = 1; i <= 9; i++) {
				
			System.out.println(j + " * " + i + " = " + j * i);
			
			}
		}
		
		
	} // --- Field "gugudan" end ---
	
	*/
	
	
	
	//           <두번째 방법>
	
	
	String gugudan(int num, int toNum) {
		
		String str = "";
		for(int j = num; j <= toNum; j++) {
			
			for(int i = 1; i <= 9; i++) {
				
			str = str + j + " * " + i + " = " + j * i + "\n";
			
			}
		}
		return str;
		
	}
	
	
	
	
	
	
	
}
