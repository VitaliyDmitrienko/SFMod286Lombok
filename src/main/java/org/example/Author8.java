package org.example;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude = {"biography"})
public class Author8 {

    private String firstName;

    private String lastName;

    private String biography;

}