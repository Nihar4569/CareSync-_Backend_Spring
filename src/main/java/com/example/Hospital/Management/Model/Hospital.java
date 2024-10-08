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
@Document(collection = "Hospital_Data")
public class Hospital {
    @Id
    private ObjectId id;
    @NotBlank
    private String hname;
    @NotBlank
    private String haddress;
    @NotBlank
    private String hphone;
    @NotBlank
    private String hemail;
    @NotBlank
    private String hpassword;
    @NotBlank
    private int bed;
    @NotBlank
    private int bbed;
    @NotBlank
    private int ebed;
    @NotBlank
    private int bebed;
    @NotBlank
    private Boolean hverified;
}
