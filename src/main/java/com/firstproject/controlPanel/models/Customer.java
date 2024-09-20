package com.firstproject.controlPanel.models;

import lombok.*;

/*@Getter @Setter @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode @ToString*/

/*podemos poner @Data para poner todos los anteriores
* Y si queremos ver el patron de diseño builder poner @Builder
* */

@Data
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String addres;


}
