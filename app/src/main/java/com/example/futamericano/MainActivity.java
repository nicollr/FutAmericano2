package com.example.futamericano;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  //boolean turno=true;
  int a1=2,a2=1;
  int b=1;
  int counter=0,counter2=0,downs=1,yfalt=10;
  TextView showvalor1,showvalor2,showvaloresop,showvaloresyfaltantes;
  Button touchdown,touchdown2,fieldgoal,safety,down,swit,reset,maxyardas,minyardas;

  public void Switch()
  {
    down.setEnabled(true);
    maxyardas.setEnabled(true);
    minyardas.setEnabled(true);
    if (a1==2)
    {
      downs=1;
      showvaloresop.setText(Integer.toString(downs));
      yfalt=10;
      showvaloresyfaltantes.setText(Integer.toString(yfalt));
      b=1;
      a2=2;
      a1=1;
      showvalor2.setTextColor(Color.RED);
      showvalor1.setTextColor(Color.BLUE);
    }
    else
    {
      if (a1==1)
      {
        downs=1;
        showvaloresop.setText(Integer.toString(downs));
        yfalt=10;
        showvaloresyfaltantes.setText(Integer.toString(yfalt));
        b=1;
        a2=1;
        a1=2;
        showvalor1.setTextColor(Color.RED);
        showvalor2.setTextColor(Color.BLUE);
      }
    }

  }
  public void reset()
  {
    //turno=true;
    a2=1;
    b=1;
    a1=2;
    downs=1;
    showvaloresop.setText(Integer.toString(downs));
    yfalt=10;
    showvaloresyfaltantes.setText(Integer.toString(yfalt));
    counter=0;
    showvalor1.setText(Integer.toString(counter));
    counter2=0;
    showvalor2.setText(Integer.toString(counter2));
    showvalor1.setTextColor(Color.RED);
    showvalor2.setTextColor(Color.BLUE);
    down.setEnabled(true);
    maxyardas.setEnabled(true);
    minyardas.setEnabled(true);
  }


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    showvalor1=(TextView)findViewById(R.id.PuntosHome);
    showvalor2=(TextView)findViewById(R.id.PuntosGuest);
    showvaloresop=(TextView)findViewById(R.id.Turno);
    showvaloresyfaltantes=(TextView)findViewById(R.id.Yardas);
    touchdown=findViewById(R.id.Touchdown);
    touchdown2=findViewById(R.id.Touchdown2);
    fieldgoal=findViewById(R.id.FieldGoal);
    safety=findViewById(R.id.Safery);
    reset=findViewById(R.id.Reset);
    down=findViewById(R.id.Down);
    swit=findViewById(R.id.Switch);
    maxyardas=findViewById(R.id.MaxYardas);
    minyardas=findViewById(R.id.MinYardas);

    yfalt=10;
    downs=1;


    touchdown.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {
        if (a2==1)
        {
          if (b==1)
          {
            counter=counter+6;
            b=2;
            showvalor1.setText(Integer.toString(counter));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            down.setEnabled(false);
            maxyardas.setEnabled(false);
            minyardas.setEnabled(false);
          }
          else
          {
            counter=counter+2;
            showvalor1.setText(Integer.toString(counter));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            a1=2;
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }
        }
        else
        {
          if (b==1)
          {
            counter2=counter2+6;
            b=2;
            showvalor2.setText(Integer.toString(counter2));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            down.setEnabled(false);
            maxyardas.setEnabled(false);
            minyardas.setEnabled(false);
          }
          else
          {
            counter2=counter2+2;
            a1=1;
            showvalor2.setText(Integer.toString(counter2));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }


        }
      }
    });
    fieldgoal.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {
        if (a1==1)
        {
          if (b==1)
          {

            counter=counter+3;
            b=2;
            showvalor1.setText(Integer.toString(counter));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }
          else
          {
            counter=counter+1;

            showvalor1.setText(Integer.toString(counter));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            a1=2;
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }
        }
        else
        {
          if (b==1)
          {
            counter2=counter2+3;
            b=2;
            showvalor2.setText(Integer.toString(counter2));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }
          else
          {
            counter2=counter2+1;
            a1=1;
            showvalor2.setText(Integer.toString(counter2));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }


        }
      }
    });
    safety.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {
        if (a2==1)
        {
          if (b==1)
          {
            counter=counter+2;
            b=2;
            showvalor1.setText(Integer.toString(counter));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }
          else
          {
            counter=counter+2;
            showvalor1.setText(Integer.toString(counter));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            a1=2;
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }
        }
        else
        {
          if (b==1)
          {
            counter2=counter2+2;
            b=2;
            showvalor2.setText(Integer.toString(counter2));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }
          else
          {
            counter2=counter2+2;
            a1=1;
            showvalor2.setText(Integer.toString(counter2));
            downs=1;
            showvaloresop.setText(Integer.toString(downs));
            yfalt=10;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
            Switch();
            down.setEnabled(true);
            maxyardas.setEnabled(true);
            minyardas.setEnabled(true);
          }


        }
      }
    });
    down.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {
        if (downs>3)
        {
          Switch();
          downs=1;
          showvaloresop.setText(Integer.toString(downs));
          yfalt=10;
          showvaloresyfaltantes.setText(Integer.toString(yfalt));
        }
        else
        {
          downs++;
          showvaloresop.setText(Integer.toString(downs));

        }
      }
    });
    reset.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {
        reset();
      }
    });
    swit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {
        Switch();
      }
    });
    maxyardas.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {


        if (downs>3)
        {
          Switch();
          downs=1;
          showvaloresop.setText(Integer.toString(downs));
          yfalt=10;
          showvaloresyfaltantes.setText(Integer.toString(yfalt));

        }
        else
        {
          if (yfalt==100)
          {
            yfalt=100;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
          }
          else
          {
            yfalt++;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
          }

        }
      }
    });
    minyardas.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v)
      {

        if (downs>3)
        {
          Switch();
          downs=1;
          showvaloresop.setText(Integer.toString(downs));
          yfalt=10;
          showvaloresyfaltantes.setText(Integer.toString(yfalt));
        }
        else
        {
          if (yfalt==1)
          {
            yfalt=1;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
          }
          else
          {
            yfalt--;
            showvaloresyfaltantes.setText(Integer.toString(yfalt));
          }

        }
      }
    });
  }
}