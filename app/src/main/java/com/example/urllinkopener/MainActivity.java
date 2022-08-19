package com.example.urllinkopener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button Amazon,Flipkart,Google,TCS,Wipro,Cysco,Microsoft,TechMahindra,unstop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Amazon=findViewById(R.id.amazon);
        Flipkart=findViewById(R.id.Flipkart);
        Google=findViewById(R.id.Google);
        TCS=findViewById(R.id.TCS);
        Wipro=findViewById(R.id.Wipro);
        Cysco=findViewById(R.id.Cysco);
        Microsoft =findViewById(R.id.Microsoft);
        TechMahindra=findViewById(R.id.Mahindra);
               unstop=findViewById(R.id.Unstop);

               Amazon.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       gotoUrl("https://www.amazon.jobs/en/");
                   }


               });

        Flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.flipkartcareers.com/#!/joblist");
            }


        });
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.google.com/jobs/results/");
            }


        });

        TCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tcs.com/careers?country=IN&lang=EN#");
            }


        });
        Wipro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.wipro.com/careers-home/");
            }


        });
        Cysco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.cisco.com/");
            }


        });
        Microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.microsoft.com/us/en");
            }


        });
        TechMahindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.techmahindra.com/");
            }


        });
        unstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://unstop.com/home");
            }


        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}