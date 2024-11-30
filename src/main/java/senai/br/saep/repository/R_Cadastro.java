package senai.br.saep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.br.saep.modal.M_cadastro;

public interface R_Cadastro extends JpaRepository<M_cadastro, Long> {

}
