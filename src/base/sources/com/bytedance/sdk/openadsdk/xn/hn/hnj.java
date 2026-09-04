package com.bytedance.sdk.openadsdk.xn.hn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dkl;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static final ConcurrentHashMap<String, Object> hnj = new ConcurrentHashMap<>();

    public static void hnj(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (hnj(str)) {
            try {
                dkl.hnj(context).hnj().hnj(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    public static int hnj(Context context, String str, String str2, String[] strArr) {
        int iHnj;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (hnj(str)) {
            try {
                iHnj = dkl.hnj(context).hnj().hnj(str, str2, strArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
        return iHnj;
    }

    public static int hnj(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int iHnj;
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (hnj(str)) {
                try {
                    iHnj = dkl.hnj(context).hnj().hnj(str, contentValues, str2, strArr);
                } catch (Throwable unused) {
                }
            }
            return iHnj;
        }
        return 0;
    }

    public static Map<String, List<String>> hnj(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Map<String, List<String>> mapHnj;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (hnj(str)) {
            try {
                mapHnj = hnj(dkl.hnj(context).hnj().hnj(str, strArr, str2, strArr2, str3, str4, str5));
            } catch (Throwable unused) {
                return null;
            }
        }
        return mapHnj;
    }

    public static Map<String, List<String>> hnj(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object hnj(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = hnj;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (hnj.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
