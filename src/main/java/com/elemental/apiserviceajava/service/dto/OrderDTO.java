package com.elemental.apiserviceajava.service.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class OrderDTO {
    private String client;
    private String externalId;
    @Builder.Default
    private Date date = new Date();
}
