package dev.javaTreino.CadastroDeNinjas.Ninjas;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD BÁSICO DE NINJA
@RestController
@RequestMapping("ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;


    @PostMapping()
    public ResponseEntity<NinjaDTO> criarNinja(@RequestBody NinjaDTO ninjaDTO) {
        NinjaDTO ninja = ninjaService.criarNinja(ninjaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ninja);
    }

    @GetMapping()
    public ResponseEntity<List<NinjaDTO>> todosNinjas() {
        List<NinjaDTO> ninja = ninjaService.listarNinjas();
        return ResponseEntity.status(HttpStatus.OK).body(ninja);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NinjaDTO> BuscarNinja(@PathVariable Long id) {

        NinjaDTO ninja = ninjaService.buscarNinjaPorId(id);

        if(ninja != null){
            return ResponseEntity.ok(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<NinjaDTO> editarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        NinjaDTO ninjaResponse =  ninjaService.atualizarNinja(id, ninja);

        if(ninja != null){
            return ResponseEntity.ok(ninjaResponse);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarNinja(@PathVariable Long id) {

        if (ninjaService.buscarNinjaPorId(id) != null) {
            ninjaService.deletarNinja(id);
            return ResponseEntity.status(HttpStatus.OK).body("Ninja de id: [ " + id + " ] Deletado com SUCESSO");

        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja Não encontrado");

        }
    }

}
