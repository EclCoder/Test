package ob;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.x1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f48427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f48428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f48429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f48430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f48431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f48432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f48433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f48434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static HashMap f48435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f48436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f48437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f48438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f48439o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static Drawable a(Context context, Resources resources, int i10) {
            return resources.getDrawable(i10, context.getTheme());
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f48425a = i10;
        String str = Build.DEVICE;
        f48426b = str;
        String str2 = Build.MANUFACTURER;
        f48427c = str2;
        String str3 = Build.MODEL;
        f48428d = str3;
        f48429e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f48430f = new byte[0];
        f48431g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f48432h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f48433i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f48434j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f48436l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f48437m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f48438n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f48439o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, Sdk$SDKError.b.TPAT_ERROR_VALUE, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.b.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, 202, Sdk$SDKError.b.AD_IS_PLAYING_VALUE, 144, 151, 158, 153, 140, 139, 130, Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE, Sdk$SDKError.b.MRAID_JS_COPY_FAILED_VALUE, Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, Sdk$SDKError.b.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE, Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 200, Sdk$SDKError.b.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk$SDKError.b.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk$SDKError.b.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE, Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE, Sdk$SDKError.b.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, Sdk$SDKError.b.AD_IS_LOADING_VALUE, 230, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    private static HashMap A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length + f48436l.length);
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
            String[] strArr = f48436l;
            if (i10 >= strArr.length) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static boolean A0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static long B(long j10, int i10) {
        return m(j10 * ((long) i10), 1000000L);
    }

    public static boolean B0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static Uri C(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f48434j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static boolean C0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static String D(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean D0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static String E(byte[] bArr) {
        return new String(bArr, sc.e.f52294c);
    }

    public static boolean E0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String F(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, sc.e.f52294c);
    }

    public static int F0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static int G(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    private static String G0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f48437m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int H(int i10) {
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
                if (f48425a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static long H0(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static x1.b I(x1 x1Var, x1.b bVar) {
        boolean zIsPlayingAd = x1Var.isPlayingAd();
        boolean zK = x1Var.k();
        boolean zJ = x1Var.j();
        boolean zF = x1Var.f();
        boolean zM = x1Var.m();
        boolean zG = x1Var.g();
        boolean zU = x1Var.getCurrentTimeline().u();
        boolean z10 = false;
        x1.b.a aVarD = new x1.b.a().b(bVar).d(4, !zIsPlayingAd).d(5, zK && !zIsPlayingAd).d(6, zJ && !zIsPlayingAd).d(7, !zU && (zJ || !zM || zK) && !zIsPlayingAd).d(8, zF && !zIsPlayingAd).d(9, !zU && (zF || (zM && zG)) && !zIsPlayingAd).d(10, !zIsPlayingAd).d(11, zK && !zIsPlayingAd);
        if (zK && !zIsPlayingAd) {
            z10 = true;
        }
        return aVarD.d(12, z10).e();
    }

    public static ExecutorService I0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ob.q0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return r0.a(str, runnable);
            }
        });
    }

    public static int J(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static String J0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String strE = sc.c.e(str);
        String str2 = Z0(strE, "-")[0];
        if (f48435k == null) {
            f48435k = A();
        }
        String str3 = (String) f48435k.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? G0(strE) : strE;
    }

    public static byte[] K(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static Object[] K0(Object[] objArr, Object obj) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        objArrCopyOf[objArr.length] = obj;
        return k(objArrCopyOf);
    }

    public static int L(String str, int i10) {
        int i11 = 0;
        for (String str2 : a1(str)) {
            if (i10 == y.m(str2)) {
                i11++;
            }
        }
        return i11;
    }

    public static Object[] L0(Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, objArrCopyOf, objArr.length, objArr2.length);
        return objArrCopyOf;
    }

    public static String M(String str, int i10) {
        String[] strArrA1 = a1(str);
        if (strArrA1.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrA1) {
            if (i10 == y.m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static Object[] M0(Object[] objArr, int i10) {
        ob.a.a(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static String N(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static Object[] N0(Object[] objArr, int i10, int i11) {
        ob.a.a(i10 >= 0);
        ob.a.a(i11 <= objArr.length);
        return Arrays.copyOfRange(objArr, i10, i11);
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

    public static long O0(String str) throws ParserException {
        Matcher matcher = f48431g.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.a("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (((long) i10) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) : timeInMillis;
    }

    public static Point P(Context context) {
        DisplayManager displayManager;
        Display display = (f48425a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) ob.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return Q(context, display);
    }

    public static long P0(String str) {
        Matcher matcher = f48432h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j10 : j10;
    }

    public static Point Q(Context context, Display display) {
        if (display.getDisplayId() == 0 && E0(context)) {
            String strO0 = f48425a < 28 ? o0("sys.display-size") : o0("vendor.display-size");
            if (!TextUtils.isEmpty(strO0)) {
                try {
                    String[] strArrY0 = Y0(strO0.trim(), "x");
                    if (strArrY0.length == 2) {
                        int i10 = Integer.parseInt(strArrY0[0]);
                        int i11 = Integer.parseInt(strArrY0[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                u.c("Util", "Invalid display size: " + strO0);
            }
            if ("Sony".equals(f48427c) && f48428d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i12 = f48425a;
        if (i12 >= 23) {
            V(display, point);
        } else if (i12 >= 17) {
            U(display, point);
        } else {
            T(display, point);
        }
        return point;
    }

    public static boolean Q0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper R() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static boolean R0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Locale S() {
        return f48425a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static void S0(List list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    private static void T(Display display, Point point) {
        display.getSize(point);
    }

    public static long T0(long j10, int i10) {
        return (j10 * 1000000) / ((long) i10);
    }

    private static void U(Display display, Point point) {
        display.getRealSize(point);
    }

    public static long U0(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (j10 * (j11 / j12));
    }

    private static void V(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long[] V0(List list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = ((Long) list.get(i10)).longValue() / j12;
                i10++;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = (long) (((Long) list.get(i10)).longValue() * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = ((Long) list.get(i10)).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    public static Drawable W(Context context, Resources resources, int i10) {
        return f48425a >= 21 ? a.a(context, resources, i10) : resources.getDrawable(i10);
    }

    public static void W0(long[] jArr, long j10, long j11) {
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
            return;
        }
        if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
            return;
        }
        long j13 = j10 / j11;
        while (i10 < jArr.length) {
            jArr[i10] = jArr[i10] * j13;
            i10++;
        }
    }

    public static int X(int i10) {
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

    public static boolean X0(x1 x1Var) {
        return x1Var == null || !x1Var.getPlayWhenReady() || x1Var.getPlaybackState() == 1 || x1Var.getPlaybackState() == 4;
    }

    public static int Y(String str) {
        String[] strArrY0;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrY0 = Y0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrY0[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrY0[length - 2]);
        try {
            i10 = Integer.parseInt((String) ob.a.e(str2));
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static String[] Y0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String Z(int i10) {
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

    public static String[] Z0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static String a0(Locale locale) {
        return f48425a >= 21 ? b0(locale) : locale.toString();
    }

    public static String[] a1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : Y0(str.trim(), "(\\s*,\\s*)");
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    private static String b0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long b1(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int c0(Context context, String str, boolean z10) {
        return (f48425a < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) ? 1 : 5;
    }

    public static byte[] c1(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static int d(List list, Comparable comparable, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= size || ((Comparable) list.get(i10)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(list.size() - 1, i11) : i11;
    }

    public static long d0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static float d1(byte[] bArr) {
        ob.a.a(bArr.length == 4);
        return Float.intBitsToFloat((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[0] << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public static int e(long[] jArr, long j10, boolean z10, boolean z11) {
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

    public static long e0(long j10) {
        return j10 == C.TIME_UNSET ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static String e1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static int f(List list, Comparable comparable, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int f0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int f1(byte[] bArr) {
        ob.a.a(bArr.length == 4);
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8);
    }

    public static int g(v vVar, long j10, boolean z10, boolean z11) {
        int i10;
        int iC = vVar.c() - 1;
        int i11 = 0;
        while (i11 <= iC) {
            int i12 = (i11 + iC) >>> 1;
            if (vVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                iC = i12 - 1;
            }
        }
        if (z10 && (i10 = iC + 1) < vVar.c() && vVar.b(i10) == j10) {
            return i10;
        }
        if (z11 && iC == -1) {
            return 0;
        }
        return iC;
    }

    public static v0 g0(int i10, int i11, int i12) {
        return new v0.b().g0(MimeTypes.AUDIO_RAW).J(i11).h0(i12).a0(i10).G();
    }

    public static long g1(int i10, int i11) {
        return h1(i11) | (h1(i10) << 32);
    }

    public static int h(int[] iArr, int i10, boolean z10, boolean z11) {
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

    public static int h0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static long h1(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static int i(long[] jArr, long j10, boolean z10, boolean z11) {
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

    public static long i0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static long i1(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static Object j(Object obj) {
        return obj;
    }

    public static int j0(int i10) {
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

    public static void j1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static Object[] k(Object[] objArr) {
        return objArr;
    }

    public static String k0(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static int l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static String[] l0() {
        String[] strArrM0 = m0();
        for (int i10 = 0; i10 < strArrM0.length; i10++) {
            strArrM0[i10] = J0(strArrM0[i10]);
        }
        return strArrM0;
    }

    public static long m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    private static String[] m0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f48425a >= 24 ? n0(configuration) : new String[]{a0(configuration.locale)};
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static String[] n0(Configuration configuration) {
        return Y0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static int o(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String o0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            u.d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static float p(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static String p0(int i10) {
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
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public static int q(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static byte[] q0(String str) {
        return str.getBytes(sc.e.f52294c);
    }

    public static long r(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean r0(x1 x1Var) {
        if (x1Var == null || !x1Var.t(1)) {
            return false;
        }
        x1Var.pause();
        return true;
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean s0(x1 x1Var) {
        boolean z10 = false;
        if (x1Var == null) {
            return false;
        }
        int playbackState = x1Var.getPlaybackState();
        if (playbackState != 1 || !x1Var.t(2)) {
            if (playbackState == 4 && x1Var.t(4)) {
                x1Var.seekToDefaultPosition();
            }
            if (x1Var.t(1)) {
                return z10;
            }
            x1Var.play();
            return true;
        }
        x1Var.a();
        z10 = true;
        if (x1Var.t(1)) {
            return z10;
        }
        x1Var.play();
        return true;
    }

    public static int t(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f48438n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean t0(x1 x1Var) {
        return X0(x1Var) ? s0(x1Var) : r0(x1Var);
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f48439o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static int u0(Uri uri) {
        int iV0;
        String scheme = uri.getScheme();
        if (scheme != null && sc.c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iV0 = v0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iV0;
        }
        Matcher matcher = f48434j.matcher((CharSequence) ob.a.e(uri.getPath()));
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

    public static Handler v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler w() {
        return x(null);
    }

    public static int w0(Uri uri, String str) {
        if (str == null) {
            return u0(uri);
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

    public static Handler x(Handler.Callback callback) {
        return v((Looper) ob.a.i(Looper.myLooper()), callback);
    }

    public static boolean x0(d0 d0Var, d0 d0Var2, Inflater inflater) {
        if (d0Var.a() <= 0) {
            return false;
        }
        if (d0Var2.b() < d0Var.a()) {
            d0Var2.c(d0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(d0Var.e(), d0Var.f(), d0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(d0Var2.e(), iInflate, d0Var2.b() - iInflate);
                if (inflater.finished()) {
                    d0Var2.T(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == d0Var2.b()) {
                        d0Var2.c(d0Var2.b() * 2);
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

    public static Handler y() {
        return z(null);
    }

    public static String y0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static Handler z(Handler.Callback callback) {
        return v(R(), callback);
    }

    public static boolean z0(Context context) {
        return f48425a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int v0(String str) {
        String strE = sc.c.e(str);
        strE.getClass();
        byte b10 = -1;
        switch (strE.hashCode()) {
            case 104579:
                if (strE.equals("ism")) {
                    b10 = 0;
                }
                break;
            case 108321:
                if (strE.equals("mpd")) {
                    b10 = 1;
                }
                break;
            case 3242057:
                if (strE.equals(giNWGaNAgVQoO.SlMvmyW)) {
                    b10 = 2;
                }
                break;
            case 3299913:
                if (strE.equals("m3u8")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }
}
