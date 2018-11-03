package com.fantasy.qimingguicai.configuration;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 忽略资源
 */
@WebFilter(filterName = "druidWebStatFilter",
urlPatterns = "/*",
initParams = {@WebInitParam(name = "exclusions", value = "*.js")})
public class DruidStatFilter extends WebStatFilter { }
