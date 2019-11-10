package adapter;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import view.About;
import view.Contact;
import view.Experience;
import view.Skills;

public class Myadapter extends FragmentPagerAdapter {
    Context context;
    public Myadapter(FragmentManager fm,Context context) {
        super(fm);
        this.context=context;
    }


    @Override
    public Fragment getItem(int i) {
        switch(i)
        {
            case 0:return new About(context);
            case 1:return new Skills(context);
            case 2:return new Experience(context);
            case 3:return new Contact(context);
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 0:return "About";
            case 1:return "Skills";
            case 2:return "Experience";
            case 3:return "Contact";
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
