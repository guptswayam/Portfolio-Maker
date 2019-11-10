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

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class Contact extends Fragment {


    Context context;
    public Contact() {
        // Required empty public constructor
    }

    public Contact(Context context)
    {
        this.context=context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_contact, container, false);
        TextView tv1=v.findViewById(R.id.insta);
        TextView tv2=v.findViewById(R.id.mail);
        Mydatabase mydatabase=new Mydatabase(context);
        tv1.setText(mydatabase.getInsta());
        tv2.setText(mydatabase.getMail());
        return v;
    }
}
