package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.e1;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m0 extends AsyncTask {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15925d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15926e = m0.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f15927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f15928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception f15929c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public m0(HttpURLConnection httpURLConnection, n0 requests) {
        kotlin.jvm.internal.s.h(requests, "requests");
        this.f15927a = httpURLConnection;
        this.f15928b = requests;
    }

    public List a(Void... params) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.s.h(params, "params");
                try {
                    HttpURLConnection httpURLConnection = this.f15927a;
                    return httpURLConnection == null ? this.f15928b.f() : j0.f15486n.o(httpURLConnection, this.f15928b);
                } catch (Exception e10) {
                    this.f15929c = e10;
                    return null;
                }
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
            return null;
        }
    }

    protected void b(List result) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (x7.a.c(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.s.h(result, "result");
                super.onPostExecute(result);
                Exception exc = this.f15929c;
                if (exc != null) {
                    String str = f15926e;
                    kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                    String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    kotlin.jvm.internal.s.g(str2, "format(format, *args)");
                    e1.l0(str, str2);
                    return;
                }
                return;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return;
            }
            x7.a.b(th, this);
        } catch (Throwable th3) {
            x7.a.b(th3, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                return a((Void[]) objArr);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (x7.a.c(this)) {
                return;
            }
            try {
                b((List) obj);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (x7.a.c(this)) {
                return;
            }
            try {
                super.onPreExecute();
                if (h0.H()) {
                    String str = f15926e;
                    kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                    String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                    kotlin.jvm.internal.s.g(str2, "format(format, *args)");
                    e1.l0(str, str2);
                }
                if (this.f15928b.o() == null) {
                    this.f15928b.D(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
                    return;
                }
                return;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return;
            }
            x7.a.b(th, this);
        } catch (Throwable th3) {
            x7.a.b(th3, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f15927a + ", requests: " + this.f15928b + "}";
        kotlin.jvm.internal.s.g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(n0 requests) {
        this(null, requests);
        kotlin.jvm.internal.s.h(requests, "requests");
    }
}
