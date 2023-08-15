import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class BT1 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException {
        Class<Example> newClass = Example.class;
        Constructor<?>[] constructors = newClass.getConstructors();
        for (Constructor<?> constructor : constructors){
            System.out.println("name: " + constructor.getName());
        }
        Field[] fields = newClass.getFields();
        for (Field field : fields){
            Example value = new Example();
            Object object = field.get(value);
            String type = field.getType().getSimpleName();
            System.out.println(type + " : " + field.getName() + " " + object) ;
        }
    }
}
class Example{
    public String Filed ;
    public final int Age;
    public String Router;
    public Example(){
        this.Filed = "hello";
        this.Age = 13;
        this.Router = "Pro";
    }
}
