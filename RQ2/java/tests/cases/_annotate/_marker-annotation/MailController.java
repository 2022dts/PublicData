@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface DisableOnCondition {
    int value() default 0;
}

public class MailController {
    @DisableOnCondition
    public void testMail() {
        /* ... */
    }
}