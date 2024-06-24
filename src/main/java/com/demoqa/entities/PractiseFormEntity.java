package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
@EqualsAndHashCode


public class PractiseFormEntity {
    private String firstName;
    private String LastName;
    private String email;
    private String number;
    private String subject;
    private String currentAddress;
    private String state;
    private String city;
    private int gender;



}
