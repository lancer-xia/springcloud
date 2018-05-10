package lancer.io.api.gateway;

import com.netflix.zuul.context.RequestContext;

/**
 * Created with IntelliJ IDEA
 * Created By lancer
 * Date: 2018/5/5
 * Time: 21:23
 */
public class SendErrorFilter extends ErrorFilter {

    protected static final String SEND_ERROR_FILTER_RAN = "sendErrorFilter.ran";

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return ctx.containsKey("error.status_code")
                && !ctx.getBoolean(SEND_ERROR_FILTER_RAN, false);
    }
}