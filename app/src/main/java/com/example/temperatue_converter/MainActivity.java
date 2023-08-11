package com.example.temperatue_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView temps1,temps2,name,name2,res1,res2;
    ImageView drop1,drop2;
    TextView btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnD,btnS,btnA;
    ImageButton btnC;
    String display="";
    final String[] data = new String[1];
    final String[] symbol = new String[1];
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temps1=findViewById(R.id.tempS1);
        temps2=findViewById(R.id.tempS2);
        drop1=findViewById(R.id.drop1);
        drop2=findViewById(R.id.drop2);
        name=findViewById(R.id.name);
        name2=findViewById(R.id.name2);
        res1=findViewById(R.id.res1);
        res2=findViewById(R.id.res2);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnD=findViewById(R.id.btnD);
        btnA=findViewById(R.id.btnA);
        btnS=findViewById(R.id.btnS);
        btnC=findViewById(R.id.btnC);
        temps1.setOnClickListener(this);
        temps2.setOnClickListener(this);
        drop1.setOnClickListener(this);
        drop2.setOnClickListener(this);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(display.length()==0)
                {

                }
                else if(display.length()<16)
                {
                    display+="0";
                    res1.setText(display);
                    result(display);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display+="1";
                res1.setText(display);
                result(display);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display+="2";
                res1.setText(display);
                result(display);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display+="3";
                res1.setText(display);
                result(display);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display+="4";
                res1.setText(display);
                result(display);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                display+="5";
                res1.setText(display);
                result(display);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display+="6";
                res1.setText(display);
                result(display);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                display+="7";
                res1.setText(display);
                result(display);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                display+="8";
                res1.setText(display);
                result(display);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                display+="9";
                res1.setText(display);
                result(display);
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(display.length()>1)
                {
                    display=display.substring(0,display.length()-1);
                    res1.setText(display);
                    result(display);
                }
                else
                {
                    display ="";
                    res1.setText("0");
                    res2.setText("0");
                }
            }
        });
    }
    @Override
    public void onClick (View view)
    {
        alert alert=new alert(this);
        alert.show();
        Window window = alert.getWindow();
        window.setGravity(Gravity.BOTTOM);
        window.setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        TextView C,F,K,Ra,Re;
        C=alert.findViewById(R.id.cel);
        F=alert.findViewById(R.id.fah);
        K=alert.findViewById(R.id.kel);
        Ra=alert.findViewById(R.id.Ran);
        Re=alert.findViewById(R.id.Rea);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                data[0] ="Celsius";
                symbol[0] ="°C";
                alert.dismiss();
                go(view);
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                data[0] ="Fahrenheit";
                symbol[0] ="°F";
                alert.dismiss();
                go(view);
            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2)
            {
                data[0] ="Kelvin";
                symbol[0] ="K";
                alert.dismiss();
                go(view);
            }
        });
        Ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                data[0] ="Rankine";
                symbol[0] ="°R";
                alert.dismiss();
                go(view);
            }
        });
        Re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                data[0] ="Réaumur";
                symbol[0] ="°Re";
                alert.dismiss();
                go(view);
            }
        });

    }
    public void go(View view)
    {
        if(view.getId()==R.id.tempS1)
        {
            temps1.setText(symbol[0]);
            name.setText(data[0]);
        }
        else if(view.getId()==R.id.tempS2)
        {
            temps2.setText(symbol[0]);
            name2.setText(data[0]);
        }
        result(display);
    }
    public void result(String res)
    {
        if(res.length()>=1)
        {
            long data_real;
            String result1,result_real;
            data_real = Long.parseLong(res);
            if(temps1.getText().equals("°C") && temps2.getText().equals("°C"))
            {
                res2.setText(res1.getText());
            }
            else if (temps1.getText().equals("°C") && temps2.getText().equals("°F"))
            {
                result1 = String.format("%.1f",data_real * 1.8000 +32.00);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }
                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°C") && temps2.getText().equals("K"))
            {
                result1 = String.format("%.1f",data_real +273.15);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }
                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°C") && temps2.getText().equals("°R"))
            {
                result1 = String.format("%.1f",data_real*1.8000+491.67);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }
                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°C") && temps2.getText().equals("°Re"))
            {
                result1 = String.format("%.1f",data_real/1.25);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°F") && temps2.getText().equals("°C"))
            {
                result1 = String.format("%.1f",(data_real-32)/1.8000);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°F") && temps2.getText().equals("°F"))
            {
                result_real = String.valueOf(data_real);
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°F") && temps2.getText().equals("K"))
            {
                result1 = String.format("%.1f",(data_real-32)/1.8000+273.15);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°F") && temps2.getText().equals("°R"))
            {
                result1 = String.format("%.1f",data_real+459.67);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°F") && temps2.getText().equals("°Re"))
            {
                result1 = String.format("%.1f",(data_real-32)*0.44444);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("K") && temps2.getText().equals("°C"))
            {
                result1 = String.format("%.1f",data_real-273.15);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }
                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("K") && temps2.getText().equals("°F"))
            {
                result1 = String.format("%.1f",(data_real-273.15)*1.8 + 32);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("K") && temps2.getText().equals("K"))
            {
                result_real = String.valueOf(data_real);
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("K") && temps2.getText().equals("°R"))
            {
                result1 = String.format("%.1f",data_real*1.8000);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("K") && temps2.getText().equals("°Re"))
            {
                result1 = String.format("%.1f",(data_real-273.15)*0.80000);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }
                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°R") && temps2.getText().equals("°C"))
            {
                result1 = String.format("%.1f",(data_real-491.67)/1.8);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°R") && temps2.getText().equals("°F"))
            {
                result1 = String.format("%.1f",data_real-459.67);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°R") && temps2.getText().equals("K"))
            {
                result1 = String.format("%.1f",data_real*0.555);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°R") && temps2.getText().equals("°R"))
            {
                result_real = String.valueOf(data_real);
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°R") && temps2.getText().equals("°Re"))
            {
                result1 = String.format("%.1f",(data_real-491.67)*0.4444);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°Re") && temps2.getText().equals("°C"))
            {
                result1 = String.format("%.1f",data_real*1.25);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }
                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°Re") && temps2.getText().equals("°F"))
            {
                result1 = String.format("%.1f",(data_real*2.2500)+32.00);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°Re") && temps2.getText().equals("K"))
            {
                result1 = String.format("%.1f",(data_real*1.25)+273.15);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°Re") && temps2.getText().equals("°R"))
            {
                result1 = String.format("%.1f",(data_real*2.25)+32+459.67);
                if(result1.contains(".0"))
                {
                    result_real=result1.replace(".0","");
                }

                else
                {
                    result_real=result1;
                }
                res2.setText(result_real);
            }
            else if (temps1.getText().equals("°Re") && temps2.getText().equals("°Re"))
            {
                result_real = String.valueOf(data_real);
                res2.setText(result_real);
            }
        }

    }
}