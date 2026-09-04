package com.google.firebase.abt.component;

import android.content.Context;
import ce.b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22068a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f22070c;

    protected a(Context context, b bVar) {
        this.f22069b = context;
        this.f22070c = bVar;
    }

    protected yc.b a(String str) {
        return new yc.b(this.f22069b, this.f22070c, str);
    }

    public synchronized yc.b b(String str) {
        try {
            if (!this.f22068a.containsKey(str)) {
                this.f22068a.put(str, a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (yc.b) this.f22068a.get(str);
    }
}
