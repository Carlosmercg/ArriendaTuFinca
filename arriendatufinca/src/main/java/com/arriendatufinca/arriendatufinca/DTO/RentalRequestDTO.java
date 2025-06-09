package com.arriendatufinca.arriendatufinca.DTO;

import java.time.LocalDateTime;

import com.arriendatufinca.arriendatufinca.Enums.RequestState;
import com.arriendatufinca.arriendatufinca.Enums.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalRequestDTO {
    
    private Long id;
    private Long tenantId;
    private Long propertyId;
    
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private RequestState state;
    private StatusEnum status;
}
