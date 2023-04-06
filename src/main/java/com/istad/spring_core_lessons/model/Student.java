package com.istad.spring_core_lessons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    public int id;
    public String name;
    public String gender;
    public float score;
}
