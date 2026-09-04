package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class x extends w {
    private static final androidx.databinding.p.i N = null;
    private static final SparseIntArray O;
    private final RelativeLayout J;
    private final LinearLayout K;
    private final o7 L;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 3);
        sparseIntArray.put(R.id.rating_question_tv, 4);
        sparseIntArray.put(R.id.satisfaction_1, 5);
        sparseIntArray.put(R.id.satisfaction_2, 6);
        sparseIntArray.put(R.id.satisfaction_3, 7);
        sparseIntArray.put(R.id.satisfaction_4, 8);
        sparseIntArray.put(R.id.satisfaction_5, 9);
        sparseIntArray.put(R.id.lv_languages, 10);
        sparseIntArray.put(R.id.progress_bar, 11);
    }

    public x(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, N, O));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.M = 1L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    private x(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[3], (ListView) objArr[10], (ProgressBar) objArr[11], (TextView) objArr[4], (ImageView) objArr[5], (ImageView) objArr[6], (ImageView) objArr[7], (ImageView) objArr[8], (ImageView) objArr[9]);
        this.M = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.K = linearLayout;
        linearLayout.setTag(null);
        Object obj = objArr[2];
        this.L = obj != null ? o7.a((View) obj) : null;
        T(view);
        F();
    }
}
