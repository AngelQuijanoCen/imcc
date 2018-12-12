
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widger.TextView

public class MainActivity extends AppCompatActivity {

    privateEditText campoPeso;
    privateEditText  campoEstatura;
    privateButton botonCalcular;
    privateButton botonLimpiar;
    privateTextView textoImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @override
        protected void onCreate(Bundle savedInstanceState)  {
            super.onCreate (savedInstanceState);
            SetContentView(R.Layout.activity_main);

            campoPeso = (EditText) findViewById(R.id.campo_peso);
            campoEstatura = (EditText) findViewById(R.id.campo_estatura);
            botonCalcular = (Button) findViewById(R.id.boton_calcular);
            botonLimpiar = (Button) findViewById(R.id.boton_limpiar);
            textoIMC = (TextView) findViewById(R.id.texto_imc);

            botonCalcular.setOnClickListener (new View.setOnClickListener)  () {
                @override
                public void OnClick(View view){
                    String s = campPeso.getText().toString();
                    double estatura = Double.parseDouble(s);
                    s = campoEstatura.getText().toString();
                    double estatura = Double.parseDouble(s);
                    double imc = peso / Math.pow(estatura, 2);


                }
            });
}
