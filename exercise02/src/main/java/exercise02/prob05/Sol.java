package exercise02.prob05;

public class Sol {

	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 100; i++) {
			
			String numStr = String.valueOf(i);
			int clapCount = 0;
			
			
			for(int j=0; j < numStr.length(); j++) {
				char c = numStr.charAt(j);
				
				if(c =='3'|| c=='6' || c=='9') {
					clapCount++;
									
				}
			}
			
			if(clapCount == 0 ) {
				
				System.out.println(i);				
			}else {
				System.out.println("짝".repeat(clapCount));
				
			}
		}
		
		
		
	}

}
