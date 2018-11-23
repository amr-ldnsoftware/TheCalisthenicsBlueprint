package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Health_Nutrition_Adapter extends RecyclerView.Adapter<Health_Nutrition_Adapter.ExampleViewHolder> {

    public ArrayList<Health_Nutrition_CardViewItem> mExampleList_health_nutrition;


    public Health_Nutrition_Adapter(ArrayList<Health_Nutrition_CardViewItem> exampleList_health_nutrition) {

        mExampleList_health_nutrition = exampleList_health_nutrition;
    }


    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView_health_nutrition;
        public TextView mTextView1_health_nutrition;
        public TextView mTextView2_health_nutrition;
        public Button mButtonStart_health_nutrition;


        public ExampleViewHolder(@NonNull final View itemView) {
            super(itemView);
            mImageView_health_nutrition = itemView.findViewById(R.id.cardImageView_healthnutrition);
            mTextView1_health_nutrition = itemView.findViewById(R.id.titleCardTextView_healthnutrition);
            mTextView2_health_nutrition = itemView.findViewById(R.id.subtitle_healthnutrition);
            mButtonStart_health_nutrition = itemView.findViewById(R.id.cardViewButton_healthnutrition);

            //This coding is setting the onClickListeners for the individual cardviews
            itemView.setOnClickListener(new View.OnClickListener() {

                //This is to set individual cards to individual activities. Add accordingly
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    if (getAdapterPosition() == 0) {
                        intent = new Intent(itemView.getContext(), Vegan_Protein_Sources.class);
                    } else if (getAdapterPosition() == 1) {
                        intent = new Intent(itemView.getContext(), Herbal_Powders.class);
                    } else if (getAdapterPosition() == 2) {
                        intent = new Intent(itemView.getContext(), Herbal_Teas.class);
                    } else if (getAdapterPosition() == 3) {
                        intent = new Intent(itemView.getContext(), BMI_Calculator.class);
                    } else
                        intent = new Intent(itemView.getContext(),Vegan_Protein_Sources.class);
                    itemView.getContext().startActivity(intent);
                }
            });

            }
        }



    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.health_nutrition_cardview_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }


    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, final int position) {

        //Setting the background colour for the textviews in the CardViews
        if(position==0){
            holder.mTextView1_health_nutrition.setBackgroundResource(R.drawable.rounded_corner_nutrition_cardview);
            holder.mTextView1_health_nutrition.setTextSize((float) 16.2);
        } else if(position==1) {
            holder.mTextView1_health_nutrition.setBackgroundResource(R.drawable.rounded_corner_nutrition_cardview);
            holder.mTextView1_health_nutrition.setTextSize((float) 16.2);
        } else if(position==2) {
            holder.mTextView1_health_nutrition.setBackgroundResource(R.drawable.rounded_corner_nutrition_cardview);
            holder.mTextView1_health_nutrition.setTextSize((float) 16.2);
        } else if(position==3) {
            holder.mTextView1_health_nutrition.setBackgroundResource(R.drawable.rounded_corner_nutrition_cardview);
            holder.mTextView1_health_nutrition.setTextSize((float) 16.2);

        }



        Health_Nutrition_CardViewItem currentItem = mExampleList_health_nutrition.get(position);
        holder.mImageView_health_nutrition.setImageResource(currentItem.getImageResource());
        holder.mTextView1_health_nutrition.setText(currentItem.getText1());
        holder.mTextView2_health_nutrition.setText(currentItem.getText2());
        holder.mButtonStart_health_nutrition.setText(currentItem.getText4());




    }




    @Override
    public int getItemCount() {
        return mExampleList_health_nutrition.size();
    }
}
