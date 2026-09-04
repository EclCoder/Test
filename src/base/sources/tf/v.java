package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.hecorat.screenrecorder.free.R;
import com.liuguangqiang.swipeback.SwipeBackLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class v extends u {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final androidx.databinding.p.i f53384d0 = null;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final SparseIntArray f53385e0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f53386c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53385e0 = sparseIntArray;
        sparseIntArray.put(R.id.root_view, 1);
        sparseIntArray.put(R.id.view_pager, 2);
        sparseIntArray.put(R.id.actionbar_layout, 3);
        sparseIntArray.put(R.id.iv_back, 4);
        sparseIntArray.put(R.id.iv_edit_name, 5);
        sparseIntArray.put(R.id.iv_image_info, 6);
        sparseIntArray.put(R.id.tv_name, 7);
        sparseIntArray.put(R.id.toolbar_layout, 8);
        sparseIntArray.put(R.id.iv_share, 9);
        sparseIntArray.put(R.id.layout_sticker, 10);
        sparseIntArray.put(R.id.iv_sticker, 11);
        sparseIntArray.put(R.id.layout_text, 12);
        sparseIntArray.put(R.id.iv_text, 13);
        sparseIntArray.put(R.id.layout_crop, 14);
        sparseIntArray.put(R.id.iv_crop, 15);
        sparseIntArray.put(R.id.layout_black_white, 16);
        sparseIntArray.put(R.id.iv_black_white, 17);
        sparseIntArray.put(R.id.layout_draw, 18);
        sparseIntArray.put(R.id.iv_draw, 19);
        sparseIntArray.put(R.id.layout_blur, 20);
        sparseIntArray.put(R.id.iv_blur, 21);
        sparseIntArray.put(R.id.layout_play_pause, 22);
        sparseIntArray.put(R.id.iv_play_pause, 23);
        sparseIntArray.put(R.id.layout_delete, 24);
        sparseIntArray.put(R.id.iv_delete, 25);
        sparseIntArray.put(R.id.layout_progress_bar, 26);
        sparseIntArray.put(R.id.waiting_progress, 27);
    }

    public v(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 28, f53384d0, f53385e0));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.f53386c0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.f53386c0 = 1L;
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
            this.f53386c0 = 0L;
        }
    }

    private v(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RelativeLayout) objArr[3], (ImageView) objArr[4], (ImageView) objArr[17], (ImageView) objArr[21], (ImageView) objArr[15], (ImageView) objArr[25], (ImageView) objArr[19], (ImageView) objArr[5], (ImageView) objArr[6], (ImageView) objArr[23], (ImageView) objArr[9], (ImageView) objArr[11], (ImageView) objArr[13], (LinearLayout) objArr[16], (LinearLayout) objArr[20], (LinearLayout) objArr[14], (LinearLayout) objArr[24], (LinearLayout) objArr[18], (LinearLayout) objArr[22], (RelativeLayout) objArr[26], (LinearLayout) objArr[10], (LinearLayout) objArr[12], (RelativeLayout) objArr[1], (SwipeBackLayout) objArr[0], (LinearLayout) objArr[8], (TextView) objArr[7], (ViewPager) objArr[2], (ProgressBar) objArr[27]);
        this.f53386c0 = -1L;
        this.X.setTag(null);
        T(view);
        F();
    }
}
