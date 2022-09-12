package com.company.urllinkopener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.urllinkopener.R;

public class MainActivity extends AppCompatActivity {
    Button Amazon, Flipkart, Google, TCS, Wipro, Cysco, Microsoft,qualcomm,quora,nokia,nagarro,intel,isro,ibm,hotstar,goldmansachs,drdo,dell,disney,dream,
            nika,nvidia,ncrcorporation,landrover,lenskart,leapfinance,licious,linkdin,jaguar,jio,jpmorgan,jupiternetwork,jupitermoney,jumbotail,
            ola,obvious,olx,oyo,observeai,opentext,optum,optym,Ocroius,TechMahindra, unstop, Atlassian, Cognizant, Infosys, Walmart, Zuspay, HCL, Saleforce;
    Button Accenture, Oracle, Adobe, Intuit, Deloitte, Hp, Mphasis, MindTree, Birlasoft, Capegemini, LarenTurbo,twitter,samsung,swiggy,shopify;
    Button Eclerx, WnsGlobal, Syntel, SAPLabs, Trigent, Symantec, Datamatics, ZohoCorporation, SutherLandGlobalService, FisGlobal, Socgen, EY, VMware;
    Button RoltaIndia, Genpact, KPMG, MuSigma, RobertBosch, SonataSoftware, PWC, KPITTech, CoforageLtd, AffleIndia, SarkariResult,
           fischjordan, xiaomi,xicomtechnologies,valuefy,viasat,vicara,vogo,Visa,uber,ubisoft,udaan,unacademy,unicommerce,unisys,upgrad,upstox,urbanCompany;
    Button hackerank,hackerEarth,codechef,codeforces,leetcode,gfg,zs,zoomCar,zomato,ZivaMe,byjus,bharatpe,bmssoftware,
            Zeta,tesla,Zerodha,yahoo,yellowai,yugabyte,yulubykes,apple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Coding platforms
        hackerank=findViewById(R.id.HackerRank);
        hackerEarth=findViewById(R.id.hackerEarth);
        codechef=findViewById(R.id.Codechef);
        codeforces=findViewById(R.id.Codeforces);
        leetcode=findViewById(R.id.LeetCode);
        gfg=findViewById(R.id.Gfg);

         // Company with name A
        apple=findViewById(R.id.apple);
        AffleIndia = findViewById(R.id.AffleIndia);
        Amazon = findViewById(R.id.amazon);
        Atlassian = findViewById(R.id.Atlassian);
        Adobe = findViewById(R.id.AdobeSystems);
        Accenture=findViewById(R.id.Accenture);

          // Company with name B ...
           Birlasoft=findViewById(R.id.BirlaSoft);
           bharatpe=findViewById(R.id.bharatpe);
           byjus=findViewById(R.id.Byjus);
           bmssoftware=findViewById(R.id.bmssoftware);


           //Company with name C
               CoforageLtd=findViewById(R.id.Coporage);
              Cysco=findViewById(R.id.Cisco);
              Capegemini=findViewById(R.id.Capegemini);
              Cognizant=findViewById(R.id.Connigzant);


              //Company with name D
                       Deloitte=findViewById(R.id.Deloitte);
                       Datamatics=findViewById(R.id.Datamatics);
                       drdo=findViewById(R.id.Drdo);
                       dream=findViewById(R.id.Dream);
                       dell=findViewById(R.id.Dell);
                       disney=findViewById(R.id.Disney);


                // Company with name E

                 Eclerx=findViewById(R.id.Eclerex);
               EY=findViewById(R.id.EY);

               // Company with name F..
        fischjordan=findViewById(R.id.FischerJordan);
                 FisGlobal=findViewById(R.id.FISglobal);
                 Flipkart=findViewById(R.id.Flipkart);


                 // Company with name G
               Genpact=findViewById(R.id.Genpact);
               Google=findViewById(R.id.Google);
               goldmansachs=findViewById(R.id.Goldmain);

