 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.spring.cloud.multi.tenant.http;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHandler;

/**
 *
 * @author malike_st
 */
@EnableBinding(Sink.class)
@EnableConfigurationProperties
public class MultiHTTPSink {

    @Bean
    @ServiceActivator(inputChannel = Sink.INPUT)
    public MessageHandler mongoDbSinkMessageHandler() {
        return null;
    }

}
