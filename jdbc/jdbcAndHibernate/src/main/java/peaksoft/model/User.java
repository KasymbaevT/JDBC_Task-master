package peaksoft.model;

import javax.persistence.*;

@Table
public class User {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Byte age;
    private Long carId;

    public User() {
    }

    public User(String name, String lastName, Byte age, Long carId) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.carId = carId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }
}