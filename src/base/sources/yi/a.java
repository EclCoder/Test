package yi;

import aj.c;
import android.content.Context;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import ji.f;
import kotlin.jvm.internal.s;
import mj.l;
import wi.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C0883a f58051u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l f58052v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final aj.a f58053w;

    /* JADX INFO: renamed from: yi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0883a implements c {
        C0883a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, boolean z10, f connectChecker) {
        super(context, z10);
        s.h(context, "context");
        s.h(connectChecker, "connectChecker");
        C0883a c0883a = new C0883a();
        this.f58051u = c0883a;
        l lVar = new l(connectChecker);
        this.f58052v = lVar;
        this.f58053w = new aj.a(lVar, c0883a);
    }

    @Override // wi.b
    protected void e(ByteBuffer audioBuffer, MediaCodec.BufferInfo info) {
        s.h(audioBuffer, "audioBuffer");
        s.h(info, "info");
        this.f58052v.Q(audioBuffer, info);
    }

    @Override // wi.b
    protected void f(ByteBuffer videoBuffer, MediaCodec.BufferInfo info) {
        s.h(videoBuffer, "videoBuffer");
        s.h(info, "info");
        this.f58052v.R(videoBuffer, info);
    }

    @Override // wi.b
    protected void i(boolean z10, int i10) {
        this.f58052v.S(i10, z10);
    }

    @Override // wi.b
    protected void j(ByteBuffer sps, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        s.h(sps, "sps");
        this.f58052v.V(sps, byteBuffer, byteBuffer2);
    }

    @Override // wi.b
    protected void w(String url) {
        s.h(url, "url");
        if (this.f56282d.L() == 90 || this.f56282d.L() == 270) {
            this.f58052v.W(this.f56282d.J(), this.f56282d.M());
        } else {
            this.f58052v.W(this.f56282d.M(), this.f56282d.J());
        }
        this.f58052v.U(this.f56282d.I());
        this.f58052v.A(url);
    }

    @Override // wi.b
    protected void y() {
        this.f58052v.D();
    }
}
