package com.springbootcourse.Spring.Boot.Course;

import jakarta.persistence.*;

@Entity(name = "StudentProfile")
@Table(name="_student_profile")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "bio")
    private String bio;

    //Target Entity
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public StudentProfile() {
    }

    public StudentProfile(String bio) {
        this.bio = bio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