               // Company with name H
        hotstar=findViewById(R.id.Hotstar);
                       HCL=findViewById(R.id.HCL);
                       Hp=findViewById(R.id.HPenterprises);

               // Company with name I
                       Intuit=findViewById(R.id.Intuit);
                       Infosys=findViewById(R.id.Infosys);
                       intel=findViewById(R.id.intel);
                       isro=findViewById(R.id.isro);
                       ibm=findViewById(R.id.ibm);

               // Company with name J

        jaguar=findViewById(R.id.jaguar);
        jio=findViewById(R.id.jio);
        jpmorgan=findViewById(R.id.jpmorgan);
        jupiternetwork=findViewById(R.id.junipernetworks);
        jupitermoney=findViewById(R.id.jupitermoney);
        jumbotail=findViewById(R.id.jumbotail);




        //  Company with name K
                KPMG=findViewById(R.id.KPMG);


                // Company with name L

                LarenTurbo=findViewById(R.id.LarsenTurboInfoTech);
                landrover=findViewById(R.id.landrover);
                lenskart=findViewById(R.id.Lenskart);
                leapfinance=findViewById(R.id.leapFinance);
                licious=findViewById(R.id.Licious);
                linkdin=findViewById(R.id.linkdin);


                // Company with name M

                MuSigma=findViewById(R.id.MuSigma);
                Microsoft =findViewById(R.id.Microsoft);
               TechMahindra=findViewById(R.id.Mahindra);
               Mphasis=findViewById(R.id.Mphasis);
               MindTree=findViewById(R.id.MindTree);


               // Company with name N

        nagarro=findViewById(R.id.Nagarro);
        nika=findViewById(R.id.nika);
        nvidia=findViewById(R.id.nvidia);
        nokia=findViewById(R.id.nokia);
        ncrcorporation=findViewById(R.id.ncrCorporation);


              // Company with name O
                       Oracle=findViewById(R.id.Oracle);
                       obvious=findViewById(R.id.Obvious);
                       Ocroius=findViewById(R.id.ocroius);
                       ola=findViewById(R.id.ola);
                       olx=findViewById(R.id.olx);
                       oyo=findViewById(R.id.Oyo);
                       observeai=findViewById(R.id.observeai);
                       opentext=findViewById(R.id.openText);
                       optum=findViewById(R.id.optum);
                       optym=findViewById(R.id.Optym);

        //Company with name P
        PWC=findViewById(R.id.PWC);

        // Company with name Q
           qualcomm=findViewById(R.id.Qualcomm);
           quora=findViewById(R.id.Quora);

        // Company with name R
                RoltaIndia=findViewById(R.id.RoltaIndia);
                RobertBosch=findViewById(R.id.RobertBosch);
//
//        // Company with name S
               Syntel=findViewById(R.id.Syntel);
              SAPLabs=findViewById(R.id.SapLabs);
              SonataSoftware=findViewById(R.id.SonataSoftware);
              Socgen=findViewById(R.id.Socgen);
              Saleforce=findViewById(R.id.saleForces);
              samsung=findViewById(R.id.Samsung);
              swiggy=findViewById(R.id.swiggy);
              shopify=findViewById(R.id.Shopify);
              SutherLandGlobalService=findViewById(R.id.SutherLand);


        // Company with name T
             Trigent=findViewById(R.id.Trigent);
            TCS=findViewById(R.id.TCS);
            twitter=findViewById(R.id.twitter);
            tesla=findViewById(R.id.tesla);


        // Company with name U

        uber=findViewById(R.id.Uber);
        ubisoft=findViewById(R.id.Ubisoft);
        udaan=findViewById(R.id.Udaan);
        unacademy=findViewById(R.id.unacademy);
        unicommerce=findViewById(R.id.UniCommerce);
        unisys=findViewById(R.id.unisys);
        upgrad=findViewById(R.id.upgrad);
        upstox=findViewById(R.id.upstox);
        urbanCompany=findViewById(R.id.urbanCompany);


