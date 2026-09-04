package com.vungle.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.downloader.Downloader;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class ServiceLocator {
    public static final Companion Companion = new Companion(null);
    private static volatile ServiceLocator INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, a> creators;
    private final Context ctx;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003R*\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/ServiceLocator$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/vungle/ads/ServiceLocator;", "getInstance", "(Landroid/content/Context;)Lcom/vungle/ads/ServiceLocator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lfl/k;", "inject", "(Landroid/content/Context;)Lfl/k;", "Lfl/g0;", "deInit", "INSTANCE", "Lcom/vungle/ads/ServiceLocator;", "getINSTANCE$vungle_ads_release", "()Lcom/vungle/ads/ServiceLocator;", "setINSTANCE$vungle_ads_release", "(Lcom/vungle/ads/ServiceLocator;)V", "getINSTANCE$vungle_ads_release$annotations", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$context = context;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // tl.a
            public final T invoke() {
                ServiceLocator companion = ServiceLocator.Companion.getInstance(this.$context);
                kotlin.jvm.internal.s.m(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                return companion.getService(Object.class);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized void deInit() {
            setINSTANCE$vungle_ads_release(null);
        }

        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        public final ServiceLocator getInstance(Context context) {
            ServiceLocator iNSTANCE$vungle_ads_release;
            kotlin.jvm.internal.s.h(context, "context");
            ServiceLocator iNSTANCE$vungle_ads_release2 = getINSTANCE$vungle_ads_release();
            if (iNSTANCE$vungle_ads_release2 != null) {
                return iNSTANCE$vungle_ads_release2;
            }
            synchronized (this) {
                Companion companion = ServiceLocator.Companion;
                iNSTANCE$vungle_ads_release = companion.getINSTANCE$vungle_ads_release();
                if (iNSTANCE$vungle_ads_release == null) {
                    iNSTANCE$vungle_ads_release = new ServiceLocator(context, null);
                    companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release);
                }
            }
            return iNSTANCE$vungle_ads_release;
        }

        public final /* synthetic */ <T> fl.k inject(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            fl.o oVar = fl.o.SYNCHRONIZED;
            kotlin.jvm.internal.s.l();
            return fl.l.a(oVar, new a(context));
        }

        public final void setINSTANCE$vungle_ads_release(ServiceLocator serviceLocator) {
            ServiceLocator.INSTANCE = serviceLocator;
        }

        private Companion() {
        }

        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class a {
        private final boolean isSingleton;

        public a(boolean z10) {
            this.isSingleton = z10;
        }

        public abstract Object create();

        public final boolean isSingleton() {
            return this.isSingleton;
        }

        public /* synthetic */ a(ServiceLocator serviceLocator, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends a {
        b() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.bidding.a create() {
            return new com.vungle.ads.internal.bidding.a(ServiceLocator.this.ctx);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends a {
        c() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.util.s create() {
            return new com.vungle.ads.internal.util.s(ServiceLocator.this.ctx);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends a {
        d() {
            super(false);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public Downloader create() {
            return new com.vungle.ads.internal.downloader.c(((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getDownloaderExecutor(), (com.vungle.ads.internal.util.s) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.s.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends a {
        e(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.util.g create() {
            return new com.vungle.ads.internal.util.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends a {
        f() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.signals.b create() {
            return new com.vungle.ads.internal.signals.b(ServiceLocator.this.ctx);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends a {
        g() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.network.i create() {
            return new com.vungle.ads.internal.network.i((com.vungle.ads.internal.network.k) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.network.k.class), ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getIoExecutor(), ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getJobExecutor(), (com.vungle.ads.internal.util.s) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.s.class), (com.vungle.ads.internal.signals.b) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.signals.b.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends a {
        h() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.task.c create() {
            return new com.vungle.ads.internal.task.k(ServiceLocator.this.ctx, (com.vungle.ads.internal.util.s) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.s.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i extends a {
        i() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.task.f create() {
            return new com.vungle.ads.internal.task.l((com.vungle.ads.internal.task.c) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.task.c.class), ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getJobExecutor(), new com.vungle.ads.internal.task.g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class j extends a {
        j() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.network.k create() {
            return new com.vungle.ads.internal.network.k(ServiceLocator.this.ctx, (com.vungle.ads.internal.platform.f) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.platform.f.class), (com.vungle.ads.internal.persistence.b) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.persistence.b.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class k extends a {
        k() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.platform.f create() {
            return new com.vungle.ads.internal.platform.d(ServiceLocator.this.ctx, ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getUaExecutor(), null, null, 12, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class l extends a {
        l(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.executor.a create() {
            return new com.vungle.ads.internal.executor.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class m extends a {
        m() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.omsdk.c create() {
            return new com.vungle.ads.internal.omsdk.c(ServiceLocator.this.ctx);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class n extends a {
        n(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.omsdk.d.b create() {
            return new com.vungle.ads.internal.omsdk.d.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class o extends a {
        o() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.persistence.b create() {
            return com.vungle.ads.internal.persistence.b.a.get$default(com.vungle.ads.internal.persistence.b.Companion, ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getIoExecutor(), (com.vungle.ads.internal.util.s) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.s.class), null, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class p extends a {
        p(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        public xj.a create() {
            return new xj.b();
        }
    }

    public /* synthetic */ ServiceLocator(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(com.vungle.ads.internal.task.c.class, new h());
        this.creators.put(com.vungle.ads.internal.task.f.class, new i());
        this.creators.put(com.vungle.ads.internal.network.k.class, new j());
        this.creators.put(com.vungle.ads.internal.platform.f.class, new k());
        this.creators.put(com.vungle.ads.internal.executor.a.class, new l(this));
        this.creators.put(com.vungle.ads.internal.omsdk.c.class, new m());
        this.creators.put(com.vungle.ads.internal.omsdk.d.b.class, new n(this));
        this.creators.put(com.vungle.ads.internal.persistence.b.class, new o());
        this.creators.put(xj.a.class, new p(this));
        this.creators.put(com.vungle.ads.internal.bidding.a.class, new b());
        this.creators.put(com.vungle.ads.internal.util.s.class, new c());
        this.creators.put(Downloader.class, new d());
        this.creators.put(com.vungle.ads.internal.util.g.class, new e(this));
        this.creators.put(com.vungle.ads.internal.signals.b.class, new f());
        this.creators.put(com.vungle.ads.internal.network.i.class, new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getOrBuild(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t10 = (T) this.cache.get(serviceClass);
        if (t10 != null) {
            return t10;
        }
        a aVar = this.creators.get(serviceClass);
        if (aVar == null) {
            throw new IllegalArgumentException("Unknown class");
        }
        T t11 = (T) aVar.create();
        if (aVar.isSingleton()) {
            this.cache.put(serviceClass, t11);
        }
        return t11;
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    public final <T> void bindService$vungle_ads_release(Class<?> serviceClass, T t10) {
        kotlin.jvm.internal.s.h(serviceClass, "serviceClass");
        this.cache.put(serviceClass, t10);
    }

    public final synchronized <T> T getService(Class<T> serviceClass) {
        kotlin.jvm.internal.s.h(serviceClass, "serviceClass");
        return (T) getOrBuild(serviceClass);
    }

    public final synchronized <T> boolean isCreated(Class<T> serviceClass) {
        kotlin.jvm.internal.s.h(serviceClass, "serviceClass");
        return this.cache.containsKey(getServiceClass(serviceClass));
    }

    private ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }
}
