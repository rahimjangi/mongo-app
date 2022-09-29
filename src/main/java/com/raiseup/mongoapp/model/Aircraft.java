package com.raiseup.mongoapp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Aircraft {
    @Id
    private String id;
    private String model;
    private Integer nbSeats;

}
