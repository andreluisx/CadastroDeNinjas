package dev.javaTreino.CadastroDeNinjas.Ninjas;

import dev.javaTreino.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // cria um constructor sem argumentos
@AllArgsConstructor // cria um constructor com todos os argumentos
@Data // cria getters e setters
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(unique = true, name = "email")
    private String email;

    @Column(name="idade")
    private int idade;

    // o ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // ForeignKey ou Chave estrangeira
    private MissaoModel missoes;


}
