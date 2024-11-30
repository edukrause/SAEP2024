package senai.br.saep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.br.saep.modal.M_cadastro;
import senai.br.saep.repository.R_Cadastro;

@Service
public class S_Cadastro {
    @Autowired
    private R_Cadastro r_cadastro;

    public M_cadastro salvarUsuario(M_cadastro usuario) {
        return r_cadastro.save(usuario);
    }
}