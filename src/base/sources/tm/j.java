package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f53518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53519b;

    public j(byte[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53518a = bufferWithData;
        this.f53519b = bufferWithData.length;
        b(10);
    }

    @Override // tm.j2
    public void b(int i10) {
        byte[] bArr = this.f53518a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, yl.g.d(i10, bArr.length * 2));
            kotlin.jvm.internal.s.g(bArrCopyOf, "copyOf(...)");
            this.f53518a = bArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53519b;
    }

    public final void e(byte b10) {
        j2.c(this, 0, 1, null);
        byte[] bArr = this.f53518a;
        int iD = d();
        this.f53519b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f53518a, d());
        kotlin.jvm.internal.s.g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
