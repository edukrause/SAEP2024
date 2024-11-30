package senai.br.saep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import senai.br.saep.modal.M_cadastro;
import senai.br.saep.service.S_Cadastro;
@RestController
public class C_cadastro {

    @Autowired
    private S_Cadastro s_cadastro;

    @PostMapping("/cadastrarUsuario")
    public ResponseEntity<String> cadastrarUsuario(
            @RequestParam("nome") String nome,
            @RequestParam("email") String email) {

        M_cadastro usuario = new M_cadastro();
        usuario.setNome(nome);
        usuario.setEmail(email);

        s_cadastro.salvarUsuario(usuario);

        return new ResponseEntity<>("Usuário cadastrado com sucesso!", HttpStatus.OK);
    }
}
