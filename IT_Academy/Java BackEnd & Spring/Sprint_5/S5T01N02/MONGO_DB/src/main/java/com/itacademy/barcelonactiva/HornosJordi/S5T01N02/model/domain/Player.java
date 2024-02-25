package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain;


import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Document(collection = "players")
public class Player implements UserDetails {


    private String username;

    @Id
    private String id;


    private String password;
    private Double winRate;
    private LocalDateTime registerDate;

    public Player(String username){
        this.username = username;
        this.winRate = null;
    }

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(this.username));
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
