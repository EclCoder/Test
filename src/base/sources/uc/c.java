package uc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f54399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54401c;

    protected c(int i10) {
        this(i10, i10);
    }

    private void f() {
        h.a(this.f54399a);
        while (this.f54399a.remaining() >= this.f54401c) {
            h(this.f54399a);
        }
        this.f54399a.compact();
    }

    private void g() {
        if (this.f54399a.remaining() < 8) {
            f();
        }
    }

    private f j(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f54399a.remaining()) {
            this.f54399a.put(byteBuffer);
            g();
            return this;
        }
        int iPosition = this.f54400b - this.f54399a.position();
        for (int i10 = 0; i10 < iPosition; i10++) {
            this.f54399a.put(byteBuffer.get());
        }
        f();
        while (byteBuffer.remaining() >= this.f54401c) {
            h(byteBuffer);
        }
        this.f54399a.put(byteBuffer);
        return this;
    }

    @Override // uc.f
    public final d b() {
        f();
        h.a(this.f54399a);
        if (this.f54399a.remaining() > 0) {
            i(this.f54399a);
            ByteBuffer byteBuffer = this.f54399a;
            h.b(byteBuffer, byteBuffer.limit());
        }
        return e();
    }

    @Override // uc.f
    public final f c(byte b10) {
        this.f54399a.put(b10);
        g();
        return this;
    }

    @Override // uc.b
    public final f d(byte[] bArr, int i10, int i11) {
        return j(ByteBuffer.wrap(bArr, i10, i11).order(ByteOrder.LITTLE_ENDIAN));
    }

    protected abstract d e();

    protected abstract void h(ByteBuffer byteBuffer);

    protected abstract void i(ByteBuffer byteBuffer);

    protected c(int i10, int i11) {
        p.d(i11 % i10 == 0);
        this.f54399a = ByteBuffer.allocate(i11 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f54400b = i11;
        this.f54401c = i10;
    }
}
