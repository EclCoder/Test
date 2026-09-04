package zi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import ji.e;
import ji.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends xi.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MediaMuxer f58967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MediaFormat f58968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MediaFormat f58969p;

    private void k() {
        if (!this.f56867k) {
            this.f56863g = this.f58967n.addTrack(this.f58969p);
        }
        this.f58967n.start();
        this.f56857a = xi.b.a.RECORDING;
    }

    private void l(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.f58967n.writeSampleData(i10, byteBuffer, bufferInfo);
            e eVar = this.f56868l;
            if (eVar != null) {
                eVar.b(((long) bufferInfo.size) * 8, i.g());
            }
        } catch (Exception unused) {
        }
    }

    @Override // xi.b
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        xi.b.a aVar = this.f56857a;
        if (aVar != xi.b.a.STARTED || this.f58968o == null || (this.f58969p == null && !this.f56867k)) {
            if (aVar == xi.b.a.RESUMED && (bufferInfo.flags == 1 || f(byteBuffer))) {
                this.f56857a = xi.b.a.RECORDING;
            }
        } else if (bufferInfo.flags == 1 || f(byteBuffer)) {
            this.f56862f = this.f58967n.addTrack(this.f58968o);
            k();
        }
        if (this.f56857a == xi.b.a.RECORDING) {
            j(this.f56864h, bufferInfo);
            l(this.f56862f, byteBuffer, this.f56864h);
        }
    }

    @Override // xi.b
    public void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f56857a == xi.b.a.RECORDING) {
            j(this.f56865i, bufferInfo);
            l(this.f56863g, byteBuffer, this.f56865i);
        }
    }

    @Override // xi.b
    public void c(MediaFormat mediaFormat, boolean z10) {
        this.f58969p = mediaFormat;
        this.f56866j = z10;
        if (z10 && this.f56857a == xi.b.a.STARTED) {
            k();
        }
    }

    @Override // xi.b
    public void d() {
        this.f58968o = null;
        this.f58969p = null;
    }

    @Override // xi.b
    public void e(MediaFormat mediaFormat, boolean z10) {
        this.f58968o = mediaFormat;
        this.f56867k = z10;
    }
}
