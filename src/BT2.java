import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BT2 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException {
        Class<?> newClass = Example2.class;
        Method[] methods = newClass.getDeclaredMethods();
        for (Method method : methods){
            if (Modifier.isStatic(method.getModifiers())){
                System.out.println("is static");
            }else{
                System.out.println("not static");
            }
        }
    }
}
class Example2{
    public String Filed ;
    public final int Age;
    public String Router;
    public Example2(){
        this.Filed = "hello";
        this.Age = 13;
        this.Router = "Pro";
    }

    public static void Hi(){}
    public  void Bur(){}
    public static void Burh(){}
}
