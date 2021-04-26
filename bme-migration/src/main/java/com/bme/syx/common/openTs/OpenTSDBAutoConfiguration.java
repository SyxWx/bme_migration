package com.bme.syx.common.openTs;

import com.bme.cloud.opentsdb.tsdb.OpenTSDBClient;
import com.bme.cloud.opentsdb.tsdb.OpenTSDBClientFactory;
import com.bme.cloud.opentsdb.tsdb.OpenTSDBConfig;
import org.apache.http.nio.reactor.IOReactorException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.util.Assert;

import java.util.Objects;

/**
 * OpenTSDB客户端注册
 *
 * @author yut
 * @date 2021/1/7 17:13
 */
@Configuration
@Import(OpenTSDBConfig.class)
public class OpenTSDBAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = {"openTSDBClient"})
    public OpenTSDBClient openTSDBClient(OpenTSDBConfig config) throws IOReactorException {
        config.setReadonly(false);
        Objects.requireNonNull(config.getHost(), "host required");
        Assert.isTrue(config.getPort() > 0, "port must be greater than 0");
        return OpenTSDBClientFactory.build(config);
    }

}
