package com.arosha.marketcloud.authorizationserver.service;

import com.arosha.marketcloud.authorizationserver.model.AuthUserDetail;
import com.arosha.marketcloud.authorizationserver.model.User;
import com.arosha.marketcloud.authorizationserver.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("UserDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> optionalUser=userDetailRepository.findByUsername(name);

        optionalUser.orElseThrow(()-> new UsernameNotFoundException("Username or Password incorrect"));

        UserDetails userDetails = new AuthUserDetail(optionalUser.get());

        new AccountStatusUserDetailsChecker().check(userDetails);

        return userDetails;
    }
}
