package dk.tv2.evemarket1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import dk.tv2.evemarket1.Adapter.AdapterMain;
import dk.tv2.evemarket1.Controler.ControlerMain;
import dk.tv2.evemarket1.Holders.HeadMid;

public class MainActivity extends AppCompatActivity {

    private AdapterMain adapter;
    private RecyclerView cycelmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cycelmain = (RecyclerView) findViewById(R.id.cyclerHeadGroup);

        cycelmain.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AdapterMain(this);

        cycelmain.setAdapter(adapter);

        ControlerMain controlMain = new ControlerMain();

        controlMain.printHead(new ControlerMain.HeadGroupCallBack(){

            @Override
            public void haveHead(List<HeadMid> data){

                adapter.updateadapter(data);

            }

            @Override
            public void Error(String error, Throwable t) {

            }





        });


    }
}
///fffdsdfuhgfifsdhgffdhgffdhfgkfdg