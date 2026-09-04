package kk;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f43515a = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends t {
        @Override // kk.t
        public m c(String str, l lVar) {
            return m.a.c(str, lVar);
        }

        private b() {
        }
    }

    protected t() {
    }

    static t a() {
        return f43515a;
    }

    public final m b(String str) {
        return c(str, i.a());
    }

    public abstract m c(String str, l lVar);

    public final hk.a d(l lVar) {
        return i.b((l) jk.b.b(lVar, TtmlNode.TAG_SPAN), false);
    }
}
