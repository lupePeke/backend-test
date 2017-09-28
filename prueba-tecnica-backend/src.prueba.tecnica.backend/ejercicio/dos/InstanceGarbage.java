package ejercicio.dos;

public class InstanceGarbage {

	private static Integer metodo1(Integer[] a){
		a  = new Integer[2];
		a[0] = new Integer(1);
		a[1] = new Integer(2);
		
		return a[0];
	}
	
	public static void main(String[] args){
		Integer[] a = null;
		Integer i = metodo1(a);
		
		do{
			Integer j= new Integer(3);
			i = j;
		}while(false);
		i = new Integer(4);
		
	}
}

/**
 *
 * En la instrucción 'Integer[] a = null' se crea el objeto 'a'
 * En la instrucción 'Integer i = metodo1(a)' se crea el objeto 'i'
 * En la instrucción 'Integer j= new Integer(3)' se crea el objeto j 
 * Como consecuencia de la instrucción 'i = j' el objeto 'j' se convierte en basura
 * Tras la ejecución de la instrucción 'i = new Integer(4)' el objeto 'i' se convierte en basura
 * Tras la ejecución de la instrucción 'i = new Integer(4)' el objeto 'a' se convierte en basura
 * 
 **/
 