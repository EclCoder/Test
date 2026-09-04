package xn;

import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f56999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        kotlin.jvm.internal.s.h(randomAccessFile, "randomAccessFile");
        this.f56999e = randomAccessFile;
    }

    @Override // xn.j
    protected synchronized void l() {
        this.f56999e.close();
    }

    @Override // xn.j
    protected synchronized int m(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.s.h(array, "array");
        this.f56999e.seek(j10);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.f56999e.read(array, i10, i11 - i12);
            if (i13 == -1) {
                if (i12 != 0) {
                    break;
                }
                return -1;
            }
            i12 += i13;
        }
        return i12;
    }

    @Override // xn.j
    protected synchronized long q() {
        return this.f56999e.length();
    }
}
