package br.com.omnilabs.physiscale.ViewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import java.util.Observable;

import br.com.omnilabs.physiscale.BR;

public class WOMACIndexViewModel extends BaseObservable {
    public int mSeekValue;
    public int mSeekDisplay;

    @Bindable
    public int getSeekValue() {
        Log.w("TESTE","Testando");
        return mSeekValue;
    }

    public void setSeekValue(int progress) {
        Log.w("TESTE","Testando");
        mSeekValue = progress;
        notifyPropertyChanged(BR.seekValue);
        setSeekDisplay(progress);
    }

    @Bindable
    public String getSeekDisplay() {
        Log.w("TESTE","Testando");
        return Integer.toString(mSeekDisplay);
    }

    public void setSeekDisplay(int progress) {
        Log.w("TESTE","Testando");
        mSeekDisplay = progress;
        notifyPropertyChanged(BR.seekDisplay);
    }


}
