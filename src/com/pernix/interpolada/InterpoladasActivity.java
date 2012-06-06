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
        //Cargamos la animaci�n desde el fichero de recursos
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.interpolado );
        //Configuramos la animaci�n, en este caso, para repetici�n infinita y desde el comienzo cada vez
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.RESTART);
        //Establecemos a la vista que animaci�n la va a animar
        view.setAnimation(animation);
        //Damos comienzo a la animaci�n
        view.startAnimation(animation);
	}
	private void rotarCirculo() {
		//Obtenemos una referencia a la vista
        View view = (View)findViewById(R.id.view2);
        //Cargamos la animaci�n desde el fichero de recursos
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.interpolado);
        //Configuramos la animaci�n, en este caso, para repetici�n infinita y desde el comienzo cada vez
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.RESTART);
        //Establecemos a la vista que animaci�n la va a animar
        view.setAnimation(animation);
        //Damos comienzo a la animaci�n
        view.startAnimation(animation);
	}

}