package dk.tv2.evemarket1.Controler;

import dk.tv2.evemarket1.Holders.HeadGroup;
import dk.tv2.evemarket1.Interface.GetQuery;
import retrofit2.Call;
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
    ControlerMain(){

        Retrofit retro = new Retrofit.Builder().baseUrl("https://crest-tq.eveonline.com").addConverterFactory(GsonConverterFactory.create()).build();

        mservice = retro.create(GetQuery.class);
    }
    
    public void getHeadGroup(final String id , final HeadGroupCallBack getGroupCallBack){
        
        @Override
                public void haveHead(final HeadGroup headdata){
            
            
        }
        
        
    }
    
    private void printHead(String id , final HeadGroupCallBack headCallBack){

        Call<HeadGroup> headGroups = mservice.HeadMidListCall("https://crest-tq.eveonline.com/market/groups")
        
    }
    
    



}
