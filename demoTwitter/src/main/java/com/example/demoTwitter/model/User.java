package com.example.demoTwitter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
// left off slide 41
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
// This is the user class that allows the user to be created.
public class User {
    // this here allows the Id to be auto generated
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
// setting up the variables that we will need
    private String email;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int active;

    @CreationTimestamp
    private Date createdAt;
// that start of the sql querys to line the user_id to the roles and the following.
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_follower", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "follower_id"))
    private List<User> followers;

    @ManyToMany(mappedBy = "followers")
    private List<User> following;
}
