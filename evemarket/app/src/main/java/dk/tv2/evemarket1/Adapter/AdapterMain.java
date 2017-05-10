package dk.tv2.evemarket1.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dk.tv2.evemarket1.Holders.HeadGroup;
import dk.tv2.evemarket1.Holders.HeadMid;
import dk.tv2.evemarket1.R;

/**
 * Created by cfr on 09-05-2017.
 */

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.holder>{

    private HeadGroup headGroup;
    private LayoutInflater inflater;
    private Context context;

    // adapter constructor ..
    public AdapterMain(Context context){

        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    // adapter updater

    public void updateadapter(HeadGroup items){

        this.headGroup = items;
        notifyDataSetChanged();

    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent , int viewType){

        View view = inflater.inflate(R.layout.headgrouplist, parent, false);

                return new holder(view);

    }
    @Override

    public void onBindViewHolder(holder holder , final int position){

        HeadMid item = headGroup.getItems().get(position);
        holder.name.setText(String.valueOf(item.getName()));


    }




    public int getItemCount(){

        if(headGroup != null && headGroup.getItems() != null) {

            return headGroup.getItems().size();
        }
        return 0;
    }

    class holder extends RecyclerView.ViewHolder{

        private TextView name;

        public holder (View head){


            super(head);
            name = (TextView) head.findViewById(R.id.headname);


        }


    }


}
