package br.com.iago.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void novaFrase(View view){

        //Array de frases
        String[] frases = {
                "Um verdadeiro mestre é um eterno aprendiz.",
                "Uma mente concentrada pode perfurar rochas.",
                "Raiva dá motivação sem propósito.",
                "Não deixe que o seu orgulho lhe cegue.",
                "O segredo para a imortalidade? Não morra!",
        };

        //Gerar número aleatório com o Random
        int numero = new Random().nextInt(frases.length);

        //Mapear a TextView com a variavel texto
        TextView texto = (TextView) findViewById(R.id.textResultado);

        //Relacionar a frase do array à variável texto
        texto.setText( frases[numero] );

    }
}
