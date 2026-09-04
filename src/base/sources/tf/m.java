package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.ChipGroup;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m extends androidx.databinding.p {
    public final AppBarLayout A;
    public final ImageView B;
    public final RecyclerView C;
    public final TextView D;
    public final ConstraintLayout E;
    public final EditText F;
    public final TextView G;
    public final TextView H;
    public final AppCompatButton I;
    public final ChipGroup J;
    public final Toolbar K;

    protected m(Object obj, View view, int i10, AppBarLayout appBarLayout, ImageView imageView, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout, EditText editText, TextView textView2, TextView textView3, AppCompatButton appCompatButton, ChipGroup chipGroup, Toolbar toolbar) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = imageView;
        this.C = recyclerView;
        this.D = textView;
        this.E = constraintLayout;
        this.F = editText;
        this.G = textView2;
        this.H = textView3;
        this.I = appCompatButton;
        this.J = chipGroup;
        this.K = toolbar;
    }

    public static m Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static m Z(LayoutInflater layoutInflater, Object obj) {
        return (m) androidx.databinding.p.E(layoutInflater, R.layout.activity_feedback, null, false, obj);
    }
}
