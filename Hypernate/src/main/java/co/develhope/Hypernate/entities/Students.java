package co.develhope.Hypernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String lastName;
    private String firstName;
    private String email;

}
