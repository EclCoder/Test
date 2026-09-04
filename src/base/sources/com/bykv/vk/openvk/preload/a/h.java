package com.bykv.vk.openvk.preload.a;

import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class<? extends d> f11682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f11683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f11684c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f11685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f11686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f11687c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f11685a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f11686b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f11687c = objArr;
            return this;
        }
    }

    /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f11683b;
    }

    final Object[] b() {
        return this.f11684c;
    }

    private h(a aVar) {
        this.f11682a = aVar.f11685a;
        this.f11683b = aVar.f11686b;
        this.f11684c = aVar.f11687c;
        if (this.f11682a == null) {
            throw new IllegalArgumentException(UoyZyZEcGYBpIg.SzyP);
        }
    }
}
