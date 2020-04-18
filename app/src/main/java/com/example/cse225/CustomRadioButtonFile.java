package com.example.cse225;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.widget.CompoundButton;

import androidx.appcompat.widget.AppCompatRadioButton;

public class CustomRadioButtonFile extends AppCompatRadioButton {


    @Override
    protected void onCreateContextMenu(ContextMenu menu) {
        super.onCreateContextMenu(menu);

    }

    private OnCheckedChangeListener onCheckedChangeListener;


    public CustomRadioButtonFile(Context context) {
        super(context);
    }

    public CustomRadioButtonFile(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRadioButtonFile(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        
        setOwnOnCheckedChangeListener();
        setButtonDrawable(null);
    }

    public void setOwnOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }


    private void setOwnOnCheckedChangeListener() {
    setOnCheckedChangeListener(new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView,boolean isChecked ) {

            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(buttonView, isChecked);
            }
        }
    });
    }
}
