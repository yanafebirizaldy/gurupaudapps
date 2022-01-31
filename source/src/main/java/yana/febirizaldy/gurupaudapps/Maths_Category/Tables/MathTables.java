package yana.febirizaldy.gurupaudapps.Maths_Category.Tables;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import yana.febirizaldy.gurupaudapps.Maths_Category.MathsDashboard;
import yana.febirizaldy.gurupaudapps.R;

public class MathTables extends AppCompatActivity {

    private ImageView playbtn, tableId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_tables);

        playbtn = (ImageView) findViewById(R.id.playBtnID);
        tableId = (ImageView) findViewById(R.id.table_ID);

    }

    public void LaunchMathDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
    }

    public void TablesNumber2(View view) {
        tableId.setImageResource(R.drawable.img_table_2);
    }

    public void TablesNumber3(View view) {
        tableId.setImageResource(R.drawable.img_table_3);
    }

    public void TablesNumber4(View view) {
        tableId.setImageResource(R.drawable.img_table_4);
    }

    public void TablesNumber5(View view) {
        tableId.setImageResource(R.drawable.img_table_5);
    }

    public void TablesNumber6(View view) {
        tableId.setImageResource(R.drawable.img_table_6);
    }

    public void TablesNumber7(View view) {
        tableId.setImageResource(R.drawable.img_table_7);
    }

    public void TablesNumber8(View view) {
        tableId.setImageResource(R.drawable.img_table_8);
    }

    public void TablesNumber9(View view) {
        tableId.setImageResource(R.drawable.img_table_9);
    }

    public void TablesNumber10(View view) {
        tableId.setImageResource(R.drawable.img_table_10);
    }
}
