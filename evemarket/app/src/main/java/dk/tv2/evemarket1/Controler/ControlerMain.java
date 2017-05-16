package dk.tv2.evemarket1.Controler;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dk.tv2.evemarket1.Holders.HeadGroup;
import dk.tv2.evemarket1.Holders.HeadMid;
import dk.tv2.evemarket1.Interface.GetQuery;
import dk.tv2.evemarket1.MainActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by cfr on 09-05-2017.
 */

public class ControlerMain {


    private static final String log = MainActivity.class.getSimpleName();
    GetQuery mservice;

    public interface HeadGroupCallBack{

        void haveHead(List<HeadMid> headdata);
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
    
    public void printHead(final HeadGroupCallBack headCallBack){



        Call<HeadGroup> headGroups = mservice.HeadMidListCall();

        headGroups.enqueue(new Callback<HeadGroup>() {
            @Override
            public void onResponse(Call <HeadGroup> call, Response <HeadGroup> response) {

                HeadGroup headgroup = response.body();

                //headCallBack.haveHead(headgroup);

               // List<HeadMid > cata = new ArrayList<>();
               // List<HeadMid> matchid = new ArrayList<>();
               // List<HeadMid> cheild = new ArrayList<>();
               // HeadGroup hent =  HeadGroup.


               // for (HeadGroup hg : ){}

//
               // HeadMid hansen = market();

              //  HeadGroup headGroup1 = new HeadGroup();
               // headCallBack.haveHead(cata);
                HeadMid market = market1(headgroup);

                HeadMid get = market.getHans().get(1);

               // headCallBack.haveHead(cata);
            for(HeadMid bla : get.getHeadmid() ){
                        Log.i(log,"hovde" + bla.getName());
                    if(bla.getHans() != null){

                        for(HeadMid sub : market.getHeadmid()){
                            Log.d(log ,"under      " + sub.getName());


                        }

                    }

            }


              //  headCallBack.haveHead(cata);



            }
            public HeadMid market1 (HeadGroup result){
               HeadMid hansen = new HeadMid();
                List<HeadMid> hans = new ArrayList<HeadMid>();
                for (HeadMid hg : result.getItems()) {

                    if(hg.getParentGroup() == null  && hg.getName() != null){

                        HeadMid under = new HeadMid();
                        under.setId(hg.getId());
                        under.setName(hg.getName());
                        under.setHans(hans1(result.getItems(), under));


                       // Log.d(log,"new!!!!" + hg.getName());


                    }



                }
                hansen.setHans(hans);
                return hansen;

            }

            public List<HeadMid> hans1(List<HeadMid>items, HeadMid hans ){
                List<HeadMid> cata = new ArrayList<HeadMid>();


                for (HeadMid hg1 : items) {


                    if(hg1.getParentGroup() != null) {
                        if(hg1.getParentGroup().getId() == hans.getId())
                        {
                            HeadMid marketcata = new HeadMid();
                            marketcata.setId(hg1.getId());
                            marketcata.setName(hg1.getName());
                            cata.add(marketcata);
                        }
                    }
                }



            return cata;

            }

            @Override
            public void onFailure(Call<HeadGroup> call, Throwable t) {

                Log.e("ERROR","no show: " , t);
                headCallBack.Error("no text..: ", t);
            }
        });
        
    }




}
