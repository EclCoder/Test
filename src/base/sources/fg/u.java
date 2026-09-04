package fg;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class u extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private eg.e f38669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f38670e;

    u(eg.e eVar) {
        this.f38669d = eVar;
    }

    @Override // fg.h
    protected MediaFormat b() {
        return this.f38669d.e();
    }

    @Override // fg.h
    protected void f(MediaCodec mediaCodec) {
        this.f38670e = mediaCodec.createInputSurface();
    }

    @Override // fg.h
    public void h() {
        Surface surface = this.f38670e;
        if (surface != null) {
            surface.release();
            this.f38670e = null;
        }
        super.h();
    }

    Surface m() {
        Surface surface = this.f38670e;
        Objects.requireNonNull(surface, "doesn't prepare()");
        return surface;
    }

    public void n() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f38645a.setParameters(bundle);
    }
}
