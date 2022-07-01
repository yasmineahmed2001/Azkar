package com.example.application25;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editName,editSurname,editMarks ,editTextId;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;
    Button btnviewUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

            myDb = new DatabaseHelper(this);

            editName = (EditText)findViewById(R.id.editText_name);
            btnAddData = (Button)findViewById(R.id.button_add);
            btnviewAll = (Button)findViewById(R.id.button_viewAll);
            AddData();
            viewAll();
        }

        public  void AddData() {
            btnAddData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    boolean isInserted = myDb.insertData(editName.getText().toString());
                    if(isInserted == true)
                        Toast.makeText(Activity3.this,"تم اضافة النص",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Activity3.this,"لم يتم اضافة النص",Toast.LENGTH_LONG).show();
                }
            }) ;
        }

        public void showMessage(String title, String Message)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle(title);
            builder.setMessage(Message);
            builder.show();
        }

        public void viewAll() {
            btnviewAll.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Cursor res = myDb.getAllData();
                            if (res.getCount() == 0) {
                                // show message
                                showMessage("خطأ", "لا يوجد بيانات لعرضها");
                                return;
                            }

                            StringBuffer buffer = new StringBuffer();
                            while (res.moveToNext()) {
                                buffer.append("النص :" + res.getString(1) + "\n");
                            }

                            // Show all data
                            showMessage("أذكاري", buffer.toString());
                        }
                    }
            );
        }}