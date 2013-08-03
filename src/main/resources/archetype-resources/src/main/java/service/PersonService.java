#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.domain.Person;

@Service
@Transactional
public class PersonService {

	@PersistenceContext
	private EntityManager em;

	public Person savePerson(Person person) {
		em.persist(person);
		em.flush();
		System.out.println(person);
		return person;
	}
}
