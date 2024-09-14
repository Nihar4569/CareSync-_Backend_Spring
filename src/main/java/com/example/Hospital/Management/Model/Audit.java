package com.example.Hospital.Management.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Audit")
public class Audit {
    @Id
    private ObjectId id;

    @NotBlank
    private LocalDate date;  // Change to LocalDate for storing the date

    @NotBlank
    private LocalTime time;  // Change to LocalTime for storing the time

    @NotBlank
    private String audit;
}
