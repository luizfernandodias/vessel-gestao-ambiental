package br.com.siga.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;  

@Configuration  
@EnableAuthorizationServer  
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter  {  
	
	@Autowired  
	private AuthenticationManager authenticationManager;
	
	@Override  
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {  
	    security.tokenKeyAccess("permitAll()")  
	            .checkTokenAccess("isAuthenticated()")  
	            .allowFormAuthenticationForClients();  
	}
	
	@Override  
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {  
	    clients.inMemory()  
	            .withClient("client-id")  
	            .secret("secret-id")  
	            .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")  
	            .scopes("read", "write", "trust")  
	            .accessTokenValiditySeconds(360)  
	            .refreshTokenValiditySeconds(360);  
	}
	
	 @Override  
	 public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {  
	     endpoints.authenticationManager(authenticationManager)  
	                 .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);  
	 }

}