package com.cts.training.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.training.models.User;
public interface UserRepo extends JpaRepository<User, Integer> {
}