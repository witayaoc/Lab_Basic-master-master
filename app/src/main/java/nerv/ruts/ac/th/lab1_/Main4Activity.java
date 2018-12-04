package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    Button button6,button7,image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button6= new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(button6);
            }
        });


        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button7 = new Intent(Main4Activity.this,Main4Activity.class);
                startActivity(button7);
            }
        });

        image1 = (Button) findViewById(R.id.btimg1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img3= new Intent(Main4Activity.this,MainActivity.class);
                        startActivity(img3);
            }
        });

    }

}
