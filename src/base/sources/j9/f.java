package j9;

import android.app.job.JobInfo;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m9.a f42134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f42135b = new HashMap();

        public a a(a9.e eVar, b bVar) {
            this.f42135b.put(eVar, bVar);
            return this;
        }

        public f b() {
            if (this.f42134a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f42135b.keySet().size() < a9.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f42135b;
            this.f42135b = new HashMap();
            return f.d(this.f42134a, map);
        }

        public a c(m9.a aVar) {
            this.f42134a = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new j9.c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    public static a b() {
        return new a();
    }

    static f d(m9.a aVar, Map map) {
        return new j9.b(aVar, map);
    }

    public static f f(m9.a aVar) {
        return b().a(a9.e.DEFAULT, b.a().b(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).d(com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS).a()).a(a9.e.HIGHEST, b.a().b(1000L).d(com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS).a()).a(a9.e.VERY_LOW, b.a().b(com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS).d(com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, a9.e eVar, long j10, int i10) {
        builder.setMinimumLatency(g(eVar, j10, i10));
        j(builder, ((b) h().get(eVar)).c());
        return builder;
    }

    abstract m9.a e();

    public long g(a9.e eVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(eVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
