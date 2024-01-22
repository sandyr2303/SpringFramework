package com.sandeep.learnspringframework;

import com.sandeep.learnspringframework.game.GameRunner;
import com.sandeep.learnspringframework.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		
		var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();

	}

}
