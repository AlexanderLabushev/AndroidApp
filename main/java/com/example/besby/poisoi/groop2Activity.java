package com.example.besby.poisoi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class groop2Activity extends ListActivity {

    final String[] wensdayArray = new String[] { "Понедельник", "Вторник", "Среда",
            "Четверг", "Пятница", "Суббота"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groop2);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, wensdayArray);
        setListAdapter(mAdapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(groop2Activity.this, day2Activity.class);
        intent.putExtra("name1",l.getItemAtPosition(position).toString());
        startActivity(intent);
    }
}
