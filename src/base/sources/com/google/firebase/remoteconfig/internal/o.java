package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f22347e = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f22348f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Pattern f22349g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f22350a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f22351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f22352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f22353d;

    public o(Executor executor, f fVar, f fVar2) {
        this.f22351b = executor;
        this.f22352c = fVar;
        this.f22353d = fVar2;
    }

    private void c(final String str, final g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f22350a) {
            try {
                for (final BiConsumer biConsumer : this.f22350a) {
                    this.f22351b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            biConsumer.accept(str, gVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static g d(f fVar) {
        return fVar.f();
    }

    private static String f(f fVar, String str) {
        g gVarD = d(fVar);
        if (gVarD == null) {
            return null;
        }
        try {
            return gVarD.h().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void g(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(BiConsumer biConsumer) {
        synchronized (this.f22350a) {
            this.f22350a.add(biConsumer);
        }
    }

    public String e(String str) {
        String strF = f(this.f22352c, str);
        if (strF != null) {
            c(str, d(this.f22352c));
            return strF;
        }
        String strF2 = f(this.f22353d, str);
        if (strF2 != null) {
            return strF2;
        }
        g(str, "String");
        return "";
    }
}
