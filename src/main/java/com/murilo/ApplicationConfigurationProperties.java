package com.murilo;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.annotation.NonNull;

import javax.validation.constraints.NotNull;

@ConfigurationProperties("application")
public class ApplicationConfigurationProperties implements ApplicationConfiguration {

    protected final Integer DEFAULT_MAX = 10;

    @NotNull
    private Integer max = DEFAULT_MAX;

    @Override
    @NonNull
    public Integer getMax() {
        return max;
    }

    public void setMax(@NonNull Integer max) {
        this.max = max;
    }
}
