package io.github.felipe_damasceno19.app.users.internal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);
}
