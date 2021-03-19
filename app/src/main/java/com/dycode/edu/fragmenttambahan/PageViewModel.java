package com.dycode.edu.fragmenttambahan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
    public class PageViewModel extends ViewModel {
        private MutableLiveData<String> mName = new MutableLiveData<>();
        private MutableLiveData<String> mTTL = new MutableLiveData<>();
        private MutableLiveData<String> mpendidikan = new MutableLiveData<>();
        private MutableLiveData<String> mprestasi = new MutableLiveData<>();

        public void setName(String name) {
            mName.setValue(name);
        }
        public LiveData<String> getName() {
            return mName;
        }

        public void setTTL(String ttl) {
            mTTL.setValue(ttl);
        }
        public LiveData<String> getTTL() {
            return mTTL;
        }

        public void setCita(String pendidikan) {
            mpendidikan.setValue(pendidikan);
        }
        public LiveData<String> getpendidikan() {
            return mpendidikan;
        }

        public void setHobi(String hobi) {
            mprestasi.setValue(hobi);
        }
        public LiveData<String> getprestasi() {
            return mprestasi;
        }
    }


