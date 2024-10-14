package io.bann.abk.preprocessor;

import com.typesafe.config.Config;

import java.util.function.Consumer;

public interface AbstractPreprocessor {

    void configure(Config config, Consumer<String> handler);

    void start();

    void end();

}
