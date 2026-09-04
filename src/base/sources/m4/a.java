package m4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f45231e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f45232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f45233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f45234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f45235d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f45232a = file2;
        this.f45233b = a(file2.getAbsolutePath());
        this.f45234c = z10;
    }

    private static Lock a(String str) {
        Lock reentrantLock;
        Map map = f45231e;
        synchronized (map) {
            try {
                reentrantLock = (Lock) map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return reentrantLock;
    }

    public void b() {
        this.f45233b.lock();
        if (this.f45234c) {
            try {
                FileChannel channel = new FileOutputStream(this.f45232a).getChannel();
                this.f45235d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f45235d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f45233b.unlock();
    }
}
