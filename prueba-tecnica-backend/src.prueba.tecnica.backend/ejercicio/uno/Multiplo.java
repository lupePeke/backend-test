package ejercicio.uno;

public class Multiplo {
	
	
	public static void main(String args[]){
		
		
		for(int i=1;i<=100;i++){
			
			StringBuffer stringBuffer = new StringBuffer();
			
			
			if(isMultipo(i, 3)){
				stringBuffer.append("Fizz");
			}
			
			if(isMultipo(i, 5)){
				stringBuffer.append("Buzz");
			}
			
			
			System.out.println((stringBuffer.toString().isEmpty())?i:stringBuffer.toString());
			
		}
		
	}
	
		
	private static boolean isMultipo(int numeroValidar, int multipo){
		
		if((numeroValidar%multipo)==0){
			return true;
		}else{
			return false;
		}
	}

	
}
