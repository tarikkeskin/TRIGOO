package com.trigoo.trigoo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trigoo.trigoo.Adapters.TractorAdapter;
import com.trigoo.trigoo.Entity.Tractor;
import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.FragmentTractorsBinding;

import java.util.ArrayList;


public class TractorsFragment extends Fragment {

    private FragmentTractorsBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasarim = FragmentTractorsBinding.inflate(inflater, container, false);

        tasarim.toolbarTractor.setTitle("Yakınımdaki Traktörler");

        ArrayList<Tractor> tractorArrayList = new ArrayList<>();
        Tractor t1 = new Tractor(1,"JD5065 + KAZIYICI","Halit Mancar","traktor_1",true,"Üçevler,Adem Kutlu Sk., 06780 Elmadağ/Ankara");
        Tractor t2 = new Tractor(2,"JD6110B + TIRMIK","Tarık Keskin","traktor_2",true,"Peçenek Hobi Bahçeleri,06365 Altındağ/Ankara");
        Tractor t3 = new Tractor(3,"JD5065 + KAZIYICI","Ahmet Koray","traktor_3",false,"Kutludügün Yaylası,06635 Mamak/Ankara");
        Tractor t4 = new Tractor(4,"JD5065 + KAZIYICI","İsmet Hamza","traktor_3",true,"Tatlıca, 06780 Elmadağ/Ankara");
        Tractor t5 = new Tractor(5,"JD5065 + TIRMIK","Yusuf Polat","traktor_4",false,"Kılıçlar-Hisarköy ,71452 Yahşihan/Kırıkkale");
        Tractor t6 = new Tractor(6,"JD5065 + KAZIYICI","Koray Çetin","traktor_1",false,"Irmak ,71452 Yahşihan/Kırıkkale");
        Tractor t7 = new Tractor(7,"JD5065 + TIRMIK","Mehmet Yargıç","traktor_4",true,"Bahçelievler, 109. Cd., 06830 Gölbaşı/Ankara");
        tractorArrayList.add(t1);
        tractorArrayList.add(t2);
        tractorArrayList.add(t3);
        tractorArrayList.add(t4);
        tractorArrayList.add(t5);
        tractorArrayList.add(t6);
        tractorArrayList.add(t7);

        TractorAdapter adapter = new TractorAdapter(requireContext(),tractorArrayList);
        tasarim.rv.setAdapter(adapter);



        return tasarim.getRoot();
    }
}