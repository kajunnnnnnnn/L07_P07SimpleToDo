package sg.edu.rp.c346.id20026955.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etTodo;
    Button btnAdd;
    Button btnClear;
    ListView lv;

    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTodo = findViewById(R.id.todo);
        btnAdd = findViewById(R.id.buttonAdd);
        btnClear = findViewById(R.id.buttonClear);
        lv = findViewById(R.id.todoList);

        al = new ArrayList<>();

        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);

        lv.setAdapter(aa);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colour = etTodo.getText().toString();
                al.add(colour);
                aa.notifyDataSetChanged();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aa.clear();
                aa.notifyDataSetChanged();
            }
        });

    }
}