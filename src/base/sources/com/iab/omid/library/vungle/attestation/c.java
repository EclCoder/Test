package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, k> f24210d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f24211e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f24212a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile List<b> f24214c;

    private c(Context context) {
        this.f24213b = context != null ? context.getApplicationContext() : null;
        c();
    }

    public static c a(Context context) {
        if (f24211e == null) {
            synchronized (c.class) {
                try {
                    if (f24211e == null) {
                        f24211e = new c(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f24211e;
    }

    private void c() {
        f24210d.put("FireTVFOSDAT", j.a(this.f24213b));
    }

    public boolean b() {
        return a().size() > 0;
    }

    public List<b> a() {
        List<b> list;
        b bVarA;
        if (this.f24214c != null) {
            return this.f24214c;
        }
        synchronized (this) {
            if (this.f24214c != null) {
                list = this.f24214c;
            } else {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, k> entry : f24210d.entrySet()) {
                        if (entry.getValue().a() && (bVarA = this.f24212a.a(entry.getKey(), this.f24213b)) != null) {
                            arrayList.add(bVarA);
                        }
                    }
                    this.f24214c = arrayList;
                    list = this.f24214c;
                } catch (Exception e10) {
                    com.iab.omid.library.vungle.utils.d.a("Error getting supported attestation mechanisms", e10);
                    this.f24214c = new ArrayList();
                    return this.f24214c;
                }
            }
        }
        return list;
    }

    public boolean a(String str) {
        k kVar = f24210d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }
}
