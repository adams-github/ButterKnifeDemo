package com.example.adams.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.OnTextChanged;
import butterknife.OnTouch;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.textView)
    public void onViewClicked() {
    }

    @OnClick(R.id.textView)
    public void onViewClicked(TextView textView) {
    }

    @OnClick({R.id.textView, R.id.btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textView:
                break;
            case R.id.btn:
                break;
        }
    }

    @OnLongClick(R.id.textView)
    public boolean onViewLongClicked() {
        return false;
    }

    @OnTouch(R.id.textView)
    public boolean onViewTouched() {
        return false;
    }

    @OnTextChanged(value = R.id.editText, callback = OnTextChanged.Callback.BEFORE_TEXT_CHANGED)
    void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @OnTextChanged(value = R.id.editText, callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED)
    void afterTextChanged(Editable s) {
    }

    @OnTextChanged(value = R.id.editText, callback = OnTextChanged.Callback.TEXT_CHANGED)
    void onTextChanged(CharSequence s, int start, int before, int count) {

    }


}
