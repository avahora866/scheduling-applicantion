package com.schedule.TimeSaver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "listline")
@Getter
@Setter
@NoArgsConstructor
public class ListLineEntity {
    @Id
    @Column(name = "LIST_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer listLineID;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private UsersEntity user;

    //mappedBy is the variable name in lists
    @OneToMany(mappedBy = "listLine")
    private List<ListEntity> lists;



}
