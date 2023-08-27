package org.example;

import lombok.AccessLevel;
import lombok.Setter;

public class Author2 {

    @Setter(AccessLevel.PROTECTED)
    private String firstName;

    private String lastName;

    private String biography;

}