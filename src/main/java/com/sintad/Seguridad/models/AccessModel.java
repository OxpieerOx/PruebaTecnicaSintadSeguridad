package com.sintad.Seguridad.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "access")
public class AccessModel {
    @Id
    @Column(name = "userid")
    private Integer userId;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;
}
