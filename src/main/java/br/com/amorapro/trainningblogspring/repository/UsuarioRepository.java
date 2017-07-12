package br.com.amorapro.trainningblogspring.repository;

import br.com.amorapro.trainningblogspring.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}