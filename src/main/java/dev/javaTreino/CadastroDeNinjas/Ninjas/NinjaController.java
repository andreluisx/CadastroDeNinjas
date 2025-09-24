package dev.javaTreino.CadastroDeNinjas.Ninjas;

import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.*;

// CRUD BÁSICO DE NINJA
@RestController
@RequestMapping("ninja")
public class NinjaController {

    @PostMapping()
    public String criarNinja() {
        return "Ninja Criada com sucesso";
    }

    @GetMapping()
    public String todosNinjas() {
        return "Todos os ninjas";
    }

    @GetMapping("/{id}")
    public String BuscarNinja(@PathVariable String id) {
        return "Ninja " + id;
    }

    @PutMapping("/{id}")
    public String editarNinja(@PathVariable String id) {
        return "editando Ninja " + id;
    }

    @DeleteMapping("/{id}")
    public String deletarNinja(@PathVariable String id) {
        return "deletando Ninja " + id;
    }

}
