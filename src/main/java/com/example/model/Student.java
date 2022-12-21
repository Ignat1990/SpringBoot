package com.example.model;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
    //
    @AllArgsConstructor
    @Getter
    @Setter
    @Entity
    @Table(name = "students")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        @Column(name = "name")
        private String firstName;
        @Column(name = "value")
    private String value;

}
