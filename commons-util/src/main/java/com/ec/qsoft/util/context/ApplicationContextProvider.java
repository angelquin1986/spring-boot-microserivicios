package com.ec.qsoft.util.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Aplication context  injeccion desde archivo de configuracion necesario para comar desde el Factory de la app
 *
 * @aquingaluisa
 */
public class ApplicationContextProvider implements ApplicationContextAware {

    private static ApplicationContext context;

    /**
     * @return
     */
    public ApplicationContext getApplicationContext() {
        return context;
    }

    /**
     * @param ac
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext ac)
            throws BeansException {
        context = ac;
    }
}