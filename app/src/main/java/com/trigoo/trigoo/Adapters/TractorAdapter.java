package com.trigoo.trigoo.Adapters;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;

import com.trigoo.trigoo.Entity.Tractor;
import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.CardTractorBinding;

import java.util.List;

public class TractorAdapter extends RecyclerView.Adapter<TractorAdapter.CardDesignAttachment>{
    private Context mContext;
    private List<Tractor> tractorList;

    public TractorAdapter(Context mContext, List<Tractor> tractorList) {
        this.mContext = mContext;
        this.tractorList = tractorList;
    }

    public class CardDesignAttachment extends RecyclerView.ViewHolder {
        private CardTractorBinding tasarim;

        public CardDesignAttachment(CardTractorBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardDesignAttachment onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        CardTractorBinding tasarim = CardTractorBinding.inflate(layoutInflater,parent,false);
        return new CardDesignAttachment(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignAttachment holder, int position) {
        Tractor tractor = tractorList.get(position);
        CardTractorBinding t = holder.tasarim;

        t.imageViewCardTractor.setImageResource(
                mContext.getResources().getIdentifier(tractor.getTractor_image(),"drawable",mContext.getPackageName()));

        t.textViewTractorName.setText(tractor.getTractor_name());
        t.textViewOwnerName.setText(tractor.getOwner_name());

        if(tractor.isTractor_active()){
            t.textViewActive.setText("Active");
        }else{
            t.textViewActive.setText("Inactive");
        }

        t.textViewLocation.setText(tractor.getLocation());

        t.imageViewCardMore.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(mContext,view);
            popupMenu.getMenuInflater().inflate(R.menu.tractor_card_popup,popupMenu.getMenu());
            popupMenu.show();
        });

    }

    @Override
    public int getItemCount() {
        return tractorList.size();
    }


}
