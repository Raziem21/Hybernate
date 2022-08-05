package co.develhope.Hypernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "Classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String description;

}
