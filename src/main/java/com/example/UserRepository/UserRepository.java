package com.example.UserRepository;

import com.example.SimpleCRUDApp.SimpleCrudAppApplication;

import com.example.entity.user;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository("/users")
public interface UserRepository {
    public interface UserRepository extends JpaRepositoriesAutoConfiguration<user, String>;
}
