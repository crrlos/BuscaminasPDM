package com.example.carlos.buscaminas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    boolean iniciado = false;
    Button iniciar;
    Button resolver;
    TextView aciertos;
    int cuentaAciertos;

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
    List<CheckBox> listaCheckBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listaMinas = new boolean[12];
        iniciar = (Button) findViewById(R.id.button2);
        resolver = (Button) findViewById(R.id.button);
        aciertos = (TextView) findViewById(R.id.textView3);
        cuentaAciertos = 0;
        listaCheckBox = new ArrayList<>();
        inicializarCheckBox();
        agregarCheckBox();
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                agregarMinas();
                Toast.makeText(MainActivity.this, "Juego iniciado", Toast.LENGTH_SHORT).show();


            }
        });

        resolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resolver(0);
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
                  resolver(1);
              }else{
                  ++cuentaAciertos;
                  aciertos.setText(String.valueOf(cuentaAciertos));
              }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox2.setClickable(false);
                if(listaMinas[1]){
                    checkBox2.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox3.setClickable(false);
                if(listaMinas[2]){
                    checkBox3.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox4.setClickable(false);
                if(listaMinas[3]){
                    checkBox4.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox5.setClickable(false);
                if(listaMinas[4]){
                    checkBox4.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox6.setClickable(false);
                if(listaMinas[5]){
                    checkBox6.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox7.setClickable(false);
                if(listaMinas[6]){
                    checkBox6.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox8.setClickable(false);
                if(listaMinas[7]){
                    checkBox8.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox9.setClickable(false);
                if(listaMinas[8]){
                    checkBox9.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox10.setClickable(false);
                if(listaMinas[9]){
                    checkBox10.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox11.setClickable(false);
                if(listaMinas[10]){
                    checkBox11.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });
        checkBox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox12.setClickable(false);
                if(listaMinas[11]){
                    checkBox12.setText("X");
                    resolver(1);
                }else{
                    ++cuentaAciertos;
                    aciertos.setText(String.valueOf(cuentaAciertos));
                }
            }
        });


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        agregarMinas();
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

        if(iniciado)
            for(int i = 0; i< listaCheckBox.size();++i){
                listaMinas[i] = false;
                listaCheckBox.get(i).setChecked(false);
                listaCheckBox.get(i).setClickable(true);


                cuentaAciertos = 0;
                aciertos.setText(String.valueOf(cuentaAciertos));
            }
        else
            iniciado = true;
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
    private void resolver(int n){
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
        if(n == 1){
            Toast.makeText(MainActivity.this, "Perdió el juego", Toast.LENGTH_SHORT).show();
        }
        for(int i = 0;i<listaCheckBox.size();++i){
            listaCheckBox.get(i).setClickable(false);
        }

    }
    private void agregarCheckBox(){
        listaCheckBox.add(checkBox1);
        listaCheckBox.add(checkBox2);
        listaCheckBox.add(checkBox3);
        listaCheckBox.add(checkBox4);
        listaCheckBox.add(checkBox5);
        listaCheckBox.add(checkBox6);
        listaCheckBox.add(checkBox7);
        listaCheckBox.add(checkBox8);
        listaCheckBox.add(checkBox9);
        listaCheckBox.add(checkBox10);
        listaCheckBox.add(checkBox11);
        listaCheckBox.add(checkBox12);
    }


}
