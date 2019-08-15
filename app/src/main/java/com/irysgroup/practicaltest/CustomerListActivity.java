package com.irysgroup.practicaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import static com.irysgroup.practicaltest.MyDividerItemDecoration.VERTICAL_LIST;

public class CustomerListActivity extends AppCompatActivity implements ContactsAdapter.ContactsAdapterListener {

    EditText edtSearch;
    RecyclerView rvContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        List<Contact> contactList = getListOfContacts();
        rvContacts = findViewById(R.id.rv_contacts);
        edtSearch = findViewById(R.id.edt_search);
        final ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactList, this);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        rvContacts.addItemDecoration(new MyDividerItemDecoration(this, VERTICAL_LIST, 5));
        rvContacts.setAdapter(contactsAdapter);

        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                contactsAdapter.getFilter().filter(s);
            }
        });
    }

    private List<Contact> getListOfContacts() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Aakriti Rastogi", "8830721334"));
        contactList.add(new Contact("Aalam Shah", "8983265077"));
        contactList.add(new Contact("Rizwan Khan", "830721477"));
        contactList.add(new Contact("Anita Kapari", "8784455200"));
        contactList.add(new Contact("Roshni Shah", "8876767777"));
        contactList.add(new Contact("Raj Malhotra", "8995555552"));
        return contactList;
    }

    @Override
    public void onContactSelected(Contact contact) {

    }
}
