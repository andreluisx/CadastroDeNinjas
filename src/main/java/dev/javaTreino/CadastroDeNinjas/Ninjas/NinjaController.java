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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninjaDTO) {
        return ninjaService.criarNinja(ninjaDTO);
    }

    @GetMapping()
    public List<NinjaDTO> todosNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/{id}")
    public NinjaDTO BuscarNinja(@PathVariable Long id) {
        return ninjaService.buscarNinjaPorId(id);
    }

    @PatchMapping("/{id}")
    public NinjaDTO editarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        return ninjaService.atualizarNinja(id, ninja);
    }

    @DeleteMapping("/{id}")
    public String deletarNinja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
        return "deletado Ninja " + id;
    }

}
