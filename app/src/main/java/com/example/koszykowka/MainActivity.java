package com.example.koszykowka;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.koszykowka.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    PunktyViewModel punktyViewModel;
    PunktyViewModel2 punktyViewModel2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);
        punktyViewModel2 = new ViewModelProvider(this).get(PunktyViewModel2.class);

        punktyViewModel.getPunkty().observe(
                this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        binding.textView.setText("" + integer);
                    }
                }
        );

        punktyViewModel2.getPunkty().observe(
                this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer2) {
                        binding.textView2.setText("" + integer2);
                    }
                }
        );

        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(1);

                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(2);

                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(40000000);

                    }
                }
        );


        binding.button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel2.addPunkty(1);

                    }
                }
        );
        binding.button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel2.addPunkty(2);

                    }
                }
        );
        binding.button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel2.addPunkty(4000000);

                    }
                }
        );
    }
}