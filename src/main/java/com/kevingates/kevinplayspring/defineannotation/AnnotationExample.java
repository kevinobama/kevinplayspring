package com.kevingates.kevinplayspring.defineannotation;

import java.lang.reflect.Field;
import java.util.Date;

public class AnnotationExample {

    public static void main(String[] args) throws Exception {
        System.out.println("Java Custom Annotation Example");
        System.out.println();

        TestUser usr = new TestUser();
        usr.setEmail("john.doe@example.com");
        usr.setName("John Doe");
        usr.setId(112);
        usr.setCreated(new Date());

        for (Field field : usr.getClass().getDeclaredFields()) {
            DBField dbField = field.getAnnotation(DBField.class);
            System.out.println("field name: " + dbField);
            System.out.println("field name: " + dbField.name());

            // changed the access to public
            field.setAccessible(true);
            Object value = field.get(usr);
            System.out.println("field value: " + value);

            System.out.println("field type: " + dbField.type());
            System.out.println("is primary: " + dbField.isPrimaryKey());
            System.out.println();
        }
    }

}
