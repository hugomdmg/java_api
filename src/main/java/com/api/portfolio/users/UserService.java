package com.api.portfolio.users;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> findAllUsers() {
        return userRepository.findAll();
    }

    public UserModel save(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
