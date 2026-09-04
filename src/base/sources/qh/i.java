package qh;

import android.graphics.Matrix;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f50829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f50832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f50833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f50834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f50835m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String id2, String text, Matrix matrix, int i10, int i11, float f10, float f11, long j10, long j11) {
        super(id2, text, j10, j11);
        s.h(id2, "id");
        s.h(text, "text");
        this.f50827e = id2;
        this.f50828f = text;
        this.f50829g = matrix;
        this.f50830h = i10;
        this.f50831i = i11;
        this.f50832j = f10;
        this.f50833k = f11;
        this.f50834l = j10;
        this.f50835m = j11;
    }

    @Override // qh.k
    public abstract long b();

    @Override // qh.k
    public abstract long c();

    public abstract int g();

    @Override // qh.k
    public abstract String getId();

    public abstract Matrix h();

    public abstract float i();

    public abstract float j();

    public abstract int k();

    public abstract void l(Matrix matrix);

    public abstract void m(float f10);

    public abstract void n(float f10);
}
