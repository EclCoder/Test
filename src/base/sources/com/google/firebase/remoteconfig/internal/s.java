package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.api.client.http.HttpMethods;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int[] f22369t = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f22370u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f22371a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22373c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HttpURLConnection f22376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.firebase.remoteconfig.internal.b f22377g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f22379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f22380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.f f22381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final de.e f22382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    f f22383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f22384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f22385o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final t f22388r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22378h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22372b = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Random f22386p = new Random();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Clock f22387q = DefaultClock.getInstance();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22374d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22375e = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f22389s = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.e();
        }
    }

    public s(com.google.firebase.f fVar, de.e eVar, m mVar, f fVar2, Context context, String str, Set set, t tVar, ScheduledExecutorService scheduledExecutorService) {
        this.f22371a = set;
        this.f22379i = scheduledExecutorService;
        this.f22373c = Math.max(8 - tVar.h().b(), 1);
        this.f22381k = fVar;
        this.f22380j = mVar;
        this.f22382l = eVar;
        this.f22383m = fVar2;
        this.f22384n = context;
        this.f22385o = str;
        this.f22388r = tVar;
    }

    private void D(Date date) {
        int iB = this.f22388r.h().b() + 1;
        this.f22388r.p(iB, new Date(date.getTime() + o(iB)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task a(s sVar, Task task, Task task2) throws Throwable {
        InputStream errorStream;
        Integer numValueOf;
        Throwable th2;
        InputStream inputStream;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        sVar.getClass();
        boolean z10 = true;
        try {
            if (!task.isSuccessful()) {
                throw new IOException(task.getException());
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) task.getResult();
            sVar.f22376f = httpURLConnection;
            inputStream = httpURLConnection.getInputStream();
            try {
                errorStream = sVar.f22376f.getErrorStream();
                try {
                    int responseCode = sVar.f22376f.getResponseCode();
                    numValueOf = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            try {
                                sVar.v();
                                sVar.f22388r.j();
                                com.google.firebase.remoteconfig.internal.b bVarB = sVar.B(sVar.f22376f);
                                sVar.f22377g = bVarB;
                                bVarB.h();
                            } catch (IOException e10) {
                                e = e10;
                                if (sVar.f22375e) {
                                    sVar.v();
                                } else {
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                }
                                sVar.i(inputStream, errorStream);
                                sVar.y(false);
                                if (sVar.f22375e || (numValueOf != 0 && !sVar.r(numValueOf.intValue()))) {
                                    z10 = false;
                                }
                                if (z10) {
                                    sVar.D(new Date(sVar.f22387q.currentTimeMillis()));
                                }
                                if (!z10 || numValueOf.intValue() == 200) {
                                    sVar.w();
                                } else {
                                    String strT = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strT = sVar.t(sVar.f22376f.getErrorStream());
                                    }
                                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), strT, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
                                }
                                sVar.f22376f = null;
                                sVar.f22377g = null;
                                return Tasks.forResult(null);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            sVar.i(inputStream, errorStream);
                            sVar.y(false);
                            if (sVar.f22375e || (numValueOf != 0 && !sVar.r(numValueOf.intValue()))) {
                                z10 = false;
                            }
                            if (z10) {
                                sVar.D(new Date(sVar.f22387q.currentTimeMillis()));
                            }
                            if (z10 || numValueOf.intValue() == 200) {
                                sVar.w();
                            } else {
                                String strT2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    strT2 = sVar.t(sVar.f22376f.getErrorStream());
                                }
                                sVar.u(new FirebaseRemoteConfigServerException(numValueOf.intValue(), strT2, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                            }
                            throw th2;
                        }
                    }
                    sVar.i(inputStream, errorStream);
                    sVar.y(false);
                    z10 = !sVar.f22375e && sVar.r(responseCode);
                    if (z10) {
                        sVar.D(new Date(sVar.f22387q.currentTimeMillis()));
                    }
                    if (z10 || responseCode == 200) {
                        sVar.w();
                    } else {
                        String strT3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (responseCode == 403) {
                            strT3 = sVar.t(sVar.f22376f.getErrorStream());
                        }
                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, strT3, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
                        sVar.u(firebaseRemoteConfigServerException);
                    }
                } catch (IOException e11) {
                    e = e11;
                    numValueOf = 0;
                } catch (Throwable th4) {
                    numValueOf = 0;
                    th2 = th4;
                }
            } catch (IOException e12) {
                e = e12;
                errorStream = null;
                numValueOf = errorStream;
                if (sVar.f22375e) {
                    sVar.v();
                } else {
                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                }
                sVar.i(inputStream, errorStream);
                sVar.y(false);
                if (sVar.f22375e) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    sVar.D(new Date(sVar.f22387q.currentTimeMillis()));
                }
                if (z10) {
                }
                sVar.w();
                sVar.f22376f = null;
                sVar.f22377g = null;
                return Tasks.forResult(null);
            } catch (Throwable th5) {
                numValueOf = 0;
                th2 = th5;
                errorStream = null;
            }
            sVar.f22376f = null;
            sVar.f22377g = null;
            return Tasks.forResult(null);
        } catch (IOException e13) {
            e = e13;
            inputStream = null;
            errorStream = null;
        } catch (Throwable th6) {
            errorStream = null;
            numValueOf = 0;
            th2 = th6;
            inputStream = null;
        }
    }

    public static /* synthetic */ Task b(s sVar, Task task, Task task2, Task task3) {
        sVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) sVar.q().openConnection();
            sVar.A(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.f) task.getResult()).b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e10) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e10));
        }
    }

    private synchronized boolean f() {
        return (this.f22371a.isEmpty() || this.f22372b || this.f22374d || this.f22375e) ? false : true;
    }

    private synchronized boolean g() {
        boolean zF;
        zF = f();
        if (zF) {
            y(true);
        }
        return zF;
    }

    private void h(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    private JSONObject k(String str) {
        HashMap map = new HashMap();
        map.put("project", m(this.f22381k.n().c()));
        map.put("namespace", this.f22385o);
        map.put("lastKnownVersionNumber", Long.toString(this.f22380j.r()));
        map.put("appId", this.f22381k.n().c());
        map.put("sdkVersion", "23.1.0");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        this.f22374d = true;
    }

    private static String m(String str) {
        Matcher matcher = f22370u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String n() {
        try {
            Context context = this.f22384n;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f22384n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f22384n.getPackageName());
            return null;
        }
    }

    private long o(int i10) {
        int[] iArr = f22369t;
        int length = iArr.length;
        if (i10 >= length) {
            i10 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i10 - 1]);
        return (millis / 2) + ((long) this.f22386p.nextInt((int) millis));
    }

    private String p(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m(this.f22381k.n().c()), str);
    }

    private URL q() {
        try {
            return new URL(p(this.f22385o));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean r(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private synchronized void s(long j10) {
        try {
            if (f()) {
                int i10 = this.f22373c;
                if (i10 > 0) {
                    this.f22373c = i10 - 1;
                    this.f22379i.schedule(new a(), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f22375e) {
                    u(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private String t(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f22371a.iterator();
        while (it.hasNext()) {
            ((je.c) it.next()).a(firebaseRemoteConfigException);
        }
    }

    private synchronized void v() {
        this.f22373c = 8;
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f22381k.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f22384n.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", n());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z10) {
        this.f22372b = z10;
    }

    public void A(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(HttpMethods.POST);
        x(httpURLConnection, str2);
        byte[] bytes = k(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.b B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f22380j, this.f22383m, this.f22371a, new b(), this.f22379i, this.f22388r);
    }

    public void C() {
        s(0L);
    }

    public void e() {
        if (g()) {
            if (new Date(this.f22387q.currentTimeMillis()).before(this.f22388r.h().a())) {
                w();
            } else {
                final Task taskJ = j();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskJ}).continueWith(this.f22379i, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.q
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return s.a(this.f22364a, taskJ, task);
                    }
                });
            }
        }
    }

    public void i(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f22376f;
        if (httpURLConnection != null && !this.f22375e) {
            httpURLConnection.disconnect();
        }
        h(inputStream);
        h(inputStream2);
    }

    public Task j() {
        final Task taskA = this.f22382l.a(false);
        final Task id2 = this.f22382l.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskA, id2}).continueWithTask(this.f22379i, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return s.b(this.f22366a, taskA, id2, task);
            }
        });
    }

    public synchronized void w() {
        s(Math.max(0L, this.f22388r.h().a().getTime() - new Date(this.f22387q.currentTimeMillis()).getTime()));
    }

    public void z(boolean z10) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f22389s) {
            try {
                this.f22375e = z10;
                com.google.firebase.remoteconfig.internal.b bVar = this.f22377g;
                if (bVar != null) {
                    bVar.k(z10);
                }
                if (Build.VERSION.SDK_INT >= 26 && z10 && (httpURLConnection = this.f22376f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements je.c {
        b() {
        }

        @Override // je.c
        public void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            s.this.l();
            s.this.u(firebaseRemoteConfigException);
        }

        @Override // je.c
        public void b(je.b bVar) {
        }
    }
}
