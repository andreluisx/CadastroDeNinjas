package dev.javaTreino.CadastroDeNinjas.Ninjas;

import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String BoasVindas() {
        return "Olá, Boas Vindas";
    }

    @PostMapping("/criar_ninja")
    public String criarNinja() {
        return "Ninja Criada com sucesso";
    }

    @GetMapping("/todos_ninjas")
    public String todosNinjas() {
        return "Todos os ninjas";
    }

    @GetMapping("/ninja/{id}")
    public String ninja(@PathVariable String id) {
        return "Ninja " + id;
    }

    @PatchMapping("/ninja/{id}")
    public String ninjaUpdate(@PathVariable String id) {
        return "editando Ninja " + id;
    }

    @DeleteMapping("/ninja/{id}")
    public String ninjaDelete(@PathVariable String id) {
        return "deletando Ninja " + id;
    }

}
