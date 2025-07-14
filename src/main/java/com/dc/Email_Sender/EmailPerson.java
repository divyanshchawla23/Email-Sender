package com.dc.Email_Sender;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "all_emails")
public class EmailPerson {
    @Id
    private String email;
    private String name;
    private String company;
}