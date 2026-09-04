package zd;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f58797a = 0;

    b() {
    }

    long d() {
        return this.f58797a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f58797a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f58797a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f58797a += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
