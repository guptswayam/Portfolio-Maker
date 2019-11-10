package view;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app2.swayamgupta.Mydatabase;
import com.app2.swayamgupta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Experience extends Fragment {

    Context context;
    public Experience() {
        // Required empty public constructor
    }
    public Experience(Context context)
    {
        this.context=context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_experience, container, false);
        TextView tv=v.findViewById(R.id.exp);
        Mydatabase mydatabase=new Mydatabase(context);
        tv.setText(mydatabase.getExperience());
        return v;
    }

}
