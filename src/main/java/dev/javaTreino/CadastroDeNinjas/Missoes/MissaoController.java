package dev.javaTreino.CadastroDeNinjas.Missoes;

import dev.javaTreino.CadastroDeNinjas.Ninjas.NinjaModel;
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
    public MissaoModel criarMissao(@RequestBody MissaoModel missao) {
        return missaoService.criarMissao(missao);
    }

    @GetMapping()
    public List<MissaoModel> todosMissoes() {
        return missaoService.listarMissoes();
    }

    @GetMapping("/{id}")
    public MissaoModel BuscarMissao(@PathVariable Long id) {
        return missaoService.buscarMissaoPorId(id);
    }

    @PatchMapping("/{id}")
    public MissaoModel editarNinja(@PathVariable Long id, @RequestBody MissaoModel missao) {
        return missaoService.atualizarMissao(id, missao);
    }

    @DeleteMapping("/{id}")
    public String deletarNinja(@PathVariable Long id) {
        missaoService.deletarMissao(id);
        return "deletado Ninja " + id;
    }

}
