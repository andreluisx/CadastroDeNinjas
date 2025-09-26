package dev.javaTreino.CadastroDeNinjas.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//LOCALHOST:8080
@RestController
@RequestMapping("missao")
public class MissaoController {

    @Autowired
    private MissaoService missaoService;

    @PostMapping()
    public String criarMissao() {
        return "Missao Criada com sucesso";
    }

    @GetMapping()
    public List<MissaoModel> todosMissoes() {
        return missaoService.listarMissoes();
    }

    @GetMapping("/{id}")
    public MissaoModel BuscarMissao(@PathVariable Long id) {
        return missaoService.buscarMissaoPorId(id);
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
