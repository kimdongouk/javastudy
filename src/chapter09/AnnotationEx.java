package chapter09;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationEx {
	
	public static void main(String[] args) {
		
		Method method[] = UserClass.class.getDeclaredMethods();
		
		for (int i=0; i<method.length; i++) {
			String methodName = method[i].getName();
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class);
			
			System.out.print(methodName + "의 어노테이션 ");
			System.out.print("value : " + annot.value() + " ");
			System.out.print("number : " + annot.number() + " ");
			System.out.println();
			
			try {
				method[i].invoke(new UserClass(), null);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
