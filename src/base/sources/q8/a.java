package q8;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0777a f50423a = new C0777a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f50424b;

    /* JADX INFO: renamed from: q8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0777a {
        public /* synthetic */ C0777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0777a() {
        }
    }

    public final boolean a() {
        try {
            Method declaredMethod = Class.forName("com.google.android.gms.ads.internal.adaptersettings.AdapterSettings").getDeclaredMethod("getInstance", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            declaredMethod2.setAccessible(true);
            Object objInvoke2 = declaredMethod2.invoke(objInvoke, "adapter:mintegral_android_restrict_multiple_ads", Boolean.FALSE);
            s.f(objInvoke2, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke2).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            return false;
        }
    }

    public final void b(Bundle serverParams) {
        s.h(serverParams, "serverParams");
        if (serverParams.containsKey("enable_multiple_ads_per_unit") && s.c(serverParams.getString("enable_multiple_ads_per_unit"), "true")) {
            f50424b = true;
        }
    }

    public final boolean c() {
        return a() || f50424b;
    }
}
