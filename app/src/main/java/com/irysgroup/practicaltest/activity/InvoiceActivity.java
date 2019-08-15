package com.irysgroup.practicaltest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.irysgroup.practicaltest.R;
import com.irysgroup.practicaltest.adapter.InvoiceAdapter;
import com.irysgroup.practicaltest.model.Contact;
import com.irysgroup.practicaltest.model.Invoice;
import com.irysgroup.practicaltest.util.MyDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import static com.irysgroup.practicaltest.util.MyDividerItemDecoration.VERTICAL_LIST;

public class InvoiceActivity extends AppCompatActivity {

    RecyclerView rvInvoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
        List<Invoice> invoiceList = getListOfInvoice();
        rvInvoice = findViewById(R.id.rvInvoice);
        final InvoiceAdapter contactsAdapter = new InvoiceAdapter(this, invoiceList);
        rvInvoice.setLayoutManager(new LinearLayoutManager(this));
        rvInvoice.addItemDecoration(new MyDividerItemDecoration(this, VERTICAL_LIST, 5));
        rvInvoice.setAdapter(contactsAdapter);
    }

    private List<Invoice> getListOfInvoice() {
        List<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(new Invoice("Aakriti Rastogi", 2,"$240.00"));
        invoiceList.add(new Invoice("Aalam Shah", 1,"$2300.00"));
        invoiceList.add(new Invoice("Rizwan Khan", 3,"$4500.00"));
        invoiceList.add(new Invoice("Anita Kapari", 2,"$5600.00"));
        invoiceList.add(new Invoice("Roshni Shah", 4,"$4000.00"));
        invoiceList.add(new Invoice("Raj Malhotra", 1,"$7800.00"));
        return invoiceList;
    }
}
