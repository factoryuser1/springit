package com.ammar.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@Data
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String body;

    //tie back to Link
}
