package com.tiagods.robots.config;

import com.tiagods.robots.config.enums.PropsEnum;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropsConfig implements PropsInterface{
    private static Properties props = null;

    public PropsConfig(PropsEnum propsEnum) {
        props = new Properties();
        fileLoad(propsEnum);
    }

    @Override
    public void fileLoad(PropsEnum propsEnum) {
        try {
            InputStream stream = getClass().getResource(propsEnum.getDescricao()).openStream();
            props.load(stream);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Falha ao carregar o arquivo de configurações do Banco de Dados - Atualizador");
        }
    }
    @Override
    public String getValue(String key) {
        return props.getProperty(key);
    }
    @Override
    public Set<String> getKeys(){
        return props.stringPropertyNames();
    }
}
