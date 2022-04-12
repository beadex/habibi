package phong.tran1.habibi.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabitFolderDTO {
    private Integer id;
    private String name;
    private String priority;
    private String color;
    private Date createdAt;
    private Date updatedAt;
}
