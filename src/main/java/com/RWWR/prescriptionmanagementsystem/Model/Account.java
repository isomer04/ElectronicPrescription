package com.RWWR.prescriptionmanagementsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Account {
    @Id
    @SequenceGenerator(
        name = "account_id_sequence", 
        sequenceName = "account_id_sequence",
        // this sets how much the id increases in the sequence. 
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "account_sequence"
    )
    private int id;

    
}
