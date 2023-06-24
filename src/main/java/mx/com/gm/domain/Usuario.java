package mx.com.gm.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class Usuario{
   
    private Long id_user;
    private String nombre;
    private String doc;
    private String email;
    private String pass;
    private String tipo_user;
    private int num_cuenta;
    private double monto; 
    
}