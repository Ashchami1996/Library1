package lk.ijse.lib.service.impl;

import lk.ijse.lib.dto.UserDTO;
import lk.ijse.lib.model.User;
import lk.ijse.lib.repository.UserRepo;
import lk.ijse.lib.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public void addUser(UserDTO userDTO) {
        User user=new User(userDTO.getUid(),userDTO.getUsername(),userDTO.getPassword());
        userRepo.save(user);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        String msg=null;

        User user=new User(userDTO.getUid(),userDTO.getUsername(),userDTO.getPassword());

        if(user.getUid()!= null){
            userRepo.save(user);

        }
    }
}
