package u6;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.dnm;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f54179a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f54180b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static dnm f54181c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f54182d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f54183e = false;

    public static boolean a() {
        return f54183e;
    }

    public static String b() {
        if (TextUtils.isEmpty(f54180b)) {
            try {
                File file = new File(c().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f54180b = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f54180b;
    }

    public static Context c() {
        return f54179a;
    }

    public static void d(int i10) {
        f54182d = i10;
    }

    public static void e(Context context, String str) {
        f54179a = context;
        f54180b = str;
    }

    public static void f(dnm dnmVar) {
        f54181c = dnmVar;
    }

    public static dnm g() {
        if (f54181c == null) {
            dnm.hnj hnjVar = new dnm.hnj("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f54181c = hnjVar.hnj(10000L, timeUnit).hn(10000L, timeUnit).qor(10000L, timeUnit).hnj();
        }
        return f54181c;
    }

    public static int h() {
        return f54182d;
    }
}
