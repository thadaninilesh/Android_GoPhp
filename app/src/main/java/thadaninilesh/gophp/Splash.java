package thadaninilesh.gophp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import thadaninilesh.gophp.R;


public class Splash extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(2000);

                    Intent openStartingPoint=new Intent("thadaninilesh.gophp.INDEX");
                    startActivity(openStartingPoint);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    finish();

                }
            }
        };
        timer.start();
    }
    protected void onPause(){
        super.onPause();
        finish();
    }
}
