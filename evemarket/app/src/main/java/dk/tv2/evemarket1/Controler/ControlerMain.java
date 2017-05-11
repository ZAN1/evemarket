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

                List<HeadMid > cata = new ArrayList<>();
                List<HeadMid> matchid = new ArrayList<>();


                for(HeadMid hg : headgroup.getItems()){




                    if(hg.getParentGroup() == null  && hg.getName() != null){



                        cata.add(hg);
                        Log.d(log,"new!!!!" + hg.getName());
                    }
                    else{





                        matchid.add(hg);

                    }



                }

//                for(int i = 0; i < cata.size(); i++) {
//                    HeadMid hg = cata.get(i);
//
//                    cata.remove(hg);
//                }
//
//                for (int j = cata.size() -1; j >= 0; j--) {
//
//                }
//
//                ListIterator<HeadMid> iter = cata.listIterator();
//                while (iter.hasNext()) {
//                    HeadMid hg = iter.next();
//                    iter.remove();
//                }

                headCallBack.haveHead(cata);

                for (HeadMid hg : cata) {

//

                    for (HeadMid hm : matchid) {

                        if(hm.getParentGroup().getId_str().equals(hg.getId_str())){

                            hg.addCheilsGroupe(hm);
                            Log.i(log, "fghfgh       " + hg.getName() + "  " +  hm.getName());

                        }

                    }



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
