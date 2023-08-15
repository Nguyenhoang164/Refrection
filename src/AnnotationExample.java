import java.lang.annotation.*;

// Annotation đánh dấu phương thức ghi đè (override)
@interface OverrideMethod {
}

// Annotation đánh dấu phương thức đã cũ
@interface DeprecatedMethod {
    String reason() default "";
}

// Annotation đánh dấu phương thức getter
@interface Getter {
}

// Annotation đánh dấu phương thức setter
@interface Setter {
}

class Parent {
    @OverrideMethod
    public void overriddenMethod() {
        System.out.println("This method is overridden.");
    }

    @DeprecatedMethod(reason = "This method is deprecated.")
    public void oldMethod() {
        System.out.println("This method is old and should not be used.");
    }
}

class Child extends Parent {
    @Override
    @Deprecated
    public void overriddenMethod() {
        System.out.println("This is the child's overridden method.");
    }

    @Getter
    public String getProperty() {
        return "Property value";
    }

    @Setter
    public void setProperty(String value) {
        System.out.println("Setting property to: " + value);
    }
}

public class AnnotationExample {
    public static void main(String[] args) {
        Child child = new Child();

        child.overriddenMethod();

        child.oldMethod(); // This will show a deprecation warning

        System.out.println("Property value: " + child.getProperty());

        child.setProperty("New value");
    }
}
