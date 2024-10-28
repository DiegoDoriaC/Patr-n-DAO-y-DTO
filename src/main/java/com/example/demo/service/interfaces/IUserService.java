package com.example.demo.service.interfaces;


import com.example.demo.presentation.dto.UserDTO;

import java.util.List;

public interface IUserService {

    List<UserDTO> findAll();
    UserDTO findById (Long id);
    UserDTO createUser (UserDTO userDTO);
    UserDTO updateUser (Long id, UserDTO userDTO);
    String deleteUser (Long id);

}
