package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6515a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0071a extends t implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f6516a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0071a(Context context) {
                super(1);
                this.f6516a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(Context it) {
                s.h(it, "it");
                return new c(this.f6516a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            s.h(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            f4.a aVar = f4.a.f38240a;
            sb2.append(aVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (aVar.a() >= 5) {
                return new f(context);
            }
            if (aVar.b() >= 9) {
                return (b) f4.b.f38243a.a(context, "MeasurementManager", new C0071a(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kl.f fVar);

    public abstract Object b(kl.f fVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, kl.f fVar);

    public abstract Object d(i iVar, kl.f fVar);

    public abstract Object e(Uri uri, kl.f fVar);

    public abstract Object f(j jVar, kl.f fVar);

    public abstract Object g(k kVar, kl.f fVar);
}
