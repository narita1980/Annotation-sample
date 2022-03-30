import java.lang.annotation.Annotation;

@MethodInformation
public class Main {

    public static void main(String[] args) {
        Main mainInstance = new Main();
        Class clazz = mainInstance.getClass();

        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(annotations);
        // [Ljava.lang.annotation.Annotation;@4554617c
        System.out.println("Hello World!");
        // Hello World!
    }
}
