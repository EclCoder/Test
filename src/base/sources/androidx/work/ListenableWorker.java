package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0100a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e f7768a;

            public C0100a() {
                this(e.f7833c);
            }

            public e e() {
                return this.f7768a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0100a.class != obj.getClass()) {
                    return false;
                }
                return this.f7768a.equals(((C0100a) obj).f7768a);
            }

            public int hashCode() {
                return (C0100a.class.getName().hashCode() * 31) + this.f7768a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f7768a + '}';
            }

            public C0100a(e eVar) {
                this.f7768a = eVar;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e f7769a;

            public c() {
                this(e.f7833c);
            }

            public e e() {
                return this.f7769a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f7769a.equals(((c) obj).f7769a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f7769a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f7769a + '}';
            }

            public c(e eVar) {
                this.f7769a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0100a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public ListenableFuture getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
        cVarS.p(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarS;
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final e getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public k5.a getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public x getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ListenableFuture setForegroundAsync(g gVar) {
        this.mRunInForeground = true;
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), gVar);
    }

    public ListenableFuture setProgressAsync(e eVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), eVar);
    }

    public void setRunInForeground(boolean z10) {
        this.mRunInForeground = z10;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
