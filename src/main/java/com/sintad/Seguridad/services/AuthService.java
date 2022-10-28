package com.sintad.Seguridad.services;
import com.sintad.Seguridad.models.AccessModel;
import com.sintad.Seguridad.repositories.IAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthService {

    @Autowired
    IAuthRepository authRepository;

    public List<AccessModel> getAcces() {

        return (List<AccessModel>) authRepository.findAll();
    }

    public Boolean validatedCredentials(String UserName, String Password) {
        List<AccessModel> result = (List<AccessModel>) authRepository.findAll();
        List<AccessModel> resultFilter = result.stream()
                .filter(t -> t.getUserName().equals(UserName) && t.getPassword().equals(Password))
                .collect(Collectors.toList());
        if (null == resultFilter || resultFilter.isEmpty()) {
            return false;
        }
        return true;
    }

}