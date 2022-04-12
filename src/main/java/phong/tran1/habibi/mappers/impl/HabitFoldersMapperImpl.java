package phong.tran1.habibi.mappers.impl;

import org.springframework.stereotype.Component;
import phong.tran1.habibi.dtos.HabitFolderDTO;
import phong.tran1.habibi.entities.HabitFolder;
import phong.tran1.habibi.mappers.HabitFoldersMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HabitFoldersMapperImpl implements HabitFoldersMapper {
    @Override
    public HabitFolderDTO toDTO(HabitFolder folder) {
        return new HabitFolderDTO(folder.getId(), folder.getName(), folder.getPriority(), folder.getColor(), folder.getCreatedAt(), folder.getUpdatedAt());
    }

    @Override
    public List<HabitFolderDTO> toListDTO(List<HabitFolder> folders) {
        return folders.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
