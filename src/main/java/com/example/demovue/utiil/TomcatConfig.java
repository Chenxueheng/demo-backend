//package com.example.demovue.utiil;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@@Configuration
//public class TomcatConfig {
//    @Bean
//    TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
//        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory(){
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint constraint = new SecurityConstraint();
//                constraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                constraint.addCollection(collection);
//                context.addConstraint(constraint);
//            }
//        };
//        factory.addAdditionalTomcatConnectors(createTomcatConnector());
//        return factory;
//    }
//
//    private Connector createTomcatConnector() {
//        Connector connector = new
//                Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(5001);
//        connector.setSecure(false);
//        connector.setRedirectPort(443);
//        return connector;
//    }
//}
