package com.example.koszykowka;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel2 extends ViewModel {
    private MutableLiveData<Integer> punkty;

    public MutableLiveData<Integer> getPunkty() {
        if(punkty==null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        return punkty;
    }

    public void setPunkty(MutableLiveData<Integer> punkty) {
        if(punkty==null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        this.punkty = punkty;
    }

    public void addPunkty(int x){
        if(punkty==null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        int aktualnePunkty = punkty.getValue();
        punkty.setValue(aktualnePunkty+x);
    }
}
