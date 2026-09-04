package com.bytedance.sdk.openadsdk.xn.gjv;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.hn;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.coremedia.iso.boxes.UserBox;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f14809hn;
    public static HashSet<String> hnj = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.xn.gjv.hnj.1
        {
            add(MBridgeConstans.APP_ID);
            add("extra_data");
            add("sdk_app_sha1");
            add(UserBox.TYPE);
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static String hn(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static String hnj(Context context, String str, String str2) {
        if (hnj.contains(str2)) {
            str = "pag_sp_bad_par";
        }
        if (eum.hnj(context)) {
            return str;
        }
        return str + "_" + eum.qor(context);
    }

    private static void qor(String str) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f14809hn;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(hn(str))) == null) {
            return;
        }
        map.clear();
    }

    public static String hn(String str, String str2, String str3) {
        return hnj() ? str3 : hnj(oj.hnj(), hn(str), str2, str3);
    }

    private static void hn(Context context, String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        try {
            String strHnj = hnj(context, str, str2);
            if (ta.dse(strHnj)) {
                hn.hnj(context, strHnj).hn().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesHnj = hnj(context, strHnj);
            if (sharedPreferencesHnj == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesHnj.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f14809hn;
            if (softReference != null && (concurrentHashMap = softReference.get()) != null && (map = concurrentHashMap.get(hn(strHnj))) != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean hnj() {
        return oj.hnj() == null;
    }

    public static void hnj(String str, String str2, Boolean bool) {
        if (hnj()) {
            return;
        }
        hnj(hn(str), str2, bool);
    }

    public static void hnj(String str, String str2, Long l10) {
        if (hnj()) {
            return;
        }
        hnj(hn(str), str2, l10);
    }

    public static void hnj(String str, String str2, String str3) {
        if (hnj()) {
            return;
        }
        hnj(hn(str), str2, str3);
    }

    public static void hnj(String str, String str2, Integer num) {
        if (hnj()) {
            return;
        }
        hnj(hn(str), str2, num);
    }

    public static int hnj(String str, String str2, int i10) {
        return hnj() ? i10 : hnj(oj.hnj(), hn(str), str2, i10);
    }

    private static int hnj(Context context, String str, String str2, int i10) {
        String strHnj = hnj(context, str, str2);
        if (ta.dse(strHnj)) {
            return hn.hnj(context, strHnj).hnj(str2, i10);
        }
        SharedPreferences sharedPreferencesHnj = hnj(context, strHnj);
        return sharedPreferencesHnj == null ? i10 : sharedPreferencesHnj.getInt(str2, i10);
    }

    private static void hn(Context context, String str) {
        String strHnj = hnj(oj.hnj(), str, "");
        if (ta.dse(strHnj)) {
            hn.hnj(context, strHnj).hn().clear().apply();
            qor(strHnj);
            return;
        }
        SharedPreferences sharedPreferencesHnj = hnj(context, strHnj);
        if (sharedPreferencesHnj == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesHnj.edit();
        editorEdit.clear();
        editorEdit.apply();
        qor(strHnj);
    }

    public static boolean hnj(String str, String str2, boolean z10) {
        return hnj() ? z10 : hnj(oj.hnj(), hn(str), str2, z10);
    }

    private static boolean hnj(Context context, String str, String str2, boolean z10) {
        String strHnj = hnj(context, str, str2);
        if (ta.dse(strHnj)) {
            return hn.hnj(context, strHnj).hnj(str2, z10);
        }
        SharedPreferences sharedPreferencesHnj = hnj(context, strHnj);
        return sharedPreferencesHnj == null ? z10 : sharedPreferencesHnj.getBoolean(str2, z10);
    }

    private static Object hn(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f14809hn;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(hn(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    public static long hnj(String str, String str2, long j10) {
        return hnj() ? j10 : hnj(oj.hnj(), hn(str), str2, j10);
    }

    private static long hnj(Context context, String str, String str2, long j10) {
        String strHnj = hnj(context, str, str2);
        if (ta.dse(strHnj)) {
            return hn.hnj(context, strHnj).hnj(str2, j10);
        }
        SharedPreferences sharedPreferencesHnj = hnj(context, strHnj);
        return sharedPreferencesHnj == null ? j10 : sharedPreferencesHnj.getLong(str2, j10);
    }

    private static void hn(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f14809hn;
        if (softReference == null || softReference.get() == null) {
            f14809hn = new SoftReference<>(new ConcurrentHashMap());
        }
        String strHn = hn(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = f14809hn.get();
        if (concurrentHashMap == null) {
            return;
        }
        Map<String, Object> map = concurrentHashMap.get(strHn);
        if (map == null) {
            map = new HashMap<>();
            concurrentHashMap.put(strHn, map);
        }
        map.put(str2, obj);
    }

    private static String hnj(Context context, String str, String str2, String str3) {
        String strHnj = hnj(context, str, str2);
        if (ta.dse(strHnj)) {
            return hn.hnj(context, strHnj).hnj(str2, str3);
        }
        SharedPreferences sharedPreferencesHnj = hnj(context, strHnj);
        return sharedPreferencesHnj == null ? str3 : sharedPreferencesHnj.getString(str2, str3);
    }

    public static void hnj(String str, String str2) {
        if (hnj()) {
            return;
        }
        try {
            hn(oj.hnj(), hn(str), str2);
        } catch (Throwable unused) {
        }
    }

    public static void hnj(String str) {
        if (hnj()) {
            return;
        }
        try {
            hn(oj.hnj(), hn(str));
        } catch (Throwable unused) {
        }
    }

    private static <T> void hnj(String str, String str2, T t10) {
        String strHnj = hnj(oj.hnj(), str, str2);
        if (ta.dse(strHnj)) {
            if (t10.equals(hn(strHnj, str2))) {
                return;
            }
            hn.qor qorVarHn = hn.hnj(oj.hnj(), hn(strHnj)).hn();
            hnj(qorVarHn, str2, (Object) t10);
            qorVarHn.apply();
            hn(strHnj, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesHnj = hnj(oj.hnj(), hn(strHnj));
        if (sharedPreferencesHnj == null || t10.equals(hn(strHnj, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesHnj.edit();
        hnj(editorEdit, str2, t10);
        editorEdit.apply();
        hn(strHnj, str2, t10);
    }

    public static SharedPreferences hnj(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(hn(str), 0);
        } catch (Throwable th2) {
            apu.qor("TTAD.TTSaveHelper", "getSharedPreferences error ", th2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void hnj(hn.qor qorVar, String str, T t10) {
        if (t10 instanceof Integer) {
            qorVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            qorVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            qorVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            qorVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            qorVar.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void hnj(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }
}
