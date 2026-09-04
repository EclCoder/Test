package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f11829a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f11830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11831c;

    private a(String str, FileLock fileLock) {
        this.f11831c = str;
        this.f11830b = fileLock;
    }

    public static a a(String str) {
        Map<String, Lock> map = f11829a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e10) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e10));
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f11829a;
        synchronized (map) {
            try {
                try {
                    this.f11830b.a();
                    this.f11830b.b();
                    map.get(this.f11831c).unlock();
                } catch (Throwable th2) {
                    f11829a.get(this.f11831c).unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
