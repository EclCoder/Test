package vg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.s;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f55523a = new c();

    private c() {
    }

    private final void c(Context context, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("action", str3);
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, str);
        bundle.putString("action_source", str2);
        FirebaseAnalytics.getInstance(context).a("dedicated_app_promo", bundle);
    }

    public static final void d(Context context, String packageName, String placement) {
        s.h(context, "context");
        s.h(packageName, "packageName");
        s.h(placement, "placement");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            e(context, packageName, placement);
            return;
        }
        try {
            context.startActivity(launchIntentForPackage.addFlags(268435456));
            f55523a.c(context, packageName, placement, "open_app");
        } catch (Exception e10) {
            wp.a.f(e10, "Could not launch %s, falling back to its listing", packageName);
            com.google.firebase.crashlytics.a.b().d(e10);
            e(context, packageName, placement);
        }
    }

    public static final void e(Context context, String packageName, String placement) {
        s.h(context, "context");
        s.h(packageName, "packageName");
        s.h(placement, "placement");
        c cVar = f55523a;
        cVar.c(context, packageName, placement, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        Intent intentAddFlags = new Intent("android.intent.action.VIEW").setData(cVar.h(packageName, placement)).addFlags(268435456);
        s.g(intentAddFlags, "addFlags(...)");
        try {
            try {
                context.startActivity(new Intent(intentAddFlags).setPackage("com.android.vending"));
            } catch (ActivityNotFoundException e10) {
                wp.a.f(e10, "No Play Store and no browser to open %s", packageName);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        } catch (ActivityNotFoundException unused) {
            context.startActivity(intentAddFlags);
        }
    }

    private final Uri h(String str, String str2) {
        return Uri.parse("https://play.google.com/store/apps/details?id=" + str + "&referrer=" + Uri.encode("utm_source=az_screen_recorder&utm_medium=cross_promo&utm_campaign=" + str2));
    }

    public final boolean a(Context context, String packageName) {
        s.h(context, "context");
        s.h(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean b(Context context, b promo) {
        s.h(context, "context");
        s.h(promo, "promo");
        return a(context, promo.j());
    }

    public final void f(Context context, b promo, String placement) {
        s.h(context, "context");
        s.h(promo, "promo");
        s.h(placement, "placement");
        e(context, promo.j(), placement);
    }

    public final boolean g(Context context, b promo) {
        s.h(context, "context");
        s.h(promo, "promo");
        return (l0.o() || b(context, promo)) ? false : true;
    }
}
