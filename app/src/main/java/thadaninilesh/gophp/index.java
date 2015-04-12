package thadaninilesh.gophp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class index extends ActionBarActivity implements AdapterView.OnItemClickListener {

    ListView l;
    String[] index={"1. Getting Started","2. Installation and Configuration","3. Language Reference","4. Features","5. PHP at the Core"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        l=(ListView)findViewById(R.id.indexview); //looks for a listview with id indexview in layout file->activity_index
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,index);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_index, menu);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int ind, long id) {
        String itemClicked = index[ind]; //it will fetch the index value and will compare it using the following if conditions to generate required activities
        if(itemClicked.equals("1. Getting Started")){
            Intent intent = new Intent(this,getstart.class); //will create an intent to generate getstart activity
            startActivity(intent);
        }
        if(itemClicked.equals("2. Installation and Configuration")){
            Intent intent = new Intent(this,install.class);
            startActivity(intent);
        }
        if(itemClicked.equals("3. Language Reference")){
            Intent intent = new Intent(this,language.class);
            startActivity(intent);
        }
        if(itemClicked.equals("4. Features")){
            Intent intent = new Intent(this,features.class);
            startActivity(intent);
        }
        if(itemClicked.equals("5. PHP at the Core")){
            Intent intent = new Intent(this,functions.class);
            startActivity(intent);
        }
    }
}