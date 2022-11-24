package com.wijeratnefurniture.ecomfurniture.service.implementation;

import com.wijeratnefurniture.ecomfurniture.dto.CreateUserDto;
import com.wijeratnefurniture.ecomfurniture.entity.User;
import com.wijeratnefurniture.ecomfurniture.repository.UserRepository;
import com.wijeratnefurniture.ecomfurniture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository; //call to repository because it work with DB

    @Override
    public Optional<User> saveUser(CreateUserDto UserDto) {
        // id missing

        // Validation
        // Sofa MX-98
        Optional<User> foundUser = userRepository.findByFirstName(UserDto.getFirstName());

        if(foundUser.isPresent()) {

            // Stop
            return Optional.empty();
            // eliminate the process
        }

        // Converting

        User user = new User();

        user.setFirstName(UserDto.getFirstName());
        user.setLastName(UserDto.getLastName());
        

        return Optional.of(userRepository.save(user)); // automatically returns the saved object
        // returns Product object with id

        // save -> without id
        // save -> with id
    }
}
