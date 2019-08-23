package com.tiagods.robots.config;

import com.tiagods.robots.config.enums.PropsEnum;

import java.util.Set;

public interface PropsInterface {
    void fileLoad(PropsEnum propsEnum);

    String getValue(String key);

    Set<String> getKeys();
}
