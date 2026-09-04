package com.xw.repo;

import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Properties f36022a = new Properties();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f36023b;

    static int a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    static boolean b() throws Throwable {
        Boolean bool = f36023b;
        if (bool != null) {
            return bool.booleanValue();
        }
        FileInputStream fileInputStream = null;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                        try {
                            f36022a.load(fileInputStream2);
                            fileInputStream2.close();
                        } catch (IOException e10) {
                            e = e10;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            f36023b = Boolean.valueOf(f36022a.containsKey("ro.miui.ui.version.name"));
                            return f36023b.booleanValue();
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                    f36023b = Boolean.valueOf(f36022a.containsKey("ro.miui.ui.version.name"));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                try {
                    f36023b = Boolean.valueOf(!TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")));
                } catch (Exception unused) {
                    f36023b = Boolean.FALSE;
                }
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
        return f36023b.booleanValue();
    }

    static int c(int i10) {
        return (int) TypedValue.applyDimension(2, i10, Resources.getSystem().getDisplayMetrics());
    }
}
