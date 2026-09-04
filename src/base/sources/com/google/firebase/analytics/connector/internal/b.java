package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.c0;
import com.google.common.collect.g0;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g0 f22083a = g0.E("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0 f22084b = c0.H("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f22085c = c0.F("auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f22086d = c0.E("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c0 f22087e = new c0.a().j(zzjo.zza).j(zzjo.zzb).m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c0 f22088f = c0.E("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f22089g = 0;

    public static boolean a(String str) {
        return !f22085c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f22084b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        c0 c0Var = f22086d;
        int size = c0Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) c0Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f22083a.contains(str);
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f22087e.contains(str2)) {
            return false;
        }
        c0 c0Var = f22088f;
        int size = c0Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) c0Var.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        c0 c0Var = f22086d;
        int size = c0Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) c0Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
