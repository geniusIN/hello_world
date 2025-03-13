package com.yedam.classes;

public class PrintStar {
	
	void printStar(int cnt, String str) {
		
		String star = "";
		for(int j = 1; j <= cnt; j++) {
				star = star + str;
				System.out.println(star);
			}
			
		
	}
	
	
	void printStarReverse(int cnt, String str) {
		
		String space = "";
		String star = "";
		
		for(int i = 1; i <= cnt; i++) {
			
			for(int j = 1; j <= cnt-i; j++) {
				
				space = space + " ";
				
			}
			
			star = star + str;
			System.out.println(space + star);
			space = "";
			
			
		}
		
	}
	
}

