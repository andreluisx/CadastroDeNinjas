package dev.javaTreino.CadastroDeNinjas.Missoes;

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

}
