package qe;

import android.net.Uri;
import em.o0;
import fl.g0;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements qe.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50662c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ne.b f50663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.j f50664b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50665r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map f50667t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ tl.o f50668u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ tl.o f50669v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, tl.o oVar, tl.o oVar2, kl.f fVar) {
            super(2, fVar);
            this.f50667t = map;
            this.f50668u = oVar;
            this.f50669v = oVar2;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return e.this.new b(this.f50667t, this.f50668u, this.f50669v, fVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        
            if (r1.invoke(r3, r7) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(ne.b appInfo, kl.j blockingDispatcher) {
        s.h(appInfo, "appInfo");
        s.h(blockingDispatcher, "blockingDispatcher");
        this.f50663a = appInfo;
        this.f50664b = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f50663a.b()).appendPath("settings").appendQueryParameter("build_version", this.f50663a.a().a()).appendQueryParameter("display_version", this.f50663a.a().f()).build().toString());
    }

    @Override // qe.a
    public Object a(Map map, tl.o oVar, tl.o oVar2, kl.f fVar) {
        Object objJ = em.i.j(this.f50664b, new b(map, oVar, oVar2, null), fVar);
        return objJ == ll.b.f() ? objJ : g0.f38750a;
    }
}
