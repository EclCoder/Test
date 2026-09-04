package ta;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f53256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f53257k;

    public l(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, int i10, v0 v0Var, int i11, Object obj, byte[] bArr) {
        super(jVar, aVar, i10, v0Var, i11, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.f53256j = bArr == null ? r0.f48430f : bArr;
    }

    private void g(int i10) {
        byte[] bArr = this.f53256j;
        if (bArr.length < i10 + 16384) {
            this.f53256j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void cancelLoad() {
        this.f53257k = true;
    }

    protected abstract void e(byte[] bArr, int i10);

    public byte[] f() {
        return this.f53256j;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() {
        try {
            this.f53219i.h(this.f53212b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f53257k) {
                g(i11);
                i10 = this.f53219i.read(this.f53256j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f53257k) {
                e(this.f53256j, i11);
            }
        } finally {
            nb.l.a(this.f53219i);
        }
    }
}
