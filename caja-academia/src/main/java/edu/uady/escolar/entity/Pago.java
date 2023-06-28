package edu.uady.escolar.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="pagos")
@Data
@NoArgsConstructor
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pago_id")
    private Long id;
    @Column(name = "alumno_id", nullable = false, precision = 30)
    private Long alumno_id;
    @Column(name = "materia_id", nullable = false, precision = 30)
    private Long materia_id;
    @Column(name = "fecha_pago")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime fecha_pago;
    @Column( name = "importe_pago")
    private int importe_pago;


}
