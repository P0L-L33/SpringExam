package com.test.Test.exception;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException() {
        super("specific student not found");
    }
}
