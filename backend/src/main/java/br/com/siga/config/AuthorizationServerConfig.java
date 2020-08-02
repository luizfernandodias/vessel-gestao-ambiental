package br.com.siga.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.DefaultWebResponseExceptionTranslator;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter{

	@Autowired  
	private AuthenticationManager authenticationManager;

	/**
	 * Define as configurações de segurança nos endpoints relativos aos tokens de acesso
	 * */
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
		.secret(new BCryptPasswordEncoder().encode("secret-id"))  
		.authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")  
		.scopes("read", "write", "trust")  
		.accessTokenValiditySeconds(3000)  
		.refreshTokenValiditySeconds(3000);  
	}

	@Override  
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {  
		endpoints.authenticationManager(authenticationManager)  
		.allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST)
		.exceptionTranslator(loggingExceptionTranslator());  
	}

	/**
	 * Exceção - log
	 * */
	@Bean
	public WebResponseExceptionTranslator loggingExceptionTranslator() {
		return new DefaultWebResponseExceptionTranslator() {
			@Override
			public ResponseEntity<OAuth2Exception> translate(Exception e) throws Exception {
				e.printStackTrace();
				ResponseEntity<OAuth2Exception> responseEntity = super.translate(e);
				HttpHeaders headers = new HttpHeaders();
				headers.setAll(responseEntity.getHeaders().toSingleValueMap());
				OAuth2Exception excBody = responseEntity.getBody();
				return new ResponseEntity<>(excBody, headers, responseEntity.getStatusCode());
			}
		};
	}


}
