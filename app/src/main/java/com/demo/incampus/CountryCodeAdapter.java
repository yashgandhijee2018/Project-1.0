package com.demo.incampus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CountryCodeAdapter extends ArrayAdapter<CountryCodeAdapter.CountryCode> {
    public CountryCodeAdapter(@NonNull Context context, ArrayList<CountryCodeAdapter.CountryCode> countryCodes) {
        super(context, 0, countryCodes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    private View initView (int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.phone_number_spinner, parent, false);
        }

        TextView countryCode = convertView.findViewById(R.id.countryCode);

        CountryCode item = getItem(position);

        if(item != null) {
            countryCode.setText((CharSequence) item.getCountryCode());
        }

        return  convertView;
    }

    static class CountryCode {
        private String countryCode;

        public CountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getCountryCode() {
            return countryCode;
        }

    }
}



