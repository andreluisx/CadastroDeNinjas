package dev.javaTreino.CadastroDeNinjas.Ninjas;

import dev.javaTreino.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String imgUrl;
    private MissaoModel missoes;
    private String rank;

}
