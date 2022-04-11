package phong.tran1.habibi.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnitSymbolDTO {
    private Integer id;
    private String name;
    private String display;
    private String symbol;
    private String type;
    private Double alpha;
}
