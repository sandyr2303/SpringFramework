package com.sandeep.learnspringframework;

import com.sandeep.learnspringframework.game.GameRunner;
//import com.sandeep.learnspringframework.game.MarioGame;
import com.sandeep.learnspringframework.game.SuperMario;

public class AppGamingBasic {

	public static void main(String[] args) {
		
//		var marioGame = new MarioGame();
		
		var superMario = new SuperMario();
		
		var gameRunner = new GameRunner(superMario);
		
		gameRunner.run();

	}

}
