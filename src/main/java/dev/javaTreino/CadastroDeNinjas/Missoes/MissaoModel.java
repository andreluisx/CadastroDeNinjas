package dev.javaTreino.CadastroDeNinjas.Missoes;

import dev.javaTreino.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(length = 10, nullable = false)
    private int dificuldade;

    // uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninjas;

    public MissaoModel() {
    }

    public MissaoModel(String nome, int dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
