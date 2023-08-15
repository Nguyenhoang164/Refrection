import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaReflection{
  int publicField;
  private String privateField;
  public JavaReflection(){}
    public void PublicMethod(){}
    private void PrivateMethod(){}

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> newClass = Class.forName("JavaReflection");
        String className = newClass.getName();
        System.out.printf("ten lop " + className);
        int Modifine = newClass.getModifiers();
        System.out.println("Modifine" + Modifine);
        Field[] fields = newClass.getFields();
        for (Field field : fields){
            System.out.println(" - " + field );
        }
        Method[] methods = newClass.getMethods();
        for (Method method : methods){
            System.out.println(" - " + method);
        }
        Constructor<?>[] constructors = newClass.getConstructors();
        for (Constructor<?> constructor : constructors){
            System.out.println(" - " + constructor);
        }
    }

}