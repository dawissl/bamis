package cz.uhk.dbs2.bamis.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private DataSource dataSource;

	@Value("${spring.queries.users-query}")
	private String usersQuery;

/*	@Value("${spring.queries.roles-query}")
	private String rolesQuery;*/

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().usersByUsernameQuery(usersQuery)./*authoritiesByUsernameQuery(rolesQuery)
				.*/dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				// URLs matching for access rights
				//.antMatchers("/").permitAll()
				.antMatchers("/login").permitAll()
				//Temporary
				.antMatchers("/customer").permitAll()
				.antMatchers("/employee_category").permitAll()
				.antMatchers("/employee").permitAll()
				.antMatchers("/error").permitAll()
				.antMatchers("/index").permitAll()
				.antMatchers("/location").permitAll()
				.antMatchers("/packageDetail").permitAll()
				.antMatchers("/packageDetails").permitAll()
				.antMatchers("/loadedVehicle").permitAll()
				.antMatchers("/assignedPackage").permitAll()
				.antMatchers("/packages").permitAll()
				.antMatchers("/region").permitAll()
				.antMatchers("/ride").permitAll()
				.antMatchers("/status_category").permitAll()
				.antMatchers("/status").permitAll()
				.antMatchers("/track").permitAll()
				.antMatchers("/test").permitAll()
				.antMatchers("/vehicle").permitAll()
				.antMatchers("/").permitAll()
				.antMatchers("/packages/*").permitAll()//Temporary
				.antMatchers("/packages/*/delete").permitAll()//Temporary
				.antMatchers("/store").permitAll()
				.antMatchers("/**").permitAll()
				.anyRequest().authenticated()
				.and()
				// form login
				.csrf().disable().formLogin()
				.loginPage("/login")
				.failureUrl("/login?error=true")
				.defaultSuccessUrl("/index")
				.usernameParameter("MAIL")
				.passwordParameter("RODNECISLO")
				.and()
				// logout
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/login").and()
				.exceptionHandling()
				.accessDeniedPage("/access-denied");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	}
}
