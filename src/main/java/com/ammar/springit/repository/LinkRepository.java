package com.ammar.springit.repository;

import com.ammar.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

    //Link findByTitle(String title);

}
