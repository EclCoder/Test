package net.openid.appauth;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.UrlEncodedParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f47459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wm.a f47460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xm.e f47461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xm.b f47462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47463e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f47464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClientAuthentication f47465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ym.a f47466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f47467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h f47468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AuthorizationException f47469f;

        public a(m mVar, ClientAuthentication clientAuthentication, ym.a aVar, h hVar, b bVar) {
            this.f47464a = mVar;
            this.f47465b = clientAuthentication;
            this.f47466c = aVar;
            this.f47468e = hVar;
            this.f47467d = bVar;
        }

        private void a(URLConnection uRLConnection) {
            if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                uRLConnection.setRequestProperty("Accept", "application/json");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStream;
            InputStream inputStream2 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionA = this.f47466c.a(this.f47464a.f47504a.f47471b);
                    httpURLConnectionA.setRequestMethod(HttpMethods.POST);
                    httpURLConnectionA.setRequestProperty("Content-Type", UrlEncodedParser.CONTENT_TYPE);
                    a(httpURLConnectionA);
                    httpURLConnectionA.setDoOutput(true);
                    Map mapA = this.f47465b.a(this.f47464a.f47506c);
                    if (mapA != null) {
                        for (Map.Entry entry : mapA.entrySet()) {
                            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    Map mapB = this.f47464a.b();
                    Map mapB2 = this.f47465b.b(this.f47464a.f47506c);
                    if (mapB2 != null) {
                        mapB.putAll(mapB2);
                    }
                    String strB = zm.b.b(mapB);
                    httpURLConnectionA.setRequestProperty("Content-Length", String.valueOf(strB.length()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionA.getOutputStream());
                    outputStreamWriter.write(strB);
                    outputStreamWriter.flush();
                    InputStream errorStream = (httpURLConnectionA.getResponseCode() < 200 || httpURLConnectionA.getResponseCode() >= 300) ? httpURLConnectionA.getErrorStream() : httpURLConnectionA.getInputStream();
                    try {
                        JSONObject jSONObject = new JSONObject(o.b(errorStream));
                        o.a(errorStream);
                        return jSONObject;
                    } catch (IOException e10) {
                        inputStream = errorStream;
                        e = e10;
                        zm.a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f47469f = AuthorizationException.m(AuthorizationException.b.f47331d, e);
                        o.a(inputStream);
                        return null;
                    } catch (JSONException e11) {
                        inputStream = errorStream;
                        e = e11;
                        zm.a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f47469f = AuthorizationException.m(AuthorizationException.b.f47333f, e);
                        o.a(inputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = errorStream;
                        o.a(inputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                }
            } catch (IOException e12) {
                e = e12;
                inputStream = null;
            } catch (JSONException e13) {
                e = e13;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(JSONObject jSONObject) {
            AuthorizationException authorizationExceptionM;
            AuthorizationException authorizationException = this.f47469f;
            if (authorizationException != null) {
                this.f47467d.a(null, authorizationException);
                return;
            }
            if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    authorizationExceptionM = AuthorizationException.l(AuthorizationException.c.a(string), string, jSONObject.optString("error_description", null), zm.b.e(jSONObject.optString("error_uri")));
                } catch (JSONException e10) {
                    authorizationExceptionM = AuthorizationException.m(AuthorizationException.b.f47333f, e10);
                }
                this.f47467d.a(null, authorizationExceptionM);
                return;
            }
            try {
                n nVarA = new n.a(this.f47464a).b(jSONObject).a();
                String str = nVarA.f47529e;
                if (str != null) {
                    try {
                        try {
                            i.a(str).c(this.f47464a, this.f47468e);
                        } catch (AuthorizationException e11) {
                            this.f47467d.a(null, e11);
                            return;
                        }
                    } catch (i.a | JSONException e12) {
                        this.f47467d.a(null, AuthorizationException.m(AuthorizationException.b.f47336i, e12));
                        return;
                    }
                }
                zm.a.a("Token exchange with %s completed", this.f47464a.f47504a.f47471b);
                this.f47467d.a(nVarA, null);
            } catch (JSONException e13) {
                this.f47467d.a(null, AuthorizationException.m(AuthorizationException.b.f47333f, e13));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(n nVar, AuthorizationException authorizationException);
    }

    public f(Context context) {
        this(context, wm.a.f56365c);
    }

    private void a() {
        if (this.f47463e) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    private Intent g(d dVar, androidx.browser.customtabs.d dVar2) {
        a();
        if (this.f47462d == null) {
            throw new ActivityNotFoundException();
        }
        Uri uriH = dVar.h();
        Intent intent = this.f47462d.f56884d.booleanValue() ? dVar2.f1834a : new Intent("android.intent.action.VIEW");
        intent.setPackage(this.f47462d.f56881a);
        intent.setData(uriH);
        zm.a.a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.f47462d.f56884d.toString());
        zm.a.a("Initiating authorization request to %s", dVar.f47410a.f47470a);
        return intent;
    }

    public androidx.browser.customtabs.d.C0018d b(Uri... uriArr) {
        a();
        return this.f47461c.e(uriArr);
    }

    public Intent c(d dVar) {
        return d(dVar, b(new Uri[0]).a());
    }

    public Intent d(d dVar, androidx.browser.customtabs.d dVar2) {
        return AuthorizationManagementActivity.c(this.f47459a, dVar, g(dVar, dVar2));
    }

    public void e(m mVar, b bVar) {
        f(mVar, wm.c.f56371a, bVar);
    }

    public void f(m mVar, ClientAuthentication clientAuthentication, b bVar) {
        a();
        zm.a.a("Initiating code exchange request to %s", mVar.f47504a.f47471b);
        new a(mVar, clientAuthentication, this.f47460b.b(), l.f47502a, bVar).execute(new Void[0]);
    }

    public f(Context context, wm.a aVar) {
        this(context, aVar, xm.d.d(context, aVar.a()), new xm.e(context));
    }

    public f(Context context, wm.a aVar, xm.b bVar, xm.e eVar) {
        this.f47463e = false;
        this.f47459a = (Context) wm.d.e(context);
        this.f47460b = aVar;
        this.f47461c = eVar;
        this.f47462d = bVar;
        if (bVar == null || !bVar.f56884d.booleanValue()) {
            return;
        }
        eVar.c(bVar.f56881a);
    }
}
