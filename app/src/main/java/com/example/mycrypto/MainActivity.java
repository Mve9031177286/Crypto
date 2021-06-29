package com.example.mycrypto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button buttonCrypt;
    Button buttonCopy;
    Button buttonDeleteAll;
    TextView editTextInput;
    TextView editTextCrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = (TextView) findViewById(R.id.editTextInput);
        editTextCrypt = (TextView) findViewById(R.id.editTextCrypt);
        buttonCrypt = (Button) findViewById(R.id.buttonCrypt);
        buttonCopy = (Button) findViewById(R.id.buttonCopy);
        buttonDeleteAll = (Button) findViewById(R.id.buttonDeleteAll);

        buttonCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crypter();
            }
        });
    }

    public static void crypter() {

        Scanner sc = new Scanner(System.in);
        String inn = sc.nextLine();

        String newString = inn.replace('в', '4');
        String newString1 = newString.replace(' ', 'f');
        String newString2 = newString1.replace('е', '$');
        String newString3 = newString2.replace('и', 'r');
        String newString4 = newString3.replace('н', '7');
        String newString5 = newString4.replace('к', 's');
        String newString6 = newString5.replace('в', '9');
        String newString7 = newString6.replace('а', 'w');
        String newString8 = newString7.replace('т', '5');
        String newString9 = newString8.replace('р', '0');
        String newString10 = newString9.replace('с', '?');
        String newString11 = newString10.replace('л', '%');
        String newString12 = newString11.replace('м', '!');
        String newString13 = newString12.replace('у', '+');

        System.out.println(newString13);
    }


}