package dwiyanhartono.com.applikasidestinasiwisata.Holder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import dwiyanhartono.com.applikasidestinasiwisata.R;

public class HolderHalaman1 extends RecyclerView.ViewHolder implements View.OnClickListener  {
    public TextView TxtTitle;
    public TextView TextRole;
    public ImageView img1;
    public LinearLayout lv ;
    ItemClickListner itemClickListener;
    public HolderHalaman1(@NonNull View itemView) {
        super(itemView);
        TxtTitle = itemView.findViewById(R.id.txtTitle);
        TextRole = itemView.findViewById(R.id.txtRole);
        img1 = itemView.findViewById(R.id.img1);
        lv = itemView.findViewById(R.id.lv);
        lv.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListner itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
