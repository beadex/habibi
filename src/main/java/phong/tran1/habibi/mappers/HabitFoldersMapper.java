package phong.tran1.habibi.mappers;

import phong.tran1.habibi.dtos.HabitFolderDTO;
import phong.tran1.habibi.entities.HabitFolder;

import java.util.List;

public interface HabitFoldersMapper {
    HabitFolderDTO toDTO(HabitFolder folder);
    List<HabitFolderDTO> toListDTO(List<HabitFolder> folders);
}
