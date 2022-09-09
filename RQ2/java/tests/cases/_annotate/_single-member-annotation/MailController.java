@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface DisableOnCondition {
    int value() default 0;
}

public class MailController {
    @DisableOnCondition(1 + 1)      // Calculate and Override the default value
    public void testMail() {
        /* ... */
    }
}