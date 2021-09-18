
package one.digitalinnovation.labpadroesprojetospring.model;

import ch.qos.logback.core.net.server.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Vitor Hugo
 */
@Repository
public interface ClienteRepository extends CrudRepository<Client,Long> {

    public void save(Cliente cliente);
    
}
