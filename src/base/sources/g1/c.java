package g1;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f38830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f38831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f38834e = d.a();

    protected int a(int i10) {
        return i10 + this.f38831b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f38833d) {
            return this.f38831b.getShort(this.f38832c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f38831b = byteBuffer;
        if (byteBuffer == null) {
            this.f38830a = 0;
            this.f38832c = 0;
            this.f38833d = 0;
        } else {
            this.f38830a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f38832c = i11;
            this.f38833d = this.f38831b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f38830a;
        return i11 + this.f38831b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f38830a;
        return this.f38831b.getInt(i11 + this.f38831b.getInt(i11));
    }
}
