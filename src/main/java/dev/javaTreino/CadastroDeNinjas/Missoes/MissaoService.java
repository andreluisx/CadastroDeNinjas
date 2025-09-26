package dev.javaTreino.CadastroDeNinjas.Missoes;

import dev.javaTreino.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {
    private final MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    public List<MissaoModel> listarMissoes() {
        return missaoRepository.findAll();
    }

    public MissaoModel buscarMissaoPorId(Long id) {
        return missaoRepository.findById(id).orElse(null);
    }

    //Criar novo Ninja
    public MissaoModel criarMissao(MissaoModel missao){
        return missaoRepository.save(missao);
    }

    public void deletarMissao(Long id){
        missaoRepository.deleteById(id);
    }

    public MissaoModel atualizarMissao(Long id, MissaoModel missao){
        MissaoModel missaoEncontrada =  missaoRepository.findById(id).orElse(null);
        if (missaoEncontrada != null){
            missaoEncontrada.setNome(missao.getNome());
            return missaoRepository.save(missaoEncontrada);
        }
        return null;
    }

}
