# sleuth-bug


I see following lines when the application starts:

```asciidoc
2024-01-13 13:05:38.002  INFO [,,] 13429 --- [           main] c.e.sleuthbug.SleuthBugApplication       : Starting SleuthBugApplication using Java 17.0.8 on INKACTXM364.local with PID 13429 (/Users/adityazagade/code/github/sleuth-bug/target/classes started by adityazagade in /Users/adityazagade/code/github/sleuth-bug)
2024-01-13 13:05:38.004  INFO [,,] 13429 --- [           main] c.e.sleuthbug.SleuthBugApplication       : No active profile set, falling back to 1 default profile: "default"
2024-01-13 13:05:38.376  INFO [,,] 13429 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-01-13 13:05:38.399  INFO [,,] 13429 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 17 ms. Found 1 JPA repository interfaces.
2024-01-13 13:05:38.554  INFO [,,] 13429 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=eb580c95-6b28-35fb-adae-a8d68c1876c9
2024-01-13 13:05:38.616  INFO [,,] 13429 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.commons.config.CommonsConfigAutoConfiguration' of type [org.springframework.cloud.commons.config.CommonsConfigAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2024-01-13 13:05:38.617  INFO [,,] 13429 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.client.loadbalancer.LoadBalancerDefaultMappingsProviderAutoConfiguration' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerDefaultMappingsProviderAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2024-01-13 13:05:38.617  INFO [,,] 13429 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'loadBalancerClientsDefaultsMappingsProvider' of type [org.springframework.cloud.client.loadbalancer.LoadBalancerDefaultMappingsProviderAutoConfiguration$$Lambda$479/0x00000070012d1ea0] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2024-01-13 13:05:38.619  INFO [,,] 13429 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'defaultsBindHandlerAdvisor' of type [org.springframework.cloud.commons.config.DefaultsBindHandlerAdvisor] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2024-01-13 13:05:38.622  INFO [,,] 13429 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'spring.sleuth.jdbc-org.springframework.cloud.sleuth.autoconfig.instrument.jdbc.TraceJdbcProperties' of type [org.springframework.cloud.sleuth.autoconfig.instrument.jdbc.TraceJdbcProperties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2024-01-13 13:05:38.922  INFO [,,] 13429 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2024-01-13 13:05:38.930  INFO [,,] 13429 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-01-13 13:05:38.930  INFO [,,] 13429 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache 
```

Note the trationDelegate$BeanPostProcessorChecker lines. 

JDBC logs are not printed