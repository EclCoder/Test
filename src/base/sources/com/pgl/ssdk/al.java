package com.pgl.ssdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile al f35316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f35317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f35318c = new ArrayList();

    private al(Context context) {
        this.f35317b = null;
        this.f35317b = context;
    }

    public static al a(Context context) {
        if (f35316a == null) {
            synchronized (al.class) {
                try {
                    if (f35316a == null) {
                        f35316a = new al(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f35316a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f35317b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intentRegisterReceiver = this.f35317b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return Math.round(((intentRegisterReceiver.getIntExtra("level", 0) / intentRegisterReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f35318c.size() <= 0) {
            return "-1";
        }
        List<Integer> list = this.f35318c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f35318c).toString();
    }

    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f35318c.add(Integer.valueOf(iF));
        try {
            int size = this.f35318c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f35318c.subList(size - 10, size));
                this.f35318c.clear();
                this.f35318c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
