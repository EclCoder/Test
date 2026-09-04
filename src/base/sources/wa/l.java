package wa;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class l implements ra.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f56107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f56108c = -1;

    public l(p pVar, int i10) {
        this.f56107b = pVar;
        this.f56106a = i10;
    }

    private boolean c() {
        int i10 = this.f56108c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // ra.s
    public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (this.f56108c == -3) {
            decoderInputBuffer.a(4);
            return -4;
        }
        if (c()) {
            return this.f56107b.R(this.f56108c, pVar, decoderInputBuffer, i10);
        }
        return -3;
    }

    public void b() {
        ob.a.a(this.f56108c == -1);
        this.f56108c = this.f56107b.k(this.f56106a);
    }

    public void d() {
        if (this.f56108c != -1) {
            this.f56107b.c0(this.f56106a);
            this.f56108c = -1;
        }
    }

    @Override // ra.s
    public boolean isReady() {
        if (this.f56108c != -3) {
            return c() && this.f56107b.D(this.f56108c);
        }
        return true;
    }

    @Override // ra.s
    public void maybeThrowError() throws SampleQueueMappingException {
        int i10 = this.f56108c;
        if (i10 == -2) {
            throw new SampleQueueMappingException(this.f56107b.getTrackGroups().b(this.f56106a).c(0).f18868l);
        }
        if (i10 == -1) {
            this.f56107b.H();
        } else if (i10 != -3) {
            this.f56107b.I(i10);
        }
    }

    @Override // ra.s
    public int skipData(long j10) {
        if (c()) {
            return this.f56107b.b0(this.f56108c, j10);
        }
        return 0;
    }
}
