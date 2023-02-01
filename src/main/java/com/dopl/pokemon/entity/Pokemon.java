package com.dopl.pokemon.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String hp;
   private String cp;
   private String name;
   private String picture;
   @ElementCollection
   private List<String>types;
   private LocalDate created;
}
