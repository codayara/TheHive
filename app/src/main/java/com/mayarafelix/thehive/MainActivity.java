package com.mayarafelix.thehive;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.mayarafelix.thehive.adapters.ItemAdapter;
import com.mayarafelix.thehive.models.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Item> items;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupItems();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ItemClickListener listener = new ItemClickListener() {
            @Override
            public void onClick(View view, View quantityView, int position, int option) {
                adapter.updateData(option, position, quantityView);
//                String optionDescription = ItemClickOptions.getName(option);
//                Toast.makeText(getApplicationContext(), "Position " + position + " Option: " + optionDescription, Toast.LENGTH_SHORT).show();
            }
        };

        adapter = new ItemAdapter(listener);
        recyclerView.setAdapter(adapter);

        adapter.updateData(items);

        // Floating action button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void setupItems() {

        items = new ArrayList<>();

        Item item1 = new Item();
        item1.setName("Papel Higienico");
        item1.setQuantity(1);

        Item item2 = new Item();
        item2.setName("Fio Dental");
        item2.setQuantity(0);

        Item item3 = new Item();
        item3.setName("Suco");
        item3.setQuantity(3);

        Item item4 = new Item();
        item4.setName("Refrigerante");
        item4.setQuantity(5);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