        // Company with name V
               VMware=findViewById(R.id.VMWare);
               valuefy=findViewById(R.id.Valuefy);
               viasat=findViewById(R.id.Viasat);
               vicara=findViewById(R.id.Vicara);
               Visa=findViewById(R.id.Visa);
               vogo=findViewById(R.id.vogo);



        // Company with name W

                Wipro=findViewById(R.id.Wipro);
              Walmart=findViewById(R.id.Walmart);
              WnsGlobal=findViewById(R.id.WnsGlobal);

              //Company with name X
        xiaomi=findViewById(R.id.xiaomi);
        xicomtechnologies=findViewById(R.id.xicomtechnologies);

              //Comapany with name Y
        yahoo = findViewById(R.id.yahoo);
        yellowai=findViewById(R.id.yellowai);
        yugabyte=findViewById(R.id.yugabyte);
        yulubykes=findViewById(R.id.YuluBikes);



        // Company with name Z

               Zuspay=findViewById(R.id.Zuspay);
               ZohoCorporation=findViewById(R.id.ZohoCorporation);
               zs=findViewById(R.id.zs);
               zoomCar=findViewById(R.id.zoomCar);
               zomato=findViewById(R.id.Zomato);
               ZivaMe=findViewById(R.id.zivaMe);
               Zeta=findViewById(R.id.Zeta);
//               Zerodha=findViewById(R.id.Zerodha);


       SarkariResult=findViewById(R.id.SarkariResult);
      unstop=findViewById(R.id.unstop);






//     //   KPITTech=findViewById(R.id.KpitTech);




//       // Symantec=findViewById(R.id.Symantec);








//






//               unstop=findViewById(R.id.Unstop);















        // ************************************************************************

        SarkariResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.sarkariresult.com/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));

            }


        });
        unstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://unstop.com/home");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));

            }


        });

        // *************************************************************************************

        //************************************************Coding Platforms *************************************************

        hackerank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.hackerrank.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        hackerEarth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.hackerearth.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        codechef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.codechef.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        codeforces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://codeforces.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        leetcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://leetcode.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        gfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.geeksforgeeks.org/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        // Company with name A **************************************************************************

               Amazon.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       gotoUrl("https://www.amazon.jobs/en/");
                   }

                   private void gotoUrl(String s) {
                       Uri uri = Uri.parse(s);
                       startActivity(new Intent(Intent.ACTION_VIEW, uri));
                   }


               });


// Atlassian
        Atlassian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.atlassian.com/company/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

        AffleIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://affle.com/career ");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


       // Adobe Systems

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.apple.com/careers/in/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        // Accenture
        Accenture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.accenture.com/in-en/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
            });
        Adobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.adobe.com/careers.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });



        // Company with name B  **************************************************************************

        //Birlasoft
        Birlasoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.birlasoft.com/careers/current-openings");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        bharatpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://bharatpe.com/career");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        bmssoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.bmc.com/careers/careers.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        byjus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://byjus.com/careers-at-byjus/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        // Company with name C ******************************************************************************

// Cognizant
        Cognizant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.cognizant.com/global/en");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

                Cysco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.cisco.com/");
            }

                    private void gotoUrl(String s) {
                        Uri uri = Uri.parse(s);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }


                });

                // Capegemini
        Capegemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.capgemini.com/in-en/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });


        CoforageLtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.coforge.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        // Company with name D ********************************************************************

                //Deloite
        Deloitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www2.deloitte.com/global/en/careers/job-search.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        // Datamatics
        Datamatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://careers.datamatics.com/dm_career/client/index.aspx");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        dream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.dreamsports.group/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        disney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.disneycareers.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        dell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.dell.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        drdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.drdo.gov.in/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        // Company with name E *****************************************************************

        // EY
        EY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.ey.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

                //Eclerex----> link paste
        Eclerx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.eclerx.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

   // Company with name F **********************************************************************

                Flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.flipkartcareers.com/#!/joblist");
            }

                    private void gotoUrl(String s) {
                        Uri uri = Uri.parse(s);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }


                });

        // FIS global
        FisGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.fisglobal.com/us/en");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        fischjordan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://fischerjordan.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        // Company with name G *******************************************************

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.google.com/jobs/results/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

        // Genpact
        Genpact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.genpact.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        goldmansachs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.goldmansachs.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        // Company with name H *****************************************************

                //Hp enterprises
        Hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.hp.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

                // HCL
        HCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.hcltech.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        hotstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.hotstar.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });


        // Company with name  I ******************************************************************


