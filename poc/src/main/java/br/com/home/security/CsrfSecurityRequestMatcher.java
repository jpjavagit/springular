package br.com.home.security;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;


public class CsrfSecurityRequestMatcher implements RequestMatcher{

	private Pattern allowedMethods = Pattern.compile("^(GET|HEAD|TRACE|OPTIONS|POST)$");
	private RegexRequestMatcher unprotectedMatcher = new RegexRequestMatcher("/ext/\\**", null);

	    
	public boolean matches(HttpServletRequest arg0) {
	  if(allowedMethods.matcher(arg0.getMethod()).matches()){
            return false;
        }
	  return !unprotectedMatcher.matches(arg0);
	}

}
