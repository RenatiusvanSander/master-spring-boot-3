package edu.remad.masterspringboot3.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import edu.remad.masterspringboot3.models.User;
import reactor.core.publisher.Mono;

public interface UserRepository extends R2dbcRepository<User, String> {
	Mono<User> findByEmail(String email);
}
