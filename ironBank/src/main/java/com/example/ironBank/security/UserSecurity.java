package com.example.ironBank.security;
import com.example.ironBank.models.user.User;

import java.util.Collection;
import java.util.HashSet;

public class UserSecurity  {

    private User user;

    public UserSecurity (User user) {
        this.user=user;
    }

   /* @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        Collection<GrantedAuthority> authorities = new HashSet<>();
        for (User user : user.getUserId(id) {
            authorities.add(new SimpleGrantedAuthority("USER"  + user.getUser()));
        }

        return authorities;
    }
    */
}