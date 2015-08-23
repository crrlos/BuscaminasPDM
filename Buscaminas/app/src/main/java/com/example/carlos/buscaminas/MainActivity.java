package com.example.carlos.buscaminas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button iniciar;
    Button resolver;

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;
    CheckBox checkBox10;
    CheckBox checkBox11;
    CheckBox checkBox12;

   boolean[] listaMinas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listaMinas = new boolean[12];
        iniciar = (Button) findViewById(R.id.button2);
        resolver = (Button) findViewById(R.id.button);
        inicializarCheckBox();

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                agregarMinas();


            }
        });

        resolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resolver();
            }
        });

        //evento para controlar la seleccion del checkbox1
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    //se deshabilita la opcion de volver a clickear el checkbox1
                    checkBox1.setClickable(false);

                //evaluar si en esta posición existe mina
              if(listaMinas[0]){
                  checkBox1.setText("X");
              }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox2.setClickable(false);
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox3.setClickable(false);
            }
        });
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox4.setClickable(false);
            }
        });
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox5.setClickable(false);
            }
        });
        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox6.setClickable(false);
            }
        });
        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox7.setClickable(false);
            }
        });
        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox8.setClickable(false);
            }
        });
        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox9.setClickable(false);
            }
        });
        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox10.setClickable(false);
            }
        });
        checkBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox11.setClickable(false);
            }
        });
        checkBox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox12.setClickable(false);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private void inicializarCheckBox(){

        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
    }

    private void agregarMinas(){
        Random random = new Random();
        random.setSeed((long)(random.nextDouble()*100000000));
        int n;

        for(int i = 0; i < 4; ++i){

            n = (int)(random.nextDouble()*12);
           if(!listaMinas[n]){
               listaMinas[n]= true;
           }else{--i;}

        }



        checkBox1.setText("?");
        checkBox2.setText("?");
        checkBox3.setText("?");
        checkBox4.setText("?");
        checkBox5.setText("?");
        checkBox6.setText("?");
        checkBox7.setText("?");
        checkBox8.setText("?");
        checkBox9.setText("?");
        checkBox10.setText("?");
        checkBox11.setText("?");
        checkBox12.setText("?");
    }
    private void resolver(){
        if(listaMinas[0])
            checkBox1.setText("X");
        if(listaMinas[1])
            checkBox2.setText("X");
        if(listaMinas[2])
            checkBox3.setText("X");
        if(listaMinas[3])
            checkBox4.setText("X");
        if(listaMinas[4])
            checkBox5.setText("X");
        if(listaMinas[5])
            checkBox6.setText("X");
        if(listaMinas[6])
            checkBox7.setText("X");
        if(listaMinas[7])
            checkBox8.setText("X");
        if(listaMinas[8])
            checkBox9.setText("X");
        if(listaMinas[9])
            checkBox10.setText("X");
        if(listaMinas[10])
            checkBox11.setText("X");
        if(listaMinas[11])
            checkBox12.setText("X");

    }
}
