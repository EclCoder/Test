package lf;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44425b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile h f44426c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rc.c f44427a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Context context) {
            h hVar;
            s.h(context, "context");
            h hVar2 = h.f44426c;
            if (hVar2 != null) {
                return hVar2;
            }
            synchronized (this) {
                hVar = h.f44426c;
                if (hVar == null) {
                    hVar = new h(context, null);
                    h.f44426c = hVar;
                }
            }
            return hVar;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(rc.e eVar);
    }

    public /* synthetic */ h(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Activity activity, final b bVar) {
        rc.f.b(activity, new rc.b.a() { // from class: lf.g
            @Override // rc.b.a
            public final void a(rc.e eVar) {
                h.h(bVar, eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(b bVar, rc.e eVar) {
        bVar.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(b bVar, rc.e eVar) {
        bVar.a(eVar);
    }

    public static final h j(Context context) {
        return f44425b.a(context);
    }

    public final void f(final Activity activity, final b onConsentGatheringCompleteListener) {
        s.h(activity, "activity");
        s.h(onConsentGatheringCompleteListener, "onConsentGatheringCompleteListener");
        this.f44427a.requestConsentInfoUpdate(activity, new rc.d.a().a(), new rc.c.b() { // from class: lf.e
            @Override // rc.c.b
            public final void onConsentInfoUpdateSuccess() {
                h.g(activity, onConsentGatheringCompleteListener);
            }
        }, new rc.c.a() { // from class: lf.f
            @Override // rc.c.a
            public final void onConsentInfoUpdateFailure(rc.e eVar) {
                h.i(onConsentGatheringCompleteListener, eVar);
            }
        });
    }

    public final boolean k() {
        return this.f44427a.getPrivacyOptionsRequirementStatus() == rc.c.EnumC0792c.REQUIRED;
    }

    public final void l(Activity activity, rc.b.a onConsentFormDismissedListener) {
        s.h(activity, "activity");
        s.h(onConsentFormDismissedListener, "onConsentFormDismissedListener");
        rc.f.c(activity, onConsentFormDismissedListener);
    }

    private h(Context context) {
        rc.c cVarA = rc.f.a(context);
        s.g(cVarA, "getConsentInformation(...)");
        this.f44427a = cVarA;
    }
}
