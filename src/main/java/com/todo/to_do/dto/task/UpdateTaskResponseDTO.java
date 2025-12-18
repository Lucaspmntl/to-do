package com.todo.to_do.dto.task;

import com.todo.to_do.entity.Task;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTaskResponseDTO {

    @Size(max = 40)
    private String name;

    @Size(max = 150)
    private String description;

    private LocalDateTime deadLineDate;

    public UpdateTaskResponseDTO(Task entity){
        BeanUtils.copyProperties(entity, this);
    }
}
