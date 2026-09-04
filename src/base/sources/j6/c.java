package j6;

import android.graphics.drawable.Drawable;
import m6.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i6.c f42074c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // j6.i
    public final i6.c d() {
        return this.f42074c;
    }

    @Override // j6.i
    public final void f(i6.c cVar) {
        this.f42074c = cVar;
    }

    @Override // j6.i
    public final void h(h hVar) {
        hVar.e(this.f42072a, this.f42073b);
    }

    public c(int i10, int i11) {
        if (l.t(i10, i11)) {
            this.f42072a = i10;
            this.f42073b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // f6.l
    public void onDestroy() {
    }

    @Override // f6.l
    public void onStart() {
    }

    @Override // f6.l
    public void onStop() {
    }

    @Override // j6.i
    public final void b(h hVar) {
    }

    @Override // j6.i
    public void c(Drawable drawable) {
    }

    @Override // j6.i
    public void g(Drawable drawable) {
    }
}
