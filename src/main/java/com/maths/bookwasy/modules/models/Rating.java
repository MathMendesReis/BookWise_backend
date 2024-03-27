package com.maths.bookwasy.modules.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rating_tb")
@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Integer rate;
    private String description;
    private Date created_at;
    @ManyToOne
    private User user;
    @ManyToMany
    @JoinTable(name = "rating_book", joinColumns = @JoinColumn(name = "rating_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> book;

}
