package servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(filterName = "SecurityFilter" , urlPatterns = "/dir/*")
public class SecurityFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println(req.getSession().getAttribute("sec_data"));
        if(req.getSession() != null && req.getSession().getAttribute("sec_data") != null) {
            chain.doFilter(request, response);
        } else{
            ((HttpServletResponse) response).sendRedirect("../index.jsp");
        }
    }
}
