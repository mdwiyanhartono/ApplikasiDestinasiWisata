package dwiyanhartono.com.applikasidestinasiwisata.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import dwiyanhartono.com.applikasidestinasiwisata.Holder.HolderHalaman1;
import dwiyanhartono.com.applikasidestinasiwisata.R;

public class Adapter_List extends RecyclerView.Adapter<HolderHalaman1> {

    Context context;
    int layputResourceID;
    private List<Adapter_Array> Data;
    private OnItemClickListener onItemClickListener;

    public Adapter_List(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
        Data = new ArrayList<>();

    }
//    public Adapter_List(@NonNull Context context, int resource, @NonNull List<Adapter_Array> objects) {
//        super(context, resource, objects);
//        this.context = context;
//        this.layputResourceID = resource;
//        this.Data = objects;
//    }

    @NonNull
    @Override
    public HolderHalaman1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_list, parent, false);
        return new HolderHalaman1(v);
    }

    @Override
    public void onBindViewHolder(final HolderHalaman1 holder, int position) {
        final Adapter_Array data_array = Data.get(position);
        holder.TxtTitle.setText(data_array.Header);
        holder.TextRole.setText(data_array.Role);
        holder.img1.setImageResource(data_array.ResID);
        holder.lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(data_array.ResID,
                        data_array.Header,
                        data_array.Role,
                        data_array.desc1,
                        data_array.desc2,
                        data_array.desc3,
                        data_array.desc4,
                        data_array.desc5,
                        data_array.Title1,
                        data_array.Title2,
                        data_array.Title3,
                        data_array.Title4,
                        data_array.ResID2,
                        data_array.ResID3,
                        data_array.ResID4,
                        data_array.ResID5
                );
            }
        });
    }

    @Override
    public int getItemCount() {
        return Data.size();
    }

    public interface OnItemClickListener {
        void onItemClick(int ResID,
                         String Header,
                         String Role,
                         String Desc1,
                         String Desc2,
                         String Desc3,
                         String Desc4,
                         String Desc5,
                         String Title1,
                         String Title2,
                         String Title3,
                         String Title4,
                         int ResID2,
                         int ResID3,
                         int ResID4,
                         int ResID5
        );
    }


    public void setData(List<Adapter_Array> data) {
        this.Data.clear();
        this.Data = data;
        notifyDataSetChanged();
    }
}
