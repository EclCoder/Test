package com.bytedance.sdk.openadsdk.xn;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.openadsdk.as.sk;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final AtomicBoolean f14810hn = new AtomicBoolean(false);
    private static boolean hnj = true;

    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    private static void hn(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Throwable th2;
        String strHn = hn();
        File file = new File(context.getDir(TextUtils.isEmpty(strHn) ? "webview" : "webview_".concat(String.valueOf(strHn)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (file.exists()) {
            FileChannel fileChannel = null;
            FileLock fileLockTryLock = null;
            fileChannel = null;
            fileChannel = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        channel = randomAccessFile.getChannel();
                        if (channel != null) {
                            try {
                                fileLockTryLock = channel.tryLock();
                            } catch (Exception unused) {
                                fileChannel = channel;
                                hnj(file);
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (Throwable th3) {
                                        th3.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    return;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th5) {
                                        th5.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    throw th2;
                                }
                                try {
                                    randomAccessFile.close();
                                    throw th2;
                                } catch (Throwable th6) {
                                    th6.getMessage();
                                    throw th2;
                                }
                            }
                        }
                        if (fileLockTryLock != null) {
                            fileLockTryLock.close();
                        } else {
                            hnj(file);
                        }
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th7) {
                                th7.getMessage();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    channel = fileChannel;
                    th2 = th;
                    if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFile == null) {
                        throw th2;
                    }
                    randomAccessFile.close();
                    throw th2;
                }
            } catch (Exception unused3) {
                randomAccessFile = null;
            } catch (Throwable th9) {
                th = th9;
                randomAccessFile = null;
                channel = null;
                th2 = th;
                if (channel != null) {
                    channel.close();
                }
                if (randomAccessFile == null) {
                    throw th2;
                }
                randomAccessFile.close();
                throw th2;
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th10) {
                th10.getMessage();
            }
        }
    }

    public static void hnj(Context context) {
        if (context != null && hnj && f14810hn.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (eum.hnj(context)) {
                        if (sk.hnj("webview_defend", false)) {
                            hn(context);
                            return;
                        }
                        return;
                    }
                    String strHn = eum.hn(context);
                    try {
                        try {
                            if (TextUtils.isEmpty(strHn)) {
                                strHn = context.getPackageName() + Process.myPid();
                            }
                            WebView.setDataDirectorySuffix(strHn);
                            apu.hnj("TTAD.TTMultiInitHelper", "init: WebView.setDataDirectorySuffix with ".concat(String.valueOf(strHn)));
                        } catch (IllegalStateException e10) {
                            apu.hnj("TTAD.TTMultiInitHelper", "init: ", e10);
                            hnj(strHn);
                        }
                    } catch (Exception e11) {
                        apu.hnj("TTAD.TTMultiInitHelper", "init: ", e11);
                    }
                }
            } catch (Throwable th2) {
                apu.hnj("TTAD.TTMultiInitHelper", "init: ", th2);
            }
        }
    }

    public static void hnj() {
        hnj = false;
    }

    private static void hnj(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable th2) {
            Log.e("TTAD.TTMultiInitHelper", "trySetDataDirectorySuffix: ", th2);
        }
    }

    private static String hn() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void hnj(File file) {
        hnj(file, file.exists() ? file.delete() : false);
    }

    private static void hnj(File file, boolean z10) {
        if (!z10 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e10) {
            apu.qor("TTAD.TTMultiInitHelper", e10.getMessage());
        }
    }
}
