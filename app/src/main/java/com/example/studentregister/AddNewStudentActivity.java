package com.example.studentregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.studentregister.databinding.ActivityAddNewStudentBinding;

public class AddNewStudentActivity extends AppCompatActivity {

    /*private Button submitButton;
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText countryEditText;*/

    private ActivityAddNewStudentBinding activityAddNewStudentBinding;
    Student student;
    private AddNewStudentActivityClickHandler addNewStudentActivityClickHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_student);

        /*nameEditText = findViewById(R.id.et_name);
        emailEditText = findViewById(R.id.et_email);
        countryEditText = findViewById(R.id.et_country);
        submitButton = findViewById(R.id.btnSubmit);*/
        student = new Student();

        activityAddNewStudentBinding = DataBindingUtil.setContentView(this, R.layout.activity_add_new_student);
        activityAddNewStudentBinding.setStudent(student);

        addNewStudentActivityClickHandler = new AddNewStudentActivityClickHandler(this);
        activityAddNewStudentBinding.setClickHandler(addNewStudentActivityClickHandler);

        /*submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(nameEditText.getText())) {
                    Toast.makeText(getApplicationContext(), "Name field cannot be empty", Toast.LENGTH_LONG).show();
                } else {
                    String name = nameEditText.getText().toString();
                    String email = emailEditText.getText().toString();
                    String country = countryEditText.getText().toString();

                    Intent intent = new Intent();
                    intent.putExtra("NAME", name);
                    intent.putExtra("EMAIL", email);
                    intent.putExtra("COUNTRY", country);
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });*/
    }


    public class AddNewStudentActivityClickHandler {
        Context context;

        public AddNewStudentActivityClickHandler(Context context) {
            this.context = context;
        }

        public void onFabSubmitClicked(View view) {
            if (student.getName() == null) {
                Toast.makeText(getApplicationContext(), "Name field cannot be empty", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent();
                intent.putExtra("NAME", student.getName());
                intent.putExtra("EMAIL", student.getEmail());
                intent.putExtra("COUNTRY", student.getCountry());
                setResult(RESULT_OK, intent);
                finish();
            }
        }
    }

}
