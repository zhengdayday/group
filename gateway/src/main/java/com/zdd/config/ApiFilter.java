package com.zdd.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-14 上午10:16
 * @Description:
 */
@Component
public class ApiFilter extends ZuulFilter {

    /**
     * 过滤类型, pre路由之前，routing路由时，post 路由之后，error 发生错误时调用
     * @return string
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序，如果有多个多滤去，按数字大小优先级过滤
     * @return int
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 表示是否过滤
     * @return boolean
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 校验逻辑
     * @return object
     */
    @Override
    public Object run() {
        // 填写校验代码
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if (!"12345".equals(token)) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("token is invalid");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
