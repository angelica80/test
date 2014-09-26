package com.example.pink.assigmentlabapplication;

        import android.app.Activity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.LinearLayout;


public class ColorActivity extends Activity implements View.OnClickListener {

    LinearLayout myLayout;
    // skapar knapparna
    Button btnYellow;
    Button btnCyan;
    Button btnGray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        myLayout = (LinearLayout)findViewById(R.id.myLayout);

        // Hämtar knappar sätt onClick
        btnYellow = (Button)findViewById(R.id.btnYellow);
        btnYellow.setOnClickListener(this);

        btnCyan = (Button)findViewById(R.id.btnCyan);
        btnCyan.setOnClickListener(this);

        btnGray = (Button)findViewById(R.id.btnGray);
        btnGray.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.color, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        if(view.getId() == R.id.btnYellow){
            myLayout.setBackgroundColor(Color.YELLOW);

        }
        else if(view.getId() == R.id.btnGray){

            myLayout.setBackgroundColor(Color.GRAY);
        }
        else if(view.getId() == R.id.btnCyan){
            myLayout.setBackgroundColor(Color.CYAN);

        }

    }
}