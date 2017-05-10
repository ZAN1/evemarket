package dk.tv2.evemarket1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import dk.tv2.evemarket1.Adapter.AdapterMain;
import dk.tv2.evemarket1.Controler.ControlerMain;

public class MainActivity extends AppCompatActivity {

    private AdapterMain adapter;
    private RecyclerView cycelmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cycelmain = (RecyclerView) findViewById(R.id.cycelheadgroup);

        cycelmain.setLayoutManager(LinearLayoutManager(this));

        adapter = new AdapterMain(this);

        cycelmain.setAdapter(adapter);

        ControlerMain controlMain = new ControlerMain();

        controlMain.

    }
}
///fffdsdfuhgfifsdhgffdhgffdhfgkfdg