package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f22273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f22274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f22275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f22276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final je.c f22277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f22278f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f22281i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Random f22279g = new Random();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22282j = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Clock f22280h = DefaultClock.getInstance();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f22284b;

        a(int i10, long j10) {
            this.f22283a = i10;
            this.f22284b = j10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.d(this.f22283a, this.f22284b);
        }
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set set, je.c cVar, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.f22274b = httpURLConnection;
        this.f22275c = mVar;
        this.f22276d = fVar;
        this.f22273a = set;
        this.f22277e = cVar;
        this.f22278f = scheduledExecutorService;
        this.f22281i = tVar;
    }

    public static /* synthetic */ Task a(b bVar, Task task, Task task2, long j10, int i10, Task task3) throws JSONException {
        bVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        m.a aVar = (m.a) task.getResult();
        g gVarA = (g) task2.getResult();
        if (!e(aVar, j10).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            bVar.b(i10, j10);
            return Tasks.forResult(null);
        }
        if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (gVarA == null) {
            gVarA = g.m().a();
        }
        Set setG = gVarA.g(aVar.d());
        if (setG.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        bVar.c(je.b.a(setG));
        return Tasks.forResult(null);
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            j(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f22278f.schedule(new a(i10, j10), this.f22279g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(je.b bVar) {
        Iterator it = this.f22273a.iterator();
        while (it.hasNext()) {
            ((je.c) it.next()).b(bVar);
        }
    }

    private static Boolean e(m.a aVar, long j10) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().l() >= j10);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    private void f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String strI = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strI = strI + line;
                if (line.contains("}")) {
                    strI = i(strI);
                    if (strI.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strI);
                if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                    this.f22277e.a(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                }
                if (g()) {
                    break;
                }
                if (jSONObject.has("latestTemplateVersionNumber")) {
                    long jR = this.f22275c.r();
                    long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                    if (j10 > jR) {
                        b(3, j10);
                    }
                }
                if (jSONObject.has("retryIntervalSeconds")) {
                    l(jSONObject.getInt("retryIntervalSeconds"));
                }
            } catch (JSONException e10) {
                j(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e10.getCause(), FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID));
                Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e10);
            }
        }
        bufferedReader.close();
    }

    private synchronized boolean g() {
        return this.f22273a.isEmpty();
    }

    private String i(String str) {
        int iIndexOf = str.indexOf(Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE);
        int iLastIndexOf = str.lastIndexOf(Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void j(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f22273a.iterator();
        while (it.hasNext()) {
            ((je.c) it.next()).a(firebaseRemoteConfigException);
        }
    }

    private synchronized void l(int i10) {
        this.f22281i.o(new Date(new Date(this.f22280h.currentTimeMillis()).getTime() + (((long) i10) * 1000)));
    }

    public synchronized Task d(int i10, final long j10) throws Throwable {
        final int i11 = i10 - 1;
        try {
            try {
                final Task taskN = this.f22275c.n(m.b.REALTIME, 3 - i11);
                final Task taskE = this.f22276d.e();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskN, taskE}).continueWithTask(this.f22278f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return b.a(this.f22268a, taskN, taskE, j10, i11, task);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public void h() {
        HttpURLConnection httpURLConnection = this.f22274b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    f(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e10) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                }
            } catch (IOException e11) {
                if (!this.f22282j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e11);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e12);
                }
            }
            throw th2;
        }
    }

    public void k(boolean z10) {
        this.f22282j = z10;
    }
}
