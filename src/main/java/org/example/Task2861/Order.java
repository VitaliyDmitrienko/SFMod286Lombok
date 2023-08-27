package org.example.Task2861;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(exclude = {"sum", "itemCount"})
public class Order {

    @NonNull
    private String innerNumber;

    @NonNull
    private String salesNumber;

    private Double sum;

    private Integer itemCount;

}