package gore.kafana.kidsup.ui.hippo;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gore.kafana.kidsup.KidsActivity;
import gore.kafana.kidsup.R;

public class HippoFragment extends Fragment {

    private static final String TAG = "KidsActivity";
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hippo_fragment, viewGroup, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       // mViewModel = ViewModelProviders.of(this).get(HippoViewModel.class);
        // TODO: Use the ViewModel

        Intent intent = new Intent(getActivity(), KidsActivity.class);
        startActivity(intent);

    }

}
