import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class FileExample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        // Lấy đối tượng Class của lớp MyClass
        Class<Object1> clazz = Object1.class;

        // Lấy danh sách các trường public của lớp
        Field[] fields = clazz.getFields();

        // Duyệt qua từng trường và hiển thị thông tin
        for (Field field : fields) {
            // Lấy tên trường
            String fieldName = field.getName();
            System.out.println("Field Name: " + fieldName);

            // Lấy kiểu dữ liệu của trường
            Class<?> fieldType = field.getType();
            System.out.println("Field Type: " + fieldType.getName());

            // Lấy thông số thuộc tính của trường
            int modifiers = field.getModifiers();
            System.out.println("Modifiers: " + Modifier.toString(modifiers));

            // Tạo đối tượng MyClass
            Object1 instance = new Object1();

            // Lấy giá trị của trường sau khi thay đổi
            Object fieldValue = field.get(instance);
            System.out.println("Field Value: " + fieldValue);

            System.out.println();
        }
    }

}
class Object1{
    String Field = "Public";
    private int privateInt = 42;
    public final String finalField = "Final";
    public void printAll(){
        System.out.println(Field);
        System.out.println(privateInt);
        System.out.println(finalField);
    }
}
