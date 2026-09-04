package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3136m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3188o4 f26972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3162n4 f26973b;

    public C3136m4(C3188o4 configManagerState, C3162n4 configManagerDI) {
        kotlin.jvm.internal.s.h(configManagerState, "configManagerState");
        kotlin.jvm.internal.s.h(configManagerDI, "configManagerDI");
        this.f26972a = configManagerState;
        this.f26973b = configManagerDI;
    }

    public final Config a(Class clazz) {
        kotlin.jvm.internal.s.h(clazz, "clazz");
        String strA = AbstractC3421x4.a(clazz);
        Config config = (Config) this.f26972a.f27114b.get(strA);
        if (config == null) {
            String[] strArr = C3369v4.f27680a;
            for (int i10 = 0; i10 < 5; i10++) {
                String str = strArr[i10];
                if (this.f26972a.f27114b.get(str) == null) {
                    this.f26972a.f27114b.put(str, AbstractC3241q5.a(str));
                }
            }
            config = (Config) this.f26972a.f27114b.get(strA);
            em.k.d(this.f26973b.f27030a, null, null, new C3058j4(this, null), 3, null);
        }
        kotlin.jvm.internal.s.f(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(kotlin.coroutines.jvm.internal.d dVar) {
        C3084k4 c3084k4;
        if (dVar instanceof C3084k4) {
            c3084k4 = (C3084k4) dVar;
            int i10 = c3084k4.f26838c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3084k4.f26838c = i10 - Integer.MIN_VALUE;
            } else {
                c3084k4 = new C3084k4(this, dVar);
            }
        } else {
            c3084k4 = new C3084k4(this, dVar);
        }
        Object obj = c3084k4.f26836a;
        Object objF = ll.b.f();
        int i11 = c3084k4.f26838c;
        if (i11 == 0) {
            fl.s.b(obj);
            if (this.f26972a.f27113a.getAndSet(true)) {
                return fl.g0.f38750a;
            }
            c3084k4.f26838c = 1;
            if (a(c3084k4) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        String[] strArr = C3369v4.f27680a;
        for (int i12 = 0; i12 < 5; i12++) {
            String str = strArr[i12];
            if (this.f26972a.f27114b.get(str) == null) {
                this.f26972a.f27114b.put(str, AbstractC3241q5.a(str));
            }
        }
        em.k.d(this.f26973b.f27030a, null, null, new C3110l4(this, null), 3, null);
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        C3007h4 c3007h4;
        if (dVar instanceof C3007h4) {
            c3007h4 = (C3007h4) dVar;
            int i10 = c3007h4.f26652c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3007h4.f26652c = i10 - Integer.MIN_VALUE;
            } else {
                c3007h4 = new C3007h4(this, dVar);
            }
        } else {
            c3007h4 = new C3007h4(this, dVar);
        }
        Object objA = c3007h4.f26650a;
        Object objF = ll.b.f();
        int i11 = c3007h4.f26652c;
        if (i11 == 0) {
            fl.s.b(objA);
            C2929e4 c2929e4 = (C2929e4) this.f26973b.f27031b.getValue();
            c3007h4.f26652c = 1;
            objA = c2929e4.a(c3007h4);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        for (Config config : (Iterable) objA) {
            config.getType();
            this.f26972a.f27114b.put(config.getType(), config);
        }
        return fl.g0.f38750a;
    }
}
