package com.example.urllinkopener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button Amazon,Flipkart,Google,TCS,Wipro,Cysco,Microsoft,TechMahindra,unstop,Atlassian,Cognizant,Infosys,Walmart,Zuspay,HCL,Saleforce;
  Button Accenture,Oracle,Adobe,Intuit,Deloitte,Hp,Mphasis,MindTree,Birlasoft,Capegemini,LarenTurbo;
  Button Eclerx,WnsGlobal,Syntel,SAPLabs,Trigent,Symantec,Datamatics,ZohoCorporation,SutherLandGlobalService,FisGlobal,Socgen,EY,VMware;
  Button RoltaIndia,Genpact,KPMG,MuSigma,RobertBosch,SonataSoftware,PWC,KPITTech,CoforageLtd,AffleIndia,SarkariResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SarkariResult=findViewById(R.id.SarkariResult);
        RoltaIndia=findViewById(R.id.RoltaIndia);
        Genpact=findViewById(R.id.Genpact);
        KPMG=findViewById(R.id.KPMG);
        MuSigma=findViewById(R.id.MuSigma);
        RobertBosch=findViewById(R.id.RobertBosch);
        SonataSoftware=findViewById(R.id.SonataSoftware);
        PWC=findViewById(R.id.PWC);
        KPITTech=findViewById(R.id.KpitTech);
        CoforageLtd=findViewById(R.id.Coporage);
        AffleIndia=findViewById(R.id.AffleIndia);
        Eclerx=findViewById(R.id.Eclerex);
        WnsGlobal=findViewById(R.id.WnsGlobal);
        Syntel=findViewById(R.id.Syntel);
        SAPLabs=findViewById(R.id.SAPLabs);
        Trigent=findViewById(R.id.Trigent);
        Symantec=findViewById(R.id.Symantec);
        Datamatics=findViewById(R.id.Datamatics);
        ZohoCorporation=findViewById(R.id.ZohoCorporation);
        SutherLandGlobalService=findViewById(R.id.SutherlandGlobalService);
        FisGlobal=findViewById(R.id.FISglobal);
        Socgen=findViewById(R.id.Socgen);
        EY=findViewById(R.id.EY);
        VMware=findViewById(R.id.VMWare);

        LarenTurbo=findViewById(R.id.LarsenTurboInfoTech);

        Amazon=findViewById(R.id.amazon);
        Flipkart=findViewById(R.id.Flipkart);
        Google=findViewById(R.id.Google);
        TCS=findViewById(R.id.TCS);
        Wipro=findViewById(R.id.Wipro);
        Cysco=findViewById(R.id.Cisco);
        Microsoft =findViewById(R.id.Microsoft);
        TechMahindra=findViewById(R.id.Mahindra);
               unstop=findViewById(R.id.Unstop);
               Atlassian=findViewById(R.id.Atlassian);
               Cognizant=findViewById(R.id.Connigzant);
               Infosys=findViewById(R.id.Infosys);
               Walmart=findViewById(R.id.Walmart);
               Zuspay=findViewById(R.id.Zuspay);
               HCL=findViewById(R.id.HCL);
               Saleforce=findViewById(R.id.SaleForce);
               Accenture=findViewById(R.id.Accenture);
               Oracle=findViewById(R.id.Oracle);
               Capegemini=findViewById(R.id.Capegemini);
               Adobe=findViewById(R.id.AdobeSystems);
               Intuit=findViewById(R.id.Intuit);
               Deloitte=findViewById(R.id.Deloitte);
               Hp=findViewById(R.id.HPenterprises);
               Mphasis=findViewById(R.id.Mphasis);
               MindTree=findViewById(R.id.MindTree);
               Birlasoft=findViewById(R.id.BirlaSoft);

        SarkariResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.sarkariresult.com/");
            }


        });

               Amazon.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       gotoUrl("https://www.amazon.jobs/en/");
                   }


               });
// Atlassian
        Atlassian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.atlassian.com/company/careers");
            }


        });
// Cognizant
        Cognizant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.cognizant.com/global/en");
            }


        });
//Infosys
        Infosys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.infosys.com/careers.html");
            }


        });
        // Walmart
        Walmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.infosys.com/careers.html");
            }


        });
// Zuspay
        Zuspay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://juspay.in/careers");
            }


        });
        // HCL
        HCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.hcltech.com/careers");
            }


        });

        // SaleForce
        Saleforce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.salesforce.com/company/careers/");
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
        // Accenture
        Accenture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.accenture.com/in-en/careers");
            }


        });
        // Oracle
        Oracle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.oracle.com/in/corporate/careers/");
            }


        });

        // Capegemini
        Capegemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.capgemini.com/in-en/careers/");
            }


        });

        // Adobe Systems
        Adobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.adobe.com/careers.html");
            }
        });
        //Intuit India
        Intuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.intuit.com/careers/");
            }
        });

        //Deloite
        Deloitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www2.deloitte.com/global/en/careers/job-search.html");
            }
        });

        //Hp enterprises
        Hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.hp.com/");
            }
        });

        //Birlasoft
        Birlasoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.birlasoft.com/careers/current-openings");
            }
        });

        //Larsen and turbo
        Birlasoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.lntinfotech.com/careers/");
            }
        });

        //Eclerex----> link paste
        Eclerx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.eclerx.com/");
            }
        });
//Wns Global
       WnsGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.wnscareers.com/global-location/india");
            }
        });
// Syntel
        Syntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://atos.net/en/careers");
            }
        });
//Sap labs
        SAPLabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.sap.com/india/about/careers.html");
            }
        });
//Trigent
        Trigent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.trigent.com/company/careers/");
            }
        });
// Symantec
        Symantec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instahyre.com/jobs-at-symantec/");
            }
        });

// Datamatics
        Datamatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://careers.datamatics.com/dm_career/client/index.aspx");
            }
        });
// Zoho corporation
        ZohoCorporation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.zohocorp.com/jobs/Careers");
            }
        });

// Sutherland
        SutherLandGlobalService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.sutherlandglobal.com/?lang=en");
            }
        });

// FIS global
        FisGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.fisglobal.com/us/en");
            }
        });
// Socgen
        Socgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.societegenerale.com/en");
            }
        });

// EY
        EY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.ey.com/");
            }
        });
// VMWare
        VMware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.vmware.com/main/");
            }
        });

//RoltaIndia
        RoltaIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://www.rolta.com/rolta-careers/");
            }
        });
// Genpact
        Genpact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.genpact.com/careers");
            }
        });
//KPMG
        KPMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://home.kpmg/xx/en/home/careers/job-search.html");
            }
        });

        MuSigma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mu-sigma.com/careers");
            }
        });

        RobertBosch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.bosch.com/careers/");
            }
        });
        SonataSoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.sonatawatches.in/content/careers");
            }
        });

        PWC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.pwc.com/gx/en/careers.html");
            }
        });
        KPITTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.kpit.com/careers/");
            }
        });

        CoforageLtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.coforge.com/careers");
            }
        });
        AffleIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://affle.com/career ");
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