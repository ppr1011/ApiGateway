package com.exercise.ApiGateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.exercise.ApiGateway.filter.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class App 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(App.class).web(true).run(args);
    }
    
    @Bean
    public AccessFilter accessFilter() {
    	return new AccessFilter();
    }
}
