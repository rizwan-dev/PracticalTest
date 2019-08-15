package com.irysgroup.practicaltest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.irysgroup.practicaltest.R;
import com.irysgroup.practicaltest.model.Contact;
import com.irysgroup.practicaltest.model.Invoice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chaitali on 16/11/17.
 */

public class InvoiceAdapter extends RecyclerView.Adapter<InvoiceAdapter.MyViewHolder> {
    private Context context;
    private List<Invoice> invoiceList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, count, sales;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.txtName);
            count = view.findViewById(R.id.txtCount);
            sales = view.findViewById(R.id.txtSales);


        }
    }


    public InvoiceAdapter(Context context, List<Invoice> invoiceList) {
        this.context = context;
        this.invoiceList = invoiceList;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.invoice_row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Invoice invoice = invoiceList.get(position);
        holder.name.setText(invoice.getName());
        holder.count.setText(String.valueOf(invoice.getCount()));
        holder.sales.setText(invoice.getSales());

    }

    @Override
    public int getItemCount() {
        return invoiceList.size();
    }


}
