package qb;

import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import ob.d0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final DecoderInputBuffer f50521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d0 f50522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f50523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f50524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f50525t;

    public b() {
        super(6);
        this.f50521p = new DecoderInputBuffer(1);
        this.f50522q = new d0();
    }

    private float[] L(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f50522q.S(byteBuffer.array(), byteBuffer.limit());
        this.f50522q.U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f50522q.u());
        }
        return fArr;
    }

    private void M() {
        a aVar = this.f50524s;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void B(long j10, boolean z10) {
        this.f50525t = Long.MIN_VALUE;
        M();
    }

    @Override // com.google.android.exoplayer2.f
    protected void H(v0[] v0VarArr, long j10, long j11) {
        this.f50523r = j11;
    }

    @Override // com.google.android.exoplayer2.c2
    public int a(v0 v0Var) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(v0Var.f18868l) ? c2.h(4) : c2.h(0);
    }

    @Override // com.google.android.exoplayer2.b2, com.google.android.exoplayer2.c2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.y1.b
    public void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f50524s = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // com.google.android.exoplayer2.b2
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // com.google.android.exoplayer2.b2
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.b2
    public void render(long j10, long j11) {
        while (!hasReadStreamToEnd() && this.f50525t < 100000 + j10) {
            this.f50521p.b();
            if (I(u(), this.f50521p, 0) != -4 || this.f50521p.g()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f50521p;
            this.f50525t = decoderInputBuffer.f16756e;
            if (this.f50524s != null && !decoderInputBuffer.f()) {
                this.f50521p.n();
                float[] fArrL = L((ByteBuffer) r0.j(this.f50521p.f16754c));
                if (fArrL != null) {
                    ((a) r0.j(this.f50524s)).a(this.f50525t - this.f50523r, fArrL);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void z() {
        M();
    }
}
