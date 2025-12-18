package com.todo.to_do.entity;


import com.todo.to_do.dto.user.RegisterUserRequestDTO;
import com.todo.to_do.dto.user.UpdateUserRequestDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class User {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column
    private String email;

    @Column
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public User(){
        createdAt = LocalDateTime.now();
    }

    public User(Long id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }

    public User(UpdateUserRequestDTO updateDto){
        BeanUtils.copyProperties(updateDto, this);
    }

    public User(RegisterUserRequestDTO registerDto){
        BeanUtils.copyProperties(registerDto, this);
    }
}