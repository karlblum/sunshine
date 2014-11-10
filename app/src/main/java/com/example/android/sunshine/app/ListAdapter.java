package com.example.android.sunshine.app;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Karl on 10.11.2014.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private String[] mDataset;
    private static final String LOG_TAG = ListAdapter.class.getSimpleName();

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListAdapter(String[] myDataset) {
        Log.v(LOG_TAG,"Initiating ListAdapter with String["+myDataset.length+"]");
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        TextView v = (TextView)LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_forecast, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);

        // v.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
                /// CharSequence forecast = mForecastAdapter.getItem(position);
                //  Intent intent = new Intent(v.getContext(),DetailActivity.class)
                //          .putExtra(Intent.EXTRA_TEXT, forecast);
                //  v.getContext().startActivity(intent);
        //    }
        // });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
