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
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseMaterialId;
    private String url;

    @OneToOne(cascade = CascadeType.ALL /*cascade = CascadeType.ALL ---> this is used to save the child object when parent is save*/
            /* *
             * fetch = FetchType.EAGER  ----> it will give the course object as well
             * fetch = FetchType.LAZY   ----> it will not give the course object
             * */
    )
    @JoinColumn(
            name = "course_id", // table name in DB
            referencedColumnName = "courseId"  // entity name in class level
    )
    private Course course;
}
