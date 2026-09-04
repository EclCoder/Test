package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.B1;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AppSetIdInfo f24495a;

    static {
        b();
    }

    public static final void a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static void b() {
        Context context = Xi.f26021a;
        if (context != null && a()) {
            AppSetIdClient client = AppSet.getClient(context);
            kotlin.jvm.internal.s.g(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            kotlin.jvm.internal.s.g(appSetIdInfo, "getAppSetIdInfo(...)");
            final Function1 function1 = new Function1() { // from class: yh.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return B1.a((AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: yh.h
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    B1.a(function1, obj);
                }
            });
        }
    }

    public static final fl.g0 a(AppSetIdInfo appSetIdInfo) {
        f24495a = appSetIdInfo;
        return fl.g0.f38750a;
    }

    public static boolean a() {
        try {
            kotlin.jvm.internal.l0.b(AppSetIdInfo.class).k();
            kotlin.jvm.internal.l0.b(Task.class).k();
            return true;
        } catch (NoClassDefFoundError e10) {
            kotlin.jvm.internal.s.g("B1", "tag");
            e10.toString();
            return false;
        }
    }

    public static void a(LinkedHashMap mutableMap) {
        AppSetIdInfo appSetIdInfo;
        kotlin.jvm.internal.s.h(mutableMap, "mutableMap");
        if (a() && (appSetIdInfo = f24495a) != null) {
            mutableMap.put("d-app-set-id", appSetIdInfo.getId());
            int scope = appSetIdInfo.getScope();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(scope);
        }
    }
}
