package sg.edu.rp.c346.id21020978.demosimplelistviewexamtips;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<String> examTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("ArrayList");

        lvExamTips = findViewById(R.id.lvExamTips);
        examTips = new ArrayList<String>();
        examTips.add("Don't just read the code, code it as much as possible during each practical session");
        examTips.add("Seek help from the lecturer ASAP, do not wait till you lost in the jungle");
        examTips.add("Prepare your template source code for each topic");
        examTips.add("Create a few empty Android projects to speed up your coding during the exam");
        examTips.add("Ensure that your Android Studio is up and running before the exam");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, examTips);

        lvExamTips.setAdapter(adapter);
    }
}