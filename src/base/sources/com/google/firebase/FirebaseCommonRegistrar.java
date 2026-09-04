package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String d(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ie.c.b());
        arrayList.add(be.f.f());
        arrayList.add(ie.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ie.h.b("fire-core", "22.0.1"));
        arrayList.add(ie.h.b("device-name", e(Build.PRODUCT)));
        arrayList.add(ie.h.b("device-model", e(Build.DEVICE)));
        arrayList.add(ie.h.b("device-brand", e(Build.BRAND)));
        arrayList.add(ie.h.c("android-target-sdk", new ie.h.a() { // from class: com.google.firebase.h
            @Override // ie.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(ie.h.c("android-min-sdk", new ie.h.a() { // from class: com.google.firebase.i
            @Override // ie.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(ie.h.c("android-platform", new ie.h.a() { // from class: com.google.firebase.j
            @Override // ie.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(ie.h.c("android-installer", new ie.h.a() { // from class: com.google.firebase.k
            @Override // ie.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String strA = ie.e.a();
        if (strA != null) {
            arrayList.add(ie.h.b("kotlin", strA));
        }
        return arrayList;
    }
}
