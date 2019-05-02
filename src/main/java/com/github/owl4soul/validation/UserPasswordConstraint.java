package com.github.owl4soul.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=UserPasswordConstraintValidator.class)
public @interface UserPasswordConstraint {
    String message() default "{value.negative}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}