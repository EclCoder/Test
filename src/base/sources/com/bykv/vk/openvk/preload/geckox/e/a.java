package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile File f11821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Long f11822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f11823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f11824f = new AtomicBoolean(false);

    a(String str, String str2) {
        this.f11819a = str;
        this.f11820b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) {
        if (this.f11823e != null) {
            return this.f11823e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f11823e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f11823e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f11823e;
    }

    private synchronized File e(String str) {
        if (this.f11821c != null) {
            return this.f11821c;
        }
        if (this.f11822d != null && this.f11822d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11819a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        try {
            if (this.f11822d == null) {
                this.f11822d = g.a(new File(this.f11819a, str));
            }
            if (this.f11822d == null) {
                this.f11822d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f11819a, str2 + str + str2 + this.f11822d + str2 + "using.lock");
            this.f11821c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f11821c;
            bVarA.a();
            return file2;
        } catch (Throwable th2) {
            bVarA.a();
            throw th2;
        }
    }

    final InputStream a(String str) {
        return d(this.f11820b).a(a(this.f11820b, str));
    }

    final boolean b(String str) {
        return d(this.f11820b).b(a(this.f11820b, str));
    }

    public final int c(String str) {
        int length;
        try {
            File file = new File(e(str), "res");
            if (file.exists() && file.isDirectory() && (length = file.listFiles().length) > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    final String b() {
        return this.f11820b;
    }

    final Long a() {
        return this.f11822d;
    }

    final void c() throws Exception {
        if (this.f11824f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11819a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f11820b);
        sb2.append(str);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f11821c == null) {
                bVarA.a();
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f11821c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f11819a + str + this.f11820b);
        } catch (Throwable th2) {
            bVarA.a();
            throw th2;
        }
    }
}
