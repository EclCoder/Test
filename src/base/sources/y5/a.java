package y5;

import com.bumptech.glide.load.data.j;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import r5.f;
import r5.g;
import x5.h;
import x5.m;
import x5.n;
import x5.o;
import x5.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f57420b = f.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f57421a;

    /* JADX INFO: renamed from: y5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0879a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f57422a = new m(500);

        @Override // x5.o
        public n d(r rVar) {
            return new a(this.f57422a);
        }
    }

    public a(m mVar) {
        this.f57421a = mVar;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, g gVar) {
        m mVar = this.f57421a;
        if (mVar != null) {
            h hVar2 = (h) mVar.a(hVar, 0, 0);
            if (hVar2 == null) {
                this.f57421a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) gVar.c(f57420b)).intValue()));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }
}
