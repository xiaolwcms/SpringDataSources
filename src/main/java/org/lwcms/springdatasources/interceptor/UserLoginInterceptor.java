package org.lwcms.springdatasources.interceptor;

import org.lwcms.springdatasources.entry.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName UserLoginInterceptor
 * @Description 用户登录拦截
 * @Author lwcms
 * @Date 2022/12/4 21:24
 */
public class UserLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            System.out.println("登录拦截");
            HttpSession session = request.getSession();
            //统一拦截(查询当前session是否存在user)
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                return true;
            }
            // 重定向到登录页面
           response.sendRedirect("http://www.baidu.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
