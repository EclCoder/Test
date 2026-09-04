package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.material.tabs.TabLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i5 extends androidx.databinding.p {
    public final ImageButton A;
    public final ImageButton B;
    public final EditText C;
    public final PlayerControlView D;
    public final TabLayout E;
    public final ConstraintLayout F;
    public final ViewPager2 G;

    protected i5(Object obj, View view, int i10, ImageButton imageButton, ImageButton imageButton2, EditText editText, PlayerControlView playerControlView, TabLayout tabLayout, ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.A = imageButton;
        this.B = imageButton2;
        this.C = editText;
        this.D = playerControlView;
        this.E = tabLayout;
        this.F = constraintLayout;
        this.G = viewPager2;
    }

    public static i5 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static i5 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i5) androidx.databinding.p.E(layoutInflater, R.layout.fragment_text_settings, viewGroup, z10, obj);
    }
}
