package qd;

import a9.g;
import a9.i;
import android.content.Context;
import c9.u;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import jd.j0;
import jd.w0;
import md.h0;
import nd.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f50615c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50616d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f50617e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f50618f = new g() { // from class: qd.a
        @Override // a9.g
        public final Object apply(Object obj) {
            return b.f50615c.Q((h0) obj).getBytes(Charset.forName(C.UTF8_NAME));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f50619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f50620b;

    b(e eVar, g gVar) {
        this.f50619a = eVar;
        this.f50620b = gVar;
    }

    public static b b(Context context, rd.j jVar, w0 w0Var) {
        u.f(context);
        i iVarG = u.c().g(new com.google.android.datatransport.cct.a(f50616d, f50617e));
        a9.b bVarB = a9.b.b("json");
        g gVar = f50618f;
        return new b(new e(iVarG.a("FIREBASE_CRASHLYTICS_REPORT", h0.class, bVarB, gVar), jVar.b(), w0Var), gVar);
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public Task c(j0 j0Var, boolean z10) {
        return this.f50619a.i(j0Var, z10).getTask();
    }
}
