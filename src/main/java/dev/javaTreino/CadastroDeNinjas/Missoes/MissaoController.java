package dev.javaTreino.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

//LOCALHOST:8080
@RestController
@RequestMapping("missao")
public class MissaoController {

    @PostMapping()
    public String criarMissao() {
        return "Missao Criada com sucesso";
    }

    @GetMapping()
    public String todosMissoes() {
        return "Todos as missoes";
    }

    @GetMapping("/{id}")
    public String BuscarMissao(@PathVariable String id) {
        return "Missao " + id;
    }

    @PutMapping("/{id}")
    public String editarMissao(@PathVariable String id) {
        return "editando Missao " + id;
    }

    @DeleteMapping("/{id}")
    public String deletarMissao(@PathVariable String id) {
        return "deletando Missao " + id;
    }

}
