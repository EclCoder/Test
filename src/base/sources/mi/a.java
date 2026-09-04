package mi;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import li.e;
import li.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends li.b implements ni.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f46254r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f46258v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f46255s = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f46256t = 32000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f46257u = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f46259w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f46260x = false;

    public a(c cVar) {
        this.f46254r = cVar;
        this.f44599q = si.a.d.AUDIO_CODEC;
        this.f44598p = MimeTypes.AUDIO_AAC;
        this.f44583a = "AudioEncoder";
    }

    @Override // li.b
    protected void C() {
        this.f46259w = 0L;
        Log.i(this.f44583a, "stopped");
    }

    protected MediaCodecInfo D(String str) {
        List listI;
        si.a.c cVar = this.f44592j;
        if (cVar == si.a.c.HARDWARE) {
            listI = si.a.g(MimeTypes.AUDIO_AAC);
        } else {
            listI = cVar == si.a.c.SOFTWARE ? si.a.i(MimeTypes.AUDIO_AAC) : si.a.e(str, true);
        }
        Log.i(this.f44583a, listI.size() + " encoders found");
        if (listI.isEmpty()) {
            return null;
        }
        return (MediaCodecInfo) listI.get(0);
    }

    public boolean E(int i10, int i11, boolean z10) {
        if (this.f44596n) {
            A();
        }
        this.f46255s = i10;
        this.f46256t = i11;
        this.f46257u = z10;
        this.f44591i = true;
        try {
            int i12 = 2;
            if (this.f44598p.equals(MimeTypes.AUDIO_ALAW)) {
                b bVar = this.f44584b;
                if (!z10) {
                    i12 = 1;
                }
                bVar.a(i11, i12);
                x();
                this.f44590h = false;
                Log.i(this.f44583a, "prepared");
                this.f44596n = true;
                return true;
            }
            MediaCodecInfo mediaCodecInfoD = D(this.f44598p);
            if (mediaCodecInfoD == null) {
                Log.e(this.f44583a, "Valid encoder not found");
                return false;
            }
            Log.i(this.f44583a, "Encoder selected " + mediaCodecInfoD.getName());
            this.f44588f = MediaCodec.createByCodecName(mediaCodecInfoD.getName());
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.f44598p, i11, z10 ? 2 : 1);
            mediaFormatCreateAudioFormat.setInteger("bitrate", i10);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", 8192);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            x();
            this.f44588f.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f44590h = false;
            Log.i(this.f44583a, "prepared");
            this.f44596n = true;
            return true;
        } catch (Exception e10) {
            Log.e(this.f44583a, "Create AudioEncoder failed.", e10);
            A();
            return false;
        }
    }

    public void F(f fVar) {
        this.f46258v = fVar;
    }

    @Override // ni.c
    public void a(e eVar) {
        if (!this.f44590h || this.f44587e.offer(eVar)) {
            return;
        }
        Log.i(this.f44583a, "frame discarded");
    }

    @Override // li.c
    public void b(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f46254r.a(mediaFormat);
    }

    @Override // li.b
    protected long f(e eVar, long j10) {
        if (!this.f46260x) {
            return Math.max(0L, eVar.f() - j10);
        }
        int i10 = this.f46257u ? 2 : 1;
        long j11 = this.f46259w;
        long j12 = (((1000000 * j11) / 2) / ((long) i10)) / ((long) this.f46256t);
        this.f46259w = j11 + ((long) eVar.e());
        return j12;
    }

    @Override // li.b
    protected void g(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        i(bufferInfo);
    }

    @Override // li.b
    protected e k() {
        f fVar = this.f46258v;
        return fVar != null ? fVar.a() : (e) this.f44587e.take();
    }

    @Override // li.b
    public boolean u() {
        B(false);
        if (!E(this.f46255s, this.f46256t, this.f46257u)) {
            return false;
        }
        v();
        return true;
    }

    @Override // li.b
    protected void w(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f46254r.b(byteBuffer, bufferInfo);
    }

    @Override // li.b
    public void z(boolean z10) {
        this.f44595m = z10;
        Log.i(this.f44583a, "started");
    }
}
