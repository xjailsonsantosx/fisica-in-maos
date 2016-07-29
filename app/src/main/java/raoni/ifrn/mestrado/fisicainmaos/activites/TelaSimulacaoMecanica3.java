package raoni.ifrn.mestrado.fisicainmaos.activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import raoni.ifrn.mestrado.fisicainmaos.R;

public class TelaSimulacaoMecanica3 extends Activity
{
    WebView wvTelaSimulacaoMecanica;
    private String simulacao;
    private Intent intentTelaSimulacaoMecanica;
    private Bundle bundleTelaSimulacaoMecanica;
    int chave;

    public void onCreate(Bundle savedInstanceState)
    {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_simulacao_mecanica3);

        bundleTelaSimulacaoMecanica = getIntent().getExtras();

        if (bundleTelaSimulacaoMecanica != null)
        {
            chave = bundleTelaSimulacaoMecanica.getInt("chave");
        }

        simulacao = "https://phet.colorado.edu/sims/html/forces-and-motion-basics/latest/forces-and-motion-basics_en.html";

        wvTelaSimulacaoMecanica = (WebView) findViewById(R.id.wv_tela_simulacao_mecanica3);
        wvTelaSimulacaoMecanica.loadUrl(simulacao);

        WebSettings settings = wvTelaSimulacaoMecanica .getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
    }
}
