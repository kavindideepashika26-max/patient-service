package com.example.patient;
import org.springframework.data.annotation.Id;

import jakarta.persistence.*; 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.Getter;
import lombok.NoArgsConstructor; 
import lombok.Setter; 
@Data
@Entity 
@Getter 
@Setter 
@Table(name = "patient") 
@AllArgsConstructor 
@NoArgsConstructor 
public class Patient { 
@Id
 private long id; 
private String name; 
private String disease; 
private Integer age; 
}
