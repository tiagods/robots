package com.tiagods.robots.padrao;

import com.tiagods.robots.config.PropsConfig;
import com.tiagods.robots.config.enums.PropsEnum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public abstract class Geral {
    //chaves do teclado

    private int ev = InputEvent.BUTTON1_DOWN_MASK;
    public void precionarSoltarMouse(Robot r) throws AWTException{
        r.mousePress(ev);
        r.mouseRelease(ev);
    }
    public void digitar(Robot robot,String valor){
        try {
            PropsConfig teclado = new PropsConfig(PropsEnum.KEYCODE);
            for(int i=0;i<valor.length();i++){
                char newValue = valor.charAt(i);
                String key = teclado.getValue(String.valueOf(newValue));
                Integer newKey = Integer.parseInt(key);
                robot.keyPress(newKey);
                robot.delay(100);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(
                    null,
                    "Um valor dentro de "+valor+" foi informado incorretamente:"+e);
            throw new RuntimeException();
        }
    }
}
