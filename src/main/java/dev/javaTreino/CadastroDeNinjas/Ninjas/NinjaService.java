package dev.javaTreino.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel buscarNinjaPorId(Long id){
        return ninjaRepository.findById(id).orElse(null);
    }

    //Criar novo Ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);

    }

    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(Long id, NinjaModel ninja){
        NinjaModel ninjaBuscado =  ninjaRepository.findById(id).orElse(null);
        if (ninjaBuscado != null){
            ninjaBuscado.setNome(ninja.getNome());
            return ninjaRepository.save(ninjaBuscado);
        }
        return null;
    }

}
