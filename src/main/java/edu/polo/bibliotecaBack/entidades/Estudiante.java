package edu.polo.bibliotecaBack.entidades;

import java.util.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotBlank(message = "Campo obligatorio")
    @Size(max = 50, message= "Nombre demasiado largo")
    @Column(unique = true)
    private String nombre;
    @NotNull
    @NotBlank(message = "Campo obligatorio")
    @Size(max = 10, message= "DNI demasiado largo")
    @Column(unique = true)
    private int dni;
    private String direccion;
    @NotNull
    @NotBlank(message = "Campo obligatorio")
    @Size(max = 50, message= "Email demasiado largo")
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "estudiante")
    private List<Prestamo> prestamos;
    
    @ManyToMany()
    // muchos estudiantes se relacionan con el mismo admin
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Admin admin;
}
