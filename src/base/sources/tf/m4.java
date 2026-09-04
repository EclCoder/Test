package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m4 extends androidx.databinding.p {
    public final ImageView A;
    public final EditText B;
    public final ImageView C;
    public final ImageView D;
    public final Spinner E;
    public final CardView F;
    public final TextView G;
    public final EditText H;
    public final LinearLayout I;
    protected jh.j J;

    protected m4(Object obj, View view, int i10, ImageView imageView, EditText editText, ImageView imageView2, ImageView imageView3, Spinner spinner, CardView cardView, TextView textView, EditText editText2, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = editText;
        this.C = imageView2;
        this.D = imageView3;
        this.E = spinner;
        this.F = cardView;
        this.G = textView;
        this.H = editText2;
        this.I = linearLayout;
    }

    public static m4 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static m4 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (m4) androidx.databinding.p.E(layoutInflater, R.layout.fragment_live_youtube, viewGroup, z10, obj);
    }

    public abstract void a0(jh.j jVar);
}
