package com.ec.qsoft.util.spring.ribbon;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.NoOpPing;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;

/**
 * Clase configuracion de ribbon , copiado de internet
 * @author  aquingaluisa
 */
public class RibbonConfiguration {

	 @Bean
	 public IPing ribbonPing() {
	        return new NoOpPing();
	 }

	 @Bean
	 public IRule ribbonRule() {
	        return new WeightedResponseTimeRule();
	 }
}
