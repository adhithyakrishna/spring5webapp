package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
//extends crud repository, the first parameter is the entity class
//the second parameter is the datatype of the primary key of the entity class
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
