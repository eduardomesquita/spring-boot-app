package br.com.test.entidades;

import lombok.Setter;
import lombok.Getter;
import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "tb_cliente", schema = "teste")
public class Cliente implements Serializable {

    @Id
    @Column(name = "id_cliente")
    private Long id;

    @OneToOne
    @JoinColumn(name = "fk_endereco")
    private Endereco endereco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

}

