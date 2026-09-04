package li;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f44601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f44607g;

    public e(byte[] buffer, int i10, int i11, long j10) {
        s.h(buffer, "buffer");
        this.f44606f = 17;
        this.f44601a = buffer;
        this.f44602b = i10;
        this.f44603c = i11;
        this.f44607g = j10;
    }

    public final byte[] a() {
        return this.f44601a;
    }

    public final int b() {
        return this.f44606f;
    }

    public final int c() {
        return this.f44602b;
    }

    public final int d() {
        return this.f44604d;
    }

    public final int e() {
        return this.f44603c;
    }

    public final long f() {
        return this.f44607g;
    }

    public final boolean g() {
        return this.f44605e;
    }

    public final void h(byte[] bArr) {
        s.h(bArr, "<set-?>");
        this.f44601a = bArr;
    }
}
