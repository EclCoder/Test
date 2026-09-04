package com.bytedance.sdk.component.dkl.hnj.hnj.hnj;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    public static void hnj(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hnj.hnj(context).hnj().hnj(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void hnj(Context context, String str, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hnj.hnj(context).hnj().hnj(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int hnj(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return hnj.hnj(context).hnj().hnj(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int hnj(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return hnj.hnj(context).hnj().hnj(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor hnj(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return hnj.hnj(context).hnj().hnj(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void hnj(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hnj.hnj(context).hnj().hnj(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
