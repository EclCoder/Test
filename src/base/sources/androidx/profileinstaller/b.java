package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f6537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f6538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f6539c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f6541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f6543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f6544h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f6546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f6547k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6545i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f6540d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f6537a = assetManager;
        this.f6538b = executor;
        this.f6539c = cVar;
        this.f6542f = str;
        this.f6543g = str2;
        this.f6544h = str3;
        this.f6541e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f6537a, this.f6544h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f6546j = g.r(inputStreamG, g.p(inputStreamG, g.f6567b), bArr, cVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th2) {
                try {
                    inputStreamG.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            this.f6539c.a(9, e10);
        } catch (IOException e11) {
            this.f6539c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f6546j = null;
            this.f6539c.a(8, e12);
        }
    }

    private void c() {
        if (!this.f6545i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f6579a;
        }
        switch (i10) {
            case 24:
            case 25:
                return i.f6583e;
            case 26:
                return i.f6582d;
            case 27:
                return i.f6581c;
            case 28:
            case 29:
            case 30:
                return i.f6580b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f6543g);
        } catch (FileNotFoundException e10) {
            this.f6539c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f6539c.a(7, e11);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6539c.b(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f6566a), this.f6542f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e10) {
                        this.f6539c.a(7, e10);
                        return cVarArrX;
                    }
                } catch (IllegalStateException e11) {
                    this.f6539c.a(8, e11);
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        this.f6539c.a(7, e12);
                    }
                    return null;
                }
            } catch (IOException e13) {
                this.f6539c.a(7, e13);
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f6539c.a(7, e14);
            }
            throw th2;
        }
    }

    private static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || i10 == 24 || i10 == 25;
    }

    private void k(final int i10, final Object obj) {
        this.f6538b.execute(new Runnable() { // from class: j4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f41995a.f6539c.a(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f6540d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f6541e.exists()) {
            try {
                if (!this.f6541e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f6541e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f6545i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f6540d != null) {
            InputStream inputStreamF = f(this.f6537a);
            if (inputStreamF != null) {
                this.f6546j = i(inputStreamF);
            }
            c[] cVarArr = this.f6546j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f6540d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        c[] cVarArr = this.f6546j;
        byte[] bArr = this.f6540d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                    if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                        this.f6539c.a(5, null);
                        this.f6546j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f6547k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f6546j = null;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f6539c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f6539c.a(8, e11);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f6547k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f6541e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f6547k = null;
                                this.f6546j = null;
                                return true;
                            } catch (Throwable th2) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                this.f6547k = null;
                this.f6546j = null;
                return false;
            } catch (IOException e11) {
                k(7, e11);
                this.f6547k = null;
                this.f6546j = null;
                return false;
            }
        } catch (Throwable th10) {
            this.f6547k = null;
            this.f6546j = null;
            throw th10;
        }
    }
}
