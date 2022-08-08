package one.digitalinnovation.padroesprojetospring.service;

import one.digitalinnovation.padroesprojetospring.model.Cliente;
import org.springframework.stereotype.Service;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio do cliente.
 * Com isso, se necessário, podemos ter múltiplas implementações dessa mesma interface
 *
 * @author Alemaof
 */
@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
