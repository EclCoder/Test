package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f11668a;

    public b(a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f11668a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f11668a.add(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f11668a) {
            if (aVar != null) {
                aVar.b(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f11668a) {
            if (aVar != null) {
                aVar.c(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f11668a) {
            if (aVar != null) {
                aVar.a(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f11668a) {
            if (aVar != null) {
                aVar.b(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f11668a) {
            if (aVar != null) {
                aVar.c(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f11668a) {
            if (aVar != null) {
                aVar.a(bVar, dVar, th2);
            }
        }
    }
}
