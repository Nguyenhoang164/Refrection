import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BT3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Example3> newClass = Example3.class;
          Method method = newClass.getMethod("Sum", int.class, int.class);
          Example3 example3 = new Example3();
           method.invoke(example3,4,5);
        }
    }

class Example3{

    public void Sum(int number1 , int number2){
        int result = number1 + number2;
        System.out.println(result);
    }
    public void Max(int number1 , int number2){
        int result = Math.max(number1, number2);
        System.out.println(result);
        }

    public void Min(int number1 , int number2){
        int result = Math.min(number1,number2);
        System.out.println(result);
    }
}

