/*
package com.bookstore.validator;

import jakarta.persistence.Table;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,  FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
public @interface ValidUsername {
    String message() default "Ten dang nhap khong hop le";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
*/

package com.bookstore.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public @interface ValidUsername {
    String message() default "Ten dang nhap khong hop le";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

