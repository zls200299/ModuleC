package adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.eduworldskillscxx.News1Fragment;
import com.example.eduworldskillscxx.News2Fragment;
import com.example.eduworldskillscxx.News3Fragment;

public class NewsAdapter extends FragmentStateAdapter {
    public NewsAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            return new News1Fragment();
        } else if (position == 1) {
            return new News2Fragment();
        } else if (position == 2) {
            return new News3Fragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
