package com.example.mycrypto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Scanner;

public class MainActivity2 extends AppCompatActivity {

    Button buttonDeCrypt;
    Button buttonDelete;
    TextView editTextInputCrypt;
    TextView editTextDeCrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonDeCrypt = (Button) findViewById(R.id.buttonDeCrypt);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        editTextInputCrypt = (TextView) findViewById(R.id.editTextInputCrypt);
        editTextDeCrypt = (TextView) findViewById(R.id.editTextDeCrypt);

        buttonDeCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrypter();
            }
        });

    }

    public static void decrypter() {

        Scanner sc = new Scanner(System.in);
        String iinn = sc.nextLine();

        String newString14 = iinn.replace('4', 'в');
        String newString15 = newString14.replace('f', ' ');
        String newString16 = newString15.replace('$', 'е');
        String newString17 = newString16.replace('r', 'и');
        String newString18 = newString17.replace('7', 'н');
        String newString19 = newString18.replace('s', 'к');
        String newString20 = newString19.replace('9', 'в');
        String newString21 = newString20.replace('w', 'а');
        String newString22 = newString21.replace('5', 'т');
        String newString23 = newString22.replace('0', 'р');
        String newString24 = newString23.replace('?', 'с');
        String newString25 = newString24.replace('%', 'л');
        String newString26 = newString25.replace('!', 'м');
        String newString27 = newString26.replace('+', 'у');

        System.out.println(newString27);
    }
}