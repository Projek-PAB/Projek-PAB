package com.si5b.bimbelku;

import android.view.Menu;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import static com.si5b.bimbelku.R.color.purple_500;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBimbel;
    private ArrayList<ModelBimbel> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBimbel = findViewById(R.id.rv_bimbel);
        rvBimbel.setHasFixedSize(true);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(purple_500)));

        data.addAll(DataBimbel.ambilDataBimbel());
        tampilDataBimbel();
    }

    private void tampilDataBimbel(){
        AdapterBimbel AB = new AdapterBimbel(data, MainActivity.this);
        rvBimbel.setLayoutManager(new LinearLayoutManager(this));
        rvBimbel.setAdapter(AB);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_tampilan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.menu_about) {
            Intent about = new Intent(MainActivity.this, About.class);
            startActivity(about);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}