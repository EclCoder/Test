package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<b<String>>> f29436a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f29437b = new ConcurrentHashMap<>();

    public void a(String str, b<String> bVar) {
        try {
            this.f29436a.computeIfAbsent(str, new Function() { // from class: fi.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return com.mbridge.msdk.config.dynamic.binddata.wrapper.a.a((String) obj);
                }
            }).addIfAbsent(bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to add map observer: " + e10.getMessage(), e10);
        }
    }

    public boolean d() {
        return this.f29437b.isEmpty();
    }

    public Set<String> e() {
        return this.f29437b.keySet();
    }

    public int f() {
        return this.f29437b.size();
    }

    public Collection<Object> g() {
        return this.f29437b.values();
    }

    public String toString() {
        return this.f29437b.toString();
    }

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e10.getMessage(), e10);
        }
    }

    public Map<String, CopyOnWriteArrayList<b<String>>> c() {
        return this.f29436a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CopyOnWriteArrayList a(String str) {
        return new CopyOnWriteArrayList();
    }

    public Object c(Object obj) {
        return this.f29437b.remove(obj);
    }

    public boolean a(Object obj) {
        return this.f29437b.containsKey(obj);
    }

    public Map<String, Object> b() {
        return this.f29437b;
    }

    public Set<Map.Entry<String, Object>> a() {
        return this.f29437b.entrySet();
    }

    public void b(Map<String, CopyOnWriteArrayList<b<String>>> map) {
        this.f29436a.clear();
        this.f29436a.putAll(map);
    }

    public void a(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public Object b(Object obj) {
        return this.f29437b.get(obj);
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.f29437b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", e10.getMessage(), e10);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.f29437b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e10.getMessage(), e10);
            return 0;
        }
    }

    private void a(final String str, final Object obj, String str2) {
        CopyOnWriteArrayList<b<String>> copyOnWriteArrayList;
        if (this.f29436a.containsKey(str) && (copyOnWriteArrayList = this.f29436a.get(str)) != null) {
            for (final b<String> bVar : copyOnWriteArrayList) {
                if (bVar instanceof d) {
                    View viewA = ((d) bVar).a();
                    if (viewA != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.a(str, obj);
                        } else {
                            viewA.post(new Runnable() { // from class: fi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bVar.a(str, obj);
                                }
                            });
                        }
                    } else {
                        bVar.a(str, obj);
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }
}
