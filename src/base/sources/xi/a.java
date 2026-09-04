package xi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import ji.e;
import ji.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected e f56868l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b.a f56857a = b.a.STOPPED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected m f56858b = m.H264;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ji.a f56859c = ji.a.AAC;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f56860d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f56861e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f56862f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f56863g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final MediaCodec.BufferInfo f56864h = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final MediaCodec.BufferInfo f56865i = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f56866j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f56867k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f56869m = 0;

    protected boolean f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[5];
        if (byteBuffer.remaining() < 5) {
            return false;
        }
        byteBuffer.duplicate().get(bArr, 0, 5);
        m mVar = this.f56858b;
        if (mVar == m.AV1) {
            return false;
        }
        if (mVar == m.H264 && (bArr[4] & 31) == 5) {
            return true;
        }
        return (mVar == m.H265 && ((bArr[4] >> 1) & 63) == 19) || ((bArr[4] >> 1) & 63) == 20;
    }

    public boolean g() {
        return this.f56857a == b.a.RECORDING;
    }

    public boolean h() {
        b.a aVar = this.f56857a;
        return aVar == b.a.STARTED || aVar == b.a.RECORDING || aVar == b.a.RESUMED || aVar == b.a.PAUSED;
    }

    public void i(MediaFormat mediaFormat) {
        c(mediaFormat, false);
    }

    protected void j(MediaCodec.BufferInfo bufferInfo, MediaCodec.BufferInfo bufferInfo2) {
        if (this.f56869m <= 0) {
            this.f56869m = bufferInfo2.presentationTimeUs;
        }
        bufferInfo.flags = bufferInfo2.flags;
        bufferInfo.offset = bufferInfo2.offset;
        bufferInfo.size = bufferInfo2.size;
        bufferInfo.presentationTimeUs = (bufferInfo2.presentationTimeUs - this.f56869m) - this.f56861e;
    }
}
