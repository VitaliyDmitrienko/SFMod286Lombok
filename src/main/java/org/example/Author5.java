package org.example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Author5 {

    @NonNull
    private String firstName;

    private final String lastName;

    private String biography;

}