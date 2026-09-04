package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, d> f28866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d>> f28867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f28868c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f28869a = new f();
    }

    public static f a() {
        return b.f28869a;
    }

    private int b() {
        return this.f28868c.incrementAndGet();
    }

    private f() {
        this.f28866a = new ConcurrentHashMap<>();
        this.f28868c = new AtomicInteger();
        this.f28867b = new ConcurrentHashMap<>();
    }

    public synchronized void a(d dVar) {
        try {
            String strE = dVar.e();
            dVar.a(b());
            if (this.f28866a.containsKey(strE)) {
                dVar.b(dVar.i() != 7 ? 8 : 7);
                if (this.f28867b.containsKey(strE)) {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList = this.f28867b.get(strE);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(dVar);
                        this.f28867b.remove(strE);
                        this.f28867b.put(strE, copyOnWriteArrayList);
                    }
                } else {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(dVar);
                    this.f28867b.put(strE, copyOnWriteArrayList2);
                }
            } else {
                dVar.b(dVar.i() != 7 ? 2 : 7);
                this.f28866a.put(strE, dVar);
                dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d> copyOnWriteArrayListRemove;
        String strE = dVar.e();
        this.f28866a.remove(strE);
        if (this.f28867b.containsKey(strE) && (copyOnWriteArrayListRemove = this.f28867b.remove(strE)) != null && !copyOnWriteArrayListRemove.isEmpty()) {
            d dVarRemove = copyOnWriteArrayListRemove.remove(0);
            dVarRemove.b(2);
            this.f28866a.put(strE, dVarRemove);
            dVarRemove.a(i.b().a().getDownloadTasks().submit(new h(dVarRemove)));
            if (!copyOnWriteArrayListRemove.isEmpty()) {
                this.f28867b.put(strE, copyOnWriteArrayListRemove);
            }
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        try {
            if (!TextUtils.isEmpty(str) && this.f28867b.containsKey(str) && (copyOnWriteArrayList = this.f28867b.get(str)) != null && !copyOnWriteArrayList.isEmpty()) {
                for (d dVar : copyOnWriteArrayList) {
                    copyOnWriteArrayList.remove(dVar);
                    dVar.b(dVar.c());
                }
                if (!copyOnWriteArrayList.isEmpty()) {
                    this.f28867b.remove(str);
                    this.f28867b.put(str, copyOnWriteArrayList);
                } else {
                    this.f28867b.remove(str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                a(this.f28866a.get(str), str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void c() {
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.c());
            this.f28866a.remove(str);
        }
    }
}
