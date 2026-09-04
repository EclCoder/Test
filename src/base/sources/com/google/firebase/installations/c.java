package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dd.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements de.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f22189m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f22190n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f22191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe.c f22192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ee.c f22193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f22194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f22195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final de.g f22196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f22197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f22198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f22199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f22200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f22201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f22202l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f22203a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f22203a.getAndIncrement())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22205b;

        static {
            int[] iArr = new int[fe.f.b.values().length];
            f22205b = iArr;
            try {
                iArr[fe.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22205b[fe.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22205b[fe.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[fe.d.b.values().length];
            f22204a = iArr2;
            try {
                iArr2[fe.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22204a[fe.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final com.google.firebase.f fVar, ce.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new fe.c(fVar.k(), bVar), new ee.c(fVar), h.c(), new t(new ce.b() { // from class: de.a
            @Override // ce.b
            public final Object get() {
                return com.google.firebase.installations.c.e(fVar);
            }
        }), new de.g());
    }

    private synchronized void A(String str) {
        this.f22200j = str;
    }

    private synchronized void B(ee.d dVar, ee.d dVar2) {
        if (this.f22201k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f22201k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    public static /* synthetic */ ee.b e(com.google.firebase.f fVar) {
        return new ee.b(fVar);
    }

    private Task f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new d(this.f22194d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(g gVar) {
        synchronized (this.f22197g) {
            this.f22202l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        ee.d dVarX;
        ee.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarX = x(dVarR);
            } else {
                if (!z10 && !this.f22194d.f(dVarR)) {
                    return;
                }
                dVarX = k(dVarR);
            }
            u(dVarX);
            B(dVarR, dVarX);
            if (dVarX.k()) {
                A(dVarX.d());
            }
            if (dVarX.i()) {
                y(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
            } else if (dVarX.j()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(dVarX);
            }
        } catch (FirebaseInstallationsException e10) {
            y(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final boolean z10) {
        ee.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f22199i.execute(new Runnable() { // from class: de.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f36692a.i(z10);
            }
        });
    }

    private ee.d k(ee.d dVar) throws FirebaseInstallationsException {
        fe.f fVarE = this.f22192b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f22205b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f22194d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    private synchronized String n() {
        return this.f22200j;
    }

    private ee.b o() {
        return (ee.b) this.f22195e.get();
    }

    public static c p() {
        return q(com.google.firebase.f.l());
    }

    public static c q(com.google.firebase.f fVar) {
        Preconditions.checkArgument(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(de.e.class);
    }

    private ee.d r() {
        ee.d dVarD;
        synchronized (f22189m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f22191a.k(), "generatefid.lock");
                try {
                    dVarD = this.f22193c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    private ee.d s() {
        ee.d dVarD;
        synchronized (f22189m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f22191a.k(), "generatefid.lock");
                try {
                    dVarD = this.f22193c.d();
                    if (dVarD.j()) {
                        dVarD = this.f22193c.b(dVarD.t(w(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    private void u(ee.d dVar) {
        synchronized (f22189m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f22191a.k(), "generatefid.lock");
                try {
                    this.f22193c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void v() {
        Preconditions.checkNotEmpty(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String w(ee.d dVar) {
        if ((!this.f22191a.m().equals("CHIME_ANDROID_SDK") && !this.f22191a.u()) || !dVar.m()) {
            return this.f22196f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f22196f.a() : strF;
    }

    private ee.d x(ee.d dVar) throws FirebaseInstallationsException {
        fe.d dVarD = this.f22192b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f22204a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f22194d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void y(Exception exc) {
        synchronized (this.f22197g) {
            try {
                Iterator it = this.f22202l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z(ee.d dVar) {
        synchronized (this.f22197g) {
            try {
                Iterator it = this.f22202l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // de.e
    public Task a(final boolean z10) {
        v();
        Task taskF = f();
        this.f22198h.execute(new Runnable() { // from class: de.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f36690a.j(z10);
            }
        });
        return taskF;
    }

    @Override // de.e
    public Task getId() {
        v();
        String strN = n();
        if (strN != null) {
            return Tasks.forResult(strN);
        }
        Task taskG = g();
        this.f22198h.execute(new Runnable() { // from class: de.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f36689a.j(false);
            }
        });
        return taskG;
    }

    String l() {
        return this.f22191a.n().b();
    }

    String m() {
        return this.f22191a.n().c();
    }

    String t() {
        return this.f22191a.n().e();
    }

    c(ExecutorService executorService, Executor executor, com.google.firebase.f fVar, fe.c cVar, ee.c cVar2, h hVar, t tVar, de.g gVar) {
        this.f22197g = new Object();
        this.f22201k = new HashSet();
        this.f22202l = new ArrayList();
        this.f22191a = fVar;
        this.f22192b = cVar;
        this.f22193c = cVar2;
        this.f22194d = hVar;
        this.f22195e = tVar;
        this.f22196f = gVar;
        this.f22198h = executorService;
        this.f22199i = executor;
    }
}
