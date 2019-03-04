package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.MintaScreen;

public class RoidRage extends Game{
	
	@Override
	public void create () {
            setScreen(new MintaScreen(this));  
	}
 
	@Override
	public void render () {
            super.render();
	}
	
	@Override
	public void dispose () {
                
	}
        @Override
        public void resize(int width, int height){
            
        }

    
}
