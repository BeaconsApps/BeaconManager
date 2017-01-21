package adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.estimote.sdk.Beacon;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 21/01/2017.
 */

public class BeaconListAdapter extends RecyclerView.Adapter<BeaconListAdapter.BeaconViewHolder> {

    ArrayList<Beacon> items = Lists.newArrayList();

    @Override
    public BeaconViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BeaconViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BeaconViewHolder extends RecyclerView.ViewHolder{

        public BeaconViewHolder(View itemView) {
            super(itemView);
        }
    }
}