//Infosys
        Infosys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.infosys.com/careers.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

        intel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.intel.com/content/www/us/en/jobs/jobs-at-intel.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

        isro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.isro.gov.in/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

        ibm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.ibm.com/employment/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

                //Intuit India
        Intuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.intuit.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

       // Company with name J ****************************************************************************

        jaguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.jaguarlandrovercareers.com/content/Find-a-job/?locale=en_GB");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        jio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.jio.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        jpmorgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.jpmorgan.com/IN/en/home");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        jupiternetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.juniper.net/#/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        jumbotail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jumbotail.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        jupitermoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.lever.co/jupiter");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });




        // Company with name K **********************************************************************************

//KPMG
        KPMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://home.kpmg/xx/en/home/careers/job-search.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });



// Company with name L********************************************************

   LarenTurbo.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           gotoUrl("https://home.kpmg/xx/en/home/careers/job-search.html");
       }

       private void gotoUrl(String s) {
           Uri uri = Uri.parse(s);
           startActivity(new Intent(Intent.ACTION_VIEW, uri));
       }
   });

        landrover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.jaguarlandrovercareers.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        lenskart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://hiring.lenskart.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        leapfinance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://leapfinance.freshteam.com/jobs");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        licious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.naukri.com/licious-jobs-careers-3095462");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        linkdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.linkedin.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

   // Company with name M


                Microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.microsoft.com/us/en");
            }

                    private void gotoUrl(String s) {
                        Uri uri = Uri.parse(s);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }


                });

                MuSigma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mu-sigma.com/careers");
            }

                    private void gotoUrl(String s) {
                        Uri uri = Uri.parse(s);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }
                });

                Mphasis.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gotoUrl("https://careers.mphasis.com/home.html");

                    }

                    private void gotoUrl(String s) {
                        Uri uri = Uri.parse(s);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }
                });

                MindTree.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gotoUrl("https://www.mindtree.com/careers");

                    }

                    private void gotoUrl(String s) {
                        Uri uri = Uri.parse(s);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }
                });

                TechMahindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.techmahindra.com/");
            }

                    private void gotoUrl(String s) {
                        Uri uri = Uri.parse(s);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }


                });


        // Company with name N


        nagarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.nagarro.com/en/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

        nika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.nikasolutions.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        nvidia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.nvidia.com/en-in/about-nvidia/careers/");

            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        nokia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.nokia.com/about-us/careers/");

            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        ncrcorporation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.ncr.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

                // Company with name O **********************************************

        // Oracle
        obvious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.obvious.in/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        Ocroius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://boards.greenhouse.io/ocrolusinc");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://ola.skillate.com/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        olx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.olxgroup.com/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        Oracle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.oracle.com/in/corporate/careers/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        oyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://oyorooms.careersitemanager.com/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        optym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://optym.com/careers/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        optum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.optum.in/about/careers.html");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        opentext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.opentext.com/");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        observeai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.observe.ai/careers ");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });

        // Company with name p

        PWC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.pwc.com/gx/en/careers.html");
            }

            private void gotoUrl(String s) {

                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });



        //Company with Q*************************************************************************
        qualcomm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.qualcomm.com/company/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });



        quora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.quora.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        // Company with name R ************************************************************

//RoltaIndia
        RoltaIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://www.rolta.com/rolta-careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });



        RobertBosch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.bosch.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

      //   Company with name S

        Saleforce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.salesforce.com/company/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
               startActivity(new Intent(Intent.ACTION_VIEW, uri));

            }
        });

        // SaleForce
