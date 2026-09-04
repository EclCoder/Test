package v5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f55177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f55178d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f55179i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f55180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f55181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f55182c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f55184e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f55183d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f55185f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f55186g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f55187h = 4194304;

        static {
            f55179i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f55184e = f55179i;
            this.f55180a = context;
            this.f55181b = (ActivityManager) context.getSystemService("activity");
            this.f55182c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f55181b)) {
                return;
            }
            this.f55184e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f55188a;

        b(DisplayMetrics displayMetrics) {
            this.f55188a = displayMetrics;
        }

        @Override // v5.i.c
        public int a() {
            return this.f55188a.heightPixels;
        }

        @Override // v5.i.c
        public int b() {
            return this.f55188a.widthPixels;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f55177c = aVar.f55180a;
        int i10 = e(aVar.f55181b) ? aVar.f55187h / 2 : aVar.f55187h;
        this.f55178d = i10;
        int iC = c(aVar.f55181b, aVar.f55185f, aVar.f55186g);
        float fB = aVar.f55182c.b() * aVar.f55182c.a() * 4;
        int iRound = Math.round(aVar.f55184e * fB);
        int iRound2 = Math.round(fB * aVar.f55183d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f55176b = iRound2;
            this.f55175a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f55184e;
            float f12 = aVar.f55183d;
            float f13 = f10 / (f11 + f12);
            this.f55176b = Math.round(f12 * f13);
            this.f55175a = Math.round(f13 * aVar.f55184e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f55176b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f55175a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f55181b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f55181b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f55177c, i10);
    }

    public int a() {
        return this.f55178d;
    }

    public int b() {
        return this.f55175a;
    }

    public int d() {
        return this.f55176b;
    }
}
