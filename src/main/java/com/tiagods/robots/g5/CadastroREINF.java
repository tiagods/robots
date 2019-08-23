package com.tiagods.robots.g5;

import com.tiagods.robots.config.PropsConfig;
import com.tiagods.robots.config.enums.PropsEnum;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class CadastroREINF extends AcoesG5{
    private int ev = InputEvent.BUTTON1_DOWN_MASK;

    public static void main(String[] args) {
        new CadastroREINF();
    }
    public CadastroREINF(){
        try {
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();
            System.out.println(x + "," + y);

            Robot robot = new Robot();

            //abrirSistemaELogar(robot);
            //abrirCadastroEmpresasG5(robot);
            PropsConfig config = new PropsConfig(PropsEnum.CLIENTES);
            Set<String> enumeration = config.getKeys();
            List<Integer> list = new ArrayList<>();
            for(String s : enumeration) {
                list.add(Integer.parseInt(s));
            }
            Collections.sort(list);
            for(int s : list) {
                String value = String.valueOf(s);
                String newValue = value.length()==4?value:
                (value.length()==3?"0"+value:
                        (value.length()==2?"00"+value:"000"+value)
                );
                System.out.println(newValue);
                processar(robot, newValue);

            }
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void processar(Robot robot,String valor) throws AWTException{
        robot.delay(3000);
        //BOTAO ACHA
        robot.mouseMove(669,82);
        precionarSoltarMouse(robot);

        robot.delay(2000);

        digitar(robot,valor);

        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.delay(1000);

        //ABA FISCAL0423
        robot.mouseMove(397,314);
        precionarSoltarMouse(robot);
        //ALTERAR
        robot.mouseMove(498,86);
        precionarSoltarMouse(robot);

        robot.delay(2000);

        //CLASSIFICACAO TRIBUTARIA EFD REINF
        robot.mouseMove(582,527);
        precionarSoltarMouse(robot);

        robot.delay(2000);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Continuar?");
        alert.setContentText("Tem apenas uma linha cadastrada!");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get()==ButtonType.CANCEL){
            robot.delay(2000);

            //SELECIONAR LINHA 2
            robot.mouseMove(454,389);
            precionarSoltarMouse(robot);

            robot.delay(500);

            //SELECIONAR EXCLUIR
            robot.mouseMove(1025,393);
            precionarSoltarMouse(robot);

            robot.delay(1000);

            //CONFIRMAR EXCLUIR
            robot.mouseMove(634,416);
            precionarSoltarMouse(robot);

            //SELECIONAR LINHA 1
            robot.mouseMove(522,374);
            precionarSoltarMouse(robot);

            //CADASTRAR NOVA DATA
            robot.mouseMove(304,326);
            precionarSoltarMouse(robot);

            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
        }
        else {
            robot.delay(2000);
            //SELECIONAR LINHA 1
            robot.mouseMove(522, 374);
            precionarSoltarMouse(robot);

            //CADASTRAR NOVA DATA
            robot.mouseMove(306, 330);
            precionarSoltarMouse(robot);
            precionarSoltarMouse(robot);

            robot.keyPress(KeyEvent.VK_DELETE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
        }

        robot.delay(500);

        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_9);

        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(200);

        robot.keyPress(KeyEvent.VK_9);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_9);
        robot.delay(200);

        //ok
        robot.mouseMove(1014,331);
        precionarSoltarMouse(robot);

        //sair
        robot.mouseMove(1018,425);
        precionarSoltarMouse(robot);

        robot.delay(2000);

        //cprb
        robot.mouseMove(580,560);
        precionarSoltarMouse(robot);

        robot.delay(2000);

        //SELECIONAR LINHA
        robot.mouseMove(610,372);
        precionarSoltarMouse(robot);

        robot.delay(2000);

        //SELECIONAR LINHA
        robot.mouseMove(502,323);
        precionarSoltarMouse(robot);
        precionarSoltarMouse(robot);

        robot.keyPress(KeyEvent.VK_DELETE);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);

        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_1);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_2);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_1);
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_9);
        robot.delay(200);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.delay(200);
        robot.keyPress(KeyEvent.VK_0);
        robot.delay(200);

        //OK
        robot.mouseMove(824,353);
        precionarSoltarMouse(robot);
        robot.delay(200);

        //SAIR
        robot.mouseMove(828,450);
        precionarSoltarMouse(robot);

        //GRAVAR
        robot.mouseMove(869,687);
        precionarSoltarMouse(robot);

        robot.delay(5000);

        //CONFIRMAR
        robot.mouseMove(625,449);
        precionarSoltarMouse(robot);

        robot.delay(10000);
    }
}
