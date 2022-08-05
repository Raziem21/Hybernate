package co.develhope.Hypernate.entities;

import javax.persistence.*;

@Entity
@Table
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Students student;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classes cl;

    public Classes getCl() {
        return cl;
    }

    public void setCl(Classes cl) {
        this.cl = cl;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }
}
