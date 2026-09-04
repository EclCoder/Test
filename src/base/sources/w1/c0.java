package w1;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import c1.pGX.geAgcEazw;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f55769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f55770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f55771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f55772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f55773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f55774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f55775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f55776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f55777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f55778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f55779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static HashMap f55780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f55781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f55782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f55783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f55784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f55785q;

    public static Handler A(Handler.Callback callback) {
        return y((Looper) a.i(Looper.myLooper()), callback);
    }

    public static boolean A0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Handler B() {
        return C(null);
    }

    public static boolean B0(Context context) {
        return f55769a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static Handler C(Handler.Callback callback) {
        return y(R(), callback);
    }

    public static int C0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    private static HashMap D() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length + f55781m.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f55781m;
            if (i10 >= strArr.length) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    private static String D0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f55782n;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static long E(long j10, int i10) {
        return P0(j10, i10, 1000000L, RoundingMode.CEILING);
    }

    public static long E0(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String F(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static ExecutorService F0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: w1.b0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return c0.a(str, runnable);
            }
        });
    }

    public static String G(byte[] bArr) {
        return new String(bArr, sc.e.f52294c);
    }

    public static String G0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String strE = sc.c.e(str);
        String str2 = V0(strE, "-")[0];
        if (f55780l == null) {
            f55780l = D();
        }
        String str3 = (String) f55780l.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? D0(strE) : strE;
    }

    public static String H(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, sc.e.f52294c);
    }

    public static Object[] H0(Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, objArrCopyOf, objArr.length, objArr2.length);
        return objArrCopyOf;
    }

    public static int I(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static Object[] I0(Object[] objArr, int i10) {
        a.a(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static int J(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static Object[] J0(Object[] objArr, int i10, int i11) {
        a.a(i10 >= 0);
        a.a(i11 <= objArr.length);
        return Arrays.copyOfRange(objArr, i10, i11);
    }

    public static AudioFormat K(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean K0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int L(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f55769a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static boolean L0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static t1.x.b M(t1.x xVar, t1.x.b bVar) {
        boolean zIsPlayingAd = xVar.isPlayingAd();
        boolean zK = xVar.k();
        boolean zJ = xVar.j();
        boolean zF = xVar.f();
        boolean zM = xVar.m();
        boolean zG = xVar.g();
        boolean zQ = xVar.getCurrentTimeline().q();
        boolean z10 = false;
        t1.x.b.a aVarD = new t1.x.b.a().b(bVar).d(4, !zIsPlayingAd).d(5, zK && !zIsPlayingAd).d(6, zJ && !zIsPlayingAd).d(7, !zQ && (zJ || !zM || zK) && !zIsPlayingAd).d(8, zF && !zIsPlayingAd).d(9, !zQ && (zF || (zM && zG)) && !zIsPlayingAd).d(10, !zIsPlayingAd).d(11, zK && !zIsPlayingAd);
        if (zK && !zIsPlayingAd) {
            z10 = true;
        }
        return aVarD.d(12, z10).e();
    }

    public static long M0(long j10, int i10) {
        return P0(j10, 1000000L, i10, RoundingMode.FLOOR);
    }

    public static int N(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static long N0(long j10, long j11, long j12) {
        return P0(j10, j11, j12, RoundingMode.FLOOR);
    }

    public static String O(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return sc.c.f(networkCountryIso);
            }
        }
        return sc.c.f(Locale.getDefault().getCountry());
    }

    public static void O0(long[] jArr, long j10, long j11) {
        R0(jArr, j10, j11, RoundingMode.FLOOR);
    }

    public static Point P(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return Q(context, display);
    }

    public static long P0(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return wc.e.b(j10, wc.e.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return wc.e.d(j10, wc.e.b(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? Q0(j10, j11, j12, roundingMode) : wc.e.d(j11, wc.e.b(j10, j12, RoundingMode.UNNECESSARY));
        }
        return wc.e.b(j11, wc.e.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static Point Q(Context context, Display display) {
        if (display.getDisplayId() == 0 && A0(context)) {
            String strL0 = f55769a < 28 ? l0("sys.display-size") : l0("vendor.display-size");
            if (!TextUtils.isEmpty(strL0)) {
                try {
                    String[] strArrU0 = U0(strL0.trim(), "x");
                    if (strArrU0.length == 2) {
                        int i10 = Integer.parseInt(strArrU0[0]);
                        int i11 = Integer.parseInt(strArrU0[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                n.c("Util", "Invalid display size: " + strL0);
            }
            if ("Sony".equals(f55771c) && f55772d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f55769a >= 23) {
            S(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    private static long Q0(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jD = wc.e.d(j10, j11);
        if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
            return wc.e.b(jD, j12, roundingMode);
        }
        long jC = wc.e.c(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = wc.e.b(j11, jC, roundingMode2);
        long jB2 = wc.e.b(j12, jC, roundingMode2);
        long jC2 = wc.e.c(Math.abs(j10), Math.abs(jB2));
        long jB3 = wc.e.b(j10, jC2, roundingMode2);
        long jB4 = wc.e.b(jB2, jC2, roundingMode2);
        long jD2 = wc.e.d(jB3, jB);
        if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
            return wc.e.b(jD2, jB4, roundingMode);
        }
        double d10 = jB3 * (jB / jB4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return wc.b.c(d10, roundingMode);
    }

    public static Looper R() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static void R0(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        if (j10 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long jB = wc.e.b(j11, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = wc.e.b(jArr[i10], jB, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long jB2 = wc.e.b(j10, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = wc.e.d(jArr[i10], jB2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = wc.e.b(j10, wc.e.b(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = Q0(j12, j10, j11, roundingMode);
                } else {
                    jArr[i11] = wc.e.d(j10, wc.e.b(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    private static void S(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void S0(Throwable th2) throws Throwable {
        T0(th2);
    }

    public static int T(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    private static void T0(Throwable th2) throws Throwable {
        throw th2;
    }

    public static int U(String str) {
        String[] strArrU0;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrU0 = U0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrU0[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrU0[length - 2]);
        try {
            i10 = Integer.parseInt((String) a.e(str2));
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static String[] U0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String V(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String[] V0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String W(Locale locale) {
        return f55769a >= 21 ? X(locale) : locale.toString();
    }

    public static long W0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    private static String X(Locale locale) {
        return locale.toLanguageTag();
    }

    public static boolean X0(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static int Y(Context context) {
        return x0(context) ? 1 : 5;
    }

    public static String Y0(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static long Z(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static long Z0(int i10, int i11) {
        return a1(i11) | (a1(i10) << 32);
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static long a0(long j10) {
        return j10 == C.TIME_UNSET ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static long a1(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static int b0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static String b1(String str) {
        int length = str.length();
        int iEnd = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '%') {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int i12 = length - (i10 * 2);
        StringBuilder sb2 = new StringBuilder(i12);
        Matcher matcher = f55778j.matcher(str);
        while (i10 > 0 && matcher.find()) {
            char c10 = (char) Integer.parseInt((String) a.e(matcher.group(1)), 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(c10);
            iEnd = matcher.end();
            i10--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i12) {
            return null;
        }
        return sb2.toString();
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static t1.o c0(int i10, int i11, int i12) {
        return new t1.o.b().o0(MimeTypes.AUDIO_RAW).N(i11).p0(i12).i0(i10).K();
    }

    public static long c1(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static int d(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(jArr.length - 1, i11) : i11;
    }

    public static int d0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i11 * 3;
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static void d1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static int e(o oVar, long j10, boolean z10, boolean z11) {
        int i10;
        int iC = oVar.c() - 1;
        int i11 = 0;
        while (i11 <= iC) {
            int i12 = (i11 + iC) >>> 1;
            if (oVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                iC = i12 - 1;
            }
        }
        if (z10 && (i10 = iC + 1) < oVar.c() && oVar.b(i10) == j10) {
            return i10;
        }
        if (z11 && iC == -1) {
            return 0;
        }
        return iC;
    }

    public static long e0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static int f(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    public static List f0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static int g(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static List g0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static Object h(Object obj) {
        return obj;
    }

    public static int h0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static Object[] i(Object[] objArr) {
        return objArr;
    }

    public static String[] i0() {
        String[] strArrJ0 = j0();
        for (int i10 = 0; i10 < strArrJ0.length; i10++) {
            strArrJ0[i10] = G0(strArrJ0[i10]);
        }
        return strArrJ0;
    }

    public static int j(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    private static String[] j0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f55769a >= 24 ? k0(configuration) : new String[]{W(configuration.locale)};
    }

    public static long k(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    private static String[] k0(Configuration configuration) {
        return U0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static String l0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            n.d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static int m(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static float n(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static byte[] n0(String str) {
        return str.getBytes(sc.e.f52294c);
    }

    public static int o(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int o0(Uri uri) {
        int iP0;
        String scheme = uri.getScheme();
        if (scheme != null && sc.c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iP0 = p0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iP0;
        }
        Matcher matcher = f55779k.matcher((CharSequence) a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long p(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static int p0(String str) {
        String strE = sc.c.e(str);
        strE.getClass();
        switch (strE) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static boolean q(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static int q0(Uri uri, String str) {
        if (str == null) {
            return o0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static boolean r(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r0(u uVar, u uVar2, Inflater inflater) {
        if (uVar.a() <= 0) {
            return false;
        }
        if (uVar2.b() < uVar.a()) {
            uVar2.c(uVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(uVar.e(), uVar.f(), uVar.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(uVar2.e(), iInflate, uVar2.b() - iInflate);
                if (inflater.finished()) {
                    uVar2.S(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == uVar2.b()) {
                        uVar2.c(uVar2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th2) {
                inflater.reset();
                throw th2;
            }
        }
    }

    public static boolean s(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f55769a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    public static String s0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static int t(SparseArray sparseArray) {
        if (f55769a >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i10)) * 31) + Objects.hashCode(sparseArray.valueAt(i10));
        }
        return iKeyAt;
    }

    public static boolean t0(Context context) {
        return f55769a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int iB = com.google.common.primitives.j.b(bArr[i10]);
            i12 = v(iB & 15, v(iB >> 4, i12));
            i10++;
        }
        return i12;
    }

    public static boolean u0(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return f55769a >= 34;
            case "image/heic":
            case "image/heif":
                return f55769a >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    private static int v(int i10, int i11) {
        return (f55784p[(i10 ^ ((i11 >> 12) & 255)) & 255] ^ ((i11 << 4) & 65535)) & 65535;
    }

    public static boolean v0(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static int w(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f55783o[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean w0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f55785q[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static boolean x0(Context context) {
        int i10 = f55769a;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 != 30) {
            return false;
        }
        String str = f55772d;
        return sc.c.a(str, "moto g(20)") || sc.c.a(str, "rmx3231");
    }

    public static Handler y(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean y0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static Handler z() {
        return A(null);
    }

    public static boolean z0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f55769a = i10;
        String str = Build.DEVICE;
        f55770b = str;
        String str2 = Build.MANUFACTURER;
        f55771c = str2;
        String str3 = Build.MODEL;
        f55772d = str3;
        f55773e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f55774f = new byte[0];
        f55775g = new long[0];
        f55776h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f55777i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f55778j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f55779k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f55781m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", qnwOeeQSSWa.VHxgHtBetJqsDr, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f55782n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f55783o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f55784p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f55785q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, Sdk$SDKError.b.TPAT_ERROR_VALUE, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.b.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, 202, Sdk$SDKError.b.AD_IS_PLAYING_VALUE, 144, 151, 158, 153, 140, 139, 130, Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, Sdk$SDKError.b.MRAID_JS_COPY_FAILED_VALUE, Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, Sdk$SDKError.b.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 200, Sdk$SDKError.b.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk$SDKError.b.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk$SDKError.b.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, Sdk$SDKError.b.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, Sdk$SDKError.b.AD_IS_LOADING_VALUE, 230, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static String m0(int i10) {
        switch (i10) {
            case -2:
                return DevicePublicKeyStringDef.NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return geAgcEazw.ziOFuEkn;
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    return "custom (" + i10 + ")";
                }
                return "?";
        }
    }
}
