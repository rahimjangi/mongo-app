package com.raiseup.mongoapp.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document("flight")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class FlightInformation {
    @Id
    private String id;
    @Field(name="departure")
    @Indexed
    private String departureCity;
    @Field("destination")
    @Indexed
    private String destinationCity;
    private FlightType type;
    private boolean isDelayed;
    private int duration;
    private LocalDate departureDate;
    private Aircraft aircraft;
    @Transient
    private LocalDate createdAt= LocalDate.now();

}
