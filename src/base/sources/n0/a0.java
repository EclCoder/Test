package n0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46568b;

    public a0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f46567a | this.f46568b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f46568b = i10;
        } else {
            this.f46567a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f46568b = 0;
        } else {
            this.f46567a = 0;
        }
    }
}
