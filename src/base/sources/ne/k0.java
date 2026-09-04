package ne;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f47185a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wd.a f47186b;

    static {
        wd.a aVarI = new yd.d().j(c.f47107a).k(true).i();
        kotlin.jvm.internal.s.g(aVarI, "build(...)");
        f47186b = aVarI;
    }

    private k0() {
    }

    private final d d(oe.d dVar) {
        if (dVar == null) {
            return d.COLLECTION_SDK_NOT_INSTALLED;
        }
        return dVar.b() ? d.COLLECTION_ENABLED : d.COLLECTION_DISABLED;
    }

    public final j0 a(com.google.firebase.f firebaseApp, SessionDetails sessionDetails, qe.j sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.s.h(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.s.h(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.s.h(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.s.h(subscribers, "subscribers");
        kotlin.jvm.internal.s.h(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.s.h(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new j0(j.SESSION_START, new q0(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new e(d((oe.d) subscribers.get(oe.d.a.PERFORMANCE)), d((oe.d) subscribers.get(oe.d.a.CRASHLYTICS)), sessionsSettings.a()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final b b(com.google.firebase.f firebaseApp) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.s.h(firebaseApp, "firebaseApp");
        Context contextK = firebaseApp.k();
        kotlin.jvm.internal.s.g(contextK, "getApplicationContext(...)");
        String packageName = contextK.getPackageName();
        PackageInfo packageInfo = contextK.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = firebaseApp.n().c();
        kotlin.jvm.internal.s.g(strC, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.s.g(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.s.g(RELEASE, "RELEASE");
        u uVar = u.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.s.e(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.s.g(MANUFACTURER, "MANUFACTURER");
        d0 d0Var = d0.f47156a;
        Context contextK2 = firebaseApp.k();
        kotlin.jvm.internal.s.g(contextK2, "getApplicationContext(...)");
        c0 c0VarB = d0Var.b(contextK2);
        Context contextK3 = firebaseApp.k();
        kotlin.jvm.internal.s.g(contextK3, "getApplicationContext(...)");
        return new b(strC, MODEL, "3.0.7", RELEASE, uVar, new a(packageName, str2, strValueOf, MANUFACTURER, c0VarB, d0Var.a(contextK3)));
    }

    public final wd.a c() {
        return f47186b;
    }
}
