package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class z3 extends y3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final androidx.databinding.p.i f53400p0 = null;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final SparseIntArray f53401q0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final HorizontalScrollView f53402n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private long f53403o0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53401q0 = sparseIntArray;
        sparseIntArray.put(R.id.menu_trim, 1);
        sparseIntArray.put(R.id.iv_trim, 2);
        sparseIntArray.put(R.id.tv_trim, 3);
        sparseIntArray.put(R.id.menu_delete, 4);
        sparseIntArray.put(R.id.iv_cut, 5);
        sparseIntArray.put(R.id.tv_cut, 6);
        sparseIntArray.put(R.id.menu_gif, 7);
        sparseIntArray.put(R.id.iv_gif, 8);
        sparseIntArray.put(R.id.tv_gif, 9);
        sparseIntArray.put(R.id.menu_extract_frame, 10);
        sparseIntArray.put(R.id.iv_extract_frame, 11);
        sparseIntArray.put(R.id.tv_extract_frame, 12);
        sparseIntArray.put(R.id.menu_crop, 13);
        sparseIntArray.put(R.id.iv_crop, 14);
        sparseIntArray.put(R.id.tv_crop, 15);
        sparseIntArray.put(R.id.menu_add_bg, 16);
        sparseIntArray.put(R.id.iv_add_bg, 17);
        sparseIntArray.put(R.id.tv_add_bg, 18);
        sparseIntArray.put(R.id.menu_rotate, 19);
        sparseIntArray.put(R.id.iv_rotate, 20);
        sparseIntArray.put(R.id.tv_rotate, 21);
        sparseIntArray.put(R.id.menu_edit_audio, 22);
        sparseIntArray.put(R.id.iv_edit_audio, 23);
        sparseIntArray.put(R.id.tv_edit_audio, 24);
        sparseIntArray.put(R.id.menu_add_text, 25);
        sparseIntArray.put(R.id.iv_add_text, 26);
        sparseIntArray.put(R.id.tv_add_text, 27);
        sparseIntArray.put(R.id.menu_add_icon, 28);
        sparseIntArray.put(R.id.iv_add_sticker, 29);
        sparseIntArray.put(R.id.tv_add_sticker, 30);
        sparseIntArray.put(R.id.menu_merge, 31);
        sparseIntArray.put(R.id.iv_merge, 32);
        sparseIntArray.put(R.id.tv_merge, 33);
        sparseIntArray.put(R.id.menu_compress, 34);
        sparseIntArray.put(R.id.iv_compress, 35);
        sparseIntArray.put(R.id.tv_compress, 36);
        sparseIntArray.put(R.id.menu_speed, 37);
        sparseIntArray.put(R.id.iv_speed, 38);
        sparseIntArray.put(R.id.tv_speed, 39);
    }

    public z3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 40, f53400p0, f53401q0));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.f53403o0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.f53403o0 = 1L;
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
            this.f53403o0 = 0L;
        }
    }

    private z3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[17], (ImageView) objArr[29], (ImageView) objArr[26], (ImageView) objArr[35], (ImageView) objArr[14], (ImageView) objArr[5], (ImageView) objArr[23], (ImageView) objArr[11], (ImageView) objArr[8], (ImageView) objArr[32], (ImageView) objArr[20], (ImageView) objArr[38], (ImageView) objArr[2], (LinearLayout) objArr[16], (LinearLayout) objArr[28], (LinearLayout) objArr[25], (LinearLayout) objArr[34], (LinearLayout) objArr[13], (LinearLayout) objArr[4], (LinearLayout) objArr[22], (LinearLayout) objArr[10], (LinearLayout) objArr[7], (LinearLayout) objArr[31], (LinearLayout) objArr[19], (LinearLayout) objArr[37], (LinearLayout) objArr[1], (TextView) objArr[18], (TextView) objArr[30], (TextView) objArr[27], (TextView) objArr[36], (TextView) objArr[15], (TextView) objArr[6], (TextView) objArr[24], (TextView) objArr[12], (TextView) objArr[9], (TextView) objArr[33], (TextView) objArr[21], (TextView) objArr[39], (TextView) objArr[3]);
        this.f53403o0 = -1L;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) objArr[0];
        this.f53402n0 = horizontalScrollView;
        horizontalScrollView.setTag(null);
        T(view);
        F();
    }
}
