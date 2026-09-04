package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class gm implements Thread.UncaughtExceptionHandler {
    public static volatile boolean hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f14639hn = Thread.getDefaultUncaughtExceptionHandler();
    private String qor;

    private gm() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        hn();
    }

    private void hn() {
        Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
        if (contextHnj == null) {
            return;
        }
        try {
            File file = new File(contextHnj.getFilesDir(), "TTCache");
            file.mkdirs();
            this.qor = file.getPath();
        } catch (Throwable unused) {
        }
    }

    public static gm hnj() {
        return new gm();
    }

    private void qor() {
        try {
            com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj());
        } catch (Throwable unused) {
        }
        try {
            if (hn.hn()) {
                com.bytedance.sdk.openadsdk.component.reward.uua.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()).sk();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.jip.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()).hnj();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (hn.hn()) {
                com.bytedance.sdk.openadsdk.component.reward.dse.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()).sk();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.dkl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()).hnj();
            }
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.dnm.hn().hnj();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.hnj.hn.hn.hn();
        } catch (Throwable unused5) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        hnj = true;
        com.bytedance.sdk.component.utils.aq.hnj = true;
        com.bytedance.sdk.component.aq.hn.sk.qor = true;
        boolean zContains = false;
        try {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (zContains) {
            hnj(thread, th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14639hn;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e7 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private void hnj(Thread thread, Throwable th2) {
        FileOutputStream fileOutputStream;
        Object[] objArr;
        int i10;
        String str = dmHT.QOaZGKD;
        FileInputStream fileInputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.qor)) {
                hn();
            }
            if (TextUtils.isEmpty(this.qor)) {
                return;
            }
            File file = new File(this.qor, "tt_crash_count.properties");
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                Properties properties = new Properties();
                properties.setProperty("crash_count", "1");
                properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                fileOutputStream = new FileOutputStream(file);
                try {
                    properties.store(fileOutputStream, "tt_crash_info");
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        com.bytedance.sdk.component.utils.apu.hnj("TTCrashHandler", "crash count error", th);
                        if (fileOutputStream != null) {
                            try {
                                return;
                            } catch (Throwable unused3) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused5) {
                            }
                        }
                    }
                }
            }
            Properties properties2 = new Properties();
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                properties2.load(fileInputStream3);
                String property = properties2.getProperty("crash_count", str);
                String property2 = properties2.getProperty("crash_last_time", str);
                int iIntValue = Integer.valueOf(property).intValue();
                if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < 300000) {
                    i10 = iIntValue + 1;
                    objArr = false;
                } else {
                    objArr = true;
                    i10 = 1;
                }
                boolean z10 = i10 >= 3;
                int i11 = z10 ? 0 : i10;
                if (z10) {
                    try {
                        file.delete();
                    } catch (Throwable unused6) {
                    }
                } else {
                    properties2.setProperty("crash_count", String.valueOf(i11));
                    if (objArr != false) {
                        properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                    try {
                        properties2.store(fileOutputStream3, "tt_crash_info");
                        fileOutputStream2 = fileOutputStream3;
                    } catch (Throwable th4) {
                        fileOutputStream = fileOutputStream3;
                        th = th4;
                        fileInputStream = fileInputStream3;
                        com.bytedance.sdk.component.utils.apu.hnj("TTCrashHandler", "crash count error", th);
                        if (fileOutputStream != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (z10) {
                    qor();
                }
                fileOutputStream = fileOutputStream2;
                fileInputStream2 = fileInputStream3;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
        }
    }
}
