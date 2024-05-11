package ex3_annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target({ElementType.TYPE,ElementType.FIELD,ElementType.TYPE_USE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
	String value() default "정보1";
	String[] testTool() default"Info1";
	String tester();
	DateTime datetime();
	
}








