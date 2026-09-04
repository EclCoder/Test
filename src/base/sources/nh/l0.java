package nh;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioRecord;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.ProjectionWarnFor51Activity;
import com.hecorat.screenrecorder.free.activities.RecordingErrorActivity;
import com.hecorat.screenrecorder.free.feedback.AskQualityActivity;
import com.hecorat.screenrecorder.free.feedback.RateActivity;
import com.hecorat.screenrecorder.free.services.RecordService;
import gl.s0;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f47742a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f47743b;

    private l0() {
    }

    public static final void A(Context context, String action) {
        kotlin.jvm.internal.s.h(action, "action");
        if (context == null) {
            return;
        }
        Intent intent = new Intent(action);
        if (Build.VERSION.SDK_INT >= 34) {
            intent.setPackage(context.getPackageName());
        }
        context.sendBroadcast(intent);
    }

    public static final void D(Context context, String str) {
        wp.a.a("startMainService %s", str);
        Intent intent = new Intent(context, (Class<?>) RecordService.class);
        if (str != null) {
            intent.setAction(str);
        }
        f47742a.E(context, intent);
    }

    public static final Bitmap b(Drawable drawable) {
        kotlin.jvm.internal.s.h(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            kotlin.jvm.internal.s.g(bitmap, "getBitmap(...)");
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final String c(long j10) {
        int i10 = (int) (j10 / ((long) 1000));
        int i11 = i10 / 3600;
        int i12 = i10 % 3600;
        int i13 = i12 / 60;
        int i14 = i12 % 60;
        Locale localeE = e();
        if (i11 > 0) {
            o0 o0Var = o0.f43602a;
            String str = String.format(localeE, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i13), Integer.valueOf(i14)}, 3));
            kotlin.jvm.internal.s.g(str, "format(...)");
            return str;
        }
        o0 o0Var2 = o0.f43602a;
        String str2 = String.format(localeE, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13), Integer.valueOf(i14)}, 2));
        kotlin.jvm.internal.s.g(str2, "format(...)");
        return str2;
    }

    public static final Locale e() {
        Locale localeC;
        String language;
        j0.k kVarO = androidx.appcompat.app.h.o();
        kotlin.jvm.internal.s.g(kVarO, "getApplicationLocales(...)");
        if (kotlin.jvm.internal.s.c(kVarO, j0.k.d()) || !((localeC = kVarO.c(0)) == null || (language = localeC.getLanguage()) == null || language.length() != 0)) {
            return i();
        }
        Locale localeC2 = kVarO.c(0);
        if (localeC2 == null) {
            localeC2 = Locale.getDefault();
        }
        kotlin.jvm.internal.s.e(localeC2);
        return localeC2;
    }

    public static final String f() {
        String languageTag;
        Locale localeE = e();
        return (localeE == null || (languageTag = localeE.toLanguageTag()) == null) ? "en" : languageTag;
    }

    public static final int g(lg.a preferenceManager) {
        kotlin.jvm.internal.s.h(preferenceManager, "preferenceManager");
        long jE = preferenceManager.e(R.string.pref_current_promo_duration, 0L);
        if (jE == 0) {
            return -1;
        }
        long jE2 = preferenceManager.e(R.string.pref_current_promo_start_time, 0L);
        if (jE2 == 0) {
            return 1;
        }
        return System.currentTimeMillis() >= jE2 + jE ? 3 : 2;
    }

    public static final Locale i() {
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        kotlin.jvm.internal.s.e(locale);
        return locale;
    }

    public static final boolean l(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        Boolean bool = f47743b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = new sf.j(context, androidx.preference.j.b(context)).getBoolean(context.getString(R.string.pref_vip), false);
        f47743b = Boolean.valueOf(z10);
        return z10;
    }

    public static final boolean n(int i10) {
        if (i10 < 0) {
            return false;
        }
        int i11 = 0;
        int i12 = 1;
        while (i11 < i10) {
            i11 += i12;
            i12++;
        }
        return i11 == i10;
    }

    public static final boolean o() {
        try {
            Context applicationContext = AzRecorderApp.e().getApplicationContext();
            Set stringSet = new sf.j(applicationContext, androidx.preference.j.b(applicationContext)).getStringSet(applicationContext.getString(R.string.pref_bought_products), s0.d());
            if (stringSet == null) {
                stringSet = s0.d();
            }
            if (!stringSet.isEmpty()) {
                return true;
            }
            kotlin.jvm.internal.s.e(applicationContext);
            return l(applicationContext);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return false;
        }
    }

    public static final boolean p(Context context) {
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.s.g(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
        return kotlin.jvm.internal.s.c("xiaomi", lowerCase) && Settings.canDrawOverlays(context) && !f47742a.j(context);
    }

    public static final void q(Context context, Class cls) {
        kotlin.jvm.internal.s.h(cls, "cls");
        Intent intent = new Intent(context, (Class<?>) cls);
        if (AzRecorderApp.e().h()) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(268468224);
        }
        if (context != null) {
            context.startActivity(intent);
        }
    }

    public static final void r(Context context, String marketAddress, String appLink) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(marketAddress, "marketAddress");
        kotlin.jvm.internal.s.h(appLink, "appLink");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(marketAddress));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(appLink));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
    }

    public static final void s(Context context, lg.a preferenceManager) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(preferenceManager, "preferenceManager");
        if (ef.a.c()) {
            ef.a.q(false);
            int iD = preferenceManager.d(R.string.pref_number_of_recordings, 0);
            if (iD == 1 || iD == 3) {
                Intent intent = new Intent(context, (Class<?>) AskQualityActivity.class);
                intent.putExtra("number_of_recordings", iD);
                context.startActivity(intent);
            } else if (n(iD)) {
                context.startActivity(new Intent(context, (Class<?>) RateActivity.class));
            }
        }
    }

    public static final void t(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://discord.gg/8ty5xTENNM")));
    }

    public static /* synthetic */ void v(l0 l0Var, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        l0Var.u(context, z10);
    }

    public static final void x(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        Intent intent = new Intent(context, (Class<?>) RecordingErrorActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static final void z(Context context, BroadcastReceiver receiver, IntentFilter intentFilter) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(receiver, "receiver");
        kotlin.jvm.internal.s.h(intentFilter, "intentFilter");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(receiver, intentFilter, 4);
        } else {
            context.registerReceiver(receiver, intentFilter);
        }
    }

    public final void B(Activity activity, String subject, String body) {
        kotlin.jvm.internal.s.h(subject, "subject");
        kotlin.jvm.internal.s.h(body, "body");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + Uri.encode("az.screen.recorder@gmail.com") + "?subject=" + Uri.encode(subject) + "&body=" + Uri.encode(body)));
        if (activity != null) {
            activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.choose_email_title)));
        }
    }

    public final void C(Window window) {
        kotlin.jvm.internal.s.h(window, "window");
        if (Build.VERSION.SDK_INT <= 29) {
            window.getDecorView().setSystemUiVisibility(5894);
            window.setFlags(UserVerificationMethods.USER_VERIFY_ALL, UserVerificationMethods.USER_VERIFY_ALL);
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.hide(WindowInsets.Type.navigationBars());
            insetsController.setSystemBarsBehavior(2);
        }
    }

    public final void E(Context context, Intent intent) {
        kotlin.jvm.internal.s.h(intent, "intent");
        if (Build.VERSION.SDK_INT >= 26) {
            if (context != null) {
                context.startForegroundService(intent);
            }
        } else if (context != null) {
            context.startService(intent);
        }
    }

    public final String a(String originalText) {
        kotlin.jvm.internal.s.h(originalText, "originalText");
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = originalText.substring(0, 1);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        Locale locale = Locale.ROOT;
        String upperCase = strSubstring.toUpperCase(locale);
        kotlin.jvm.internal.s.g(upperCase, "toUpperCase(...)");
        sb2.append(upperCase);
        String strSubstring2 = originalText.substring(1);
        kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
        String lowerCase = strSubstring2.toLowerCase(locale);
        kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        return sb2.toString();
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("---------------\n");
        sb2.append("Manufacturer: " + Build.MANUFACTURER + '\n');
        sb2.append("Model: " + Build.MODEL + '\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ABI: ");
        String string = Arrays.toString(Build.SUPPORTED_ABIS);
        kotlin.jvm.internal.s.g(string, "toString(...)");
        sb3.append(string);
        sb3.append('\n');
        sb2.append(sb3.toString());
        sb2.append("Android SDK: " + Build.VERSION.SDK_INT + '\n');
        sb2.append("App version: 6.9.10\n");
        sb2.append("---------------\n");
        return sb2.toString();
    }

    public final boolean j(Context context) {
        Object systemService;
        if (context != null) {
            try {
                systemService = context.getSystemService("appops");
            } catch (Exception e10) {
                wp.a.e(e10);
                return true;
            }
        } else {
            systemService = null;
        }
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        Class cls = Integer.TYPE;
        Object objInvoke = AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) systemService, 10021, Integer.valueOf(Process.myUid()), context.getPackageName());
        kotlin.jvm.internal.s.f(objInvoke, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objInvoke).intValue() == 0;
    }

    public final boolean k() {
        NetworkCapabilities networkCapabilities;
        Object systemService = AzRecorderApp.e().getApplicationContext().getSystemService("connectivity");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:30:0x0041). Please report as a decompilation issue!!! */
    public final boolean m() throws Throwable {
        Throwable th2;
        ?? r10;
        boolean z10 = false;
        ?? r11 = 0;
        AudioRecord audioRecord = null;
        r11 = 0;
        try {
            try {
                try {
                    int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                    AudioRecord audioRecord2 = new AudioRecord(1, 44100, 16, 2, minBufferSize);
                    try {
                        audioRecord2.startRecording();
                        int i10 = audioRecord2.read(new short[minBufferSize], 0, minBufferSize);
                        r11 = -3;
                        if (i10 != -3 && i10 != 0) {
                            z10 = true;
                        }
                        audioRecord2.release();
                    } catch (Exception e10) {
                        e = e10;
                        audioRecord = audioRecord2;
                        com.google.firebase.crashlytics.a.b().d(e);
                        r11 = audioRecord;
                        if (audioRecord != null) {
                            audioRecord.release();
                            r11 = audioRecord;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        r10 = audioRecord2;
                        if (r10 == 0) {
                            throw th2;
                        }
                        try {
                            r10.release();
                            throw th2;
                        } catch (Exception e11) {
                            wp.a.e(e11);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    r10 = r11;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            wp.a.e(e13);
            r11 = r11;
        }
        return z10;
    }

    public final void u(Context context, boolean z10) {
        kotlin.jvm.internal.s.h(context, "context");
        Intent intent = new Intent(context, (Class<?>) HomeActivity.class);
        intent.addFlags(268468224);
        boolean z11 = false;
        intent.putExtra("fragment_code", 0);
        if (!o() && z10) {
            z11 = true;
        }
        intent.putExtra("show_open_app_ads", z11);
        context.startActivity(intent);
    }

    public final void w(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        Intent intent = new Intent(context, (Class<?>) RecordingErrorActivity.class);
        intent.setFlags(AzRecorderApp.e().h() ? 1342177280 : 1342210048);
        context.startActivity(intent);
    }

    public final void y(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        Intent intent = new Intent(context, (Class<?>) ProjectionWarnFor51Activity.class);
        intent.setFlags(268435456);
        intent.addFlags(1073741824);
        context.startActivity(intent);
    }

    public final String d(long j10) {
        String str;
        long j11 = 1000;
        int i10 = (int) (j10 / j11);
        int i11 = i10 / 3600;
        int i12 = i10 % 3600;
        int i13 = i12 / 60;
        int i14 = i12 % 60;
        Locale localeE = e();
        String str2 = obFGmWgqyy.ajeiMoofGFyma;
        if (i11 > 0) {
            o0 o0Var = o0.f43602a;
            str = String.format(localeE, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i13), Integer.valueOf(i14)}, 3));
            kotlin.jvm.internal.s.g(str, str2);
        } else {
            o0 o0Var2 = o0.f43602a;
            str = String.format(localeE, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13), Integer.valueOf(i14)}, 2));
            kotlin.jvm.internal.s.g(str, str2);
        }
        return str + '.' + (((int) (j10 % j11)) / 100);
    }
}
