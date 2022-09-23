package mao.android_switch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Switch switch1 = findViewById(R.id.switch1);
        Switch switch2 = findViewById(R.id.switch2);
        Switch switch3 = findViewById(R.id.switch3);

        switch1.setChecked(true);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Toast.makeText(MainActivity2.this, "WiFi已打开", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "WiFi已关闭", Toast.LENGTH_SHORT).show();
                }
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Toast.makeText(MainActivity2.this, "蓝牙已打开", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "蓝牙已关闭", Toast.LENGTH_SHORT).show();
                }
            }
        });

        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Toast.makeText(MainActivity2.this, "移动数据已打开", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "移动数据已关闭", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}