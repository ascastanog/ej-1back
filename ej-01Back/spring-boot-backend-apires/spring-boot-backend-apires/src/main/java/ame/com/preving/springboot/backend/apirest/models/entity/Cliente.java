package ame.com.preving.springboot.backend.apirest.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String apellido;
    private String email;

    @Column(name="created_at")
    @Temporal(DATE)
    private Date createdAt;

    @PrePersist
    public void prePersist ()
    {
        createdAt=new Date();
    }



}
