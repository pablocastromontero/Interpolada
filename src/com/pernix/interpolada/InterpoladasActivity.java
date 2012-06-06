package com.pernix.interpolada;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class InterpoladasActivity extends Activity {
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        rotarCuadrado();
        rotarCirculo();
    }

	private void rotarCuadrado() {
		//Obtenemos una referencia a la vista
        View view = (View)findViewById(R.id.view1);
        //Cargamos la animación desde el fichero de recursos
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.interpolado );
        //Configuramos la animación, en este caso, para repetición infinita y desde el comienzo cada vez
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.RESTART);
        //Establecemos a la vista que animación la va a animar
        view.setAnimation(animation);
        //Damos comienzo a la animación
        view.startAnimation(animation);
	}
	private void rotarCirculo() {
		//Obtenemos una referencia a la vista
        View view = (View)findViewById(R.id.view2);
        //Cargamos la animación desde el fichero de recursos
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.interpolado);
        //Configuramos la animación, en este caso, para repetición infinita y desde el comienzo cada vez
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.RESTART);
        //Establecemos a la vista que animación la va a animar
        view.setAnimation(animation);
        //Damos comienzo a la animación
        view.startAnimation(animation);
	}

}