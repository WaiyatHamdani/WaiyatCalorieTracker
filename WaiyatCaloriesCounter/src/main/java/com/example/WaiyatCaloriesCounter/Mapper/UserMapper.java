package com.example.WaiyatCaloriesCounter.Mapper;

import com.example.WaiyatCaloriesCounter.dto.UserDTO;
import com.example.WaiyatCaloriesCounter.model.User;
import jakarta.persistence.Column;

public class UserMapper {

    public static User mapUser(UserDTO userdto) {
        if (userdto == null) {
            return null;
        }
        return new User(
                userdto.getUserId(),
                userdto.getFirstname(),
                userdto.getLastname(),
                userdto.getWeight(),
                userdto.getGender(),
                userdto.getAge(),
                userdto.getUsername(),
                userdto.getPassword(),
                userdto.getExercise(),
                userdto.getGoal()
        );
    }

    public static UserDTO mapUserDto(User user) {
        if (user == null) {
            return null;
        }
        return new UserDTO(
                user.getUserId(),
                user.getFirstname(),
                user.getLastname(),
                user.getWeight(),
                user.getGender(),
                user.getAge(),
                user.getUsername(),
                user.getPassword(),
                user.getExercise(),
                user.getGoal()
        );
    }
}
