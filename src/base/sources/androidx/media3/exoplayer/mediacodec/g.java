package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import t1.v;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5609b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5610c = true;

    public g(Context context) {
        this.f5608a = context;
    }

    private boolean b() {
        int i10 = c0.f55769a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f5608a;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.h.b
    public h a(h.a aVar) {
        int i10;
        if (c0.f55769a < 23 || !((i10 = this.f5609b) == 1 || (i10 == 0 && b()))) {
            return new q.b().a(aVar);
        }
        int iF = v.f(aVar.f5613c.f52757n);
        w1.n.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + c0.m0(iF));
        b.C0062b c0062b = new b.C0062b(iF);
        c0062b.e(this.f5610c);
        return c0062b.a(aVar);
    }
}
