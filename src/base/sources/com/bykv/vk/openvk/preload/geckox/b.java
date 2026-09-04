package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f11736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f11737s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f11739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f11740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final INetWork f11741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f11742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f11743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f11744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f11745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f11746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f11747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f11748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f11749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f11750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f11751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f11752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f11753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f11754q;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f11755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f11756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f11757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f11758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f11759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f11760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f11761g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f11762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f11763i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f11764j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f11765k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f11766l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private File f11767m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f11768n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f11769o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f11770p;

        public a(Context context) {
            this.f11758d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f11757c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f11756b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f11766l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f11755a = iNetWork;
            return this;
        }

        public final a b() {
            this.f11763i = 38L;
            return this;
        }

        public final a a(long j10) {
            this.f11770p = j10;
            return this;
        }

        public final a b(String str) {
            this.f11765k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f11760f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f11761g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f11762h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f11764j = str;
            return this;
        }

        public final a a(File file) {
            this.f11767m = file;
            return this;
        }
    }

    /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f11736r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f11737s == null) {
            synchronized (b.class) {
                try {
                    if (f11737s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f11737s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11737s;
    }

    public final Context a() {
        return this.f11738a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f11744g;
    }

    public final boolean c() {
        return this.f11752o;
    }

    public final List<String> d() {
        return this.f11743f;
    }

    public final List<String> e() {
        return this.f11742e;
    }

    public final JSONObject f() {
        return this.f11754q;
    }

    public final INetWork i() {
        return this.f11741d;
    }

    public final String j() {
        return this.f11748k;
    }

    public final long k() {
        return this.f11745h.longValue();
    }

    public final String l() {
        return this.f11750m;
    }

    public final String m() {
        return this.f11749l;
    }

    public final File n() {
        return this.f11751n;
    }

    public final String o() {
        return this.f11746i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f11739b;
    }

    public final IStatisticMonitor q() {
        return this.f11740c;
    }

    public final String r() {
        return this.f11747j;
    }

    public final long s() {
        return this.f11753p;
    }

    private b(a aVar) {
        Context context = aVar.f11758d;
        this.f11738a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f11756b;
        this.f11742e = list;
        this.f11743f = aVar.f11757c;
        this.f11739b = aVar.f11759e;
        this.f11744g = aVar.f11762h;
        Long l10 = aVar.f11763i;
        this.f11745h = l10;
        if (TextUtils.isEmpty(aVar.f11764j)) {
            this.f11746i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f11746i = aVar.f11764j;
        }
        String str = aVar.f11765k;
        this.f11747j = str;
        this.f11749l = aVar.f11768n;
        this.f11750m = aVar.f11769o;
        this.f11753p = aVar.f11770p;
        if (aVar.f11767m == null) {
            this.f11751n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f11751n = aVar.f11767m;
        }
        String str2 = aVar.f11766l;
        this.f11748k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f11741d = aVar.f11755a;
        this.f11740c = aVar.f11760f;
        this.f11752o = aVar.f11761g;
    }

    public final void a(JSONObject jSONObject) {
        this.f11754q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f11736r = iThreadPoolCallback;
    }
}
