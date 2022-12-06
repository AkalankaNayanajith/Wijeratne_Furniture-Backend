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
  
        Optional<User> foundUser = userRepository.findByEmail(UserDto.getEmail());

        if(foundUser.isPresent()) {

            // Stop
            return Optional.empty();
            // eliminate the process
        }

        // Converting

        User user = new User();

        user.setUserid(UserDto.getUserid());
        user.setFirstName(UserDto.getFirstName());
        user.setLastName(UserDto.getLastName());
        user.setAddress(UserDto.getAddress());
        user.setGender(UserDto.getGender());
        user.setNIC(UserDto.getNIC());
        user.setRole(UserDto.getRole());
        user.setEmail(UserDto.getEmail());
        user.setPassword(UserDto.getPassword());
        user.setImage64(UserDto.getImage64());
        user.setAge(UserDto.getAge());
        user.setDOB(UserDto.getDOB());
        

        return Optional.of(userRepository.save(user)); // automatically returns the saved object
        // returns User object with id

        // save -> without id
        // save -> with id
    }

    @Override
    public Iterable<User> allUsers() {
        return userRepository.findAll();
    }
  

}
