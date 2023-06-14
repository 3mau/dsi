package com.restaurante.dsi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.*;
import jakarta.persistence.*;

@Entity @Setter @Getter @NoArgsConstructor
public class Tables {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String capacity;
    private String description;
    
    
    

    
}
