package vu.com.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name;
    private String username;
    @Column(nullable = false)
    private String email;
    private String city;
    private long  age ;
    @Column(nullable = false)
    private String gender;

    public long getAge()
    {
        return age;
    }

    public void setAge(long age)
    {
        this.age = age;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public Student(long age, String city, String email, String gender, long id, String name, String username)
    {
        this.age = age;
        this.city = city;
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.username = username;
    }
    public Student()
    {

    }
}
