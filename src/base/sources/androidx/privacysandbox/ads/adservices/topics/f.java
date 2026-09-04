package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6529a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0073a extends t implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f6530a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0073a(Context context) {
                super(1);
                this.f6530a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(Context it) {
                s.h(it, "it");
                return new g(this.f6530a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends t implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f6531a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(1);
                this.f6531a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h invoke(Context it) {
                s.h(it, "it");
                return new h(this.f6531a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Context context) {
            s.h(context, "context");
            f4.a aVar = f4.a.f38240a;
            if (aVar.a() >= 11) {
                return new i(context);
            }
            if (aVar.a() >= 5) {
                return new k(context);
            }
            if (aVar.a() == 4) {
                return new j(context);
            }
            if (aVar.b() >= 11) {
                return (f) f4.b.f38243a.a(context, "TopicsManager", new C0073a(context));
            }
            if (aVar.b() >= 9) {
                return (f) f4.b.f38243a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, kl.f fVar);
}
