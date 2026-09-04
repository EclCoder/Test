package jd;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gd.f f42248h;

    public a(String str, String str2, List list, String str3, String str4, String str5, String str6, gd.f fVar) {
        this.f42241a = str;
        this.f42242b = str2;
        this.f42243c = list;
        this.f42244d = str3;
        this.f42245e = str4;
        this.f42246f = str5;
        this.f42247g = str6;
        this.f42248h = fVar;
    }

    public static a a(Context context, r0 r0Var, String str, String str2, List list, gd.f fVar) {
        String packageName = context.getPackageName();
        String strG = r0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
