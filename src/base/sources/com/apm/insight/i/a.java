package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f10731a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f10732b = "";

    private a(Context context) {
        String string;
        if (f10731a == null) {
            synchronized (a.class) {
                if (f10731a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f10731a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f10731a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f10731a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f10731a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f10732b)) {
                new a(context);
                UUID uuid = f10731a;
                if (uuid != null) {
                    f10732b = uuid.toString();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f10732b;
    }
}
