package dev.javaTreino.CadastroDeNinjas.Ninjas;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD BÁSICO DE NINJA
@RestController
@RequestMapping("ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;


    @PostMapping()
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping()
    public List<NinjaModel> todosNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/{id}")
    public NinjaModel BuscarNinja(@PathVariable Long id) {
        return ninjaService.buscarNinjaPorId(id);
    }

    @PatchMapping("/{id}")
    public NinjaModel editarNinja(@PathVariable Long id, @RequestBody NinjaModel ninja) {
        return ninjaService.atualizarNinja(id, ninja);
    }

    @DeleteMapping("/{id}")
    public String deletarNinja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
        return "deletado Ninja " + id;
    }

}
