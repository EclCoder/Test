package ym;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import wm.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f58097a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58099c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f58098b = (int) timeUnit.toMillis(15L);
        f58099c = (int) timeUnit.toMillis(10L);
    }

    private b() {
    }

    @Override // ym.a
    public HttpURLConnection a(Uri uri) {
        d.f(uri, "url must not be null");
        d.a("https".equals(uri.getScheme()), "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(f58098b);
        httpURLConnection.setReadTimeout(f58099c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
