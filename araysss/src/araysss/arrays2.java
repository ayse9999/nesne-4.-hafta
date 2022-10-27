package araysss;

public class arrays2 {

	public static void main(String[] args) {
		int[] array = {32,27,64,18,95,14,90,70,60,37};
	int gecici;
	int i;
		
	
	 System.out.printf("%s%8s%n","index","value");
		 
		 for(int counter=0; counter<array.length; counter++) {
			 System.out.printf("%5d%8d%n" , counter, array[counter]);
		 }
		 System.out.println("dizinin tersi:");
		 for( i=0 ;i<array.length;i++) {
			
			
			 gecici=array[i];
			 array [i]= array [array.length-1];
			 array[array.length-1]=gecici;
			 
			
				 
			 System.out.println(array[i]+ " ");
		 }
		
	}
	}

	 
	

