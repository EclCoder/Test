package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d f6568a = androidx.concurrent.futures.d.r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f6569b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f6570c = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f6571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f6572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f6573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f6574d;

        b(int i10, int i11, long j10, long j11) {
            this.f6571a = i10;
            this.f6572b = i11;
            this.f6573c = j10;
            this.f6574d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f6571a);
                dataOutputStream.writeInt(this.f6572b);
                dataOutputStream.writeLong(this.f6573c);
                dataOutputStream.writeLong(this.f6574d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f6572b == bVar.f6572b && this.f6573c == bVar.f6573c && this.f6571a == bVar.f6571a && this.f6574d == bVar.f6574d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f6572b), Long.valueOf(this.f6573c), Integer.valueOf(this.f6571a), Long.valueOf(this.f6574d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f6575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f6576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f6577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f6578d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f6575a = i10;
            this.f6577c = z11;
            this.f6576b = z10;
            this.f6578d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f6570c = cVar;
        f6568a.n(cVar);
        return f6570c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    static c c(Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        b bVarA;
        b bVar;
        int i12;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z10 && (cVar = f6570c) != null) {
            return cVar;
        }
        synchronized (f6569b) {
            if (z10) {
                i10 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                assetFileDescriptorOpenFd.close();
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarA = b.a(file3);
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10) {
                        i10 = 2;
                    }
                    if (bVarA != null) {
                        i10 = 3;
                    }
                    int i13 = i10;
                    bVar = new b(1, i13, jA, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    return b(i13, z12, z13, z11);
                }
                return b(MediaHttpUploader.MINIMUM_CHUNK_SIZE, false, false, z11);
            }
            c cVar2 = f6570c;
            if (cVar2 != null) {
                return cVar2;
            }
            i10 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th2;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                z11 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28 && i11 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                try {
                    long jA2 = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused2) {
                            return b(131072, z12, z13, z11);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null && bVarA.f6573c == jA2 && (i12 = bVarA.f6572b) != 2) {
                        i10 = i12;
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10 && z13 && i10 != 1) {
                        i10 = 2;
                    }
                    if (bVarA != null && bVarA.f6572b == 2 && i10 == 1 && length3 < bVarA.f6574d) {
                        i10 = 3;
                    }
                    int i14 = i10;
                    bVar = new b(1, i14, jA2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused3) {
                            i14 = 196608;
                        }
                    }
                    return b(i14, z12, z13, z11);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return b(C.DEFAULT_BUFFER_SEGMENT_SIZE, z12, z13, z11);
                }
            }
            return b(MediaHttpUploader.MINIMUM_CHUNK_SIZE, false, false, z11);
            throw th;
        }
    }
}
