package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f22325j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int[] f22326k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final de.e f22327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.b f22328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Clock f22330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f22331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f22332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f22333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f22334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f22335i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Date f22336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f22338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f22339d;

        private a(Date date, int i10, g gVar, String str) {
            this.f22336a = date;
            this.f22337b = i10;
            this.f22338c = gVar;
            this.f22339d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.i(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f22338c;
        }

        String e() {
            return this.f22339d;
        }

        int f() {
            return this.f22337b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22343a;

        b(String str) {
            this.f22343a = str;
        }

        String g() {
            return this.f22343a;
        }
    }

    public m(de.e eVar, ce.b bVar, Executor executor, Clock clock, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map map) {
        this.f22327a = eVar;
        this.f22328b = bVar;
        this.f22329c = executor;
        this.f22330d = clock;
        this.f22331e = random;
        this.f22332f = fVar;
        this.f22333g = configFetchHttpClient;
        this.f22334h = tVar;
        this.f22335i = map;
    }

    public static /* synthetic */ Task a(m mVar, Task task, Task task2, Date date, Map map, Task task3) {
        mVar.getClass();
        if (task.isSuccessful()) {
            return !task2.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : mVar.l((String) task.getResult(), ((com.google.firebase.installations.f) task2.getResult()).b(), date, map);
        }
        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
    }

    public static /* synthetic */ Task c(m mVar, Date date, Task task) {
        mVar.x(task, date);
        return task;
    }

    private boolean f(long j10, Date date) {
        Date dateE = this.f22334h.e();
        if (dateE.equals(t.f22392f)) {
            return false;
        }
        return date.before(new Date(dateE.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int iD = firebaseRemoteConfigServerException.d();
        if (iD == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iD == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iD == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iD != 500) {
                switch (iD) {
                    case 502:
                    case 503:
                    case PglCryptUtils.BASE64_FAILED /* 504 */:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.d(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a k(String str, String str2, Date date, Map map) throws FirebaseRemoteConfigException {
        Date date2;
        try {
            date2 = date;
            try {
                a aVarFetch = this.f22333g.fetch(this.f22333g.d(), str, str2, s(), this.f22334h.d(), map, p(), date2, this.f22334h.b());
                if (aVarFetch.d() != null) {
                    this.f22334h.n(aVarFetch.d().l());
                }
                if (aVarFetch.e() != null) {
                    this.f22334h.m(aVarFetch.e());
                }
                this.f22334h.i();
                return aVarFetch;
            } catch (FirebaseRemoteConfigServerException e10) {
                e = e10;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                t.a aVarV = v(firebaseRemoteConfigServerException.d(), date2);
                if (u(aVarV, firebaseRemoteConfigServerException.d())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(aVarV.a().getTime());
                }
                throw g(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e11) {
            e = e11;
            date2 = date;
        }
    }

    private Task l(String str, String str2, Date date, Map map) {
        try {
            final a aVarK = k(str, str2, date, map);
            return aVarK.f() != 0 ? Tasks.forResult(aVarK) : this.f22332f.i(aVarK.d()).onSuccessTask(this.f22329c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(aVarK);
                }
            });
        } catch (FirebaseRemoteConfigException e10) {
            return Tasks.forException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task m(Task task, long j10, final Map map) {
        final m mVar;
        Task taskContinueWithTask;
        final Date date = new Date(this.f22330d.currentTimeMillis());
        if (task.isSuccessful() && f(j10, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(h(dateO.getTime() - date.getTime()), dateO.getTime()));
            mVar = this;
        } else {
            final Task id2 = this.f22327a.getId();
            final Task taskA = this.f22327a.a(false);
            mVar = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, taskA}).continueWithTask(this.f22329c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return m.a(this.f22315a, id2, taskA, date, map, task2);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(mVar.f22329c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return m.c(this.f22320a, date, task2);
            }
        });
    }

    private Date o(Date date) {
        Date dateA = this.f22334h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private Long p() {
        bd.a aVar = (bd.a) this.f22328b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.c(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f22326k;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f22331e.nextInt((int) millis));
    }

    private Map s() {
        HashMap map = new HashMap();
        bd.a aVar = (bd.a) this.f22328b.get();
        if (aVar != null) {
            for (Map.Entry entry : aVar.c(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private boolean u(t.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    private t.a v(int i10, Date date) {
        if (t(i10)) {
            w(date);
        }
        return this.f22334h.a();
    }

    private void w(Date date) {
        int iB = this.f22334h.a().b() + 1;
        this.f22334h.k(iB, new Date(date.getTime() + q(iB)));
    }

    private void x(Task task, Date date) {
        if (task.isSuccessful()) {
            this.f22334h.r(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f22334h.s();
        } else {
            this.f22334h.q();
        }
    }

    public Task i() {
        return j(this.f22334h.g());
    }

    public Task j(final long j10) {
        final HashMap map = new HashMap(this.f22335i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.g() + "/1");
        return this.f22332f.e().continueWithTask(this.f22329c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f22312a.m(task, j10, map);
            }
        });
    }

    public Task n(b bVar, int i10) {
        final HashMap map = new HashMap(this.f22335i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.g() + "/" + i10);
        return this.f22332f.e().continueWithTask(this.f22329c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f22322a.m(task, 0L, map);
            }
        });
    }

    public long r() {
        return this.f22334h.f();
    }
}
