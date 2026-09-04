package wo;

import co.l;
import co.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56377a;

        static {
            int[] iArr = new int[eo.a.values().length];
            f56377a = iArr;
            try {
                iArr[eo.a.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56377a[eo.a.HANDSHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56377a[eo.a.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56377a[eo.a.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56377a[eo.a.UNCHALLENGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public e(zn.a aVar) {
        if (aVar != null) {
            return;
        }
        zn.h.k(getClass());
    }

    public boolean a(l lVar, q qVar, fo.c cVar, eo.g gVar, gp.f fVar) {
        throw null;
    }

    public boolean b(l lVar, q qVar, fo.c cVar, eo.g gVar, gp.f fVar) {
        int i10;
        if (cVar.a(lVar, qVar, fVar) || (i10 = a.f56377a[gVar.c().ordinal()]) == 1 || i10 == 2) {
            throw null;
        }
        if (i10 == 3) {
            return false;
        }
        gVar.f(eo.a.UNCHALLENGED);
        return false;
    }

    public e() {
        this(null);
    }
}
