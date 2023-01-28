@Configuration
@EnableWebSecurity
public class SecurityConfigOauth extends WebSecurityConfigurerAdapter {
    //Other configuration
    @Autowired
    private CustomAuthenticationProvider customAuthenticationProvider;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(customAuthenticationProvider);
    }
//Other configuration
}
