package chapter01;

public class Ex30WhileContinueFix {

	public static void main(String[] args) {
		
		
//		int i = 0;

//		while (i < 10) { 					
//			if (i > 5) { 
//				i++;
//				continue; 
//		   } 
//			System.out.println(i);
//			i++;
//	}

		for (int i = 0; i < 10; i++) {
		if ( i > 5 ) {
			continue;
}
 
System.out.println(i); 
}
}
}