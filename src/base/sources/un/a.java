package un;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xn.c0;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0822a f54849h = new C0822a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f54850i = "PublicSuffixDatabase.list";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f54851g;

    /* JADX INFO: renamed from: un.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0822a {
        public /* synthetic */ C0822a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0822a() {
        }
    }

    public a(String path) {
        s.h(path, "path");
        this.f54851g = path;
    }

    @Override // un.b
    public q0 e() throws IOException {
        Context contextB = okhttp3.internal.platform.d.f48995a.b();
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open(d());
        s.g(inputStreamOpen, "open(...)");
        return c0.i(inputStreamOpen);
    }

    @Override // un.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String d() {
        return this.f54851g;
    }

    public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f54850i : str);
    }
}
