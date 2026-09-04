package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g extends androidx.databinding.p {
    public final ImageView A;
    public final FragmentContainerView B;
    public final FragmentContainerView C;
    public final ImageButton D;
    public final Toolbar E;
    public final ConstraintLayout F;
    public final TextView G;
    protected uh.y H;

    protected g(Object obj, View view, int i10, ImageView imageView, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2, ImageButton imageButton, Toolbar toolbar, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = fragmentContainerView;
        this.C = fragmentContainerView2;
        this.D = imageButton;
        this.E = toolbar;
        this.F = constraintLayout;
        this.G = textView;
    }

    public static g Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static g Z(LayoutInflater layoutInflater, Object obj) {
        return (g) androidx.databinding.p.E(layoutInflater, R.layout.activity_edit_video, null, false, obj);
    }

    public abstract void a0(uh.y yVar);
}
