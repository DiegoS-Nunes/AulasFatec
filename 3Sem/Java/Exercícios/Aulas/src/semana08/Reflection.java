package semana08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	public static String getAtributo(Object obj, String atributo) {
		try {
			Field field = obj.getClass().getDeclaredField(atributo);
			field.setAccessible(true); //private
			String conteudo = field.get(obj).toString();
			return conteudo;
		}
		catch(Exception e) {
			return "Falha ao ler o atributo " + e;
		}
	}
	
	public static void listarMetodos(String classe) {
		
		try {
			Class<?> c = Class.forName(classe);
			System.out.println("Metodos:");
			Method[] m = c.getDeclaredMethods();
			for(int i=0; i<m.length; i++) {
				System.out.println(m[i].getName());
			}
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrada " + classe);
		}
		
	}
	
	
}
