package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
Button button2,button3,image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button2 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(button2);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button3 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(button3);
            }
        });
        image1=(Button) findViewById(R.id.btimg1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img1= new Intent(Main2Activity.this,MainActivity.class);
                finish();
            }
        });
    }
}
