package br.com.test.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "tb_endereco", schema = "teste")
public class Endereco implements Serializable {

    @Id
    @Column(name = "id_endereco")
    private Long id;

    @Column(name = "cidade")
    private String cidade;
}
