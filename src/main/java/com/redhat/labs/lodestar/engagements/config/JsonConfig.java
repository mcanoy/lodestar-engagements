package com.redhat.labs.lodestar.engagements.config;

import javax.inject.Singleton;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;

import io.quarkus.jsonb.JsonbConfigCustomizer;

/**
 * For actions associated with requests and responses
 *
 */
@Singleton
public class JsonConfig implements JsonbConfigCustomizer {

    @Override
    public void customize(JsonbConfig jsonbConfig) {
        jsonbConfig.withFormatting(true).withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES);
    }

}