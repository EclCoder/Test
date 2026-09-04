package cc;

import android.content.Context;
import android.graphics.Color;
import jc.b;
import sb.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f9950f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f9955e;

    public a(Context context) {
        this(b.c(context, c.f51630r, false), ac.a.b(context, c.f51628q, 0), ac.a.b(context, c.f51626p, 0), ac.a.b(context, c.f51620m, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i10) {
        return e0.a.k(i10, 255) == this.f9954d;
    }

    public float a(float f10) {
        float f11 = this.f9955e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = ac.a.j(e0.a.k(i10, 255), this.f9952b, fA);
        if (fA > 0.0f && (i11 = this.f9953c) != 0) {
            iJ = ac.a.i(iJ, e0.a.k(i11, f9950f));
        }
        return e0.a.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f9951a && f(i10)) ? b(i10, f10) : i10;
    }

    public int d(float f10) {
        return c(this.f9954d, f10);
    }

    public boolean e() {
        return this.f9951a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f9951a = z10;
        this.f9952b = i10;
        this.f9953c = i11;
        this.f9954d = i12;
        this.f9955e = f10;
    }
}
