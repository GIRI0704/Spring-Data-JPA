package com.DataJpa.SpringDataJpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;
    private String title;
    private Integer credit;

    @OneToOne(mappedBy = "course") /*cascade = CascadeType.ALL ---> this is used to save the child object when parent is save*/
    private CourseMaterial courseMaterial;
}
