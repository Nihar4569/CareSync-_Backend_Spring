package com.example.Hospital.Management.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Doctor")
public class Doctor {
    @Id
    private ObjectId id;
    @NotBlank
    private String hname;
    @NotBlank
    private String dname;
    @NotBlank
    private String password;
    @NotBlank
    private String gender;
    @NotBlank
    private String specialty;
    @NotBlank
    private String phone;
    @NotBlank
    private String email;
}
