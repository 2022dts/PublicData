import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args){
        try {
            Class c;
            c = Person.class;
            Object o = c.newInstance();
            Method method = c.getMethod("fun", String.class, int.class);
            method.invoke(o, "tengj", 10);
            method = c.getMethod("fun", null);
            method.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}