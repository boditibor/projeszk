package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;


public class MintaScreen implements Screen, InputProcessor {
    private Stage s;
    private Game g;
    Texture img;
        
    int x=0,y=0;
    boolean left=false, right=false, up=false, down=false;
    
    public MintaScreen(Game G){
        g=G;
        s=new Stage(new ScreenViewport());
	img = new Texture("badlogic.jpg");
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(float f) {
        if(right && (x<(Gdx.graphics.getWidth()-img.getWidth()))) x++;
        if(left && (x>0)) x--;
        if(up && y<Gdx.graphics.getHeight()-img.getHeight()) y++;
        if(down && y>0) y--;
	Gdx.gl.glClearColor(1, 0, 0, 1);
	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	s.getBatch().begin();
	s.getBatch().draw(img, x, y);
                
	s.getBatch().end();
    }

    @Override
    public void resize(int i, int i1) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
        s.dispose();
	img.dispose();
    }
    
    @Override
    public boolean keyDown(int i) {
        switch(i){
            case Input.Keys.A:
                left=true;
                break;
            case Input.Keys.D:
                right=true;
                break;
            case Input.Keys.W:
                up=true;
                break;
            case Input.Keys.S:
                down=true;
                break;
        }
        return true;
    }

    @Override
    public boolean keyUp(int i) {
        switch(i){
            case Input.Keys.A:
                left=false;
                break;
            case Input.Keys.D:
                right=false;
                break;
            case Input.Keys.W:
                up=false;
                break;
            case Input.Keys.S:
                down=false;
                break;
        }
        return true;
    }

    @Override
    public boolean keyTyped(char c) {return false;}

    @Override
    public boolean touchDown(int i, int i1, int i2, int i3) {return false;}

    @Override
    public boolean touchUp(int i, int i1, int i2, int i3) {return false; }

    @Override
    public boolean touchDragged(int i, int i1, int i2) {return false;}

    @Override
    public boolean mouseMoved(int i, int i1) {return false;}

    @Override
    public boolean scrolled(int i) {return false;}
}
