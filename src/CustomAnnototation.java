import jdk.jfr.Description;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface CustomAnnototation {
    String version() default "";
    String reason() default "";

}
class Caculator{
    public int add(int a , int b){
        return a + b;
    }
    @CustomAnnototation(version = "1.0",reason = "add")
    public int sum (int a,int b){
        return a +b ;
    }
}
class Main{
    public static void main(String[] args) throws NoSuchMethodException {
        Caculator caculator =new Caculator();
        int result = caculator.add(2,3);
        System.out.println(result);
        if (Caculator.class.getMethod("sum",int.class,int.class).isAnnotationPresent(CustomAnnototation.class)){
            System.out.println("warning");
            CustomAnnototation customAnnototation = Caculator.class.getMethod("sum",int.class,int.class).getAnnotation(CustomAnnototation.class);
            System.out.println(customAnnototation);
            System.out.println(customAnnototation.reason());
        }

    }
}