package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i2 extends androidx.databinding.p {
    public final ImageView A;
    public final ImageButton B;
    public final TabLayout C;
    public final ConstraintLayout D;
    public final TextView E;
    public final ViewPager2 F;
    protected uh.y G;

    protected i2(Object obj, View view, int i10, ImageView imageView, ImageButton imageButton, TabLayout tabLayout, ConstraintLayout constraintLayout, TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = imageButton;
        this.C = tabLayout;
        this.D = constraintLayout;
        this.E = textView;
        this.F = viewPager2;
    }

    public static i2 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static i2 Z(LayoutInflater layoutInflater, Object obj) {
        return (i2) androidx.databinding.p.E(layoutInflater, R.layout.dialog_output_settings, null, false, obj);
    }

    public abstract void a0(uh.y yVar);
}
