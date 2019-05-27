package com.databinding.multiobjects;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.databinding.R;
import com.databinding.databinding.ActivityNormalbindingBinding;

public class MODataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityNormalbindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_normalbinding);

        FirstUser firstUser = new FirstUser();
        firstUser.setUserName("Dilip Singh Panwar");
        firstUser.setUserEmail("dilip.dsp@gmail.com");
        firstUser.setUserMobNo("+919827445708");
        firstUser.setUserAddress("Indore");

        SecondUser secondUser = new SecondUser();
        secondUser.setUserName("Dillu Singh Panwar");
        secondUser.setUserEmail("Dillu.dsp@gmail.com");
        secondUser.setUserMobNo("+919827445708");
        secondUser.setUserAddress("Ratlam");

        binding.setFirstUser(firstUser);

        binding.setSecondUser(secondUser);
    }
}