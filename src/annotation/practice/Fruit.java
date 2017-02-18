package annotation.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Adrian on 18.02.2017.
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)   //METHOD, FIELD, CONSTRUCTOR, LOCAL_VARIABLE, PACKAGE, PARAMETER etc.
public @interface Fruit {

    String value() default "Adrian";

}
