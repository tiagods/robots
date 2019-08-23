package com.tiagods.robots.g5;

import com.tiagods.robots.padrao.Logon;

import java.awt.*;
import java.awt.event.KeyEvent;

public abstract class AcoesG5 extends Logon {
    protected void abrirCadastroEmpresasG5(Robot r) throws AWTException{
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_C);
        r.keyPress(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_C);
    }
}
