package vi;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import li.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends li.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f55640r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ByteBuffer f55643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ByteBuffer f55644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ByteBuffer f55645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Surface f55646x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f55641s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f55642t = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f55647y = 640;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f55648z = 480;
    private int A = 30;
    private int B = 1228800;
    private int C = 90;
    private int D = 2;
    private final ri.b E = new ri.b();
    private a F = a.YUV420Dynamical;
    private int G = -1;
    private int H = -1;

    public c(b bVar) {
        this.f55640r = bVar;
        this.f44599q = si.a.d.VIDEO_CODEC;
        this.f44598p = MimeTypes.VIDEO_H264;
        this.f44583a = "VideoEncoder";
    }

    private a D(MediaCodecInfo mediaCodecInfo) {
        for (int i10 : mediaCodecInfo.getCapabilitiesForType(this.f44598p).colorFormats) {
            a aVar = a.YUV420PLANAR;
            if (i10 == aVar.g()) {
                return aVar;
            }
            a aVar2 = a.YUV420SEMIPLANAR;
            if (i10 == aVar2.g()) {
                return aVar2;
            }
        }
        return null;
    }

    private Pair F(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr, 0, i10);
        byteBuffer.rewind();
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= i10 - 4) {
                i12 = -1;
                break;
            }
            if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1) {
                if (i11 != -1) {
                    break;
                }
                i11 = i12;
            }
            i12++;
        }
        if (i11 == -1 || i12 == -1) {
            return null;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        int i13 = i10 - i12;
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr, i12, bArr3, 0, i13);
        return new Pair(ByteBuffer.wrap(bArr2), ByteBuffer.wrap(bArr3));
    }

    private ByteBuffer G(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (bufferInfo.flags != 1) {
            return null;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        ki.a aVar = new ki.a();
        for (ki.b bVar : aVar.b(bArr)) {
            if (aVar.a(bVar.c()[0]) == ki.c.SEQUENCE_HEADER) {
                return ByteBuffer.wrap(bVar.b());
            }
        }
        return null;
    }

    private List H(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        byteBuffer.rewind();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        for (int i14 = 0; i14 < iRemaining; i14++) {
            if (i13 == 3 && bArr[i14] == 1) {
                if (i12 == -1) {
                    i12 = i14 - 3;
                } else if (i10 == -1) {
                    i10 = i14 - 3;
                } else {
                    i11 = i14 - 3;
                }
            }
            i13 = bArr[i14] == 0 ? i13 + 1 : 0;
        }
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[i11 - i10];
        byte[] bArr4 = new byte[iRemaining - i11];
        for (int i15 = 0; i15 < iRemaining; i15++) {
            if (i15 < i10) {
                bArr2[i15] = bArr[i15];
            } else if (i15 < i11) {
                bArr3[i15 - i10] = bArr[i15];
            } else {
                bArr4[i15 - i11] = bArr[i15];
            }
        }
        arrayList.add(ByteBuffer.wrap(bArr2));
        arrayList.add(ByteBuffer.wrap(bArr3));
        arrayList.add(ByteBuffer.wrap(bArr4));
        return arrayList;
    }

    private boolean P(MediaFormat mediaFormat) {
        if (this.f44598p.equals("video/av01")) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
            if (byteBuffer == null || byteBuffer.remaining() <= 4) {
                return false;
            }
            this.f55640r.c(byteBuffer, null, null);
            return true;
        }
        if (!this.f44598p.equals(MimeTypes.VIDEO_H265)) {
            this.f55643u = mediaFormat.getByteBuffer("csd-0");
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
            this.f55644v = byteBuffer2;
            this.f55645w = null;
            this.f55640r.c(this.f55643u, byteBuffer2, null);
            return true;
        }
        List listH = H(mediaFormat.getByteBuffer("csd-0"));
        this.f55643u = (ByteBuffer) listH.get(1);
        this.f55644v = (ByteBuffer) listH.get(2);
        ByteBuffer byteBuffer3 = (ByteBuffer) listH.get(0);
        this.f55645w = byteBuffer3;
        this.f55640r.c(this.f55643u, this.f55644v, byteBuffer3);
        return true;
    }

    @Override // li.b
    protected void C() {
        this.f55641s = false;
        Surface surface = this.f55646x;
        if (surface != null) {
            surface.release();
        }
        this.f55646x = null;
        this.f55643u = null;
        this.f55644v = null;
        this.f55645w = null;
        Log.i(this.f44583a, "stopped");
    }

    protected MediaCodecInfo E(String str) {
        si.a.c cVar = this.f44592j;
        List<MediaCodecInfo> listH = cVar == si.a.c.HARDWARE ? si.a.h(str, true) : cVar == si.a.c.SOFTWARE ? si.a.j(str, true) : si.a.f(str, true, true);
        Log.i(this.f44583a, listH.size() + " encoders found");
        for (MediaCodecInfo mediaCodecInfo : listH) {
            Log.i(this.f44583a, "Encoder " + mediaCodecInfo.getName());
            for (int i10 : mediaCodecInfo.getCapabilitiesForType(str).colorFormats) {
                Log.i(this.f44583a, "Color supported: " + i10);
                a aVar = this.F;
                a aVar2 = a.SURFACE;
                if (aVar == aVar2) {
                    if (i10 == aVar2.g()) {
                        return mediaCodecInfo;
                    }
                } else {
                    if (i10 == a.YUV420PLANAR.g() || i10 == a.YUV420SEMIPLANAR.g()) {
                        return mediaCodecInfo;
                    }
                }
            }
        }
        return null;
    }

    public int I() {
        return this.A;
    }

    public int J() {
        return this.f55648z;
    }

    public Surface K() {
        return this.f55646x;
    }

    public int L() {
        return this.C;
    }

    public int M() {
        return this.f55647y;
    }

    public boolean N(int i10, int i11, int i12, int i13, int i14, int i15, a aVar, int i16, int i17) {
        String str;
        MediaFormat mediaFormatCreateVideoFormat;
        if (this.f44596n) {
            A();
        }
        this.f55647y = i10;
        this.f55648z = i11;
        this.A = i12;
        this.B = i13;
        this.C = i14;
        this.D = i15;
        this.F = aVar;
        this.G = i16;
        this.H = i17;
        this.f44591i = true;
        MediaCodecInfo mediaCodecInfoE = E(this.f44598p);
        try {
            if (mediaCodecInfoE == null) {
                Log.e(this.f44583a, "Valid encoder not found");
                return false;
            }
            Log.i(this.f44583a, "Encoder selected " + mediaCodecInfoE.getName());
            this.f44588f = MediaCodec.createByCodecName(mediaCodecInfoE.getName());
            if (this.F == a.YUV420Dynamical) {
                a aVarD = D(mediaCodecInfoE);
                this.F = aVarD;
                if (aVarD == null) {
                    Log.e(this.f44583a, "YUV420 dynamical choose failed");
                    return false;
                }
            }
            if (i14 == 90 || i14 == 270) {
                str = i11 + "x" + i10;
                mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f44598p, i11, i10);
            } else {
                str = i10 + "x" + i11;
                mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f44598p, i10, i11);
            }
            Log.i(this.f44583a, "Prepare video info: " + this.F.name() + ", " + str);
            mediaFormatCreateVideoFormat.setInteger("color-format", this.F.g());
            mediaFormatCreateVideoFormat.setInteger("max-input-size", 0);
            mediaFormatCreateVideoFormat.setInteger("bitrate", i13);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", i12);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i15);
            if (si.a.k(mediaCodecInfoE, this.f44598p)) {
                Log.i(this.f44583a, "set bitrate mode CBR");
                mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
            } else {
                Log.i(this.f44583a, "bitrate mode CBR not supported using default mode");
            }
            int i18 = this.G;
            if (i18 > 0) {
                mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, i18);
            }
            int i19 = this.H;
            if (i19 > 0) {
                mediaFormatCreateVideoFormat.setInteger("level", i19);
            }
            x();
            this.f44588f.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f44590h = false;
            if (aVar == a.SURFACE) {
                this.f44591i = false;
                this.f55646x = this.f44588f.createInputSurface();
            }
            Log.i(this.f44583a, "prepared");
            this.f44596n = true;
            return true;
        } catch (Exception e10) {
            Log.e(this.f44583a, "Create VideoEncoder failed.", e10);
            A();
            return false;
        }
    }

    public void O() {
        if (n()) {
            if (!this.f55641s) {
                this.f55642t = true;
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            try {
                this.f44588f.setParameters(bundle);
                this.f55640r.c(this.f55643u, this.f55644v, this.f55645w);
            } catch (IllegalStateException e10) {
                Log.e(this.f44583a, "encoder need be running", e10);
            }
        }
    }

    @Override // li.c
    public void b(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f55640r.b(mediaFormat);
        this.f55641s = P(mediaFormat);
    }

    @Override // li.b
    protected long f(e eVar, long j10) {
        return Math.max(0L, eVar.f() - j10);
    }

    @Override // li.b
    protected void g(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f55642t) {
            this.f55642t = false;
            O();
        }
        i(bufferInfo);
        if (!this.f55641s && this.f44598p.equals(MimeTypes.VIDEO_H264)) {
            Log.i(this.f44583a, "formatChanged not called, doing manual sps/pps extraction...");
            Pair pairF = F(byteBuffer.duplicate(), bufferInfo.size);
            if (pairF != null) {
                Log.i(this.f44583a, "manual sps/pps extraction success");
                ByteBuffer byteBuffer2 = (ByteBuffer) pairF.first;
                this.f55643u = byteBuffer2;
                ByteBuffer byteBuffer3 = (ByteBuffer) pairF.second;
                this.f55644v = byteBuffer3;
                this.f55645w = null;
                this.f55640r.c(byteBuffer2, byteBuffer3, null);
                this.f55641s = true;
            } else {
                Log.e(this.f44583a, "manual sps/pps extraction failed");
            }
        } else if (!this.f55641s && this.f44598p.equals(MimeTypes.VIDEO_H265)) {
            Log.i(this.f44583a, "formatChanged not called, doing manual vps/sps/pps extraction...");
            List listH = H(byteBuffer.duplicate());
            if (listH.size() == 3) {
                Log.i(this.f44583a, "manual vps/sps/pps extraction success");
                this.f55643u = (ByteBuffer) listH.get(1);
                this.f55644v = (ByteBuffer) listH.get(2);
                ByteBuffer byteBuffer4 = (ByteBuffer) listH.get(0);
                this.f55645w = byteBuffer4;
                this.f55640r.c(this.f55643u, this.f55644v, byteBuffer4);
                this.f55641s = true;
            } else {
                Log.e(this.f44583a, "manual vps/sps/pps extraction failed");
            }
        } else if (!this.f55641s && this.f44598p.equals("video/av01")) {
            Log.i(this.f44583a, "formatChanged not called, doing manual av1 extraction...");
            ByteBuffer byteBufferG = G(byteBuffer.duplicate(), bufferInfo);
            if (byteBufferG != null) {
                this.f55640r.c(byteBufferG, null, null);
                this.f55641s = true;
            } else {
                Log.e(this.f44583a, "manual av1 extraction failed");
            }
        }
        if (this.F == a.SURFACE) {
            bufferInfo.presentationTimeUs = (System.nanoTime() / 1000) - this.f44589g;
        }
    }

    @Override // li.b
    protected e k() {
        e eVar = (e) this.f44587e.take();
        if (eVar == null) {
            return null;
        }
        if (this.E.a()) {
            return k();
        }
        byte[] bArrA = eVar.a();
        boolean z10 = eVar.b() == 842094169;
        int iD = eVar.g() ? eVar.d() + 180 : eVar.d();
        if (iD >= 360) {
            iD -= 360;
        }
        byte[] bArrE = z10 ? ui.b.e(bArrA, this.f55647y, this.f55648z, iD) : ui.b.d(bArrA, this.f55647y, this.f55648z, iD);
        eVar.h(z10 ? ui.b.b(bArrE, this.f55647y, this.f55648z, this.F) : ui.b.a(bArrE, this.f55647y, this.f55648z, this.F));
        return eVar;
    }

    @Override // li.b
    public boolean u() {
        B(false);
        if (!N(this.f55647y, this.f55648z, this.A, this.B, this.C, this.D, this.F, this.G, this.H)) {
            return false;
        }
        v();
        return true;
    }

    @Override // li.b
    protected void w(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f55640r.a(byteBuffer, bufferInfo);
    }

    @Override // li.b
    public void z(boolean z10) {
        this.f55642t = false;
        this.f44595m = z10;
        this.f55641s = false;
        if (this.F != a.SURFACE) {
            ui.b.c(((this.f55647y * this.f55648z) * 3) / 2);
        }
        Log.i(this.f44583a, "started");
    }
}
