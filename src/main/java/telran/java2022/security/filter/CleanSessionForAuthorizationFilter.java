package telran.java2022.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import telran.java2022.security.service.SessionService;

@Component
@RequiredArgsConstructor
@Order(5)
public class CleanSessionForAuthorizationFilter implements Filter {

	final SessionService sessionService;

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		if (request.getHeader("Authorization") != null) {
			String sessionId = request.getSession().getId();
			sessionService.removeUser(sessionId);
		}
		chain.doFilter(request, response);
	}

}
