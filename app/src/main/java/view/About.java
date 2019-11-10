package view;


import android.content.Context;
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
public class About extends Fragment {


    Context context;
    public About() {
        // Required empty public constructor
    }
    public About(Context context)
    {
        this.context=context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_about, container, false);
        TextView tv1=v.findViewById(R.id.about);
        Mydatabase mydatabase=new Mydatabase(context);
        tv1.setText(mydatabase.getAbout());
        return v;
    }
}
