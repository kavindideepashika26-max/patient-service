package com.example.patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank; 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.Getter;
import lombok.NoArgsConstructor; 
import lombok.Setter; 
@Data
@Entity 
@Getter 
@Setter 

@Table(name = "patients")

@AllArgsConstructor 
@NoArgsConstructor 

public class Patient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Patient name is required")
    @Column(nullable = false)
    private String name;
    @Min(value = 0, message = "Age must be positive")
    private int age;
    
    private String disease;
}