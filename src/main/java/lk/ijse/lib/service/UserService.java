package lk.ijse.lib.service;

import lk.ijse.lib.dto.UserDTO;

public interface UserService {
    void addUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);
}
