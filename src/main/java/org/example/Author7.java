package org.example;

import lombok.ToString;

@ToString(exclude = {"biography"})
public class Author7 {

    private String firstName;

    private String lastName;

    private String biography;

}