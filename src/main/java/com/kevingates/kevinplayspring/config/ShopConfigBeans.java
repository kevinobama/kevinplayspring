package com.kevingates.kevinplayspring.config;

import com.kevingates.kevinplayspring.models.Nft;
import com.kevingates.kevinplayspring.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfigBeans {

    @Bean
    public Nft nftObject() {

        return new Nft();
    }

    @Bean
    public User userObject() {

        return new User();
    }
}