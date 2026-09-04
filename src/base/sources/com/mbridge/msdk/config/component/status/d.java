package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f29115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f29116b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f29117c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SharedPreferences.OnSharedPreferenceChangeListener f29118d = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f29115a == null || !d.this.f29115a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916006");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f29115a.getAll().get(str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c(AppMeasurementSdk.ConditionalUserProperty.VALUE), obj);
            } catch (Exception unused) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c(AppMeasurementSdk.ConditionalUserProperty.VALUE), d.this.f29115a.getString(str, ""));
            }
            if (d.this.f29116b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f29116b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f29115a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f29118d);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f29117c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f29117c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f29116b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f29117c.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th2) {
            q0.b("PreferencePublisher", th2.getMessage());
        }
    }
}
