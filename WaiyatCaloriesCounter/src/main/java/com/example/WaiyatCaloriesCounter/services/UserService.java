package com.example.WaiyatCaloriesCounter.services;

import com.example.WaiyatCaloriesCounter.Mapper.UserMapper;
import com.example.WaiyatCaloriesCounter.dto.UserDTO;
import com.example.WaiyatCaloriesCounter.model.User;
import com.example.WaiyatCaloriesCounter.repository.UserRepository;
import jakarta.persistence.Column;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO registration(UserDTO userdto){
            User user = UserMapper.mapUser(userdto);
            userRepository.save(user);
            return UserMapper.mapUserDto(user);
    }

    public List<UserDTO> getAllUser(String username){
        List<User> users =userRepository.findAll();
        return users.stream().map(user -> UserMapper.mapUserDto(user)).collect(Collectors.toList());
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    private String username;
    private String password;


    public UserDTO updateUser(int userId, UserDTO userDto) {
        User user = userRepository.findById(userId).orElseThrow(()-> new NullPointerException());
        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setWeight(userDto.getWeight());
        user.setGender(userDto.getGender());
        user.setAge(userDto.getAge());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return UserMapper.mapUserDto(user);
    }

    public UserDTO login(UserDTO userDto) {
        User user = userRepository.findByUsername(userDto.getUsername());
        if (user != null && userDto.getPassword().equals(user.getPassword())) {
            return UserMapper.mapUserDto(user);
        }
        return null;
    }

}
