package n2;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.source.r;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import t1.o;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final DecoderInputBuffer f46773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final u f46774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f46775t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f46776u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f46777v;

    public b() {
        super(6);
        this.f46773r = new DecoderInputBuffer(1);
        this.f46774s = new u();
    }

    private float[] Z(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f46774s.R(byteBuffer.array(), byteBuffer.limit());
        this.f46774s.T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f46774s.t());
        }
        return fArr;
    }

    private void a0() {
        a aVar = this.f46776u;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void L() {
        a0();
    }

    @Override // androidx.media3.exoplayer.h
    protected void O(long j10, boolean z10) {
        this.f46777v = Long.MIN_VALUE;
        a0();
    }

    @Override // androidx.media3.exoplayer.h
    protected void U(o[] oVarArr, long j10, long j11, r.b bVar) {
        this.f46775t = j11;
    }

    @Override // androidx.media3.exoplayer.g2
    public int a(o oVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(oVar.f52757n) ? g2.h(4) : g2.h(0);
    }

    @Override // androidx.media3.exoplayer.f2, androidx.media3.exoplayer.g2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.d2.b
    public void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f46776u = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.f2
    public void render(long j10, long j11) {
        while (!hasReadStreamToEnd() && this.f46777v < 100000 + j10) {
            this.f46773r.b();
            if (W(F(), this.f46773r, 0) != -4 || this.f46773r.e()) {
                return;
            }
            long j12 = this.f46773r.f4866f;
            this.f46777v = j12;
            boolean z10 = j12 < H();
            if (this.f46776u != null && !z10) {
                this.f46773r.l();
                float[] fArrZ = Z((ByteBuffer) c0.h(this.f46773r.f4864d));
                if (fArrZ != null) {
                    ((a) c0.h(this.f46776u)).a(this.f46777v - this.f46775t, fArrZ);
                }
            }
        }
    }
}
