package jd;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f42311a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 jd.i$a, still in use, count: 1, list:
      (r0v0 jd.i$a) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 jd.i$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Map f42322k;

        static {
            HashMap map = new HashMap(4);
            f42322k = map;
            map.put("armeabi-v7a", new a());
            map.put("armeabi", new a());
            map.put("arm64-v8a", new a());
            map.put("x86", new a());
        }

        private a() {
            super(str, i);
        }

        static a g() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                gd.g.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) f42322k.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f42323l.clone();
        }
    }

    public static String A(String str) {
        return s(str, "SHA-1");
    }

    public static String B(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th2) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean d(Context context) {
        if (!e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                gd.g.f().e(str, e10);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sb2.append((String) obj);
            }
            String string = sb2.toString();
            if (string.length() > 0) {
                return A(string);
            }
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z10) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iP = p(context, str, "bool");
            if (iP > 0) {
                return resources.getBoolean(iP);
            }
            int iP2 = p(context, str, "string");
            if (iP2 > 0) {
                return Boolean.parseBoolean(context.getString(iP2));
            }
        }
        return z10;
    }

    public static List j(Context context) {
        ArrayList arrayList = new ArrayList();
        int iP = p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iP2 = p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iP3 = p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iP == 0 || iP2 == 0 || iP3 == 0) {
            gd.g.f().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iP), Integer.valueOf(iP2), Integer.valueOf(iP3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iP);
        String[] stringArray2 = context.getResources().getStringArray(iP2);
        String[] stringArray3 = context.getResources().getStringArray(iP3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            gd.g.f().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i10 = 0; i10 < stringArray3.length; i10++) {
            arrayList.add(new f(stringArray[i10], stringArray2[i10], stringArray3[i10]));
        }
        return arrayList;
    }

    public static int k() {
        return a.g().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l() {
        boolean zX = x();
        ?? r10 = zX;
        if (y()) {
            r10 = (zX ? 1 : 0) | 2;
        }
        return w() ? r10 | 4 : r10;
    }

    public static String m(Context context) {
        int iP = p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iP == 0) {
            iP = p(context, "com.crashlytics.android.build_id", "string");
        }
        if (iP != 0) {
            return context.getResources().getString(iP);
        }
        return null;
    }

    public static boolean n(Context context) {
        return (x() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String o(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i10);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, o(context));
    }

    public static SharedPreferences q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String r(Context context) {
        int iP = p(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (iP == 0) {
            return null;
        }
        return context.getResources().getString(iP);
    }

    private static String s(String str, String str2) {
        return t(str.getBytes(), str2);
    }

    private static String t(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return u(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            gd.g.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e10);
            return "";
        }
    }

    public static String u(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = i10 * 2;
            char[] cArr2 = f42311a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean v(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean x() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean y() {
        boolean zX = x();
        String str = Build.TAGS;
        if ((zX || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zX && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean z(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
