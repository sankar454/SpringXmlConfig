package com.experiments.springxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experiments.springxmlconfig.games.Cricket;
import com.experiments.springxmlconfig.games.Game;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
    	Game game = (Game)context.getBean("cricket",Cricket.class);
    	System.out.println(game.getName());
    	System.out.println(game.getRule().getRule());
    }
}
