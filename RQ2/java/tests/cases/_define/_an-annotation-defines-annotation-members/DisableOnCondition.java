
public @interface DisableOnCondition {
    
    String value() default "Mode.DEMO";
    
    String mode() default "Mode.DEMO";
}