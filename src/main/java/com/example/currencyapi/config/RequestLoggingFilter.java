package com.example.currencyapi.config;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class RequestLoggingFilter extends OncePerRequestFilter {

    private final Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void doFilterInternal(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        logRequestDetails(request);


        filterChain.doFilter(request, response);
    }

    private void logRequestDetails(HttpServletRequest request) {
        String ipAddress = request.getRemoteAddr();
        String requestUri = request.getRequestURI();
        String httpMethod = request.getMethod();

        logger.info("Request from IP Address: {}", ipAddress);
        logger.info("Request URI: {}", requestUri);
        logger.info("HTTP Method: {}", httpMethod);
    }
}
