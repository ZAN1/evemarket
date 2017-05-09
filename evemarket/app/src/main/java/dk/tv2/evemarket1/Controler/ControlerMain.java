package dk.tv2.evemarket1.Controler;

import android.util.Log;

import dk.tv2.evemarket1.Holders.HeadGroup;
import dk.tv2.evemarket1.Holders.HeadMid;
import dk.tv2.evemarket1.Interface.GetQuery;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by cfr on 09-05-2017.
 */

public class ControlerMain {

    GetQuery mservice;

    public interface HeadGroupCallBack{

        void haveHead(HeadGroup headdata);
        void Error(String error , Throwable t);

    }




    // Constructor til query
   public ControlerMain(){

        Retrofit retro = new Retrofit.Builder().baseUrl("https://crest-tq.eveonline.com").addConverterFactory(GsonConverterFactory.create()).build();

        mservice = retro.create(GetQuery.class);
    }
    
//    public void getHeadGroup(final String id , final ControlerMain getHeadGroupCallBack){
//
//        @Override
//                public void haveHead(HeadGroup groupdata){
//            getHeadGroupCallBack.getHeadGroup();
//
//        }
        
        
  //  }
    
    private void printHead(final HeadGroupCallBack headCallBack){



        Call<HeadGroup> headGroups = mservice.HeadMidListCall();

        headGroups.enqueue(new Callback<HeadGroup>() {
            @Override
            public void onResponse(Call<HeadGroup> call, Response<HeadGroup> response) {

                HeadGroup headgroup = response.body();

                headCallBack.haveHead(headgroup);

                for(HeadMid hg : headgroup.getItems()){

                    Log.d("boom","name: " + hg.getName());

                }

            }

            @Override
            public void onFailure(Call<HeadGroup> call, Throwable t) {

                Log.e("ERROR","no show: " , t);
                headCallBack.Error("no text..: ", t);
            }
        });
        
    }
    
    



}
