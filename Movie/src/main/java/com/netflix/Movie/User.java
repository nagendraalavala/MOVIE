package com.netflix.Movie;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User
{
    @Id
    private Long Id;
    private String fname;
    private String lname;
    private Integer age;
    private
    



}
