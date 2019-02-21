package common.System;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;    
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.*;    
import org.springframework.security.provisioning.InMemoryUserDetailsManager;  
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;    
@EnableWebSecurity    
@ComponentScan("common.System")    
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {    
 
	/*@Bean    
  public UserDetailsService userDetailsService() {    
      InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();    
      manager.createUser(User.withDefaultPasswordEncoder()  
      .username("admin").password("123").roles("ADMIN").build());    
      return manager;    
  }  */
	
	  @Override
	   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	      auth.inMemoryAuthentication()
	      .withUser("admin").password("123").roles("USER");
	   }

	  
  @Override    
  protected void configure(HttpSecurity http) throws Exception {    
      http.authorizeRequests().anyRequest()
      .hasAnyRole("USER","ADMIN")
      .and()
      .authorizeRequests().antMatchers("/login**")
      .permitAll()
      .and()
      .formLogin()
      .loginPage("/login")
      .usernameParameter("userid")  // Username parameter, used in name attribute
      // of the <input> tag. Default is 'username'.
.passwordParameter("passwd")  // Password parameter, used in name attribute
      // of the <input> tag. Default is 'password'.
.successHandler((req,res,auth)->{    //Success handler invoked after successful authentication
for (GrantedAuthority authority : auth.getAuthorities()) {
System.out.println(authority.getAuthority());
}
System.out.println(auth.getName());
res.sendRedirect("/"); // Redirect user to index/home page
});
      
      
      
      
    /*  
      antMatchers("/index", "/user","/").permitAll()  
      .antMatchers("/admin","/status","/productos").authenticated()  
      .and()  
      .formLogin() 
      .and()  
      .logout() .permitAll() 
      
      
      
      
      .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));*/
        
  }    
}    