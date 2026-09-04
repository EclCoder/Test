package zg;

import android.content.Context;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r extends f {
    public r(Context context) {
        super(context);
    }

    public void Z() {
        this.f58879c.animate().translationX(0.0f);
        this.f58879c.animate().alpha(1.0f);
    }

    public void a0() {
        wp.a.a("Start animation gravity %d", Integer.valueOf(this.f58878b.gravity));
        this.f58879c.animate().alpha(0.7f).setDuration(200L).start();
        this.f58879c.animate().translationX((N() ? -1.0f : 1.0f) * this.f58878b.width * 0.3f).setDuration(200L).start();
        e();
    }

    @Override // zg.o
    protected int i() {
        return super.i() | 256;
    }

    @Override // zg.o
    protected int j() {
        return this.f58881e.getResources().getDimensionPixelSize(R.dimen.size_float_menu_item);
    }

    @Override // zg.o
    protected int l() {
        return this.f58881e.getResources().getDimensionPixelSize(R.dimen.size_float_menu_item);
    }
}
