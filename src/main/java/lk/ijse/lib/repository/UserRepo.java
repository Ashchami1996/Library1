package lk.ijse.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.lib.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
}
