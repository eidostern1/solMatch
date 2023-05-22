package Model;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.solmatchfinalproject.R;

import java.util.List;

public class donationAdapter extends ArrayAdapter<Donations> {
    private List<Donations> donationsList=null;
    private Context context=null;

    public donationAdapter(Context context, List<Donations> donationsList) {
        super(context, R.layout.userinfolist, donationsList);
        this.context = context;
        this.donationsList = donationsList;
    }

    public List<Donations> getDonationsList() {
        return donationsList;
    }

    public void setDonationsList(List<Donations> donationsList) {
        this.donationsList = donationsList;
    }

    @NonNull
    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
        // needs to recive data from database
    }
}
