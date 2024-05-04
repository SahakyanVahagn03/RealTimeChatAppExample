package com.example.chatapp.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
