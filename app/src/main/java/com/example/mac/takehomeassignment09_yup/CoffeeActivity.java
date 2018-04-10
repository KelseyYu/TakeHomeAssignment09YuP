package com.example.mac.takehomeassignment09_yup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CoffeeActivity extends AppCompatActivity {

    public int quantity = 0;
    public EditText name;
    public CheckBox addCream;
    public CheckBox addChocolate;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference nameRef = database.getReference("Customer's name");
    private DatabaseReference customization = database.getReference("Customization");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        name = findViewById(R.id.name_field);
        quantity = Integer.parseInt(findViewById(R.id.quantity_text_view).toString());
        addCream = findViewById(R.id.cream_checkbox);
        addChocolate = findViewById(R.id.chocolate_checkbox);

    }



    public void increment(View view) {
        if (quantity == 100) {
            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity == 1) {
            return;
        }
        quantity = quantity - 1;
        display(quantity);
    }

    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    public void confirm(View view) {
        String nameConfirm = name.getText().toString();
        nameRef.setValue(nameConfirm);
    }


    public void submit (View view){
        int coffeeNumber = quantity;
        boolean cream = addCream.isChecked();
        boolean chocolate = addChocolate.isChecked();

        customization.push().setValue(new Coffee(cream,chocolate,coffeeNumber));


    }



}
