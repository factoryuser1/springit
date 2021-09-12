package com.ammar.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Link {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    //comments
    @OneToMany(mappedBy = "link")
    private ArrayList<Comment> comments = new ArrayList<>();
}
