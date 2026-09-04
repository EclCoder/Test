package on;

import java.util.List;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49191a = a.f49193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f49192b = new a.C0761a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f49193a = new a();

        /* JADX INFO: renamed from: on.x$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0761a implements x {
            @Override // on.x
            public void a(int i10, on.a errorCode) {
                kotlin.jvm.internal.s.h(errorCode, "errorCode");
            }

            @Override // on.x
            public boolean c(int i10, List responseHeaders, boolean z10) {
                kotlin.jvm.internal.s.h(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // on.x
            public boolean d(int i10, xn.g source, int i11, boolean z10) {
                kotlin.jvm.internal.s.h(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // on.x
            public boolean b(int i10, List list) {
                kotlin.jvm.internal.s.h(list, CIdIVqKnNZ.cvyicdvpAxr);
                return true;
            }
        }

        private a() {
        }
    }

    void a(int i10, on.a aVar);

    boolean b(int i10, List list);

    boolean c(int i10, List list, boolean z10);

    boolean d(int i10, xn.g gVar, int i11, boolean z10);
}
