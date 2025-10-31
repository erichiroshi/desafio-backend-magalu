package com.erichiroshi.magalu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "tb_status")
public class Status {

    @Id
    private Long statusId;

    private String description;

}
