package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static ArrayMap<String, File> bug = null;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static boolean f12843hn = false;
    protected static hnj hnj;
    private static ArrayMap<File, hn> orl;
    private long aq;
    private volatile boolean dkl;
    private final File dnm;
    private int dse;
    private final Object gjv;
    private long ojm;
    private final Object qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Properties f12844sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final File f12845ta;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0190hn {
        volatile boolean gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        final Properties f12847hn;
        final long hnj;
        final CountDownLatch qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        boolean f12848sk;

        void hnj(boolean z10, boolean z11) {
            this.f12848sk = z10;
            this.gjv = z11;
            this.qor.countDown();
        }

        private C0190hn(long j10, Properties properties) {
            this.qor = new CountDownLatch(1);
            this.gjv = false;
            this.f12848sk = false;
            this.hnj = j10;
            this.f12847hn = properties;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        HandlerThread hnj(String str, int i10);

        ExecutorService hnj();
    }

    private hn(File file) {
        Object obj = new Object();
        this.qor = obj;
        this.gjv = new Object();
        this.f12844sk = new Properties();
        this.dkl = false;
        this.dse = 0;
        this.f12845ta = file;
        this.dnm = hnj(file);
        synchronized (obj) {
            this.dkl = false;
        }
        hnj hnjVar = hnj;
        if (hnjVar == null || hnjVar.hnj() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.hn.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    hn.this.hnj();
                }
            }.start();
        } else {
            hnj.hnj().execute(new Runnable() { // from class: com.bytedance.sdk.component.hn.2
                @Override // java.lang.Runnable
                public void run() {
                    hn.this.hnj();
                }
            });
        }
    }

    static /* synthetic */ long dkl(hn hnVar) {
        long j10 = hnVar.aq;
        hnVar.aq = 1 + j10;
        return j10;
    }

    static /* synthetic */ int ojm(hn hnVar) {
        int i10 = hnVar.dse;
        hnVar.dse = i10 - 1;
        return i10;
    }

    static /* synthetic */ int sk(hn hnVar) {
        int i10 = hnVar.dse;
        hnVar.dse = i10 + 1;
        return i10;
    }

    private void gjv() {
        while (!this.dkl) {
            try {
                this.qor.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public qor hn() {
        return new qor();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class qor implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final Object f12849hn = new Object();
        private final Map<String, Object> qor = new HashMap();
        private boolean gjv = false;

        public qor() {
        }

        private C0190hn hn() {
            Properties properties;
            long j10;
            Object obj;
            boolean z10;
            synchronized (hn.this.qor) {
                try {
                    if (hn.this.dse > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(hn.this.f12844sk);
                        hn.this.f12844sk = properties2;
                    }
                    properties = hn.this.f12844sk;
                    hn.sk(hn.this);
                    synchronized (this.f12849hn) {
                        try {
                            boolean z11 = false;
                            if (this.gjv) {
                                if (properties.isEmpty()) {
                                    z10 = false;
                                } else {
                                    properties.clear();
                                    z10 = true;
                                }
                                this.gjv = false;
                                z11 = z10;
                            }
                            for (Map.Entry<String, Object> entry : this.qor.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z11 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z11 = true;
                                }
                            }
                            this.qor.clear();
                            if (z11) {
                                hn.dkl(hn.this);
                            }
                            j10 = hn.this.aq;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return new C0190hn(j10, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            hn.this.hnj(hn(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = hn.f12843hn ? System.currentTimeMillis() : 0L;
            C0190hn c0190hnHn = hn();
            hn.this.hnj(c0190hnHn, true);
            try {
                c0190hnHn.qor.await();
                return c0190hnHn.gjv;
            } catch (InterruptedException unused) {
            } finally {
                if (hn.f12843hn) {
                    Log.d("TTPropHelper", hn.this.f12845ta.getName() + ":" + c0190hnHn.hnj + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        public qor hnj(String str, Set<String> set) {
            synchronized (this.f12849hn) {
                this.qor.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return hnj(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public qor putInt(String str, int i10) {
            synchronized (this.f12849hn) {
                this.qor.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public qor putLong(String str, long j10) {
            synchronized (this.f12849hn) {
                this.qor.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public qor putFloat(String str, float f10) {
            synchronized (this.f12849hn) {
                this.qor.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public qor putString(String str, String str2) {
            synchronized (this.f12849hn) {
                this.qor.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public qor putBoolean(String str, boolean z10) {
            synchronized (this.f12849hn) {
                this.qor.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public qor remove(String str) {
            synchronized (this.f12849hn) {
                this.qor.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public qor clear() {
            synchronized (this.f12849hn) {
                this.gjv = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:121:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0122 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0129  */
    /* JADX WARN: Code duplicated, block: B:86:0x0134 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x0148, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.FileOutputStream] */
    public void hn(C0190hn c0190hn, boolean z10) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Throwable th2;
        long jCurrentTimeMillis3;
        ?? r11;
        FileOutputStream fileOutputStream;
        String str;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z11;
        long jCurrentTimeMillis6 = f12843hn ? System.currentTimeMillis() : 0L;
        boolean zExists = this.f12845ta.exists();
        if (f12843hn) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (this.ojm >= c0190hn.hnj) {
                z11 = false;
            } else if (z10) {
                z11 = true;
            } else {
                synchronized (this.qor) {
                    z11 = this.aq == c0190hn.hnj;
                }
            }
            if (!z11) {
                c0190hn.hnj(false, true);
                return;
            }
            boolean zExists2 = this.dnm.exists();
            if (f12843hn) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            if (!zExists2) {
                if (!this.f12845ta.renameTo(this.dnm)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + this.f12845ta + " to backup file " + this.dnm);
                    c0190hn.hnj(false, false);
                    return;
                }
            } else {
                this.f12845ta.delete();
            }
        }
        try {
            synchronized (this.gjv) {
                Object obj = null;
                String str2 = null;
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(this.f12845ta);
                        try {
                            try {
                                jCurrentTimeMillis3 = f12843hn ? System.currentTimeMillis() : 0L;
                                try {
                                    c0190hn.f12847hn.store(fileOutputStream3, (String) null);
                                    if (f12843hn) {
                                        Log.d("TTPropHelper", "save: " + c0190hn.f12847hn);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + this.f12845ta.getAbsolutePath() + "success");
                                        str2 = "success";
                                    }
                                    try {
                                        fileOutputStream3.close();
                                        obj = str2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = "TTPropHelper";
                                        Log.w(str, th.getMessage());
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    fileOutputStream = fileOutputStream3;
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    c0190hn.hnj(false, false);
                                    obj = fileOutputStream;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                            obj = fileOutputStream;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str = "TTPropHelper";
                                            Log.w(str, th.getMessage());
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                r11 = fileOutputStream3;
                                if (r11 != 0) {
                                    try {
                                        r11.close();
                                        throw th2;
                                    } catch (Throwable th6) {
                                        Log.w("TTPropHelper", th6.getMessage());
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream2 = fileOutputStream3;
                            jCurrentTimeMillis3 = 0;
                            fileOutputStream = fileOutputStream2;
                            Log.e("TTPropHelper", "saveToLocal: ", e);
                            c0190hn.hnj(false, false);
                            obj = fileOutputStream;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                obj = fileOutputStream;
                            }
                            if (f12843hn) {
                                jCurrentTimeMillis4 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis4 = 0;
                            }
                            this.dnm.delete();
                            if (f12843hn) {
                                jCurrentTimeMillis5 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis5 = 0;
                            }
                            this.ojm = c0190hn.hnj;
                            c0190hn.hnj(true, true);
                            if (f12843hn) {
                                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        r11 = obj;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            if (f12843hn) {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            this.dnm.delete();
            if (f12843hn) {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            this.ojm = c0190hn.hnj;
            c0190hn.hnj(true, true);
            if (f12843hn) {
                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (Throwable th8) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th8);
            if (this.f12845ta.exists() && !this.f12845ta.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.f12845ta);
            }
            c0190hn.hnj(false, false);
        }
    }

    public static void hnj(hnj hnjVar) {
        hnj = hnjVar;
    }

    public static hn hnj(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (hn.class) {
            try {
                if (bug == null) {
                    bug = new ArrayMap<>();
                }
                File file = bug.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    bug.put(str, file);
                }
                if (orl == null) {
                    orl = new ArrayMap<>();
                }
                hn hnVar = orl.get(file);
                if (hnVar != null) {
                    return hnVar;
                }
                hn hnVar2 = new hn(file);
                orl.put(file, hnVar2);
                return hnVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static File hnj(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[Catch: all -> 0x00db, TryCatch #4 {all -> 0x00db, blocks: (B:50:0x00d2, B:52:0x00d8, B:55:0x00dd, B:56:0x00e5), top: B:69:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void hnj() {
        FileInputStream fileInputStream;
        Throwable th2;
        synchronized (this.qor) {
            try {
                if (this.dkl) {
                    if (f12843hn) {
                        Log.d("TTPropHelper", "reload: already loaded, ignore");
                    }
                    return;
                }
                if (this.dnm.exists()) {
                    this.f12845ta.delete();
                    this.dnm.renameTo(this.f12845ta);
                }
                if (f12843hn) {
                    Log.d("TTPropHelper", "reload: " + this.f12845ta.getAbsolutePath() + ", exist? " + this.f12845ta.exists());
                }
                Properties properties = null;
                if (this.f12845ta.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        fileInputStream = new FileInputStream(this.f12845ta);
                        try {
                            properties2.load(fileInputStream);
                            if (f12843hn) {
                                Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.f12845ta.getAbsolutePath());
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                Log.e("TTPropHelper", "reload: ", th2);
                                if (fileInputStream != null) {
                                }
                                properties = properties2;
                                synchronized (this.qor) {
                                    if (properties != null) {
                                        try {
                                            if (!properties.isEmpty()) {
                                                this.f12844sk = properties;
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    this.dkl = true;
                                    this.qor.notifyAll();
                                }
                            } catch (Throwable th5) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th6) {
                                        Log.w("TTPropHelper", th6.getMessage());
                                    }
                                }
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        fileInputStream = null;
                        th2 = th7;
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable th8) {
                        Log.w("TTPropHelper", th8.getMessage());
                    }
                    properties = properties2;
                }
                synchronized (this.qor) {
                    if (properties != null) {
                        if (!properties.isEmpty()) {
                            this.f12844sk = properties;
                        }
                    }
                    this.dkl = true;
                    this.qor.notifyAll();
                }
            } catch (Throwable th9) {
                throw th9;
            }
        }
    }

    public String hnj(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.qor) {
            gjv();
            property = this.f12844sk.getProperty(str, str2);
        }
        return property;
    }

    public int hnj(String str, int i10) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.qor) {
                try {
                    try {
                        gjv();
                        i11 = Integer.parseInt(this.f12844sk.getProperty(str, String.valueOf(i10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i11;
        }
        return i10;
    }

    public long hnj(String str, long j10) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.qor) {
                try {
                    try {
                        gjv();
                        j11 = Long.parseLong(this.f12844sk.getProperty(str, String.valueOf(j10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j11;
        }
        return j10;
    }

    public boolean hnj(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.qor) {
                try {
                    try {
                        gjv();
                        z11 = Boolean.parseBoolean(this.f12844sk.getProperty(str, String.valueOf(z10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final C0190hn c0190hn, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.hn.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (hn.this.gjv) {
                    try {
                        hn.this.hn(c0190hn, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (hn.this.qor) {
                    hn.ojm(hn.this);
                }
            }
        };
        if (z10) {
            synchronized (this.qor) {
                z11 = this.dse == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.qor.hnj(runnable, true ^ z10);
    }
}
