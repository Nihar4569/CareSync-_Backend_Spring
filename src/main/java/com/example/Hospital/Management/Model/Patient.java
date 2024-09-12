package com.example.Hospital.Management.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Patient")
public class Patient {
    @Id
    private ObjectId id;
    @NotBlank
    private String pname;
    @NotBlank
    private String hname;
    @NotBlank
    private String address;
    @NotBlank
    private String phone;
    @NotBlank
    private String email;
    @NotBlank
    private String gender;
    @NotBlank
    private Date dob;
    @NotBlank
    private String parent;
    @NotBlank
    private boolean police;
    @NotBlank
    private String desc;
    private String dname;
    private String pres;
}