//        Saleforce.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.salesforce.com/company/careers/");
//            }
//
//            private void gotoUrl(String s) {
//                Uri uri = Uri.parse(s);
//                startActivity(new Intent(Intent.ACTION_VIEW, uri));
//            }
////
//
//        });
//
//        // Syntel
        Syntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://atos.net/en/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        shopify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.shopify.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        swiggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.swiggy.com/#/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        shopify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.shopify.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

////Sap labs
        SAPLabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.sap.com/india/about/careers.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        SutherLandGlobalService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.sutherlandglobal.com/?lang=en");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.samsung.com/in/about-us/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

////        // Sutherland
//        SutherLandGlobalService.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://jobs.sutherlandglobal.com/?lang=en");
//            }
//
//            private void gotoUrl(String s) {
//                Uri uri = Uri.parse(s);
//                startActivity(new Intent(Intent.ACTION_VIEW, uri));
//            }
//        });
//        samsung.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.samsung.com/in/about-us/careers/");
//            }
//
//            private void gotoUrl(String s) {
//                Uri uri = Uri.parse(s);
//                startActivity(new Intent(Intent.ACTION_VIEW, uri));
//            }
//        });
////
//

//        SutherLandGlobalService.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://jobs.sutherlandglobal.com/?lang=en");
//            }
//
//            private void gotoUrl(String s) {
//                Uri uri = Uri.parse(s);
//               startActivity(new Intent(Intent.ACTION_VIEW, uri));
//            }
//        });
//// Socgen
        Socgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.societegenerale.com/en");
            }


            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        SonataSoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.sonatawatches.in/content/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });



        // Company with name T


        TCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tcs.com/careers?country=IN&lang=EN#");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        tesla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tesla.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.twitter.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });
        //Trigent
        Trigent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.trigent.com/company/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        //Company with name U *****************************


        urbanCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.urbancompany.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        upstox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://upstox.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        upgrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.upgrad.com/us/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        unisys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.unisys.com/us/en");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        unicommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://unicommerce.com/life-at-unicommerce/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        unacademy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://unacademy.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        ubisoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.ubisoft.com/en-us/company/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.uber.com/in/en/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        udaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.udaan.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        // Company with name V

        // VMWare
        VMware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.vmware.com/main/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        vogo .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://vogo.in/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        valuefy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://valuefy-solutions.breezy.hr/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        vicara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://vicara.ch/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        viasat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.viasat.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        Visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://usa.visa.com/careers.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        // Company with name W



        // Walmart
        Walmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.infosys.com/careers.html");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
            });


        Wipro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.wipro.com/careers-home/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });





//Wns Global
       WnsGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.wnscareers.com/global-location/india");
            }

           private void gotoUrl(String s) {
               Uri uri = Uri.parse(s);
               startActivity(new Intent(Intent.ACTION_VIEW, uri));
           }
       });

       //Comapany with name X

        xiaomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://xiaomi.app.param.ai/jobs/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        xicomtechnologies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.xicom.biz/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

       // Comapany with name Y


        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.yahooinc.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });


        yellowai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://yellow.ai/career/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });






        yugabyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.yugabyte.com/careers/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });





        yulubykes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://ats.careers.yulu.bike/#!/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });


        // Company with name Z


// Zuspay
        Zuspay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://juspay.in/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }


        });



// Zoho corporation
        ZohoCorporation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.zohocorp.com/jobs/Careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });



//        Zerodha.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://careers.zohocorp.com/jobs/Careers");
//            }
//
//            private void gotoUrl(String s) {
//                Uri uri = Uri.parse(s);
//                startActivity(new Intent(Intent.ACTION_VIEW, uri));
//            }
//        });

        Zeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.zeta.tech/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        ZivaMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.zivame.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.zomato.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        zoomCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.zoomcar.com/careers");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        zs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://jobs.zs.com/all/jobs");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });




//// Symantec
//        Symantec.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.instahyre.com/jobs-at-symantec/");
//            }
//        });
//






//        KPITTech.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.kpit.com/careers/");
//            }
//        });

//
//
//        unstop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://unstop.com/home");
//            }
//
//        });
//
//
//
//    }


    }
}