package com.portafolio.mgb.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author jesica
 */
@Entity

public class Persona {

    @Id /*Parametros para la tabla de la bd*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*Parametros para la tabla de la bd*/
    private Long id;/*campo 1*/

    @NotNull /*Parametros para la tabla de la bd*/
    @Size(min = 1, max = 50, message = "no cumple con la longitud") /*Parametros para la tabla de la bd --- tamaño de caracteres*/
    private String Nombre;/*campo 2*/

    @NotNull /*Parametros para la tabla de la bd*/
    @Size(min = 1, max = 50, message = "no cumple con la longitud") /*Parametros para la tabla de la bd --- tamaño de caracteres*/
    private String Apellido;/*campo 3*/

    @NotNull /*Parametros para la tabla de la bd*/
    @Size(min = 1, max = 50, message = "no cumple con la longitud") /*Parametros para la tabla de la bd --- tamaño de caracteres*/
    private String img;/*campo 3*/
    
    /*Creando Getters y Setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    /*Otra opcion en la que se pueden importar los Getters and Setters es realizando la notacion (@Getter @Setter) eso se debe a lonvok*/
    
    
   }
