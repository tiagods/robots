package com.tiagods.robots.padrao;

import com.tiagods.robots.config.PropsConfig;
import com.tiagods.robots.config.enums.PropsEnum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class Logon extends Geral{
    protected void abrirSistemaELogar(Robot r) throws AWTException{
        try {
            Path path = Paths.get("\\\\plkserver\\Sistemas\\Phoenix\\PgwF.exe");
            Desktop.getDesktop().open(path.toFile());
            r.delay(20000);

            //MODO TURBO
            r.mouseMove(860,401);
            precionarSoltarMouse(r);

            r.delay(10000);

            PropsConfig logon =  new PropsConfig(PropsEnum.LOGON);
            String usuario = logon.getValue("username");
            String password = logon.getValue("password");

            //USUARIO COM DUPLO CLIQUE
            /*
            r.mouseMove(656,303);
            precionarSoltarMouse(r);
            precionarSoltarMouse(r);
            digitar(r,usuario);
*/
            //SENHA COM DUPLO CLIQUE
            r.mouseMove(657,358);
            precionarSoltarMouse(r);
            precionarSoltarMouse(r);
            digitar(r,password);

            //LOGAR
            r.mouseMove(771,409);
            precionarSoltarMouse(r);

            r.delay(15000);

            //FECHAR PAINEL NOVIDADES
            r.mouseMove(1004,161);
            precionarSoltarMouse(r);

            r.delay(3000);

            //FECHAR LIVECONT
            r.mouseMove(1088,145);
            precionarSoltarMouse(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
