package br.org.serratec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.model.Cliente;
import br.org.serratec.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
}
