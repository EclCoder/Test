package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f3 extends e3 {
    private static final androidx.databinding.p.i O = null;
    private static final SparseIntArray P;
    private final LinearLayout M;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.player_control_view, 1);
        sparseIntArray.put(R.id.body, 2);
        sparseIntArray.put(R.id.body_content, 3);
        sparseIntArray.put(R.id.close_iv, 4);
        sparseIntArray.put(R.id.title, 5);
        sparseIntArray.put(R.id.confirm_iv, 6);
        sparseIntArray.put(R.id.generate_btn, 7);
        sparseIntArray.put(R.id.styles_row, 8);
        sparseIntArray.put(R.id.bottom_row, 9);
        sparseIntArray.put(R.id.language_btn, 10);
        sparseIntArray.put(R.id.edit_captions_btn, 11);
        sparseIntArray.put(R.id.remove_all_btn, 12);
    }

    public f3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 13, O, P));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    private f3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (FrameLayout) objArr[2], (LinearLayout) objArr[3], (LinearLayout) objArr[9], (ImageButton) objArr[4], (ImageButton) objArr[6], (ImageButton) objArr[11], (Button) objArr[7], (Button) objArr[10], (PlayerControlView) objArr[1], (ImageButton) objArr[12], (RecyclerView) objArr[8], (TextView) objArr[5]);
        this.N = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
