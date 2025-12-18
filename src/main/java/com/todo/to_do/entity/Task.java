package com.todo.to_do.entity;

import com.todo.to_do.dto.task.RegisterTaskRequestDTO;
import com.todo.to_do.dto.task.TaskResponseDTO;
import com.todo.to_do.dto.user.UpdateUserRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Task {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @JoinColumn(name = "user_id")
    private Long userId;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalDateTime deadLineDate;

    private LocalDateTime createdAt;

    public Task(){
        this.createdAt = LocalDateTime.now();
    }

    public Task(Long id, Long userId, String name, String description, LocalDateTime deadLineDate) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.deadLineDate = deadLineDate;
        this.createdAt = LocalDateTime.now();
    }

    public Task(RegisterTaskRequestDTO registerDto){
        BeanUtils.copyProperties(registerDto, this);
    }

    public Task(UpdateUserRequestDTO registerDto){
        BeanUtils.copyProperties(registerDto, this);
    }
}
