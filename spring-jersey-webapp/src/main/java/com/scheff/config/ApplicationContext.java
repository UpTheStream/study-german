package com.scheff.config;

import com.scheff.rest.config.RestContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Serg Petrochenko
 *         21/05/16.
 */
@Configuration
@Import(value = RestContext.class)
public class ApplicationContext {
}
