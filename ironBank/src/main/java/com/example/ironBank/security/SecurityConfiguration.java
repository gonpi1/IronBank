package com.example.ironBank.security;
import org.springframework.context.annotation.Bean;

public class SecurityConfiguration {

   /* @Bean
   PasswordEncoder passwordEncoder() {return new BCryptPasswordEncoder();}

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConf) throws Exception {
        return authConf.getAuthenticationManager();
    }

    }

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic();

        httpSecurity.authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET, "/user-area").hasRole("USER")
                .requestMatchers(HttpMethod.GET, "/user-admin-area**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.GET, "/user-details").hasAnyRole("ADMIN", "USER")
                .anyRequest().permitAll();

        httpSecurity.csrf().disable();

        return httpSecurity.build();
    }

}
 */
}