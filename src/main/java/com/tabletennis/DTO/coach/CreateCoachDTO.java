package com.tabletennis.DTO.coach;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCoachDTO {
    private Integer idClub;
    private String name;
}