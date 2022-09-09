import java.lang.reflect.Method;
import Person;

public class ReflectDemo {

    public static void main(String[] args){
        try {
            Person o = new Person();
            Class c = o.getClass();
            Method method = c.getMethod("fun", String.class, int.class);
            method.invoke(o, "tengj", 10);
            method = c.getMethod("fun", null);
            method.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}