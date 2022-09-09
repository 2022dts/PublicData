@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface DisableOnCondition {
    int value() default 0;
    String comment() default "";
}

public class MailController {
    @DisableOnCondition(value = 1, comment = "No need")      // Overrides the default value
    public void testMail() {
        /* ... */
    }
}