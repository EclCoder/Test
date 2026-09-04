package gn;

import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39746a = a.f39748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f39747b = new a.C0596a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39748a = new a();

        /* JADX INFO: renamed from: gn.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0596a implements o {
            @Override // gn.o
            public List b(y url) {
                kotlin.jvm.internal.s.h(url, "url");
                return gl.r.l();
            }

            @Override // gn.o
            public void a(y url, List list) {
                kotlin.jvm.internal.s.h(url, "url");
                kotlin.jvm.internal.s.h(list, Lykgign.ZehImD);
            }
        }

        private a() {
        }
    }

    void a(y yVar, List list);

    List b(y yVar);
}
