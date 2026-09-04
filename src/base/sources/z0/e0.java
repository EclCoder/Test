package z0;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f58223b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NativeSharedCounter f58224c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58225a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final e0 b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd2 = parcelFileDescriptor.getFd();
            if (c().nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = c().nativeCreateSharedCounter(fd2);
            if (jNativeCreateSharedCounter >= 0) {
                return new e0(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        public final e0 a(tl.a produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            kotlin.jvm.internal.s.h(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
                try {
                    e0 e0VarB = b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return e0VarB;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptorOpen = null;
            }
        }

        public final NativeSharedCounter c() {
            return e0.f58224c;
        }

        public final void d() {
            System.loadLibrary("datastore_shared_counter");
        }

        private a() {
        }
    }

    public /* synthetic */ e0(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public final int b() {
        return f58224c.nativeGetCounterValue(this.f58225a);
    }

    public final int c() {
        return f58224c.nativeIncrementAndGetCounterValue(this.f58225a);
    }

    private e0(long j10) {
        this.f58225a = j10;
    }
}
