package thadaninilesh.gophp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class features extends ActionBarActivity implements View.OnClickListener{


    TextView next;
    TextView menu;
    TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        menu=(TextView)findViewById(R.id.indexbutton);
        next=(TextView)findViewById(R.id.nextget);
        back=(TextView)findViewById(R.id.backget);
        next.setOnClickListener(this);
        menu.setOnClickListener(this);
        back.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_features, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void gonext(){
        Intent intent=new Intent(this,corephp.class);
        startActivity(intent);

    }
    private void gomenu(){
        Intent intent=new Intent(this,index.class);
        startActivity(intent);
    }
    private void goback(){
        Intent intent=new Intent(this,language.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextget: gonext();
                break;
            case R.id.indexbutton: gomenu();
                break;
            case R.id.backget: goback();
                break;
        }
    }
}
