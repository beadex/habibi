package phong.tran1.habibi.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GoalDTO {
    private Integer id;
    private String periodicity;
    private Integer value;
    private UnitSymbolDTO unitSymbolDTO;
    private Date createdAt;
    private Date updatedAt;
}
