package com.example.bixby;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String input = getIntent().getExtras().getString("com.example.bixby.SOMETHING");

        final TextView ansTV = (TextView) findViewById(R.id.ansTV);
        ansTV.setText("Bixby:-  "+input+"\n");
        final EditText editText=(EditText) findViewById(R.id.editText);

        final ImageButton sent=(ImageButton) findViewById(R.id.sent);


        sent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String output=editText.getText().toString();
                String you="You:-  "+output+"\n";
                        ansTV.append(you);
                if(output.equalsIgnoreCase("hi") || output.equalsIgnoreCase("hello") || output.equalsIgnoreCase("hey")){

                    bixby("How are you");

                }
                else if(output.equalsIgnoreCase("fine") || output.equalsIgnoreCase("i am fine")|| output.equalsIgnoreCase("i am good")|| output.equalsIgnoreCase("good")){

                    bixby("Thats very good to hear!!!");
                }

                else if(output.equalsIgnoreCase("sad") || output.equalsIgnoreCase("i am sad")|| output.equalsIgnoreCase("i am depressed")|| output.equalsIgnoreCase("depressed")){

                    bixby("Be patient and face your problems strongly!!!");
                }

                else if(output.equalsIgnoreCase("How are you?") || output.equalsIgnoreCase("how are you")|| output.equalsIgnoreCase("How do you do?")|| output.equalsIgnoreCase("How you doin?")){

                    bixby("I am very good.");
                }

                else if(output.equalsIgnoreCase("How old are you?") || output.equalsIgnoreCase("Whats your age?")|| output.equalsIgnoreCase("age?")){

                    bixby("I am only 16 Year's old. SWEET 16 :))) ");
                    bixby("What about you? Please enter number only");
                    if(Integer.parseInt(output)<= 40){
                        bixby("You are still too young and beautiful ");

                    }
                    else if(Integer.parseInt(output)> 40){
                        bixby("You are not too old. Old is GOLD :)) ");

                    }

                }

                else if(output.equalsIgnoreCase("set alarm")||output.equalsIgnoreCase("set alarm ") || output.equalsIgnoreCase("set reminder")|| output.equalsIgnoreCase("set reminder ")){

                    Intent startIntent=new Intent(getApplicationContext(),MainAlarm.class);
                    startIntent.putExtra("com.example.bixby.SOMETHING","Hello");
                    startActivity(startIntent);
                }

                else if(output.equalsIgnoreCase("open whatsapp") || output.equalsIgnoreCase("start whatsapp")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                    startActivity(i);

                }
                else if(output.equalsIgnoreCase("open viber") || output.equalsIgnoreCase("start viber")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.viber.voip");
                    startActivity(i);

                }
                else if(output.equalsIgnoreCase("open skype") || output.equalsIgnoreCase("start skype")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.skype.raider");
                    startActivity(i);

                }
                else if(output.equalsIgnoreCase("open Contacts") || output.equalsIgnoreCase("start Contacts")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.samsung.android.contacts");
                    startActivity(i);

                }
                else if(output.equalsIgnoreCase("open calendar") || output.equalsIgnoreCase("start calendar")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.samsung.android.calendar");
                    startActivity(i);

                }

                else if(output.equalsIgnoreCase("open samsungpass") || output.equalsIgnoreCase("start samsungpass")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.samsung.android.samsungpass");
                    startActivity(i);

                }

                else if(output.equalsIgnoreCase("open reminder") || output.equalsIgnoreCase("start reminder")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.samsung.android.app.reminder");
                    startActivity(i);

                }

                else if(output.equalsIgnoreCase("open clock") || output.equalsIgnoreCase("start clock") || output.equalsIgnoreCase("set alarm")){


                    Intent i=getPackageManager().getLaunchIntentForPackage("com.sec.android.app.clockpackage");
                    startActivity(i);

                }


                else if(output.equalsIgnoreCase("Please search for me")){


                    bixby("What you want to search?");

                    editText.setText(null);
                    //String output2 = editText.getText().toString();

                    sent.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            String output2 = editText.getText().toString();
                            if(output2.equalsIgnoreCase("")){

                                bixby("Please enter something");
                            }
                            else {



                                String google = "https://www.google.ie/search?q=" + output2;
                                Uri webaddress = Uri.parse(google);
                                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);

                                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {

                                    startActivity(gotoGoogle);
                                }

                            }

                        }

                    });



                }


                else if(output.equalsIgnoreCase("search song")){


                    bixby("Which song you want to search?");

                    editText.setText(null);
                    //String output2 = editText.getText().toString();

                    sent.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            String output2 = editText.getText().toString();
                            if(output2.equalsIgnoreCase("")){

                                bixby("Please enter something");
                            }
                            else {



                                String youtube = "https://www.youtube.com/results?search_query=" + output2;
                                Uri webaddress = Uri.parse(youtube);
                                Intent gotoYoutube = new Intent(Intent.ACTION_VIEW, webaddress);

                                if (gotoYoutube.resolveActivity(getPackageManager()) != null) {

                                    startActivity(gotoYoutube);
                                }

                            }

                        }

                    });



                }





                else{

                    int rand=(int)(Math.random()*4);

                    if(rand==1){
                        bixby("I didn't get that.");
                    }
                    else if(rand==2){
                        bixby("Please rephrase it.");
                    }
                    else{
                        bixby("???");
                    }
                }

                editText.setText(null);
            } });





    }
    public void bixby(String s){

        final TextView ansTV = (TextView) findViewById(R.id.ansTV);
        String bixby="Bixby:-  "+s+" \n";
        
        ansTV.append(bixby);

    }
}
