
package com.Tienda.domain;

/**
 *
 * @author cadam
 */

import jakarta.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data //Para la creacion automatica de los set y get de los atributos
@Entity
@Table(name = "rol")
public class Rol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long idRol;
    
    @NotEmpty
    private String nombre;
    
    @Column(name = "id_usuario")
    private Long idUsuario;
}
