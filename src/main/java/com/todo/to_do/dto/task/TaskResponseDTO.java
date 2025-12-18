package com.todo.to_do.dto.task;

import com.todo.to_do.entity.Task;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskResponseDTO {

    @Setter(AccessLevel.NONE)
    private Long id;

    private Long userId;

    private String name;

    private String description;

    private LocalDateTime deadLineDate;

    private LocalDateTime createdAt;

    public TaskResponseDTO(Task entity){
        BeanUtils.copyProperties(entity, this);
    }
}
